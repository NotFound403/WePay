package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.code.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileCodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7374984458771567822L;

	/** 
	 * 业务关联的id，如订单号,userId
	 */
	@ApiField("biz_linked_id")
	private String bizLinkedId;

	/** 
	 * 业务类型，类型产品名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 码值状态，
init:初始
normal:正常
pause:暂停
stop:停止
	 */
	@ApiField("code_status")
	private String codeStatus;

	/** 
	 * 发码接口传入的扩展参数，业务自定义,码平台不用理解。
	 */
	@ApiField("context_str")
	private String contextStr;

	/** 
	 * 动态生成图片地址
	 */
	@ApiField("dynamic_img_url")
	private String dynamicImgUrl;

	/** 
	 * 编码失效时间(yyyy-MM-dd hh:mm:ss)
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * 如果是true，则扫一扫下发跳转地址直接取自BizLinkedId
否则，从路由信息里取跳转地址
	 */
	@ApiField("is_direct")
	private String isDirect;

	/** 
	 * 备注信息字段
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 业务用到的码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 原始码值
	 */
	@ApiField("qr_token")
	private String qrToken;

	/** 
	 * 发码来源，业务自定义
	 */
	@ApiField("source_id")
	private String sourceId;

	/** 
	 * 编码启动时间（yyy-MM-dd hh:mm:ss），为空表示立即启用
	 */
	@ApiField("start_date")
	private Date startDate;

	/** 
	 * 发码请求中带的支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Setter for the field <code>bizLinkedId</code>.</p>
	 *
	 * @param bizLinkedId a {@link java.lang.String} object.
	 */
	public void setBizLinkedId(String bizLinkedId) {
		this.bizLinkedId = bizLinkedId;
	}
	/**
	 * <p>Getter for the field <code>bizLinkedId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizLinkedId( ) {
		return this.bizLinkedId;
	}

	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType( ) {
		return this.bizType;
	}

	/**
	 * <p>Setter for the field <code>codeStatus</code>.</p>
	 *
	 * @param codeStatus a {@link java.lang.String} object.
	 */
	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}
	/**
	 * <p>Getter for the field <code>codeStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeStatus( ) {
		return this.codeStatus;
	}

	/**
	 * <p>Setter for the field <code>contextStr</code>.</p>
	 *
	 * @param contextStr a {@link java.lang.String} object.
	 */
	public void setContextStr(String contextStr) {
		this.contextStr = contextStr;
	}
	/**
	 * <p>Getter for the field <code>contextStr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContextStr( ) {
		return this.contextStr;
	}

	/**
	 * <p>Setter for the field <code>dynamicImgUrl</code>.</p>
	 *
	 * @param dynamicImgUrl a {@link java.lang.String} object.
	 */
	public void setDynamicImgUrl(String dynamicImgUrl) {
		this.dynamicImgUrl = dynamicImgUrl;
	}
	/**
	 * <p>Getter for the field <code>dynamicImgUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDynamicImgUrl( ) {
		return this.dynamicImgUrl;
	}

	/**
	 * <p>Setter for the field <code>expireDate</code>.</p>
	 *
	 * @param expireDate a {@link java.lang.String} object.
	 */
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	/**
	 * <p>Getter for the field <code>expireDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpireDate( ) {
		return this.expireDate;
	}

	/**
	 * <p>Setter for the field <code>isDirect</code>.</p>
	 *
	 * @param isDirect a {@link java.lang.String} object.
	 */
	public void setIsDirect(String isDirect) {
		this.isDirect = isDirect;
	}
	/**
	 * <p>Getter for the field <code>isDirect</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsDirect( ) {
		return this.isDirect;
	}

	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo( ) {
		return this.memo;
	}

	/**
	 * <p>Setter for the field <code>qrCode</code>.</p>
	 *
	 * @param qrCode a {@link java.lang.String} object.
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	/**
	 * <p>Getter for the field <code>qrCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCode( ) {
		return this.qrCode;
	}

	/**
	 * <p>Setter for the field <code>qrToken</code>.</p>
	 *
	 * @param qrToken a {@link java.lang.String} object.
	 */
	public void setQrToken(String qrToken) {
		this.qrToken = qrToken;
	}
	/**
	 * <p>Getter for the field <code>qrToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrToken( ) {
		return this.qrToken;
	}

	/**
	 * <p>Setter for the field <code>sourceId</code>.</p>
	 *
	 * @param sourceId a {@link java.lang.String} object.
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * <p>Getter for the field <code>sourceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceId( ) {
		return this.sourceId;
	}

	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.util.Date} object.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * <p>Getter for the field <code>startDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartDate( ) {
		return this.startDate;
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
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId( ) {
		return this.userId;
	}

}
