package cn.isliu.ocean.entity;

import cn.isliu.core.BaseEntity;
import cn.isliu.core.annotation.TableConf;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

@Data
@TableConf(headLine = 2, enableDesc = true, headBackColor = "#000000", headFontColor = "#ffffff")
public class OceanEngineExcel extends BaseEntity {

    /**
     * 广告主ID，需开通巨量品牌广告新版
     */
    @JSONField(name = "advertiser_id")
    private Long advertiserId;

    /**
     * 广告主名称
     */
    @JSONField(name = "advertiser_name")
    private String advertiserName;

    /**
     * 广告组信息
     */
    @JSONField(name = "campaign_info")
    private OceanEngineCampaign campaignInfo;

    /**
     * 预定单信息
     */
    @JSONField(name = "order_info")
    private OceanEngineOrder orderInfo;

    /**
     * 创意信息
     */
    @JSONField(name = "creative_info")
    private OceanEngineCreative creativeInfo;
}
