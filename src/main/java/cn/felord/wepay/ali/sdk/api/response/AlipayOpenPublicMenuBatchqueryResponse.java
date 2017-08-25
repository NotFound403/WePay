package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.QueryMenu;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMenuBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6654694661947984128L;

	/** 
	 * 菜单数量，包括默认菜单和个性化菜单
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 菜单列表
	 */
	@ApiListField("menus")
	@ApiField("query_menu")
	private List<QueryMenu> menus;

	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.String} object.
	 */
	public void setCount(String count) {
		this.count = count;
	}
	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCount( ) {
		return this.count;
	}

	/**
	 * <p>Setter for the field <code>menus</code>.</p>
	 *
	 * @param menus a {@link java.util.List} object.
	 */
	public void setMenus(List<QueryMenu> menus) {
		this.menus = menus;
	}
	/**
	 * <p>Getter for the field <code>menus</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QueryMenu> getMenus( ) {
		return this.menus;
	}

}
