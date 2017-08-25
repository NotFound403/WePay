package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 芝麻分分段
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZmScoreZrankResult extends AlipayObject {

	private static final long serialVersionUID = 2366852676227257989L;

	/**
	 * 芝麻分分段 Z0-Z7
	 */
	@ApiField("zrank")
	private String zrank;

	/**
	 * <p>Getter for the field <code>zrank</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getZrank() {
		return this.zrank;
	}
	/**
	 * <p>Setter for the field <code>zrank</code>.</p>
	 *
	 * @param zrank a {@link java.lang.String} object.
	 */
	public void setZrank(String zrank) {
		this.zrank = zrank;
	}

}
