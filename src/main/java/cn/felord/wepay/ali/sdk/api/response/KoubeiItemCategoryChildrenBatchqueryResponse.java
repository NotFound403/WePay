package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.StandardCategoryInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.category.children.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemCategoryChildrenBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8889277798839337283L;

	/** 
	 * 口碑标准后台类目信息列表
	 */
	@ApiListField("category_list")
	@ApiField("standard_category_info")
	private List<StandardCategoryInfo> categoryList;

	/**
	 * <p>Setter for the field <code>categoryList</code>.</p>
	 *
	 * @param categoryList a {@link java.util.List} object.
	 */
	public void setCategoryList(List<StandardCategoryInfo> categoryList) {
		this.categoryList = categoryList;
	}
	/**
	 * <p>Getter for the field <code>categoryList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<StandardCategoryInfo> getCategoryList( ) {
		return this.categoryList;
	}

}
