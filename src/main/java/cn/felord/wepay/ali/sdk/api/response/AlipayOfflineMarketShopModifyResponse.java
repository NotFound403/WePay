package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.modify response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4542542973276529664L;

	/** 
	 * 修改门店请求受理成功后返回的支付宝流水ID，根据此ID调用接口
alipay.offline.market.applyorder.batchquery，能够获取当前修改店铺请求审核状态、驳回原因等信息。
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

}
