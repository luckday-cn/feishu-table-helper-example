package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0设备平台枚举
 */
@Getter
public enum PlatformEnum implements BaseEnum {
    
    ANDROID("ANDROID", "安卓"),
    IOS("IOS", "iOS"),
    UNLIMITED("UNLIMITED", "不限");
    
    private final String code;
    private final String desc;
    
    PlatformEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static PlatformEnum getByCode(String code) {
        for (PlatformEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 