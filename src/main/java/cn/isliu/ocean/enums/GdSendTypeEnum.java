package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0优化目标枚举
 */
@Getter
public enum GdSendTypeEnum implements BaseEnum {
    
    CTR("CTR", "优选点击"),
    FANS_INCR("FANS_INCR", "粉丝增长"),
    HOISTING("HOISTING", "优选调起"),
    INTERACTIVE("INTERACTIVE", "普通"),
    PLANT_GRASS("PLANT_GRASS", "优选种草"),
    REACH("REACH", "优选触达"),
    CPV_EFFECTIVE("CPV_EFFECTIVE", "优选播放"),
    FORM("FORM", "优选线索"),
    SEQUENCE("SEQUENCE", "优选位置");
    
    private final String code;
    private final String desc;
    
    GdSendTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static GdSendTypeEnum getByCode(String code) {
        for (GdSendTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 