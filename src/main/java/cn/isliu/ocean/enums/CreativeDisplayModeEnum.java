package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0创意展示模式枚举
 */
@Getter
public enum CreativeDisplayModeEnum implements BaseEnum {
    
    CTR("CTR", "优选"),
    RANDOM("RANDOM", "轮播");
    
    private final String code;
    private final String desc;
    
    CreativeDisplayModeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static CreativeDisplayModeEnum getByCode(String code) {
        for (CreativeDisplayModeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 