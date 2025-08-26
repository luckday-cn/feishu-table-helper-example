package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;

/**
 * 巨量引擎创意样式枚举（对应 creative_template 字段值）
 */
public enum CreativeTemplateEnum implements BaseEnum {
    // 内容热推(含磁贴)、种草通(含磁贴) 支持的样式
    DOUYIN_CONTENT_PLANT_GRASS_AD_NORMAL("DouyinContentPlantGrassAdNormal", "抖音内容热推&种草通(含磁贴)-常规"),
    DOUYIN_CONTENT_PLANT_GRASS_AD_SEARCH_EXPLORE("DouyinContentPlantGrassAdSearchExplore", "抖音内容热推&种草通(含磁贴)-探索一下"),
    DOUYIN_CONTENT_PLANT_GRASS_AD_SEARCHD_IMAGE("DouyinContentPlantGrassAdSearchdImage", "抖音内容热推&种草通(含磁贴)-直播引流磁贴"),

    // 内容热推(不含磁贴)、种草通(不含磁贴) 支持的样式
    DOUYIN_CONTENT_PLANT_GRASS_NORMAL("DouyinContentPlantGrassNormal", "抖音内容热推&种草通(不含磁贴)-常规"),

    // 推荐信息流-落地页 支持的样式
    DOUYIN_FEED_EXTERNAL_CARD("DouyinFeedExternalCard", "抖音信息流&本地达(落地页)-图片磁贴"),
    DOUYIN_FEED_EXTERNAL_NORMAL("DouyinFeedExternalNormal", "抖音信息流&本地达(落地页)-常规"),

    // 推荐信息流-抖音主页 支持的样式
    DOUYIN_FEED_NATIVE_CARD("DouyinFeedNativeCard", "抖音信息流&本地达(抖音主页)-图片磁贴"),
    DOUYIN_FEED_NATIVE_NORMAL("DouyinFeedNativeNormal", "抖音信息流&本地达(抖音主页)-常规");

    private final String code;  // 对应 creative_template 字段的实际值
    private final String desc;  // 样式中文描述

    CreativeTemplateEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
