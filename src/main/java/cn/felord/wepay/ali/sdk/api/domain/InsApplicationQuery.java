package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 投保单查询结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsApplicationQuery extends AlipayObject {

	private static final long serialVersionUID = 2215636347474792835L;

	/**
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 投保单状态;此状态用于判断投保流程的推进过程.INIT: 初始,UNDERWROTE:已核保, DECLINED:已拒保,CLOSED:已关闭, PAID:已付款,REFUND:已退款,ISSUED:已出单
	 */
	@ApiField("application_status")
	private String applicationStatus;

	/**
	 * 保险机构
	 */
	@ApiField("merchant")
	private InsMerchant merchant;

	/**
	 * 交易操作流水号;用于跳支付宝收银台付款
	 */
	@ApiField("operation_id")
	private String operationId;

	/**
	 * 商户生成的外部投保业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 支付交易订单号;用于跳支付宝收银台付款
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>applicationNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	/**
	 * <p>Setter for the field <code>applicationNo</code>.</p>
	 *
	 * @param applicationNo a {@link java.lang.String} object.
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * <p>Getter for the field <code>applicationStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplicationStatus() {
		return this.applicationStatus;
	}
	/**
	 * <p>Setter for the field <code>applicationStatus</code>.</p>
	 *
	 * @param applicationStatus a {@link java.lang.String} object.
	 */
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * <p>Getter for the field <code>merchant</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsMerchant} object.
	 */
	public InsMerchant getMerchant() {
		return this.merchant;
	}
	/**
	 * <p>Setter for the field <code>merchant</code>.</p>
	 *
	 * @param merchant a {@link cn.felord.wepay.ali.sdk.api.domain.InsMerchant} object.
	 */
	public void setMerchant(InsMerchant merchant) {
		this.merchant = merchant;
	}

	/**
	 * <p>Getter for the field <code>operationId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperationId() {
		return this.operationId;
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
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
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
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
