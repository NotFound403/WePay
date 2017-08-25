package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.operation.cancel response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundAuthOperationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2859213184419495719L;

	/** 
	 * 本次撤销触发的资金动作
close：关闭冻结明细，无资金解冻
unfreeze：产生了资金解冻
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 支付宝资金授权订单号。
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 支付宝的冻结操作流水号。
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户的授权资金订单号。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户的冻结操作流水号 。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * <p>Setter for the field <code>action</code>.</p>
	 *
	 * @param action a {@link java.lang.String} object.
	 */
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * <p>Getter for the field <code>action</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAction( ) {
		return this.action;
	}

	/**
	 * <p>Setter for the field <code>authNo</code>.</p>
	 *
	 * @param authNo a {@link java.lang.String} object.
	 */
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	/**
	 * <p>Getter for the field <code>authNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthNo( ) {
		return this.authNo;
	}

	/**
	 * <p>Setter for the field <code>operationId</code>.</p>
	 *
	 * @param operationId a {@link java.lang.String} object.
	 */
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	/**
	 * <p>Getter for the field <code>operationId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperationId( ) {
		return this.operationId;
	}

	/**
	 * <p>Setter for the field <code>outOrderNo</code>.</p>
	 *
	 * @param outOrderNo a {@link java.lang.String} object.
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	/**
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	/**
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
