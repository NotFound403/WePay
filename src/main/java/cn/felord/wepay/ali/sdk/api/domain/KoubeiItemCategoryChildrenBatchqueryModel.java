package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 批量查询标准后台类目
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemCategoryChildrenBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4251234365555839373L;

	/**
	 * 根类目ID. 参数非必传，不传该参数时查询所有的一级类目及递归子类目； 传该参数时，根据入参递归查询子类目信息的列表返回
	 */
	@ApiField("root_category_id")
	private String rootCategoryId;

	/**
	 * <p>Getter for the field <code>rootCategoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRootCategoryId() {
		return this.rootCategoryId;
	}
	/**
	 * <p>Setter for the field <code>rootCategoryId</code>.</p>
	 *
	 * @param rootCategoryId a {@link java.lang.String} object.
	 */
	public void setRootCategoryId(String rootCategoryId) {
		this.rootCategoryId = rootCategoryId;
	}

}
