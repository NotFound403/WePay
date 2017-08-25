package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 生活圈新动态发布接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseMcommentNewsfeedAddModel extends AlipayObject {

	private static final long serialVersionUID = 4798628357984197725L;

	/**
	 * 活动地点名称
	 */
	@ApiField("activity_address")
	private String activityAddress;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 动态关联的现场id
	 */
	@ApiField("aid")
	private String aid;

	/**
	 * 业务系统ID,必须保证唯一性
规则：uid@时间戳
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 动态的文字内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 红包信息
	 */
	@ApiField("gift_info")
	private NewsfeedMediaGiftInfo giftInfo;

	/**
	 * 图片信息
	 */
	@ApiListField("img_infos")
	@ApiField("newsfeed_media_img")
	private List<NewsfeedMediaImg> imgInfos;

	/**
	 * 动态的标题信息
	 */
	@ApiField("label_info")
	private NewsfeedLabelInfo labelInfo;

	/**
	 * 链接信息（link类型时必填）
	 */
	@ApiField("link_info")
	private NewsfeedMediaLinkInfo linkInfo;

	/**
	 * 动态相关的地理位置（发给现场的动态必填）
	 */
	@ApiField("location_info")
	private NewsfeedLocationInfo locationInfo;

	/**
	 * 地理位置名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 地理位置跳转链接（当前支持https和alipay开头）
	 */
	@ApiField("location_scheme")
	private String locationScheme;

	/**
	 * 场景码,生活圈默认LFC
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 支持口碑评论等特殊类型需要的评分，不为空可显示星级评分
满分10分，每1分代表半颗星
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 接口请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用于标识来源app的图标
	 */
	@ApiField("source_icon")
	private String sourceIcon;

	/**
	 * 用于标识来源APP的名称
	 */
	@ApiField("source_name")
	private String sourceName;

	/**
	 * 个人动态扩散范围：0只生活圈，
1只现场，2既有生活圈也有现场
	 */
	@ApiField("spread_range")
	private Long spreadRange;

	/**
	 * 动态的类型：text纯文本，
image图片，video视频，link链接
，crossVideo横屏视频
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * video信息（video、crossVideo类型时必填）
	 */
	@ApiField("video_info")
	private NewsfeedMediaVideoInfo videoInfo;

	/**
	 * 动态的可见性：0公开，1私密（仅本人可见）
	 */
	@ApiField("visible")
	private Long visible;

	/**
	 * 动态的可见范围
visible为0,1时，为空列表
visible为2时，表示可见的标签分组列表，
visible为3时，表示不可见的标签分组列表
	 */
	@ApiListField("visible_range")
	@ApiField("string")
	private List<String> visibleRange;

	/**
	 * 和谁在一起，用户列表
	 */
	@ApiListField("with_me")
	@ApiField("newsfeed_with_me_info")
	private List<NewsfeedWithMeInfo> withMe;

	/**
	 * <p>Getter for the field <code>activityAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityAddress() {
		return this.activityAddress;
	}
	/**
	 * <p>Setter for the field <code>activityAddress</code>.</p>
	 *
	 * @param activityAddress a {@link java.lang.String} object.
	 */
	public void setActivityAddress(String activityAddress) {
		this.activityAddress = activityAddress;
	}

	/**
	 * <p>Getter for the field <code>activityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityName() {
		return this.activityName;
	}
	/**
	 * <p>Setter for the field <code>activityName</code>.</p>
	 *
	 * @param activityName a {@link java.lang.String} object.
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	/**
	 * <p>Getter for the field <code>aid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAid() {
		return this.aid;
	}
	/**
	 * <p>Setter for the field <code>aid</code>.</p>
	 *
	 * @param aid a {@link java.lang.String} object.
	 */
	public void setAid(String aid) {
		this.aid = aid;
	}

	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo() {
		return this.bizNo;
	}
	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>giftInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedMediaGiftInfo} object.
	 */
	public NewsfeedMediaGiftInfo getGiftInfo() {
		return this.giftInfo;
	}
	/**
	 * <p>Setter for the field <code>giftInfo</code>.</p>
	 *
	 * @param giftInfo a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedMediaGiftInfo} object.
	 */
	public void setGiftInfo(NewsfeedMediaGiftInfo giftInfo) {
		this.giftInfo = giftInfo;
	}

	/**
	 * <p>Getter for the field <code>imgInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<NewsfeedMediaImg> getImgInfos() {
		return this.imgInfos;
	}
	/**
	 * <p>Setter for the field <code>imgInfos</code>.</p>
	 *
	 * @param imgInfos a {@link java.util.List} object.
	 */
	public void setImgInfos(List<NewsfeedMediaImg> imgInfos) {
		this.imgInfos = imgInfos;
	}

	/**
	 * <p>Getter for the field <code>labelInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedLabelInfo} object.
	 */
	public NewsfeedLabelInfo getLabelInfo() {
		return this.labelInfo;
	}
	/**
	 * <p>Setter for the field <code>labelInfo</code>.</p>
	 *
	 * @param labelInfo a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedLabelInfo} object.
	 */
	public void setLabelInfo(NewsfeedLabelInfo labelInfo) {
		this.labelInfo = labelInfo;
	}

	/**
	 * <p>Getter for the field <code>linkInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedMediaLinkInfo} object.
	 */
	public NewsfeedMediaLinkInfo getLinkInfo() {
		return this.linkInfo;
	}
	/**
	 * <p>Setter for the field <code>linkInfo</code>.</p>
	 *
	 * @param linkInfo a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedMediaLinkInfo} object.
	 */
	public void setLinkInfo(NewsfeedMediaLinkInfo linkInfo) {
		this.linkInfo = linkInfo;
	}

	/**
	 * <p>Getter for the field <code>locationInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedLocationInfo} object.
	 */
	public NewsfeedLocationInfo getLocationInfo() {
		return this.locationInfo;
	}
	/**
	 * <p>Setter for the field <code>locationInfo</code>.</p>
	 *
	 * @param locationInfo a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedLocationInfo} object.
	 */
	public void setLocationInfo(NewsfeedLocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	/**
	 * <p>Getter for the field <code>locationName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLocationName() {
		return this.locationName;
	}
	/**
	 * <p>Setter for the field <code>locationName</code>.</p>
	 *
	 * @param locationName a {@link java.lang.String} object.
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * <p>Getter for the field <code>locationScheme</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLocationScheme() {
		return this.locationScheme;
	}
	/**
	 * <p>Setter for the field <code>locationScheme</code>.</p>
	 *
	 * @param locationScheme a {@link java.lang.String} object.
	 */
	public void setLocationScheme(String locationScheme) {
		this.locationScheme = locationScheme;
	}

	/**
	 * <p>Getter for the field <code>sceneCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneCode() {
		return this.sceneCode;
	}
	/**
	 * <p>Setter for the field <code>sceneCode</code>.</p>
	 *
	 * @param sceneCode a {@link java.lang.String} object.
	 */
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	/**
	 * <p>Getter for the field <code>score</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getScore() {
		return this.score;
	}
	/**
	 * <p>Setter for the field <code>score</code>.</p>
	 *
	 * @param score a {@link java.lang.Long} object.
	 */
	public void setScore(Long score) {
		this.score = score;
	}

	/**
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * <p>Getter for the field <code>sourceIcon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceIcon() {
		return this.sourceIcon;
	}
	/**
	 * <p>Setter for the field <code>sourceIcon</code>.</p>
	 *
	 * @param sourceIcon a {@link java.lang.String} object.
	 */
	public void setSourceIcon(String sourceIcon) {
		this.sourceIcon = sourceIcon;
	}

	/**
	 * <p>Getter for the field <code>sourceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceName() {
		return this.sourceName;
	}
	/**
	 * <p>Setter for the field <code>sourceName</code>.</p>
	 *
	 * @param sourceName a {@link java.lang.String} object.
	 */
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	/**
	 * <p>Getter for the field <code>spreadRange</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSpreadRange() {
		return this.spreadRange;
	}
	/**
	 * <p>Setter for the field <code>spreadRange</code>.</p>
	 *
	 * @param spreadRange a {@link java.lang.Long} object.
	 */
	public void setSpreadRange(Long spreadRange) {
		this.spreadRange = spreadRange;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * <p>Getter for the field <code>videoInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedMediaVideoInfo} object.
	 */
	public NewsfeedMediaVideoInfo getVideoInfo() {
		return this.videoInfo;
	}
	/**
	 * <p>Setter for the field <code>videoInfo</code>.</p>
	 *
	 * @param videoInfo a {@link cn.felord.wepay.ali.sdk.api.domain.NewsfeedMediaVideoInfo} object.
	 */
	public void setVideoInfo(NewsfeedMediaVideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}

	/**
	 * <p>Getter for the field <code>visible</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getVisible() {
		return this.visible;
	}
	/**
	 * <p>Setter for the field <code>visible</code>.</p>
	 *
	 * @param visible a {@link java.lang.Long} object.
	 */
	public void setVisible(Long visible) {
		this.visible = visible;
	}

	/**
	 * <p>Getter for the field <code>visibleRange</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getVisibleRange() {
		return this.visibleRange;
	}
	/**
	 * <p>Setter for the field <code>visibleRange</code>.</p>
	 *
	 * @param visibleRange a {@link java.util.List} object.
	 */
	public void setVisibleRange(List<String> visibleRange) {
		this.visibleRange = visibleRange;
	}

	/**
	 * <p>Getter for the field <code>withMe</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<NewsfeedWithMeInfo> getWithMe() {
		return this.withMe;
	}
	/**
	 * <p>Setter for the field <code>withMe</code>.</p>
	 *
	 * @param withMe a {@link java.util.List} object.
	 */
	public void setWithMe(List<NewsfeedWithMeInfo> withMe) {
		this.withMe = withMe;
	}

}
