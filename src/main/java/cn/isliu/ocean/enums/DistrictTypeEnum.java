package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0地域定向类型枚举
 */
@Getter
public enum DistrictTypeEnum implements BaseEnum {
    
    REGION("REGION", "按行政区域"),
    UNLIMITED("UNLIMITED", "不限");
    
    private final String code;
    private final String desc;
    
    DistrictTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static DistrictTypeEnum getByCode(String code) {
        for (DistrictTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 