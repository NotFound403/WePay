package cn.felord.wepay.ali.sdk.api.response;

import java.util.Date;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.operation.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundCouponOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8282453224674799888L;

	/** 
	 * 该支付宝操作流水操作金额，单位为：元（人民币）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 商户请求创建预授权订单时传入的扩展参数（merchantExt, orderExpiredTime）
	 */
	@ApiField("extra_param")
	private String extraParam;

	/** 
	 * 资金授权单据操作流水创建时间，
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 支付宝账务处理成功时间，
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 支付宝资金操作类型。
目前支持： 
PAY：支付
REFUND：退款
	 */
	@ApiField("operation_type")
	private String operationType;

	/** 
	 * 业务订单的简单描述，如商品名称等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 收款方支付宝账号（Email或手机号）。仅作展示使用，默认会加“*”号处理
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/** 
	 * 收款方支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/** 
	 * 付款方支付宝账号（Email或手机号）。仅作展示使用，默认会加“*”号处理
	 */
	@ApiField("payer_logon_id")
	private String payerLogonId;

	/** 
	 * 付款方支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/** 
	 * 商户对本次操作的附言描述，长度不超过100个字母或50个汉字
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 资金操作流水的状态，
目前支持： 
INIT：初始
SUCCESS：成功
CLOSED：关闭
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 红包总退回金额，单位为：元（人民币）
	 */
	@ApiField("total_pay_refund_amount")
	private String totalPayRefundAmount;

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
	 * <p>Setter for the field <code>extraParam</code>.</p>
	 *
	 * @param extraParam a {@link java.lang.String} object.
	 */
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}
	/**
	 * <p>Getter for the field <code>extraParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtraParam( ) {
		return this.extraParam;
	}

	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.util.Date} object.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreate( ) {
		return this.gmtCreate;
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
	 * <p>Setter for the field <code>operationType</code>.</p>
	 *
	 * @param operationType a {@link java.lang.String} object.
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	/**
	 * <p>Getter for the field <code>operationType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperationType( ) {
		return this.operationType;
	}

	/**
	 * <p>Setter for the field <code>orderTitle</code>.</p>
	 *
	 * @param orderTitle a {@link java.lang.String} object.
	 */
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	/**
	 * <p>Getter for the field <code>orderTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderTitle( ) {
		return this.orderTitle;
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
	 * <p>Setter for the field <code>payeeLogonId</code>.</p>
	 *
	 * @param payeeLogonId a {@link java.lang.String} object.
	 */
	public void setPayeeLogonId(String payeeLogonId) {
		this.payeeLogonId = payeeLogonId;
	}
	/**
	 * <p>Getter for the field <code>payeeLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeLogonId( ) {
		return this.payeeLogonId;
	}

	/**
	 * <p>Setter for the field <code>payeeUserId</code>.</p>
	 *
	 * @param payeeUserId a {@link java.lang.String} object.
	 */
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}
	/**
	 * <p>Getter for the field <code>payeeUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeUserId( ) {
		return this.payeeUserId;
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
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark( ) {
		return this.remark;
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

	/**
	 * <p>Setter for the field <code>totalPayRefundAmount</code>.</p>
	 *
	 * @param totalPayRefundAmount a {@link java.lang.String} object.
	 */
	public void setTotalPayRefundAmount(String totalPayRefundAmount) {
		this.totalPayRefundAmount = totalPayRefundAmount;
	}
	/**
	 * <p>Getter for the field <code>totalPayRefundAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalPayRefundAmount( ) {
		return this.totalPayRefundAmount;
	}

}
