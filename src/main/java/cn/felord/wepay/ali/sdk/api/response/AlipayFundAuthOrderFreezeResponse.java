package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.freeze response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundAuthOrderFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1677434853148322813L;

	/** 
	 * 本次操作冻结的金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝的资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 资金授权成功时间
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝的资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户本次资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 收款方支付宝账号（Email或手机号）
	 */
	@ApiField("payer_logon_id")
	private String payerLogonId;

	/** 
	 * 付款方支付宝用户号
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/** 
	 * 资金预授权明细的状态
目前支持：  INIT：初始
SUCCESS: 成功
CLOSED：关闭
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount( ) {
		return this.amount;
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
	 * <p>Setter for the field <code>gmtTrans</code>.</p>
	 *
	 * @param gmtTrans a {@link java.util.Date} object.
	 */
	public void setGmtTrans(Date gmtTrans) {
		this.gmtTrans = gmtTrans;
	}
	/**
	 * <p>Getter for the field <code>gmtTrans</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtTrans( ) {
		return this.gmtTrans;
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

	/**
	 * <p>Setter for the field <code>payerLogonId</code>.</p>
	 *
	 * @param payerLogonId a {@link java.lang.String} object.
	 */
	public void setPayerLogonId(String payerLogonId) {
		this.payerLogonId = payerLogonId;
	}
	/**
	 * <p>Getter for the field <code>payerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerLogonId( ) {
		return this.payerLogonId;
	}

	/**
	 * <p>Setter for the field <code>payerUserId</code>.</p>
	 *
	 * @param payerUserId a {@link java.lang.String} object.
	 */
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	/**
	 * <p>Getter for the field <code>payerUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerUserId( ) {
		return this.payerUserId;
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
