package cn.isliu.ocean.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum AdPlatformTemplateEnum {

    // 信息流-推荐信息流-落地页-常规
    INFO_FEED_LAND_PAGE_NORMAL(7, "信息流-推荐信息流-落地页-常规", AdPlatformEnum.OCEAN, "xxlTjxxlLdyCg"),
    // 信息流-推荐信息流-落地页-图片磁贴
    INFO_FEED_LAND_PAGE_IMAGE_TILE(8, "信息流-推荐信息流-落地页-图片磁贴", AdPlatformEnum.OCEAN, "xxlTjxxlLdyTpct"),
    // 信息流-推荐信息流-抖音主页-常规
    INFO_FEED_DOUYIN_NORMAL(9, "信息流-推荐信息流-抖音主页-常规", AdPlatformEnum.OCEAN, "xxlTjxxlDyzyCg"),
    // 信息流-推荐信息流-抖音主页-图片磁贴
    INFO_FEED_DOUYIN_IMAGE_TILE(10, "信息流-推荐信息流-抖音主页-图片磁贴", AdPlatformEnum.OCEAN, "xxlTjxxlDyzyTpct"),
    // 内容种草-种草通（不含磁贴）-无-常规
    SEED_WITHOUT_TILE_NORMAL(1, "内容种草-种草通（不含磁贴）-无-常规", AdPlatformEnum.OCEAN, "nrzcZctbhctCg"),
    // 内容种草-种草通（含磁贴）-无-常规
    SEED_WITH_TILE_NORMAL(3, "内容种草-种草通（含磁贴）-无-常规", AdPlatformEnum.OCEAN, "nrzcZctHctCg"),
    // 内容种草-种草通（含磁贴）-无-探索一下
    SEED_WITH_TILE_EXPLORE(5, "内容种草-种草通（含磁贴）-无-探索一下", AdPlatformEnum.OCEAN, "nrzcZcthctTsyx"),
    // 内容种草-种草通（含磁贴）-无-直播引流磁贴
    SEED_WITH_TILE_LIVE(6, "内容种草-种草通（含磁贴）-无-直播引流磁贴", AdPlatformEnum.OCEAN, "nrzcZctHctZbylct"),
    // 内容种草-内容热推（不含磁贴）-无-常规
    HOT_WITHOUT_TILE_NORMAL(1, "内容种草-内容热推（不含磁贴）-无-常规", AdPlatformEnum.OCEAN, "nrzcNrrtbhctCg"),
    // 内容种草-内容热推（含磁贴）-无-常规
    HOT_WITH_TILE_NORMAL(3, "内容种草-内容热推（含磁贴）-无-常规", AdPlatformEnum.OCEAN, "nrzcNrrthctCg"),
    // 内容种草-内容热推（含磁贴）-无-探索一下
    HOT_WITH_TILE_EXPLORE(5, "内容种草-内容热推（含磁贴）-无-探索一下", AdPlatformEnum.OCEAN, "nrzcNrrthctTsyx"),
    // 内容种草-内容热推（含磁贴）-无-直播引流磁贴
    HOT_WITH_TILE_LIVE(6, "内容种草-内容热推（含磁贴）-无-直播引流磁贴", AdPlatformEnum.OCEAN, "nrzcNrrthctZbylct");

    /**
     * 模板ID
     */
    private final Integer templateId;

    /**
     * 业务参数
     */
    private final String businessParam;

    /**
     * 平台类型
     */
    private final AdPlatformEnum platformType;

    /**
     * 引擎的链路ID
     */
    private final String litFlowChainId;


}
