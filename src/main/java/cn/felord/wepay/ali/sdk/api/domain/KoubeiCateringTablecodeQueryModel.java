package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 扫一扫查询桌码信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCateringTablecodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3523255496218558326L;

	/**
	 * 用户在isv界面通过扫一扫传入的url文本
	 */
	@ApiField("url_context")
	private String urlContext;

	/**
	 * <p>Getter for the field <code>urlContext</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrlContext() {
		return this.urlContext;
	}
	/**
	 * <p>Setter for the field <code>urlContext</code>.</p>
	 *
	 * @param urlContext a {@link java.lang.String} object.
	 */
	public void setUrlContext(String urlContext) {
		this.urlContext = urlContext;
	}

}
