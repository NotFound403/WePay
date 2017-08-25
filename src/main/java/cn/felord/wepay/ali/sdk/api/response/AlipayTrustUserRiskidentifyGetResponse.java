package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AliTrustRiskIdentify;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.riskidentify.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTrustUserRiskidentifyGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4397184494557537167L;

	/** 
	 * 行业关注名单识别结果
	 */
	@ApiField("ali_trust_risk_identify")
	private AliTrustRiskIdentify aliTrustRiskIdentify;

	/**
	 * <p>Setter for the field <code>aliTrustRiskIdentify</code>.</p>
	 *
	 * @param aliTrustRiskIdentify a {@link cn.felord.wepay.ali.sdk.api.domain.AliTrustRiskIdentify} object.
	 */
	public void setAliTrustRiskIdentify(AliTrustRiskIdentify aliTrustRiskIdentify) {
		this.aliTrustRiskIdentify = aliTrustRiskIdentify;
	}
	/**
	 * <p>Getter for the field <code>aliTrustRiskIdentify</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AliTrustRiskIdentify} object.
	 */
	public AliTrustRiskIdentify getAliTrustRiskIdentify( ) {
		return this.aliTrustRiskIdentify;
	}

}
