package cn.isliu.ocean.enums;

import cn.isliu.core.enums.BaseEnum;
import lombok.Getter;

/**
 * 巨量品牌2.0时间段
 */
@Getter
public enum OceanEnginePeriodEnum implements BaseEnum {

    TIME_00_00("00:00", "【00:00】"),
    TIME_01_00("01:00", "【01:00】"),
    TIME_02_00("02:00", "【02:00】"),
    TIME_03_00("03:00", "【03:00】"),
    TIME_04_00("04:00", "【04:00】"),
    TIME_05_00("05:00", "【05:00】"),
    TIME_06_00("06:00", "【06:00】"),
    TIME_07_00("07:00", "【07:00】"),
    TIME_08_00("08:00", "【08:00】"),
    TIME_09_00("09:00", "【09:00】"),
    TIME_10_00("10:00", "【10:00】"),
    TIME_11_00("11:00", "【11:00】"),
    TIME_12_00("12:00", "【12:00】"),
    TIME_13_00("13:00", "【13:00】"),
    TIME_14_00("14:00", "【14:00】"),
    TIME_15_00("15:00", "【15:00】"),
    TIME_16_00("16:00", "【16:00】"),
    TIME_17_00("17:00", "【17:00】"),
    TIME_18_00("18:00", "【18:00】"),
    TIME_19_00("19:00", "【19:00】"),
    TIME_20_00("20:00", "【20:00】"),
    TIME_21_00("21:00", "【21:00】"),
    TIME_22_00("22:00", "【22:00】"),
    TIME_23_00("23:00", "【23:00】"),
    TIME_24_00("24:00", "【24:00】");

    private final String code;
    private final String desc;

    OceanEnginePeriodEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static OceanEnginePeriodEnum getByCode(String code) {
        for (OceanEnginePeriodEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}