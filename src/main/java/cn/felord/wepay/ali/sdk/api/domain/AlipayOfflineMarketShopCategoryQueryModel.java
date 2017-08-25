package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店类目配置查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6221475843529384322L;

	/**
	 * 类目ID，如果为空则查询全部类目。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 表示接口业务的调用方身份,默认不填标识为ISV。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * <p>Getter for the field <code>categoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryId() {
		return this.categoryId;
	}
	/**
	 * <p>Setter for the field <code>categoryId</code>.</p>
	 *
	 * @param categoryId a {@link java.lang.String} object.
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * <p>Getter for the field <code>opRole</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpRole() {
		return this.opRole;
	}
	/**
	 * <p>Setter for the field <code>opRole</code>.</p>
	 *
	 * @param opRole a {@link java.lang.String} object.
	 */
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

}
