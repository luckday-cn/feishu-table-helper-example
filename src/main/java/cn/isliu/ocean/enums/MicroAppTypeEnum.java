package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0小程序链接类型枚举
 */
@Getter
public enum MicroAppTypeEnum implements BaseEnum {
    
    DEFAULT("DEFAULT", "字节小程序"),
    WECHAT("WECHAT", "微信小程序");
    
    private final String code;
    private final String desc;
    
    MicroAppTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static MicroAppTypeEnum getByCode(String code) {
        for (MicroAppTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 