package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店类目信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 7483921643496893734L;

	/**
	 * 类目编号
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目层级,目前最多支持1、2、3三级
	 */
	@ApiField("category_level")
	private String categoryLevel;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

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
	 * <p>Getter for the field <code>categoryLevel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryLevel() {
		return this.categoryLevel;
	}
	/**
	 * <p>Setter for the field <code>categoryLevel</code>.</p>
	 *
	 * @param categoryLevel a {@link java.lang.String} object.
	 */
	public void setCategoryLevel(String categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	/**
	 * <p>Getter for the field <code>categoryName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	/**
	 * <p>Setter for the field <code>categoryName</code>.</p>
	 *
	 * @param categoryName a {@link java.lang.String} object.
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
