package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0频控状态枚举
 */
@Getter
public enum FrequencyStatusEnum implements BaseEnum {
    
    DISABLE("DISABLE", "不启用"),
    ENABLE("ENABLE", "启用");
    
    private final String code;
    private final String desc;
    
    FrequencyStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static FrequencyStatusEnum getByCode(String code) {
        for (FrequencyStatusEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 