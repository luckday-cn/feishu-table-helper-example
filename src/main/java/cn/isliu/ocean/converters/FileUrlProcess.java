package cn.isliu.ocean.converters;

import cn.isliu.core.FileData;
import cn.isliu.core.client.FsClient;
import cn.isliu.core.converters.FieldValueProcess;
import cn.isliu.core.enums.ErrorCode;
import cn.isliu.core.logging.FsLogger;
import cn.isliu.core.utils.FileUtil;
import cn.isliu.core.utils.FsApiUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class FileUrlProcess implements FieldValueProcess<String> {

    private static final Logger log = Logger.getLogger(FileUrlProcess.class.getName());

    @Override
    public String process(Object value) {
        if (value instanceof String) {
            return value.toString();
        }

        List<String> fileUrls = new ArrayList<>();
        if (value instanceof JsonArray) {
            JsonArray arr = (JsonArray) value;
            for (int i = 0; i < arr.size(); i++) {
                JsonElement jsonElement = arr.get(i);
                if (jsonElement.isJsonObject()) {
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    String url = getUrlByTextFile(jsonObject);
                    fileUrls.add(url);
                }
            }
        } else if (value instanceof JsonObject) {
            JsonObject jsb = (JsonObject) value;
            String url = getUrlByTextFile(jsb);
            fileUrls.add(url);
        }
        return String.join(",", fileUrls);
    }

    @Override
    public Object reverseProcess(Object value) {
        if (value == null) {
            return null;
        } else {
            if (value instanceof String) {
                String path = value.toString();
                try {
                    FileData fileData = new FileData();
                    fileData.setFileUrl( path);
                    fileData.setFileType(FileUtil.isImageFile(path) ? "image" : "file");
                    fileData.setFileName(FileUtil.getFileName(path));
                    fileData.setImageData(FileUtil.getImageData(path));
                    return fileData;
                } catch (Exception e) {
                    FsLogger.error(ErrorCode.BUSINESS_LOGIC_ERROR,"【飞书表格】 文件上传-文件URL处理异常!" + e.getMessage(),  path, e);
                    return value;
                }

            } else {
                return value;
            }
        }
    }

    private synchronized String getUrlByTextFile(JsonObject jsb) {
        String url = "";
        String cellType = jsb.get("type").getAsString();

        switch (cellType) {
            case "url":
                String link = jsb.get("link").getAsString();
                if (link == null) {
                    url = jsb.get("text").getAsString();
                } else {
                    url = link;
                }
                break;
            case "embed-image":
                url = getImageOssUrl(jsb);
                break;
            case "attachment":
                url = getAttachmentOssUrl(jsb);
                break;
        }
        return url;
    }

    public static String getImageOssUrl(JsonObject jsb) {
        String url = "";
        String fileToken = jsb.get("fileToken").getAsString();

        String fileUuid = UUID.randomUUID().toString();
        String filePath = FileUtil.getRootPath() + File.separator + fileUuid + ".png";

        boolean isSuccess = true;
        try {
            FsApiUtil.downloadMaterial(fileToken, filePath , FsClient.getInstance().getClient(), null);
            url = filePath;
        } catch (Exception e) {
            FsLogger.warn("【飞书表格】 根据文件FileToken下载失败！fileToken: {}, e: {}", fileToken, e.getMessage());
            isSuccess = false;
        }

        if (!isSuccess) {
            String tmpUrl = FsApiUtil.downloadTmpMaterialUrl(fileToken, FsClient.getInstance().getClient());
            // 根据临时下载地址下载
            FileUtil.downloadFile(tmpUrl, filePath);
        }

        FsLogger.info("【飞书表格】 文件上传-飞书图片上传成功！fileToken: {}, filePath: {}", fileToken, filePath);
        return url;
    }

    public String getAttachmentOssUrl(JsonObject jsb) {
        String url = "";
        String token = jsb.get("fileToken").getAsString();
        String fileName = jsb.get("text").getAsString();

        String fileUuid = UUID.randomUUID().toString();
        String path = FileUtil.getRootPath() + File.separator + fileUuid + fileName;

        boolean isSuccess = true;
        try {
            FsApiUtil.downloadMaterial(token, path , FsClient.getInstance().getClient(), null);
            url = path;
        } catch (Exception e) {
            FsLogger.warn("【飞书表格】 附件-根据文件FileToken下载失败！fileToken: {}, e: {}", token, e.getMessage());
            isSuccess = false;
        }

        if (!isSuccess) {
            String tmpUrl = FsApiUtil.downloadTmpMaterialUrl(token, FsClient.getInstance().getClient());
            FileUtil.downloadFile(tmpUrl, path);
        }

        FsLogger.info("【飞书表格】 文件上传-附件上传成功！fileToken: {}, filePath: {}", token, path);
        return url;
    }
}
