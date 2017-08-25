package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.pay response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppPdeductPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6494952724378738473L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝订单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 扩展参数
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 商户代扣业务流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 订单支付状态。
0：未知
1：成功
2：失败
	 */
	@ApiField("result_status")
	private String resultStatus;

	/**
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId( ) {
		return this.agreementId;
	}

	/**
	 * <p>Setter for the field <code>billNo</code>.</p>
	 *
	 * @param billNo a {@link java.lang.String} object.
	 */
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	/**
	 * <p>Getter for the field <code>billNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillNo( ) {
		return this.billNo;
	}

	/**
	 * <p>Setter for the field <code>extendField</code>.</p>
	 *
	 * @param extendField a {@link java.lang.String} object.
	 */
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	/**
	 * <p>Getter for the field <code>extendField</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendField( ) {
		return this.extendField;
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
	 * <p>Setter for the field <code>resultStatus</code>.</p>
	 *
	 * @param resultStatus a {@link java.lang.String} object.
	 */
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	/**
	 * <p>Getter for the field <code>resultStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
