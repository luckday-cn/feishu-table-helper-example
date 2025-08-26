package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0投放位置枚举
 */
@Getter
public enum AppOriginEnum implements BaseEnum {
    
    AWEME("AWEME", "抖音");
    
    private final String code;
    private final String desc;
    
    AppOriginEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static AppOriginEnum getByCode(String code) {
        for (AppOriginEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 