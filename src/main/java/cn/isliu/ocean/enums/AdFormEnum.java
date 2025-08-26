package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0投放产品枚举
 */
@Getter
public enum AdFormEnum implements BaseEnum {

    AWEME_LBS("AWEME_LBS", "本地达"), CONTENTRECOMMEND("CONTENTRECOMMEND", "种草通（含磁贴）"),
    CONTENTRECOMMEND_NO_GRASS("CONTENTRECOMMEND_NO_GRASS", "内容热推（含磁贴）"), CONTENTSERVICE("CONTENTSERVICE", "种草通（不含磁贴）"),
    CONTENTSERVICE_NO_GRASS("CONTENTSERVICE_NO_GRASS", "内容热推（不含磁贴）"), FEED("FEED", "推荐信息流"),
    FEEDSLIVE("FEEDSLIVE", "直播间"), FEEDSLIVE_AD("FEEDSLIVE_AD", "feedslive广告"),
    FEEDSLIVE_SERVICE("FEEDSLIVE_SERVICE", "feedslive服务"), SEARCH("SEARCH", "搜索"), SPLASH("SPLASH", "开屏"),
    VIDEOLIVE_AD("VIDEOLIVE_AD", "videolive广告"), VIDEOLIVE_SERVICE("VIDEOLIVE_SERVICE", "videolive服务");

    private final String code;
    private final String desc;

    AdFormEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AdFormEnum getByCode(String code) {
        for (AdFormEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

    /**
     * 根据状态码获取状态描述
     *
     * @param code 状态码
     * @return 对应的状态描述，如果没有找到则返回null
     */
    public static String getDescriptionByCode(String code) {
        AdFormEnum status = getByCode(code);
        return status != null ? status.getDesc() : null;
    }
}