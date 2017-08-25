package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 品类查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemExtitemCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4358131813561548265L;

	/**
	 * 父品类编码. (查询顶级类目时值传0)
	 */
	@ApiField("parent_id")
	private String parentId;

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
