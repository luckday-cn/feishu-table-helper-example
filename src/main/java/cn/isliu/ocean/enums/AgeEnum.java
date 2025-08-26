package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0年龄范围枚举
 */
@Getter
public enum AgeEnum implements BaseEnum {
    
    ABOVE50("ABOVE50", "50岁以上"),
    BETWEEN18_23("BETWEEN18_23", "18-23岁"),
    BETWEEN24_30("BETWEEN24_30", "24-30岁"),
    BETWEEN31_40("BETWEEN31_40", "31-40岁"),
    BETWEEN41_49("BETWEEN41_49", "41-49岁"),
    UNLIMITED("UNLIMITED", "不限");
    
    private final String code;
    private final String desc;
    
    AgeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static AgeEnum getByCode(String code) {
        for (AgeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 