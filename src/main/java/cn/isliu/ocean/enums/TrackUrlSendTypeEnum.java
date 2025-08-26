package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0监测链接数据发送方式枚举
 */
@Getter
public enum TrackUrlSendTypeEnum implements BaseEnum {
    
    CLIENT("CLIENT", "客户端");
    
    private final String code;
    private final String desc;
    
    TrackUrlSendTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public static TrackUrlSendTypeEnum getByCode(String code) {
        for (TrackUrlSendTypeEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
} 