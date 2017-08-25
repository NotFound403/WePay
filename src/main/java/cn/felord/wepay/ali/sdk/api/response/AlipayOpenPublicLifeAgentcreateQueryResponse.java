package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.agentcreate.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeAgentcreateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4692919296537458214L;

	/** 
	 * 只有审核通过，且商户在支付宝发送的授权邮件中确认授权，此时生活号才会正式创建，查询才会返回该值
	 */
	@ApiField("life_app_id")
	private String lifeAppId;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、待商户确认、成功、失败。注:暂存是审核前的中间状态，如出现暂存请再次提交
	 */
	@ApiField("order_status_biz_desc")
	private String orderStatusBizDesc;

	/** 
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 只有审核失败才会返回该值
	 */
	@ApiField("refused_reason")
	private String refusedReason;

	/**
	 * <p>Setter for the field <code>lifeAppId</code>.</p>
	 *
	 * @param lifeAppId a {@link java.lang.String} object.
	 */
	public void setLifeAppId(String lifeAppId) {
		this.lifeAppId = lifeAppId;
	}
	/**
	 * <p>Getter for the field <code>lifeAppId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLifeAppId( ) {
		return this.lifeAppId;
	}

	/**
	 * <p>Setter for the field <code>merchantPid</code>.</p>
	 *
	 * @param merchantPid a {@link java.lang.String} object.
	 */
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	/**
	 * <p>Getter for the field <code>merchantPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	/**
	 * <p>Setter for the field <code>orderStatusBizDesc</code>.</p>
	 *
	 * @param orderStatusBizDesc a {@link java.lang.String} object.
	 */
	public void setOrderStatusBizDesc(String orderStatusBizDesc) {
		this.orderStatusBizDesc = orderStatusBizDesc;
	}
	/**
	 * <p>Getter for the field <code>orderStatusBizDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatusBizDesc( ) {
		return this.orderStatusBizDesc;
	}

	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	/**
	 * <p>Setter for the field <code>refusedReason</code>.</p>
	 *
	 * @param refusedReason a {@link java.lang.String} object.
	 */
	public void setRefusedReason(String refusedReason) {
		this.refusedReason = refusedReason;
	}
	/**
	 * <p>Getter for the field <code>refusedReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefusedReason( ) {
		return this.refusedReason;
	}

}
