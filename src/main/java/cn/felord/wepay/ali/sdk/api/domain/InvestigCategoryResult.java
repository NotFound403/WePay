package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 数据项的调查结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvestigCategoryResult extends AlipayObject {

	private static final long serialVersionUID = 4723613658247918751L;

	/**
	 * 数据项Category
	 */
	@ApiField("category")
	private String category;

	/**
	 * 数据项对应的所有采集结果
	 */
	@ApiListField("category_result")
	@ApiField("investig_category_data")
	private List<InvestigCategoryData> categoryResult;

	/**
	 * <p>Getter for the field <code>category</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategory() {
		return this.category;
	}
	/**
	 * <p>Setter for the field <code>category</code>.</p>
	 *
	 * @param category a {@link java.lang.String} object.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * <p>Getter for the field <code>categoryResult</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InvestigCategoryData> getCategoryResult() {
		return this.categoryResult;
	}
	/**
	 * <p>Setter for the field <code>categoryResult</code>.</p>
	 *
	 * @param categoryResult a {@link java.util.List} object.
	 */
	public void setCategoryResult(List<InvestigCategoryData> categoryResult) {
		this.categoryResult = categoryResult;
	}

}
