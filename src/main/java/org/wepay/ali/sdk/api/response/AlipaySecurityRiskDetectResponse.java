package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.detect response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-04 14:55:25
 */
public class AlipaySecurityRiskDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2133393314258838444L;

	/** 
	 * 结果码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/** 
	 * 风险等级
	 */
	@ApiField("risk_level")
	private Long riskLevel;

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getRiskCode( ) {
		return this.riskCode;
	}

	public void setRiskLevel(Long riskLevel) {
		this.riskLevel = riskLevel;
	}
	public Long getRiskLevel( ) {
		return this.riskLevel;
	}

}
