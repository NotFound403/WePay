package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayZmScoreZrankResult;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zmscore.zrank.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZmscoreZrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1455891392151729446L;

	/** 
	 * 芝麻分分段
	 */
	@ApiField("zm_score_zrank")
	private AlipayZmScoreZrankResult zmScoreZrank;

	/**
	 * <p>Setter for the field <code>zmScoreZrank</code>.</p>
	 *
	 * @param zmScoreZrank a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayZmScoreZrankResult} object.
	 */
	public void setZmScoreZrank(AlipayZmScoreZrankResult zmScoreZrank) {
		this.zmScoreZrank = zmScoreZrank;
	}
	/**
	 * <p>Getter for the field <code>zmScoreZrank</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayZmScoreZrankResult} object.
	 */
	public AlipayZmScoreZrankResult getZmScoreZrank( ) {
		return this.zmScoreZrank;
	}

}
