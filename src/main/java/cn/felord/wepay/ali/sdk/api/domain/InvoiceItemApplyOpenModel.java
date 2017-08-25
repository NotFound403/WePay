package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发票内容项申请模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceItemApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2426918674521531426L;

	/**
	 * 明细不含税金额，该值为item_quantity＊item_unit_price，依据税控厂商的不同，目前对接的阿里平台和浙江航信该字段不必传
	 */
	@ApiField("item_ex_tax_amount")
	private String itemExTaxAmount;

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
	 * 数量。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * 商品型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 明细价税合计。该值为item_tax_amount＋item_ex_tax_amount，依据税控厂商的不同，目前对接的阿里平台和浙江航信该字段可不传。
	 */
	@ApiField("item_sum_amount")
	private String itemSumAmount;

	/**
	 * 明细税额，该值为item_ex_tax_amount*item_tax_rate,依据税控厂商的不同，对于目前对接的浙江航信和阿里平台，该字段可不传
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_unit_price")
	private String itemUnitPrice;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * <p>Getter for the field <code>itemExTaxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemExTaxAmount() {
		return this.itemExTaxAmount;
	}
	/**
	 * <p>Setter for the field <code>itemExTaxAmount</code>.</p>
	 *
	 * @param itemExTaxAmount a {@link java.lang.String} object.
	 */
	public void setItemExTaxAmount(String itemExTaxAmount) {
		this.itemExTaxAmount = itemExTaxAmount;
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
	 * <p>Getter for the field <code>itemSpec</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemSpec() {
		return this.itemSpec;
	}
	/**
	 * <p>Setter for the field <code>itemSpec</code>.</p>
	 *
	 * @param itemSpec a {@link java.lang.String} object.
	 */
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	/**
	 * <p>Getter for the field <code>itemSumAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemSumAmount() {
		return this.itemSumAmount;
	}
	/**
	 * <p>Setter for the field <code>itemSumAmount</code>.</p>
	 *
	 * @param itemSumAmount a {@link java.lang.String} object.
	 */
	public void setItemSumAmount(String itemSumAmount) {
		this.itemSumAmount = itemSumAmount;
	}

	/**
	 * <p>Getter for the field <code>itemTaxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemTaxAmount() {
		return this.itemTaxAmount;
	}
	/**
	 * <p>Setter for the field <code>itemTaxAmount</code>.</p>
	 *
	 * @param itemTaxAmount a {@link java.lang.String} object.
	 */
	public void setItemTaxAmount(String itemTaxAmount) {
		this.itemTaxAmount = itemTaxAmount;
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
	 * <p>Getter for the field <code>itemUnitPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemUnitPrice() {
		return this.itemUnitPrice;
	}
	/**
	 * <p>Setter for the field <code>itemUnitPrice</code>.</p>
	 *
	 * @param itemUnitPrice a {@link java.lang.String} object.
	 */
	public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	/**
	 * <p>Getter for the field <code>rowType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRowType() {
		return this.rowType;
	}
	/**
	 * <p>Setter for the field <code>rowType</code>.</p>
	 *
	 * @param rowType a {@link java.lang.String} object.
	 */
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

}
