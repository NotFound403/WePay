package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.menu.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8689529311639887725L;

	/** 
	 * 所有菜单列表json串
	 */
	@ApiField("all_menu_list")
	private String allMenuList;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

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

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

	/** {@inheritDoc} */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * <p>Getter for the field <code>msg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsg( ) {
		return this.msg;
	}

}
