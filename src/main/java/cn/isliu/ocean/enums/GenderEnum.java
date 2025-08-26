package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0性别枚举
 */
@Getter
public enum GenderEnum implements BaseEnum {
    
    FEMALE("FEMALE", "女"),
    MALE("MALE", "男"),
    UNLIMITED("UNLIMITED", "不限");
    
    private final String code;
    private final String desc;
    
    GenderEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static GenderEnum getByCode(String code) {
        for (GenderEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 