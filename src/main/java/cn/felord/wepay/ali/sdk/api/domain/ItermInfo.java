package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 返回充值面额状态list
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ItermInfo extends AlipayObject {

	private static final long serialVersionUID = 2745353364584382519L;

	/**
	 * 更新时系统异常，返回错误详细信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 充值面额的状态Y/N
	 */
	@ApiField("is_for_sale")
	private String isForSale;

	/**
	 * 面额的code，唯一标示码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 售价，比如100的面额，卖99元
	 */
	@ApiField("mark_price")
	private String markPrice;

	/**
	 * 针对更新时，是否更新成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 手机充值的面额价格
	 */
	@ApiField("supplier_price")
	private String supplierPrice;

	/**
	 * <p>Getter for the field <code>errorMessage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}
	/**
	 * <p>Setter for the field <code>errorMessage</code>.</p>
	 *
	 * @param errorMessage a {@link java.lang.String} object.
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * <p>Getter for the field <code>isForSale</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsForSale() {
		return this.isForSale;
	}
	/**
	 * <p>Setter for the field <code>isForSale</code>.</p>
	 *
	 * @param isForSale a {@link java.lang.String} object.
	 */
	public void setIsForSale(String isForSale) {
		this.isForSale = isForSale;
	}

	/**
	 * <p>Getter for the field <code>itemCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemCode() {
		return this.itemCode;
	}
	/**
	 * <p>Setter for the field <code>itemCode</code>.</p>
	 *
	 * @param itemCode a {@link java.lang.String} object.
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * <p>Getter for the field <code>markPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMarkPrice() {
		return this.markPrice;
	}
	/**
	 * <p>Setter for the field <code>markPrice</code>.</p>
	 *
	 * @param markPrice a {@link java.lang.String} object.
	 */
	public void setMarkPrice(String markPrice) {
		this.markPrice = markPrice;
	}

	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSuccess() {
		return this.success;
	}
	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.Boolean} object.
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * <p>Getter for the field <code>supplierPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSupplierPrice() {
		return this.supplierPrice;
	}
	/**
	 * <p>Setter for the field <code>supplierPrice</code>.</p>
	 *
	 * @param supplierPrice a {@link java.lang.String} object.
	 */
	public void setSupplierPrice(String supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

}
