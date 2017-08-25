package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileStdPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678321617662146937L;

	/** 
	 * 所有菜单列表json串
	 */
	@ApiField("all_menu_list")
	private String allMenuList;

	/**
	 * <p>Setter for the field <code>allMenuList</code>.</p>
	 *
	 * @param allMenuList a {@link java.lang.String} object.
	 */
	public void setAllMenuList(String allMenuList) {
		this.allMenuList = allMenuList;
	}
	/**
	 * <p>Getter for the field <code>allMenuList</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAllMenuList( ) {
		return this.allMenuList;
	}

}
