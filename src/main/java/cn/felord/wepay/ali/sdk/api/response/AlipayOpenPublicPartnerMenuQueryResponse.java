package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.partner.menu.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPartnerMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7279699183781551693L;

	/** 
	 * 服务窗菜单
	 */
	@ApiField("public_menu")
	private String publicMenu;

	/**
	 * <p>Setter for the field <code>publicMenu</code>.</p>
	 *
	 * @param publicMenu a {@link java.lang.String} object.
	 */
	public void setPublicMenu(String publicMenu) {
		this.publicMenu = publicMenu;
	}
	/**
	 * <p>Getter for the field <code>publicMenu</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicMenu( ) {
		return this.publicMenu;
	}

}
