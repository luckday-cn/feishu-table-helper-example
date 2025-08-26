package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0库存加量包类型枚举
 */
@Getter
public enum StockIncreasePackageTypeEnum implements BaseEnum {
    
    NONE("NONE", "无"),
    PLUS("PLUS", "库存加量包PLUS"),
    PRO("PRO", "库存加量包Pro");
    
    private final String code;
    private final String desc;
    
    StockIncreasePackageTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static StockIncreasePackageTypeEnum getByCode(String code) {
        for (StockIncreasePackageTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 