package cn.isliu.ocean.entity;


import cn.isliu.core.annotation.TableProperty;
import cn.isliu.core.enums.TypeEnum;
import cn.isliu.ocean.converters.AnchorOptionsProcess;
import cn.isliu.ocean.converters.FileUrlProcess;
import cn.isliu.ocean.enums.*;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * 巨量品牌2.0创意创建基础DTO
 * API: /open_api/v3.0/brand/v2/material/create/
 */
@Data
public class OceanEngineCreative {

    /**
     * 广告主ID，需开通巨量品牌广告新版
     */
    @JSONField(name = "advertiser_id")
    private Long advertiserId;

    /**
     * 预定单ID，已完成/已删除状态的预定单不可创建创意
     */
    @JSONField(name = "order_id")
    private Long orderId;

    /**
     * 当投放产品=推荐信息流时必填，可选值：LANDING_PAGE（落地页）、NATIVE（抖音主页）
     */
    @JSONField(name = "content_type")
    private ContentTypeEnum contentType;

    /**
     * 创意列表，每个元素包含创意名称、样式及组件信息
     */
    @JSONField(name = "material_list")
    private List<MaterialInfo> materialList;

    /**
     * 创意展示模式，可选值：CTR（优选）、RANDOM（轮播）
     */
    @JSONField(name = "creative_display_mode")
    private CreativeDisplayModeEnum creativeDisplayMode;

    /**
     * 创意分类和标签，包含行业分类、品牌ID等信息
     */
    @JSONField(name = "category_info")
    private CategoryInfo categoryInfo;

    /**
     * 广告监测链接，包含展示、点击、视频播放等监测地址
     */
    @JSONField(name = "track_url_info")
    private TrackUrlInfo trackUrlInfo;

    /**
     * LBS信息
     */
    @JSONField(name = "lbs")
    private LbsInfo lbs;



    /**
     * 创意信息
     */
    @Data
    public static class MaterialInfo {
        /**
         * 创意名称，1-35个字，不支持emoji表情
         */
      
        @JSONField(name = "material_name")
        @TableProperty(value = {"创意父级", "创意名称"}, order = 12, desc = "1-35个字，不支持emoji表情")
        private String materialName;

        /**
         * 创意ID，由平台生成的唯一标识
         */
        @JSONField(name = "material_id")
        private Long materialId;

        /**
         * 创意样式，根据投放产品选择（如DouyinContentPlantGrassNormal）
         */
        @JSONField(name = "creative_template")
        private CreativeTemplateEnum creativeTemplate;

        /**
         * 创意组件列表，根据创意样式添加支持的组件
         */
        @JSONField(name = "material_component")
        private MaterialComponent materialComponent;


        /**
         * 创意是否AI生成。
         * <p>
         * true：是
         * false：否
         * 创意由第三方AI工具生成，如果选择AI生成，那么投放出的广告底部会增加对应提示，请谨慎选择
         */
        @JSONField(name = "creative_is_aigc")
        private Boolean creativeIsAigc;
        
    }

    /**
     * 创意组件
     */
    @Data
    public static class MaterialComponent {
        /**
         * 普通落地页组件，包含落地页链接、直达链接等信息
         */
        @JSONField(name = "common_external")
        private CommonExternal commonExternal;

        /**
         * 落地页标题组件
         */
        @JSONField(name = "external_title")
        private ExternalTitle externalTitle;

        /**
         * 创意投放周期组件
         */
        @JSONField(name = "delivery_time_list")
        private DeliveryTimeList deliveryTimeList;

        /**
         * 创意视频组件
         */
        @JSONField(name = "aweme_video")
        private AwemeVideo awemeVideo;

        /**
         * 抖音号组件，包含抖音号ID、类型和昵称等信息
         */
        @JSONField(name = "ies_core_user")
        private IesCoreUser iesCoreUser;

        /**
         * 落地页组件
         */
        @JSONField(name = "business_url")
        private BusinessUrl businessUrl;


        @JSONField(name = "image_card")
        private ImageCard imageCard;

        /**
         * 探索一下组件，包含擦前动画图片、遮罩图片、文案和动画时长等
         */
        @JSONField(name = "explore_one_time")
        private ExploreOneTime exploreOneTime;

