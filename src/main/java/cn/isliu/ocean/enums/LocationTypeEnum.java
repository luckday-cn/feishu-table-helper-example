package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0地域类型枚举
 */
@Getter
public enum LocationTypeEnum implements BaseEnum {
    
    ALL_LOCATION("ALL_LOCATION", "所有"),
    TRAVEL("TRAVEL", "旅游");
    
    private final String code;
    private final String desc;
    
    LocationTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static LocationTypeEnum getByCode(String code) {
        for (LocationTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 