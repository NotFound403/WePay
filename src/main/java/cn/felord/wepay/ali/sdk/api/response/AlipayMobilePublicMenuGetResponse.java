package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.menu.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicMenuGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3882416961933755474L;

	/** 
	 * success
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 菜单内容
	 */
	@ApiField("menu_content")
	private String menuContent;

	/** 
	 * 成功
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
