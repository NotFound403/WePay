package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.info.analysis response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityInfoAnalysisResponse extends AlipayResponse {

	private static final long serialVersionUID = 4422528396495822623L;

	/** 
	 * 风险标签
	 */
	@ApiField("risk_code")
	private String riskCode;

	/** 
	 * 风险等级
	 */
	@ApiField("risk_level")
	private Long riskLevel;

	/**
	 * <p>Setter for the field <code>riskCode</code>.</p>
	 *
	 * @param riskCode a {@link java.lang.String} object.
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	/**
	 * <p>Getter for the field <code>riskCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskCode( ) {
		return this.riskCode;
	}

	/**
	 * <p>Setter for the field <code>riskLevel</code>.</p>
	 *
	 * @param riskLevel a {@link java.lang.Long} object.
	 */
	public void setRiskLevel(Long riskLevel) {
		this.riskLevel = riskLevel;
	}
	/**
	 * <p>Getter for the field <code>riskLevel</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRiskLevel( ) {
		return this.riskLevel;
	}

}
