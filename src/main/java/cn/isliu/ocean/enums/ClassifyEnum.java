package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0广告分类枚举
 */
@Getter
public enum ClassifyEnum implements BaseEnum {
    
    SALE("SALE", "售卖");
    
    private final String code;
    private final String desc;
    
    ClassifyEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static ClassifyEnum getByCode(String code) {
        for (ClassifyEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 