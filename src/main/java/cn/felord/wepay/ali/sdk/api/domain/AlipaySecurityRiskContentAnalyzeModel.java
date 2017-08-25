package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 内容风险识别接口服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskContentAnalyzeModel extends AlipayObject {

	private static final long serialVersionUID = 2269225844132339196L;

	/**
	 * 内容的发表账户号，用于将需要检测的内容（文本、链接、图片、音视频）等和账户进行关联
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账户类型：

用户： 0
商户： 1
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 应用主场景
	 */
	@ApiField("app_main_scene")
	private String appMainScene;

	/**
	 * 应用主场景主体ID
	 */
	@ApiField("app_main_scene_id")
	private String appMainSceneId;

	/**
	 * 应用名称，用于区分内容的应用来源
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用场景
	 */
	@ApiField("app_scene")
	private String appScene;

	/**
	 * 业务ID，例如发帖的帖子ID
	 */
	@ApiField("app_scene_data_id")
	private String appSceneDataId;

	/**
	 * 进行识别的音频地址列表
	 */
	@ApiListField("audio_urls")
	@ApiField("string")
	private List<String> audioUrls;

	/**
	 * 进行识别的链接地址列表
	 */
	@ApiListField("link_urls")
	@ApiField("string")
	private List<String> linkUrls;

	/**
	 * 进行识别的图片地址列表
	 */
	@ApiListField("picture_urls")
	@ApiField("string")
	private List<String> pictureUrls;

	/**
	 * 发布时间
	 */
	@ApiField("publish_date")
	private Date publishDate;

	/**
	 * 文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 进行识别的视频地址列表
	 */
	@ApiListField("video_urls")
	@ApiField("string")
	private List<String> videoUrls;

	/**
	 * <p>Getter for the field <code>accountId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountId() {
		return this.accountId;
	}
	/**
	 * <p>Setter for the field <code>accountId</code>.</p>
	 *
	 * @param accountId a {@link java.lang.String} object.
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * <p>Getter for the field <code>accountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountType() {
		return this.accountType;
	}
	/**
	 * <p>Setter for the field <code>accountType</code>.</p>
	 *
	 * @param accountType a {@link java.lang.String} object.
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * <p>Getter for the field <code>appMainScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppMainScene() {
		return this.appMainScene;
	}
	/**
	 * <p>Setter for the field <code>appMainScene</code>.</p>
	 *
	 * @param appMainScene a {@link java.lang.String} object.
	 */
	public void setAppMainScene(String appMainScene) {
		this.appMainScene = appMainScene;
	}

	/**
	 * <p>Getter for the field <code>appMainSceneId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppMainSceneId() {
		return this.appMainSceneId;
	}
	/**
	 * <p>Setter for the field <code>appMainSceneId</code>.</p>
	 *
	 * @param appMainSceneId a {@link java.lang.String} object.
	 */
	public void setAppMainSceneId(String appMainSceneId) {
		this.appMainSceneId = appMainSceneId;
	}

	/**
	 * <p>Getter for the field <code>appName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppName() {
		return this.appName;
	}
	/**
	 * <p>Setter for the field <code>appName</code>.</p>
	 *
	 * @param appName a {@link java.lang.String} object.
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * <p>Getter for the field <code>appScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppScene() {
		return this.appScene;
	}
	/**
	 * <p>Setter for the field <code>appScene</code>.</p>
	 *
	 * @param appScene a {@link java.lang.String} object.
	 */
	public void setAppScene(String appScene) {
		this.appScene = appScene;
	}

	/**
	 * <p>Getter for the field <code>appSceneDataId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppSceneDataId() {
		return this.appSceneDataId;
	}
	/**
	 * <p>Setter for the field <code>appSceneDataId</code>.</p>
	 *
	 * @param appSceneDataId a {@link java.lang.String} object.
	 */
	public void setAppSceneDataId(String appSceneDataId) {
		this.appSceneDataId = appSceneDataId;
	}

	/**
	 * <p>Getter for the field <code>audioUrls</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getAudioUrls() {
		return this.audioUrls;
	}
	/**
	 * <p>Setter for the field <code>audioUrls</code>.</p>
	 *
	 * @param audioUrls a {@link java.util.List} object.
	 */
	public void setAudioUrls(List<String> audioUrls) {
		this.audioUrls = audioUrls;
	}

	/**
	 * <p>Getter for the field <code>linkUrls</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getLinkUrls() {
		return this.linkUrls;
	}
	/**
	 * <p>Setter for the field <code>linkUrls</code>.</p>
	 *
	 * @param linkUrls a {@link java.util.List} object.
	 */
	public void setLinkUrls(List<String> linkUrls) {
		this.linkUrls = linkUrls;
	}

	/**
	 * <p>Getter for the field <code>pictureUrls</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPictureUrls() {
		return this.pictureUrls;
	}
	/**
	 * <p>Setter for the field <code>pictureUrls</code>.</p>
	 *
	 * @param pictureUrls a {@link java.util.List} object.
	 */
	public void setPictureUrls(List<String> pictureUrls) {
		this.pictureUrls = pictureUrls;
	}

	/**
	 * <p>Getter for the field <code>publishDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getPublishDate() {
		return this.publishDate;
	}
	/**
	 * <p>Setter for the field <code>publishDate</code>.</p>
	 *
	 * @param publishDate a {@link java.util.Date} object.
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * <p>Getter for the field <code>text</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getText() {
		return this.text;
	}
	/**
	 * <p>Setter for the field <code>text</code>.</p>
	 *
	 * @param text a {@link java.lang.String} object.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * <p>Getter for the field <code>videoUrls</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getVideoUrls() {
		return this.videoUrls;
	}
	/**
	 * <p>Setter for the field <code>videoUrls</code>.</p>
	 *
	 * @param videoUrls a {@link java.util.List} object.
	 */
	public void setVideoUrls(List<String> videoUrls) {
		this.videoUrls = videoUrls;
	}

}
