package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0产品类型枚举
 */
@Getter
public enum ProTypeEnum implements BaseEnum {
    
    PLANT_GRASS("PLANT_GRASS", "内容种草"),
    FEED("FEED", "信息流");
    
    private final String code;
    private final String desc;
    
    ProTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static ProTypeEnum getByCode(String code) {
        for (ProTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 