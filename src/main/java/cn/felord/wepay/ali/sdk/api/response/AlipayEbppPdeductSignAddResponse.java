package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.add response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppPdeductSignAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7381173523588939249L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝协议状态。签约成功则返回success
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 扩展参数，可为空
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 通知方式设置。
	 */
	@ApiField("notify_config")
	private String notifyConfig;

	/** 
	 * 商户生成的代扣协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/** 
	 * 支付方式设置
	 */
	@ApiListField("pay_config")
	@ApiField("string")
	private List<String> payConfig;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_date")
	private String signDate;

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
	 * <p>Setter for the field <code>notifyConfig</code>.</p>
	 *
	 * @param notifyConfig a {@link java.lang.String} object.
	 */
	public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}
	/**
	 * <p>Getter for the field <code>notifyConfig</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyConfig( ) {
		return this.notifyConfig;
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
	 * <p>Setter for the field <code>payConfig</code>.</p>
	 *
	 * @param payConfig a {@link java.util.List} object.
	 */
	public void setPayConfig(List<String> payConfig) {
		this.payConfig = payConfig;
	}
	/**
	 * <p>Getter for the field <code>payConfig</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPayConfig( ) {
		return this.payConfig;
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

}
