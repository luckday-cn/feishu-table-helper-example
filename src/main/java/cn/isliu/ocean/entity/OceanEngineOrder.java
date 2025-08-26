package cn.isliu.ocean.entity;

import cn.isliu.core.annotation.TableProperty;
import cn.isliu.core.enums.TypeEnum;
import cn.isliu.ocean.converters.GdSendTypeOptionsProcess;
import cn.isliu.ocean.converters.RetargetingTagOptionsProcess;
import cn.isliu.ocean.enums.*;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * 巨量品牌2.0预定单基础DTO
 * API: /open_api/v3.0/brand/v2/order/create/
 */
@Data
public class OceanEngineOrder {

    /**
     * 广告主ID，需开通巨量品牌广告新版
     */
    @JSONField(name = "advertiser_id")
    private Long advertiserId;

    /**
     * 广告组ID
     */
    @JSONField(name = "campaign_id")
    private Long campaignId;

    /**
     * 预订单名称，1-50个字，同广告主下未删除的预定单名称不可重复
     */
    @JSONField(name = "name")
    @TableProperty(value = "预订单名称", order = 2)
    private String name;

    /**
     * 广告分类，可选值：SALE（售卖）
     */
    @JSONField(name = "classify")
    @TableProperty(value = "广告分类", enumClass = ClassifyEnum.class)
    private ClassifyEnum classify;

    /**
     * 招商订单编号，不填则不启用招商订单
     */
    @JSONField(name = "intention_no")
    private String intentionNo;

    /**
     * 产品类型，可选值：PLANT_GRASS（内容种草）、FEED（信息流）
     */
    @JSONField(name = "pro_type")
    private ProTypeEnum proType;

    /**
     * 投放产品：
     * 内容种草时可选CONTENTRECOMMEND（种草通含磁贴）、CONTENTSERVICE（种草通不含磁贴）等
     * 信息流时可选FEED（推荐信息流）
     */
    @JSONField(name = "ad_form")
    private AdFormEnum adForm;

    /**
     * 投放位置，可选值：AWEME（抖音）
     */
    @JSONField(name = "app_origin")
    private AppOriginEnum appOrigin;

    /**
     * 计费类型，可选值：GD（保量）
     */
    @JSONField(name = "pricing_type")
    private PricingTypeEnum pricingType;

    /**
     * 优化目标，可选值：CTR（优选点击）、FANS_INCR（粉丝增长）、PLANT_GRASS（优选种草）等
     */
    @JSONField(name = "gd_send_type")
    @TableProperty(value = "优化目标", order = 3, enumClass = GdSendTypeEnum.class, optionsClass = GdSendTypeOptionsProcess.class)
    private GdSendTypeEnum gdSendType;

    /**
     * 定向模块，包含地域、性别、年龄等信息
     */
    @JSONField(name = "audience_info")
    private AudienceInfo audienceInfo;

    /**
     * 政策编号
     */
    @JSONField(name = "policy_no")
    private String policyNo;

    /**
     * 预订量信息
     */
    @JSONField(name = "booking_quantity_info")
    private BookingQuantityInfo bookingQuantityInfo;

    /**
     * 实际总价，单位：元
     */
    @JSONField(name = "budget")
    @TableProperty(value = "实际总价", order = 11)
    private Long budget;

    /**
     * 备注，1-35个字，不支持emoji
     */
    @JSONField(name = "remark")
    private String remark;

    /**
     * 代理商员工ID列表（代理商创建时必填）
     */
    @JSONField(name = "staff_ids")
    private List<Long> staffIds;

    /**
     * 频控信息
     */
    @JSONField(name = "frequency_info")
    private FrequencyInfo frequencyInfo;

    @Data
    public static class AudienceInfo {
        /**
         * 地域信息，不填则为不限
         */
        @JSONField(name = "district_info")
        private DistrictInfo districtInfo;

        /**
         * 性别，可选值：FEMALE（女）、MALE（男）、UNLIMITED（不限）
         */
        @JSONField(name = "gender")
        @TableProperty(value = "性别", order = 5, enumClass = GenderEnum.class)
        private GenderEnum gender;

