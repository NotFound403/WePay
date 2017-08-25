package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * yufalingsanyaowub
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppYufalingsanyaowubYufalingsanyaowubQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1264358665464973355L;

	/**
	 * yufaa
	 */
	@ApiField("yufaa")
	private String yufaa;

	/**
	 * <p>Getter for the field <code>yufaa</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getYufaa() {
		return this.yufaa;
	}
	/**
	 * <p>Setter for the field <code>yufaa</code>.</p>
	 *
	 * @param yufaa a {@link java.lang.String} object.
	 */
	public void setYufaa(String yufaa) {
		this.yufaa = yufaa;
	}

}
