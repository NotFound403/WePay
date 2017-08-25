package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 电子发票平台发票明细项
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceItemContent extends AlipayObject {

	private static final long serialVersionUID = 1294158228845581632L;

	/**
	 * 价税合计。(等于sumPrice和tax之和)
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 发票项目名称（或商品名称）
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品编号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 数量。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * 单项总价，格式：100.00
	 */
	@ApiField("item_sum_price")
	private String itemSumPrice;

	/**
	 * 税额
	 */
	@ApiField("item_tax_price")
	private String itemTaxPrice;

	/**
	 * 税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 台
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
	 */
	@ApiField("row_type")
	private Long rowType;

	/**
	 * <p>Getter for the field <code>itemAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemAmount() {
		return this.itemAmount;
	}
	/**
	 * <p>Setter for the field <code>itemAmount</code>.</p>
	 *
	 * @param itemAmount a {@link java.lang.String} object.
	 */
	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}

	/**
	 * <p>Getter for the field <code>itemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemName() {
		return this.itemName;
	}
	/**
	 * <p>Setter for the field <code>itemName</code>.</p>
	 *
	 * @param itemName a {@link java.lang.String} object.
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * <p>Getter for the field <code>itemNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemNo() {
		return this.itemNo;
	}
	/**
	 * <p>Setter for the field <code>itemNo</code>.</p>
	 *
	 * @param itemNo a {@link java.lang.String} object.
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * <p>Getter for the field <code>itemPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemPrice() {
		return this.itemPrice;
	}
	/**
	 * <p>Setter for the field <code>itemPrice</code>.</p>
	 *
	 * @param itemPrice a {@link java.lang.String} object.
	 */
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * <p>Getter for the field <code>itemQuantity</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	/**
	 * <p>Setter for the field <code>itemQuantity</code>.</p>
	 *
	 * @param itemQuantity a {@link java.lang.Long} object.
	 */
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	/**
	 * <p>Getter for the field <code>itemSumPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemSumPrice() {
		return this.itemSumPrice;
	}
	/**
	 * <p>Setter for the field <code>itemSumPrice</code>.</p>
	 *
	 * @param itemSumPrice a {@link java.lang.String} object.
	 */
	public void setItemSumPrice(String itemSumPrice) {
		this.itemSumPrice = itemSumPrice;
	}

	/**
	 * <p>Getter for the field <code>itemTaxPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemTaxPrice() {
		return this.itemTaxPrice;
	}
	/**
	 * <p>Setter for the field <code>itemTaxPrice</code>.</p>
	 *
	 * @param itemTaxPrice a {@link java.lang.String} object.
	 */
	public void setItemTaxPrice(String itemTaxPrice) {
		this.itemTaxPrice = itemTaxPrice;
	}

	/**
	 * <p>Getter for the field <code>itemTaxRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemTaxRate() {
		return this.itemTaxRate;
	}
	/**
	 * <p>Setter for the field <code>itemTaxRate</code>.</p>
	 *
	 * @param itemTaxRate a {@link java.lang.String} object.
	 */
	public void setItemTaxRate(String itemTaxRate) {
		this.itemTaxRate = itemTaxRate;
	}

	/**
	 * <p>Getter for the field <code>itemUnit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemUnit() {
		return this.itemUnit;
	}
	/**
	 * <p>Setter for the field <code>itemUnit</code>.</p>
	 *
	 * @param itemUnit a {@link java.lang.String} object.
	 */
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	/**
	 * <p>Getter for the field <code>rowType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getRowType() {
		return this.rowType;
	}
	/**
	 * <p>Setter for the field <code>rowType</code>.</p>
	 *
	 * @param rowType a {@link java.lang.Long} object.
	 */
	public void setRowType(Long rowType) {
		this.rowType = rowType;
	}

}