        /**
         * 搜索词组件，包含搜索词列表、搜索样式和展示类型等
         */
        @JSONField(name = "search")
        private Search search;

        /**
         * 原生锚点组件
         */
        @JSONField(name = "aweme_anchor")
        private AwemeAnchor awemeAnchor;

        /**
         * 抖音小店主页
         */
        @JSONField(name = "aweme_shop_home_page")
        private AwemeShopHomePage awemeShopHomePage;

        /**
         * 商品详情页组件，包含抖音店铺ID、商品详情页链接和商品ID等信息
         */
        @JSONField(name = "product_detail_page")
        private ProductDetailPage productDetailPage;


        /**
         * 商城活动页组件，包含抖音店铺ID、活动页链接和直达链接等信息
         */
        @JSONField(name = "mall_activity_page")
        private MallActivityPage mallActivityPage;


        /**
         * 头像图标组件，包含图标图片和类型等
         */
        @JSONField(name = "avatar_icon")
        private AvatarIcon avatarIcon;

        /**
         * 信息流按钮文案组件，包含按钮文案和类型等
         */
        @JSONField(name = "feed_button_text")
        private FeedButtonText feedButtonText;


        /**
         * 音乐文案
         * <p>
         * 要求：音乐名称和音乐昵称需要同时填写
         */
        @JSONField(name = "music_text")
        private MusicText musicText;


        /**
         * 视频下载
         */
        @JSONField(name = "video_download")
        private VideoDownload videoDownload;

        /**
         * 广告评论
         */
        @JSONField(name = "video_comment")
        private VideoComment videoComment;

        /**
         * LBS
         * <p>
         * 要求：LBS落地页针对预定单下所有创意统一配置门店，不支持各创意差异化配置
         */
        @JSONField(name = "lbs_external")
        private LbsExternal lbsExternal;

    }

    /**
     * 普通落地页组件
     */
    @Data
    public static class CommonExternal {
        /**
         * 落地页链接
         */
        @JSONField(name = "external_url")
        private String externalUrl;

        /**
         * 直达链接
         */
//        @Pattern(regexp = "^https?://.*", message = "请输入正确的直达链接URL")
        @JSONField(name = "open_url")
        private String openUrl;

        /**
         * 是否为下载类链接（0：不使用，1：使用）
         */
        @JSONField(name = "external_url_is_download")
        private Integer externalUrlIsDownload;

        /**
         * 小程序链接类型（DEFAULT：字节小程序，WECHAT：微信小程序）
         */
        @JSONField(name = "micro_app_open_url_type")
        private MicroAppTypeEnum microAppOpenUrlType;

        /**
         * 字节小程序
         */
        @JSONField(name = "micro_app_info")
        private MicroAppInfo microAppInfo;

        /**
         * 微信小程序
         */
        @JSONField(name = "wechat_micro_app_info")
        private WechatMicroAppInfo wechatMicroAppInfo;

    }

    /**
     * 微信小程序
     */
    @Data
    public static class WechatMicroAppInfo {
        /**
         * 微信小程序页面路径
         */
        @JSONField(name = "path")
        private String path;

        /**
         * 微信小程序用户名
         */
        @JSONField(name = "user_name")
        private String userName;

        /** */
    }

    /**
     * 字节小程序
     */
    @Data
    public static class MicroAppInfo {
        /**
         * 小程序链接地址
         */
        @JSONField(name = "url")
        private String url;
    }

    /**
     * 创意视频组件
     */
    @Data
    public static class AwemeVideo {
        /**
         * 视频信息
         */
        @JSONField(name = "video")
        private Video video;

        /**
         * 视频标题
         */
        @JSONField(name = "title")
        @TableProperty(value = "视频标题", order = 15)
        private String title;

        /**
         * 视频来源
         * 0：本地上传视频
         * 1：通过抖音号获取视频
         */
        @JSONField(name = "aweme_item_source")
        private Integer awemeItemSource;

        /**
         * 抖音视频ID，视频来源为抖音号主页时必填
         */
        @JSONField(name = "aweme_item_id")
        private String awemeItemId;

