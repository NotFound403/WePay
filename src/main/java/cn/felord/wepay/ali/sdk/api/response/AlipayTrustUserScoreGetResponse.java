package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AliTrustScore;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-04 10:16:11
 */
public class AlipayTrustUserScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6493566678282645758L;

	/** 
	 * 芝麻信用通过模型计算出的该用户的芝麻信用评分
	 */
	@ApiField("ali_trust_score")
	private AliTrustScore aliTrustScore;

	public void setAliTrustScore(AliTrustScore aliTrustScore) {
		this.aliTrustScore = aliTrustScore;
	}
	public AliTrustScore getAliTrustScore( ) {
		return this.aliTrustScore;
	}

}
