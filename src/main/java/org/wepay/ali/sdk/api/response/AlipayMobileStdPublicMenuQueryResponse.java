package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:30:12
 */
public class AlipayMobileStdPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678321617662146937L;

	/** 
	 * 所有菜单列表json串
	 */
	@ApiField("all_menu_list")
	private String allMenuList;

	public void setAllMenuList(String allMenuList) {
		this.allMenuList = allMenuList;
	}
	public String getAllMenuList( ) {
		return this.allMenuList;
	}

}