        /**
         * 抖音视频URL 供内部使用不需要序列化
         */
        @JSONField(name = "aweme_video_url")
        @TableProperty(value = "视频链接或文件视频链接或文件", order = 14, type = TypeEnum.TEXT_FILE, fieldFormatClass = FileUrlProcess.class)
        private String awemeVideoUrl;
    }

    /**
     * 视频信息
     */
    @Data
    public static class Video {
        /**
         * 视频VID
         */
        @JSONField(name = "video_id")
        private String videoId;
    }


    /**
     * 图片信息
     */
    @Data
    public static class Image {
        /**
         * 图片URI
         */
        @JSONField(name = "web_uri")
        private String webUri;
    }

    /**
     * 抖音号组件
     */
    @Data
    public static class IesCoreUser {
        /**
         * 抖音号ID，支持传入已授权的抖音号
         */
        @JSONField(name = "id")
        @TableProperty(value = "达人/达人ID", order = 13, desc = "四方达饿啊闻风丧胆乏味四大分卫")
        private String id;
    }

    /**
     * 图片磁贴组件
     */
    @Data
    public static class ImageCard {
        /**
         * 组件弹出时间（秒）
         */
        @JSONField(name = "advanced_duration")
        private Integer advancedDuration;

        /**
         * 引流直播间抖音号ID，仅支持授权的抖音号
         * 注意：仅 DouyinContentPlantGrassAdSearchdImage（抖音内容热推&种草通(含磁贴)直播引流磁贴）创意样式 支持传该字段
         */
        @JSONField(name = "live_ies_core_user_id")
        private String liveIesCoreUserId;


        /**
         * 搜索词列表（最多3个，每个≤14字）
         * 兼容存量数据，后续会下线，不需要传
         */
        @JSONField(name = "search_words")
        private List<String> searchWords;


        @JSONField(name = "image")
        private Image image;

        /**
         * 图片磁贴图片oss地址  供内部使用不需要序列化
         */
        @JSONField(deserialize = false)
        private String imageCardUrl;
    }

    /**
     * 按钮信息
     */
    @Data
    public static class Button {
        /**
         * 按钮文案
         */
        @JSONField(name = "text")
        private String text;

        /**
         * 按钮类型（LINK/DOWNLOAD）
         */
        @JSONField(name = "type")
        private String type;
    }

    /**
     * 探索一下组件
     */
    @Data
    public static class ExploreOneTime {
        /**
         * 擦前展示动画，条件：
         * <p>
         * 尺寸：540*276
         * 图片时长：2-3秒
         * 文件大小：小于5M
         * 格式：WEBP
         */
        @JSONField(name = "wipe_before_image")
        private Image wipeBeforeImage;

        /**
         * 遮罩图片，条件：
         * <p>
         * 尺寸：540*276
         * 文件大小：小于300KB
         * 格式：PNG
         */
        @JSONField(name = "wipe_image")
        private Image wipeImage;

        /**
         * 擦一擦文案，1-6个字
         * <p>
         * 固定文案“擦一擦，解锁 {wipe_text}”
         */
        @JSONField(name = "wipe_text")
        private String wipeText;

        /**
         * 擦后展示图片，条件：
         * <p>
         * 尺寸：540*276
         * 文件：<=300KB
         * 格式：PNG
         */
        @JSONField(name = "wipe_after_image")
        private Image wipeAfterImage;

        /**
         * 组件弹出时间，单位：秒
         */
        @JSONField(name = "advanced_duration")
        private Integer advancedDuration;
    }

    /**
     * 搜索词组件
     */
    @Data
    public static class Search {
        /**
         * 搜索词
         * <p>
         * 支持1～3个搜索词，每个词最多14个字，不支持特殊字符
         */
        @JSONField(name = "search_words")
        @TableProperty(value = {"创意父级", "搜索词"}, order = 16, type = TypeEnum.MULTI_TEXT, desc = "支持1～3个搜索词，每个词最多14个字，不支持特殊字符")
        private List<String> searchWords;
    }

    /**
     * 原生锚点组件
     */
    @Data
    public static class AwemeAnchor {
        /**
         * 锚点ID
         */
        @JSONField(name = "anchor_id")
        @TableProperty(value = {"创意父级", "锚点信息"}, order = 17, optionsClass = AnchorOptionsProcess.class)
        private String anchorId;

