package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0网络类型枚举
 */
@Getter
public enum NetworkTypeEnum implements BaseEnum {
    
    UNLIMITED("UNLIMITED", "不限"),
    WIFI("WIFI", "无线网络");
    
    private final String code;
    private final String desc;
    
    NetworkTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static NetworkTypeEnum getByCode(String code) {
        for (NetworkTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 