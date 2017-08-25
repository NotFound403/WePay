package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 个性化菜单删除
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPersonalizedMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6358547824869751113L;

	/**
	 * 要删除的个性化菜单key
	 */
	@ApiField("menu_key")
	private String menuKey;

	/**
	 * <p>Getter for the field <code>menuKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMenuKey() {
		return this.menuKey;
	}
	/**
	 * <p>Setter for the field <code>menuKey</code>.</p>
	 *
	 * @param menuKey a {@link java.lang.String} object.
	 */
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

}