        /**
         * 是否启用锚点
         * 1：启用锚点
         * 0：不启用锚点
         */
        @JSONField(name = "enable_anchor")
        private Integer enableAnchor;

        /**
         * 锚点类型 可选值:
         * SHOPPING_CART 购物车锚点
         * <p>
         * 默认值: SHOPPING_CART
         */
        @JSONField(name = "anchor_type")
        private String anchorType;
    }

    /**
     * LBS落地页组件
     */
    @Data
    public static class LbsExternal {
        /**
         * 链接地址
         */
        @JSONField(name = "external_url")
        private String externalUrl;

        /**
         * 使用下载类型链接地址
         */
        @JSONField(name = "external_url_is_download")
        private Integer externalUrlIsDownload;

        /**
         * 直达链接
         */
        @JSONField(name = "open_url")
        private String openUrl;
    }

    /**
     * 头像图标组件
     */
    @Data
    public static class AvatarIcon {
        /**
         * 广告头像图片
         * <p>
         * 分辨率:98 x 98,文件≤50k,支持JPG,JPEG格式
         */
        @JSONField(name = "image")
        private Image image;


        /**
         * 图片磁贴图片oss地址  供内部使用不需要序列化
         */
        @JSONField(deserialize = false)
        private String avatarIconUrl;
    }

    /**
     * 信息流按钮文案组件
     */
    @Data
    public static class FeedButtonText {
        /**
         * 信息流按钮文案
         * <p>
         * 默认查看详情，可选立即下载、立即购票、立即购买、立即预订、立即试玩、立即体验、立即参与、立享优惠
         */
        @JSONField(name = "text")
        private String text;
    }

    /**
     * 音乐文案组件
     */
    @Data
    public static class MusicText {
        /**
         * 音乐名称
         */
        @JSONField(name = "music_name")
        private String musicName;

        /**
         * 音乐昵称
         */
        @JSONField(name = "music_nick_name")
        private String musicNickName;
    }

    /**
     * 视频下载组件
     */
    @Data
    public static class VideoDownload {
        /**
         * 是否启用
         */
        @JSONField(name = "is_open")
        private Boolean isOpen;
    }

    /**
     * 视频评论组件
     */
    @Data
    public static class VideoComment {
        /**
         * 是否开启评论（新增字段）
         */
        @JSONField(name = "is_open")
        private Boolean isOpen;
    }

    /**
     * 创意分类和标签
     */
    @Data
    public static class CategoryInfo {
        /**
         * 广告分类
         * <p>
         * 只需填写广告分类的最小层级（第三层级）
         */
        @JSONField(name = "industry_v3")
        private Long industryV3;

        /**
         * 所属行业
         * <p>
         * 当优化目标为优选种草时
         * 条件必填，一级行业，如选择了云图品牌版品牌，则必填；如选择云图极速版品牌，则不需填写。
         * 当优化目标非优选种草时
         * 必填
         */
        @JSONField(name = "yuntu_category_id")
        private Long yuntuCategoryId;

        /**
         * 创意标签
         * <p>
         * 最多20个标签，每个标签不超过5个字
         */
        @JSONField(name = "ad_keywords")
        private List<String> adKeywords;

        /**
         * 品牌名称ID（种草）
         * <p>
         * 优化目标为优选种草时，必填
         */
        @JSONField(name = "brand_name_id")
        private Long brandNameId;

        /**
         * 品牌名称ID（非种草）
         * <p>
         * 优化目标为非优选种草并且能查到品牌数据时必填，否则不填
         */
        @JSONField(name = "cdp_brand_id")
        private Long cdpBrandId;

        /**
         * 产品系列（非种草）
         * <p>
         * 优化目标为非优选种草并且能查到品牌数据和系列数据时必填，否则不填
         */
        @JSONField(name = "sub_brand_name_ids")
        private List<Long> subBrandNameIds;

        /**
         * 电商SPU ID
         */
        @JSONField(name = "yuntu_spu_id")
        private String yuntuSpuId;

        /**
         * 是否种草
         */
        @JSONField(deserialize = false)
        private Boolean isPlantGrass;
    }

