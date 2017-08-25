package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2877997351995394297L;

	/** 
	 * 一级菜单数组，个数应为1~4个
	 */
	@ApiField("menu_content")
	private String menuContent;

	/**
	 * <p>Setter for the field <code>menuContent</code>.</p>
	 *
	 * @param menuContent a {@link java.lang.String} object.
	 */
	public void setMenuContent(String menuContent) {
		this.menuContent = menuContent;
	}
	/**
	 * <p>Getter for the field <code>menuContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMenuContent( ) {
		return this.menuContent;
	}

}
