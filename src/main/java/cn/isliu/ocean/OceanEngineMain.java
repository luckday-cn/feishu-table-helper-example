package cn.isliu.ocean;

import cn.isliu.FsHelper;
import cn.isliu.core.client.FsClient;
import cn.isliu.ocean.entity.OceanEngineExcel;


public class OceanEngineMain {
    public static void main(String[] args) {
        String spreadsheetToken = "your spreadsheetToken";

        try (FsClient fsClient = FsClient.getInstance()) {
            fsClient.initializeClient("your appId", "your appSecret");

            String sheetId = FsHelper.create("巨量引擎", spreadsheetToken, OceanEngineExcel.class);
            System.out.println("sheetId:" + sheetId);

//        List<OceanEngineExcel> data = FsHelper.read(sheetId, spreadsheetToken, OceanEngineExcel.class);
//        data.forEach(System.out::println);
//
//        Object write = FsHelper.write(sheetId, spreadsheetToken, data);
//        System.out.println(write);
        }
    }
}