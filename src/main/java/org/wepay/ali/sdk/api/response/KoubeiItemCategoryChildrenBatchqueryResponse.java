package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.StandardCategoryInfo;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.category.children.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-06 11:40:51
 */
public class KoubeiItemCategoryChildrenBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8889277798839337283L;

	/** 
	 * 口碑标准后台类目信息列表
	 */
	@ApiListField("category_list")
	@ApiField("standard_category_info")
	private List<StandardCategoryInfo> categoryList;

	public void setCategoryList(List<StandardCategoryInfo> categoryList) {
		this.categoryList = categoryList;
	}
	public List<StandardCategoryInfo> getCategoryList( ) {
		return this.categoryList;
	}

}