    /**
     * 广告监测链接
     */
    @Data
    public static class TrackUrlInfo {
        /**
         * 数据发送方式，可选值：CLIENT
         */
        @JSONField(name = "track_url_send_type")
        private TrackUrlSendTypeEnum trackUrlSendType;

        /**
         * 展示监测链接，最多填写5个
         */
        @JSONField(name = "track_url")
        private List<String> trackUrl;

        /**
         * 视频播放链接，最多填写5个
         */
        @JSONField(name = "first_frame")
        private List<String> firstFrame;

        /**
         * 视频播放完成监测链接，最多填写5个
         */
        @JSONField(name = "last_frame")
        private List<String> lastFrame;

        /**
         * 点击监测链接，最多填写5个
         */
        @JSONField(name = "action_track_url")
        private List<String> actionTrackUrl;

        /**
         * 视频有效播放监测链接，最多填写5个
         */
        @JSONField(name = "effective_frame")
        private List<String> effectiveFrame;
    }

    /**
     * LBS信息
     */
    @Data
    public static class LbsInfo {
        /**
         * LBS动态地址类型，可选值：LIFE_ACCOUNT_POI（来客门店）
         */
        @JSONField(name = "lbs_type")
        private LbsTypeEnum lbsType;

        /**
         * 来客账号ID，需与lbs_type=LIFE_ACCOUNT_POI搭配使用
         */
        @JSONField(name = "life_account_id")
        private String lifeAccountId;

        /**
         * 来客门店ID列表，支持传入多个门店ID（需与life_account_id关联）
         */
        @JSONField(name = "life_poi_id_list")
        private List<String> lifePoiIdList;
    }


    @Data
    public static class AwemeShopHomePage {
        /**
         * 抖音店铺ID
         */
        @JSONField(name = "aweme_shop_id")
        private String awemeShopId;

        /**
         * 店铺主页链接
         */
        @JSONField(name = "external_url")
        private String externalUrl;
    }


    /**
     * 商品详情页组件
     */
    @Data
    public static class ProductDetailPage {
        /**
         * 抖音店铺ID
         */
        @JSONField(name = "aweme_shop_id")
        private String awemeShopId;

        /**
         * 商品详情页链接
         */
        @JSONField(name = "external_url")
        private String externalUrl;

        /**
         * 商品ID
         */
        @JSONField(name = "product_id")
        private String productId;
    }

    /**
     * 商城活动页组件
     */
    @Data
    public static class MallActivityPage {
        /**
         * 抖音小店账号ID
         */
        @JSONField(name = "aweme_shop_id")
        private String awemeShopId;

        /**
         * 商城活动页链接
         */
//        @NotNull(message = "商城活动页链接不能为空")
//        @Pattern(regexp = "^https?://.*$", message = "商城活动页链接格式不正确")
        @JSONField(name = "external_url")
        private String externalUrl;

        /**
         * 活动页直达链接
         */
//        @NotNull(message = "活动页直达链接不能为空")
//        @Pattern(regexp = "^https?://.*$", message = "活动页直达链接格式不正确")
        @JSONField(name = "open_url")
        private String openUrl;
    }


    /**
     * 落地页标题组件
     */
    @Data
    public static class ExternalTitle {
        
        @JSONField(name = "source")
        private String source;
    }


    /**
     * 创意投放周期
     * <p>
     * <p>
     * 格式: ["2025-01-02"] 可以跨天填写，必须是预定单投放日期的子集
     */
    @Data
    public static class DeliveryTimeList {

//        @Size(min = 1, max = 1, message = "创意投放周期只能填写1个")
        @JSONField(name = "day_list")
        private List<String> dayList;
    }


    @Data
    public static class BusinessUrl {
        /**
         * 购物车无分佣链接
         */
        @JSONField(name = "external_url")
        private String externalUrl;


        /**
         * 使用下载类落地页链接
         * <p>
         * 0：不使用
         * 1：使用
         */
       
        @JSONField(name = "external_url_is_download")
        private Integer externalUrlIsDownload;

        /**
         * 购物车无分佣直达链接
         */
      
        @JSONField(name = "open_url")
        private String openUrl;
    }

}
