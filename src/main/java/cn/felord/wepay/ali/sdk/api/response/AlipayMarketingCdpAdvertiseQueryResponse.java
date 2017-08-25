package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCdpAdvertiseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5717816834218129318L;

	/** 
	 * 用户点击广告后，跳转URL地址, 协议必须为HTTPS。广告类型为PIC时，需要设置该值。对于类型为URL不生效
	 */
	@ApiField("action_url")
	private String actionUrl;

	/** 
	 * 广告位标识码，目前广告位只支持在支付宝钱包中显示，口碑app暂不支持。传值：CDP_OPEN_MERCHANT
	 */
	@ApiField("ad_code")
	private String adCode;

	/** 
	 * 该规则用于商家设置对用户是否展示广告的校验条件，目前支持设置商家店铺规则。按业务要求应用对应规则即可
	 */
	@ApiField("ad_rules")
	private String adRules;

	/** 
	 * 广告消失机制，CLOSE_AFTER_CLICK：总共点击一定次数消失
	 */
	@ApiField("behavior")
	private String behavior;

	/** 
	 * 广告扩展字段
	 */
	@ApiField("biz_ext_info")
	private String bizExtInfo;

	/** 
	 * 广告内容。如果广告类型是HTML5，则传入H5链接地址，建议为https协议。最大尺寸不得超过1242px＊242px，小屏幕将按分辨率宽度同比例放大缩小；如果类型是图片，则传入图片ID标识，如何获取图片ID参考图片上传接口：alipay.offline.material.image.upload。图片尺寸为1242px＊290px。图片大小不能超过50kb。
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 广告内容类型，目前包括HTML5和图片，分别传入：URL和PIC
	 */
	@ApiField("content_type")
	private String contentType;

	/** 
	 * 投放广告结束时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 当广告类型是H5时，必须传入内容高度。对于广告位CDP_OPEN_MERCHANT的内容高度不能高于钱包要求的展位高度242px。当广告类型是图片时，不需要传入内容高度(height)，系统会检查用户上传的图片尺寸是否符合要求，对于广告位CDP_OPEN_MERCHANT的图片尺寸要求：宽1242px, 高290px,大小50kb，实际上传图片与图片标准宽高必须一致，图片大小不能超过50kb。
	 */
	@ApiField("height")
	private String height;

	/** 
	 * 投放广告开始时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 在线：ONLINE , 下线：OFFLINE
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Setter for the field <code>actionUrl</code>.</p>
	 *
	 * @param actionUrl a {@link java.lang.String} object.
	 */
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	/**
	 * <p>Getter for the field <code>actionUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionUrl( ) {
		return this.actionUrl;
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
	 * <p>Getter for the field <code>adCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdCode( ) {
		return this.adCode;
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
	 * <p>Getter for the field <code>adRules</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdRules( ) {
		return this.adRules;
	}

	/**
	 * <p>Setter for the field <code>behavior</code>.</p>
	 *
	 * @param behavior a {@link java.lang.String} object.
	 */
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
	/**
	 * <p>Getter for the field <code>behavior</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBehavior( ) {
		return this.behavior;
	}

	/**
	 * <p>Setter for the field <code>bizExtInfo</code>.</p>
	 *
	 * @param bizExtInfo a {@link java.lang.String} object.
	 */
	public void setBizExtInfo(String bizExtInfo) {
		this.bizExtInfo = bizExtInfo;
	}
	/**
	 * <p>Getter for the field <code>bizExtInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizExtInfo( ) {
		return this.bizExtInfo;
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
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent( ) {
		return this.content;
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
	 * <p>Getter for the field <code>contentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentType( ) {
		return this.contentType;
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
	 * <p>Getter for the field <code>endTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndTime( ) {
		return this.endTime;
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
	 * <p>Getter for the field <code>height</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeight( ) {
		return this.height;
	}

	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.util.Date} object.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartTime( ) {
		return this.startTime;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus( ) {
		return this.status;
	}

}
