package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6541833757415145475L;

	/** 
	 * 默认菜单菜单key，文本菜单为“default”，icon菜单为“iconDefault”
	 */
	@ApiField("menu_key")
	private String menuKey;

	/**
	 * <p>Setter for the field <code>menuKey</code>.</p>
	 *
	 * @param menuKey a {@link java.lang.String} object.
	 */
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	/**
	 * <p>Getter for the field <code>menuKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
