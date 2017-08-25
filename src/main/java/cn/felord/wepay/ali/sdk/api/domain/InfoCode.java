package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 风险解释
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InfoCode extends AlipayObject {

	private static final long serialVersionUID = 7279379553413756447L;

	/**
	 * 风险描述
	 */
	@ApiField("risk_description")
	private String riskDescription;

	/**
	 * 风险因素编码
	 */
	@ApiField("risk_factor_code")
	private String riskFactorCode;

	/**
	 * 风险因素名称
	 */
	@ApiField("risk_factor_name")
	private String riskFactorName;

	/**
	 * 风险度量
	 */
	@ApiField("risk_magnitude")
	private String riskMagnitude;

	/**
	 * <p>Getter for the field <code>riskDescription</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskDescription() {
		return this.riskDescription;
	}
	/**
	 * <p>Setter for the field <code>riskDescription</code>.</p>
	 *
	 * @param riskDescription a {@link java.lang.String} object.
	 */
	public void setRiskDescription(String riskDescription) {
		this.riskDescription = riskDescription;
	}

	/**
	 * <p>Getter for the field <code>riskFactorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskFactorCode() {
		return this.riskFactorCode;
	}
	/**
	 * <p>Setter for the field <code>riskFactorCode</code>.</p>
	 *
	 * @param riskFactorCode a {@link java.lang.String} object.
	 */
	public void setRiskFactorCode(String riskFactorCode) {
		this.riskFactorCode = riskFactorCode;
	}

	/**
	 * <p>Getter for the field <code>riskFactorName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskFactorName() {
		return this.riskFactorName;
	}
	/**
	 * <p>Setter for the field <code>riskFactorName</code>.</p>
	 *
	 * @param riskFactorName a {@link java.lang.String} object.
	 */
	public void setRiskFactorName(String riskFactorName) {
		this.riskFactorName = riskFactorName;
	}

	/**
	 * <p>Getter for the field <code>riskMagnitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskMagnitude() {
		return this.riskMagnitude;
	}
	/**
	 * <p>Setter for the field <code>riskMagnitude</code>.</p>
	 *
	 * @param riskMagnitude a {@link java.lang.String} object.
	 */
	public void setRiskMagnitude(String riskMagnitude) {
		this.riskMagnitude = riskMagnitude;
	}

}
