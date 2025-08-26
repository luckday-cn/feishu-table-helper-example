package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

@Getter
public enum OceanProvinceEnum implements BaseEnum {

    BEIJING("11", "北京"),
    TIANJIN("12", "天津"),
    HEIBEI("13", "河北"),
    SHANXI("14", "山西"),
    NEIMENGGU("15", "内蒙古"),
    LIAONING("21", "辽宁"),
    JILIN("22", "吉林"),
    HEILONGJIANG("23", "黑龙江"),
    SHANGHAI("31", "上海"),
    JIANGSU("32", "江苏"),
    ZHEJIANG("33", "浙江"),
    ANHUI("34", "安徽"),
    FUJIAN("35", "福建"),
    JIANGXI("36", "江西"),
    SHANDONG("37", "山东"),
    HENAN("41", "河南"),
    HUBEI("42", "湖北"),
    HUNAN("43", "湖南"),
    GUANGDONG("44", "广东"),
    GUANGXI("45", "广西"),
    HAINAN("46", "海南"),
    CHONGQING("50", "重庆"),
    SICHUAN("51", "四川"),
    GUIZHOU("52", "贵州"),
    YUNNAN("53", "云南"),
    XIZANG("54", "西藏"),
    SHAANXI("61", "陕西"),
    GANSU("62", "甘肃"),
    QINGHAI("63", "青海"),
    NINGXIA("64", "宁夏"),
    XINJIANG("65", "新疆"),
    TAIWAN("1668284", "台湾"),
    HONGKONG("1819730", "香港"),
    MACAO("1821275", "澳门");

    private final String code;
    private final String desc;

    OceanProvinceEnum (String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static OceanProvinceEnum getByCode(String code) {
        for (OceanProvinceEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
