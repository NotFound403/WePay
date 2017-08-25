package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ExtCategory;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.category.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemExtitemCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6897237383915341979L;

	/** 
	 * 品类信息列表
	 */
	@ApiListField("category_list")
	@ApiField("ext_category")
	private List<ExtCategory> categoryList;

	/**
	 * <p>Setter for the field <code>categoryList</code>.</p>
	 *
	 * @param categoryList a {@link java.util.List} object.
	 */
	public void setCategoryList(List<ExtCategory> categoryList) {
		this.categoryList = categoryList;
	}
	/**
	 * <p>Getter for the field <code>categoryList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ExtCategory> getCategoryList( ) {
		return this.categoryList;
	}

}
