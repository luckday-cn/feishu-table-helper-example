package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0 LBS动态地址类型枚举
 */
@Getter
public enum LbsTypeEnum implements BaseEnum {
    
    LIFE_ACCOUNT_POI("LIFE_ACCOUNT_POI", "来客门店");
    
    private final String code;
    private final String desc;
    
    LbsTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static LbsTypeEnum getByCode(String code) {
        for (LbsTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 