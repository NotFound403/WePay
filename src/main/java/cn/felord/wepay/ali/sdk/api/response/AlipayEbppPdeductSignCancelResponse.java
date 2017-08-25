package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.cancel response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppPdeductSignCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2438444334879352356L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝协议状态。解约成功则返回success
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 商户代扣协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

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
	 * <p>Setter for the field <code>agreementStatus</code>.</p>
	 *
	 * @param agreementStatus a {@link java.lang.String} object.
	 */
	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	/**
	 * <p>Getter for the field <code>agreementStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	/**
	 * <p>Setter for the field <code>outAgreementId</code>.</p>
	 *
	 * @param outAgreementId a {@link java.lang.String} object.
	 */
	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}
	/**
	 * <p>Getter for the field <code>outAgreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutAgreementId( ) {
		return this.outAgreementId;
	}

}
