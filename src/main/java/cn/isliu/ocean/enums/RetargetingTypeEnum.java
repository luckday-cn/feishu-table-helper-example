package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0人群包类型枚举
 */
@Getter
public enum RetargetingTypeEnum implements BaseEnum {
    
    EXCLUDE("EXCLUDE", "排除人群包"),
    INCLUDE("INCLUDE", "定向人群包"),
    UNLIMITED("UNLIMITED", "不限");
    
    private final String code;
    private final String desc;
    
    RetargetingTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static RetargetingTypeEnum getByCode(String code) {
        for (RetargetingTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 