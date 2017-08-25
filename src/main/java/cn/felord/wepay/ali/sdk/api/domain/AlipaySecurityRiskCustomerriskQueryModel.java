package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户风险服务输出
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskCustomerriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7691884814397272924L;

	/**
	 * 银行卡号不唯一，用于传递服务商查询接入的商户的银行卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 身份证号不唯一，用于传递服务商查询接入的商户风险所需要的身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 手机号不唯一，用于传递服务商查询接入的商户的手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 风险类型不唯一，用于服务商查询接入的商户风险，例如：merchant_general（综合风险），merchant_fraud（欺诈风险），merchant_business（资质风险）等，签约时指定查询风险类型，且一次调用可以传递多个风险类型，用逗号隔开
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * <p>Getter for the field <code>cardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNo() {
		return this.cardNo;
	}
	/**
	 * <p>Setter for the field <code>cardNo</code>.</p>
	 *
	 * @param cardNo a {@link java.lang.String} object.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo() {
		return this.certNo;
	}
	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * <p>Getter for the field <code>mobileNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobileNo() {
		return this.mobileNo;
	}
	/**
	 * <p>Setter for the field <code>mobileNo</code>.</p>
	 *
	 * @param mobileNo a {@link java.lang.String} object.
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * <p>Getter for the field <code>riskType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskType() {
		return this.riskType;
	}
	/**
	 * <p>Setter for the field <code>riskType</code>.</p>
	 *
	 * @param riskType a {@link java.lang.String} object.
	 */
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
