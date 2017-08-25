package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 品类信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExtCategory extends AlipayObject {

	private static final long serialVersionUID = 2845359511642926869L;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 品类名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父品类编码。顶级类目此值为0
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * <p>Getter for the field <code>categoryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryCode() {
		return this.categoryCode;
	}
	/**
	 * <p>Setter for the field <code>categoryCode</code>.</p>
	 *
	 * @param categoryCode a {@link java.lang.String} object.
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>parentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParentId() {
		return this.parentId;
	}
	/**
	 * <p>Setter for the field <code>parentId</code>.</p>
	 *
	 * @param parentId a {@link java.lang.String} object.
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
