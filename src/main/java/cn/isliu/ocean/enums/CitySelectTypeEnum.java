package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0城市选择类型枚举
 */
@Getter
public enum CitySelectTypeEnum implements BaseEnum {
    
    EXCLUDE("EXCLUDE", "排除城市"),
    SELECT("SELECT", "选择城市");
    
    private final String code;
    private final String desc;
    
    CitySelectTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static CitySelectTypeEnum getByCode(String code) {
        for (CitySelectTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 