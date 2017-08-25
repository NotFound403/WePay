package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppPdeductSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6641619212497826495L;

	/** 
	 * 协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 朗新协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_date")
	private String signDate;

	/** 
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

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
	 * <p>Setter for the field <code>billKey</code>.</p>
	 *
	 * @param billKey a {@link java.lang.String} object.
	 */
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	/**
	 * <p>Getter for the field <code>billKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillKey( ) {
		return this.billKey;
	}

	/**
	 * <p>Setter for the field <code>chargeInst</code>.</p>
	 *
	 * @param chargeInst a {@link java.lang.String} object.
	 */
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	/**
	 * <p>Getter for the field <code>chargeInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInst( ) {
		return this.chargeInst;
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

	/**
	 * <p>Setter for the field <code>signDate</code>.</p>
	 *
	 * @param signDate a {@link java.lang.String} object.
	 */
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	/**
	 * <p>Getter for the field <code>signDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSignDate( ) {
		return this.signDate;
	}

	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId( ) {
		return this.userId;
	}

}