        /**
         * 年龄范围，可选值：ABOVE50、BETWEEN18_23等，不填则为不限
         */
        @JSONField(name = "ages")
        @TableProperty(value = "年龄范围", order = 6, enumClass = AgeEnum.class)
        private List<AgeEnum> ages;

        /**
         * 设备平台，可选值：ANDROID、IOS、UNLIMITED（不限）
         */
        @JSONField(name = "platform")
        private PlatformEnum platform;

        /**
         * 网络类型，可选值：UNLIMITED（不限）、WIFI（无线网络）
         */
        @JSONField(name = "ac")
        private NetworkTypeEnum ac;

        /**
         * 兴趣分类ID列表，不填则为不限
         */
        @JSONField(name = "action_categories")
        private List<Long> actionCategories;

        /**
         * 人群包信息，不填则为不限
         */
        @JSONField(name = "retargeting_info")
        private RetargetingInfo retargetingInfo;
    }

    @Data
    public static class DistrictInfo {
        /**
         * 地域定向类型，可选值：REGION（按行政区域）、UNLIMITED（不限）
         */
        @JSONField(name = "district_type")
        private DistrictTypeEnum districtType;

        /**
         * 城市选择类型（仅当district_type为REGION时必填），可选值：EXCLUDE（排除城市）、SELECT（选择城市）
         */
        @JSONField(name = "city_select_type")
        @TableProperty(value = "地域定向/排除", order = 4, enumClass = CitySelectTypeEnum.class)
        private CitySelectTypeEnum citySelectType;

        /**
         * 选择/排除的城市ID列表（仅当district_type为REGION时必填）
         */
        @JSONField(name = "city")
        @TableProperty(value = "地域信息", order = 4, type = TypeEnum.MULTI_SELECT, enumClass = OceanProvinceEnum.class)
        private List<Long> city;

        /**
         * 地域类型（仅当district_type为REGION时必填），可选值：ALL_LOCATION（所有）、TRAVEL（旅游）
         */
        @JSONField(name = "location_type")
        private LocationTypeEnum locationType;
    }

    @Data
    public static class RetargetingInfo {
        /**
         * 人群包类型，可选值：EXCLUDE（排除）、INCLUDE（定向）、UNLIMITED（不限）
         */
        @JSONField(name = "retargeting_type")
        private RetargetingTypeEnum retargetingType;

        /**
         * 人群包ID列表
         */
        @JSONField(name = "retargeting_tags")
        @TableProperty(value = "人群包ID", order = 7, type = TypeEnum.MULTI_SELECT, optionsClass = RetargetingTagOptionsProcess.class)
        private List<Long> retargetingTags;
    }

    @Data
    public static class BookingQuantityInfo {
        /**
         * 投放日期及预订量列表
         */
        @JSONField(name = "daily_quantity")
        private List<DailyQuantity> dailyQuantity;

        /**
         * 库存加量包类型，可选值：NONE、PLUS、PRO
         */
        @JSONField(name = "stock_increase_package_type")
        private StockIncreasePackageTypeEnum stockIncreasePackageType;
    }

    @Data
    public static class DailyQuantity {
        /**
         * 投放日期，格式：yyyy-MM-dd
         */
        @JSONField(name = "date")
        @TableProperty(value = "投放日期", order = 8)
        private String date;

        /**
         * 预订量（≥100CPM，整数，≤当日可预定量）
         */
        @JSONField(name = "quantity")
        @TableProperty(value = "预订量", order = 10)
        private Long quantity;

        /**
         * 分时段信息，格式：["09:00","22:00"]，时段≥4小时，时间粒度1小时
         */
        @JSONField(name = "period")
        @TableProperty(value = "时间段", order = 9, type = TypeEnum.MULTI_SELECT, enumClass = OceanEnginePeriodEnum.class)
        private List<String> period;
    }

    @Data
    public static class FrequencyInfo {
        /**
         * 是否启用频控，可选值：DISABLE（不启用）、ENABLE（启用）
         */
        @JSONField(name = "frequency_status")
        private FrequencyStatusEnum frequencyStatus;

        /**
         * 频控次数（正整数，需根据投放天数调整范围）
         */
        @JSONField(name = "frequency")
        private Integer frequency;
    }
} 