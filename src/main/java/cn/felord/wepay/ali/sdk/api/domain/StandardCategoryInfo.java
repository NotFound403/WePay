package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑标准后台类目
 *
 * @author auto create
 * @version $Id: $Id
 */
public class StandardCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 1387643753322832874L;

	/**
	 * 后台类目ID，类目信息的主键；商品类目ID，发布/修改商品的时候，需要填写商品所属的类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 是否为叶子类目，商品只能够发布在叶子类目下
	 */
	@ApiField("is_leaf")
	private String isLeaf;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 本类目的上一级类目ID，如果本类目是一级类目，上一级类目ID为空
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 类目路径，递归父一级类目ID的列表，依次按照一级、二级、三级...顺序排列
	 */
	@ApiField("path")
	private String path;

	/**
	 * 类目所属一级类目的ID，若本类目是一级类目，值为本类目的ID
	 */
	@ApiField("root_id")
	private String rootId;

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
	 * <p>Getter for the field <code>isLeaf</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsLeaf() {
		return this.isLeaf;
	}
	/**
	 * <p>Setter for the field <code>isLeaf</code>.</p>
	 *
	 * @param isLeaf a {@link java.lang.String} object.
	 */
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
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

	/**
	 * <p>Getter for the field <code>path</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPath() {
		return this.path;
	}
	/**
	 * <p>Setter for the field <code>path</code>.</p>
	 *
	 * @param path a {@link java.lang.String} object.
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * <p>Getter for the field <code>rootId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRootId() {
		return this.rootId;
	}
	/**
	 * <p>Setter for the field <code>rootId</code>.</p>
	 *
	 * @param rootId a {@link java.lang.String} object.
	 */
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
