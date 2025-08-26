package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0内容类型枚举
 */
@Getter
public enum ContentTypeEnum implements BaseEnum {
    
    LANDING_PAGE("LANDING_PAGE", "落地页"),
    NATIVE("NATIVE", "抖音主页");
    
    private final String code;
    private final String desc;
    
    ContentTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static ContentTypeEnum getByCode(String code) {
        for (ContentTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 