package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * yufalingsanyaowub
 *
 * @author auto create
 * @since 1.0, 2017-03-15 22:56:43
 */
public class AlipayOpenAppYufalingsanyaowubYufalingsanyaowubQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1264358665464973355L;

	/**
	 * yufaa
	 */
	@ApiField("yufaa")
	private String yufaa;

	public String getYufaa() {
		return this.yufaa;
	}
	public void setYufaa(String yufaa) {
		this.yufaa = yufaa;
	}

}
