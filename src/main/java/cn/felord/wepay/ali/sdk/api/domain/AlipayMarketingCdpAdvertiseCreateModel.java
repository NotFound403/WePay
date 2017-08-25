package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 提供给ISV、开发者创建广告的接口，创建广告后投放渠道包括钱包APP，聚牛APP等，投放支持的APP应用
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCdpAdvertiseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5415535264271389286L;

	/**
	 * 用户点击广告后，跳转URL地址，必须为https协议。广告类型为PIC时，需要设置该值。对于类型为URL不生效。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 广告位标识码（务必注意保存），目前广告位只支持在支付宝钱包中显示，口碑app暂不支持。传值：CDP_OPEN_MERCHANT
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 广告展示规则。该规则用于商家设置对用户是否展示广告的校验条件。CDP_OPEN_MERCHANT目前仅支持商家店铺规则，shop_id为支付宝店铺ID，商家登陆https://b.alipay.com/查询。
	 */
	@ApiField("ad_rules")
	private String adRules;

	/**
	 * 广告内容。如果广告类型是URL，则传入H5链接地址，建议为https协议。最大尺寸不得超过1242px＊242px，小屏幕将按分辨率宽度同比例放大缩小；如果类型是图片，则传入图片ID标识。如何获取图片ID参考图片上传接口：alipay.offline.material.image.upload。图片尺寸为1242px＊290px。图片大小不能超过50kb。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 广告类型，目前包括HTML5和图片，分别传入：URL和PIC.
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 投放广告结束时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 当广告类型是H5时，必须传入内容高度。对于广告位CDP_OPEN_MERCHANT的内容高度不能高于钱包要求的展位高度242px。
当广告类型是图片时，不需要传入内容高度(height)，系统会检查用户上传的图片尺寸是否符合要求，对于广告位CDP_OPEN_MERCHANT的图片尺寸要求：宽1242px, 高290px,大小50kb，实际上传图片与图片标准宽高必须一致，图片大小不能超过50kb。
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
