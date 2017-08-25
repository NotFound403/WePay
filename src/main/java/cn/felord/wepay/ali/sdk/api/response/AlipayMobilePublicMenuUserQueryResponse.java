package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.menu.user.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicMenuUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8269772799132523651L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 菜单唯一标识
	 */
	@ApiField("menu_key")
	private String menuKey;

	/** 
	 * 结果码描述
	 */
	@ApiField("msg")
	private String msg;

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
