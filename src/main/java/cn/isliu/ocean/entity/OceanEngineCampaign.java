package cn.isliu.ocean.entity;

import cn.isliu.core.annotation.TableProperty;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

/**
 * 巨量品牌2.0广告组创建请求参数
 * API: /open_api/v3.0/brand/v2/campaign/create/
 */
@Data
public class OceanEngineCampaign {

    /**
     * 广告主ID，需开通巨量品牌广告新版
     */
    @JSONField(name = "advertiser_id")
    private Long advertiserId;

    /**
     * 广告组名称，支持1-35个字，不可包含emoji表情
     */
    @TableProperty(value = "广告组名称", order = 1)
    @JSONField(name = "campaign_name")
    private String campaignName;

    /**
     * 合同ID，仅支持代理商/直客商务合作协议，需满足"已生效/未生效"状态且审批通过、已盖章、已归档
     */
    @JSONField(name = "main_contract_id")
    private String mainContractId;

    /**
     * 代理商员工ID，接收下单失败等消息通知
     */
    @JSONField(name = "staff_id")
    private Long staffId;
} 