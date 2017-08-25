package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商品列表查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemExtitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2773599298881726392L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 当前页码。
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小。最大50条，超过限制默认50
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 商品名称（仅支持前缀匹配）
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>brandCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandCode() {
		return this.brandCode;
	}
	/**
	 * <p>Setter for the field <code>brandCode</code>.</p>
	 *
	 * @param brandCode a {@link java.lang.String} object.
	 */
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

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
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNum() {
		return this.pageNum;
	}
	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.String} object.
	 */
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
