package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店类目配置信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ShopCategoryConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 4729766622535429996L;

	/**
	 * 类目ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否是叶子节点
	 */
	@ApiField("is_leaf")
	private String isLeaf;

	/**
	 * 类目层级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 类目层级路径
	 */
	@ApiField("link")
	private String link;

	/**
	 * 类目名称
	 */
	@ApiField("nm")
	private String nm;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
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
	 * <p>Getter for the field <code>level</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevel() {
		return this.level;
	}
	/**
	 * <p>Setter for the field <code>level</code>.</p>
	 *
	 * @param level a {@link java.lang.String} object.
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * <p>Getter for the field <code>link</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLink() {
		return this.link;
	}
	/**
	 * <p>Setter for the field <code>link</code>.</p>
	 *
	 * @param link a {@link java.lang.String} object.
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * <p>Getter for the field <code>nm</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNm() {
		return this.nm;
	}
	/**
	 * <p>Setter for the field <code>nm</code>.</p>
	 *
	 * @param nm a {@link java.lang.String} object.
	 */
	public void setNm(String nm) {
		this.nm = nm;
	}

}
