package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 品类查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:10
 */
public class KoubeiItemExtitemCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4358131813561548265L;

	/**
	 * 父品类编码. (查询顶级类目时值传0)
	 */
	@ApiField("parent_id")
	private String parentId;

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
