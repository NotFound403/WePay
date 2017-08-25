package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8525563878767771762L;

	/** 
	 * 开店请求受理成功后返回的支付宝流水ID，根据此ID调用接口
alipay.offline.market.applyorder.batchquery，能够获取当前开店请求审核状态、驳回原因等信息。
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 废弃字段。
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 同步请求如果支付宝受理成功，将返回AUDITING状态。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 废弃字段，T表示上架,F表示未上架。
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 废弃字段，T表示显示，F表示隐藏。
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 开店请求结果码：
WAIT_MERCHANT_CONFIRM：等待商户确认
当开店需要商户确认时返回此结果码，商户需要登录到商家中心e.alipay.com进行开店确认。例如，ISV帮商户开店时，出现需要改签口碑当面付主体，接口同步返回此错误码，并且支付宝发送短信告知商户登录商家中心进行改签确认，确认后进入到后续审核流程。
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 废弃字段，支付宝门店ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Setter for the field <code>applyId</code>.</p>
	 *
	 * @param applyId a {@link java.lang.String} object.
	 */
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	/**
	 * <p>Getter for the field <code>applyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyId( ) {
		return this.applyId;
	}

	/**
	 * <p>Setter for the field <code>auditDesc</code>.</p>
	 *
	 * @param auditDesc a {@link java.lang.String} object.
	 */
	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	/**
	 * <p>Getter for the field <code>auditDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	/**
	 * <p>Setter for the field <code>auditStatus</code>.</p>
	 *
	 * @param auditStatus a {@link java.lang.String} object.
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * <p>Getter for the field <code>auditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	/**
	 * <p>Setter for the field <code>isOnline</code>.</p>
	 *
	 * @param isOnline a {@link java.lang.String} object.
	 */
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	/**
	 * <p>Getter for the field <code>isOnline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsOnline( ) {
		return this.isOnline;
	}

	/**
	 * <p>Setter for the field <code>isShow</code>.</p>
	 *
	 * @param isShow a {@link java.lang.String} object.
	 */
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	/**
	 * <p>Getter for the field <code>isShow</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsShow( ) {
		return this.isShow;
	}

	/**
	 * <p>Setter for the field <code>resultCode</code>.</p>
	 *
	 * @param resultCode a {@link java.lang.String} object.
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * <p>Getter for the field <code>resultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultCode( ) {
		return this.resultCode;
	}

	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId( ) {
		return this.shopId;
	}

}
