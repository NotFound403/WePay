package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建广告接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingAdvertisingCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6878121246413459696L;

	/**
	 * 用户点击广告后，跳转URL地址，必须为https协议。广告类型为PIC时，需要设置该值。对于类型为URL不生效。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 广告位标识码，目前开放的广告位是钱包APP/口碑TAB/商家详情页中，传值：SHOPPING_OPEN_BANNER
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 广告展示规则。该规则用于商家设置对用户是否展示广告的校验条件，目前支持商家店铺规则。按业务要求应用对应规则即可。
	 */
	@ApiField("ad_rules")
	private String adRules;

	/**
	 * 广告内容，目前支持传入图片ID标识。如何获取图片ID参考图片上传接口：alipay.offline.material.image.upload。图片尺寸为1242px＊290px。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 广告类型，目前只支持PIC.
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 投放广告结束时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 直接传入的是图片，目前该字段可以先忽略
	 */
	@ApiField("height")
	private String height;

	/**
	 * 投放广告开始时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * <p>Getter for the field <code>actionUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionUrl() {
		return this.actionUrl;
	}
	/**
	 * <p>Setter for the field <code>actionUrl</code>.</p>
	 *
	 * @param actionUrl a {@link java.lang.String} object.
	 */
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	/**
	 * <p>Getter for the field <code>adCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdCode() {
		return this.adCode;
	}
	/**
	 * <p>Setter for the field <code>adCode</code>.</p>
	 *
	 * @param adCode a {@link java.lang.String} object.
	 */
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	/**
	 * <p>Getter for the field <code>adRules</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdRules() {
		return this.adRules;
	}
	/**
	 * <p>Setter for the field <code>adRules</code>.</p>
	 *
	 * @param adRules a {@link java.lang.String} object.
	 */
	public void setAdRules(String adRules) {
		this.adRules = adRules;
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
	 * <p>Getter for the field <code>contentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentType() {
		return this.contentType;
	}
	/**
	 * <p>Setter for the field <code>contentType</code>.</p>
	 *
	 * @param contentType a {@link java.lang.String} object.
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime() {
		return this.endTime;
	}
	/**
	 * <p>Setter for the field <code>endTime</code>.</p>
	 *
	 * @param endTime a {@link java.util.Date} object.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * <p>Getter for the field <code>height</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeight() {
		return this.height;
	}
	/**
	 * <p>Setter for the field <code>height</code>.</p>
	 *
	 * @param height a {@link java.lang.String} object.
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
