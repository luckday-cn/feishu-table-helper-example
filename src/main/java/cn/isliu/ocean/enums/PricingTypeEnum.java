package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0计费类型枚举
 */
@Getter
public enum PricingTypeEnum implements BaseEnum {
    
    GD("GD", "保量");
    
    private final String code;
    private final String desc;
    
    PricingTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static PricingTypeEnum getByCode(String code) {
        for (PricingTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 