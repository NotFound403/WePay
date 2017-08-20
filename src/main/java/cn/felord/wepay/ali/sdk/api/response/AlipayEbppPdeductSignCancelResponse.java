package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 17:04:09
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

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}
	public String getOutAgreementId( ) {
		return this.outAgreementId;
	}

}
