package cn.isliu.ocean.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AdPlatformEnum {
    OCEAN(1, "巨量", "OCEAN"),

    RED_BOOK(2, "小红书", "RED_BOOK"),
    ;

    /**
     * 广告平台编码
     */
    private final Integer adPlatformCode;
    /**
     * 广告平台描述
     */
    private final String adPlatformDesc;
    /**
     * 广告平台类型
     */
    private final String adPlatformType;

    public static AdPlatformEnum codeToEnum(Integer adPlatformCode) {
        for (AdPlatformEnum adPlatformEnum : AdPlatformEnum.values()) {
            if (adPlatformEnum.getAdPlatformCode().equals(adPlatformCode)) {
                return adPlatformEnum;
            }
        }
        return null;
    }

    public static AdPlatformEnum getPlatformCode(String adPlatformType) {
        for (AdPlatformEnum adPlatformEnum : AdPlatformEnum.values()) {
            if (adPlatformEnum.getAdPlatformType().equals(adPlatformType)) {
                return adPlatformEnum;
            }
        }
        return null;
    }

}
