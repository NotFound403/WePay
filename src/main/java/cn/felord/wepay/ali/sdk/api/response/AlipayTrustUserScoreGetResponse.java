package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AliTrustScore;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.score.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTrustUserScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6493566678282645758L;

	/** 
	 * 芝麻信用通过模型计算出的该用户的芝麻信用评分
	 */
	@ApiField("ali_trust_score")
	private AliTrustScore aliTrustScore;

	/**
	 * <p>Setter for the field <code>aliTrustScore</code>.</p>
	 *
	 * @param aliTrustScore a {@link cn.felord.wepay.ali.sdk.api.domain.AliTrustScore} object.
	 */
	public void setAliTrustScore(AliTrustScore aliTrustScore) {
		this.aliTrustScore = aliTrustScore;
	}
	/**
	 * <p>Getter for the field <code>aliTrustScore</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AliTrustScore} object.
	 */
	public AliTrustScore getAliTrustScore( ) {
		return this.aliTrustScore;
	}

}
