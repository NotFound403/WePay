package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 信用借还订单归还
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantOrderRentCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 7117859254145384116L;

	/**
	 * 信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 金额类型：
RENT:租金
DAMAGE:赔偿金
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/**
	 * 信用借还的产品码:w1010100000000002858
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 物品归还门店名称
	 */
	@ApiField("restore_shop_name")
	private String restoreShopName;

	/**
	 * 物品归还时间
	 */
	@ApiField("restore_time")
	private String restoreTime;

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * <p>Getter for the field <code>payAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmount() {
		return this.payAmount;
	}
	/**
	 * <p>Setter for the field <code>payAmount</code>.</p>
	 *
	 * @param payAmount a {@link java.lang.String} object.
	 */
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * <p>Getter for the field <code>payAmountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmountType() {
		return this.payAmountType;
	}
	/**
	 * <p>Setter for the field <code>payAmountType</code>.</p>
	 *
	 * @param payAmountType a {@link java.lang.String} object.
	 */
	public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}

	/**
	 * <p>Getter for the field <code>productCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * <p>Setter for the field <code>productCode</code>.</p>
	 *
	 * @param productCode a {@link java.lang.String} object.
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * <p>Getter for the field <code>restoreShopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRestoreShopName() {
		return this.restoreShopName;
	}
	/**
	 * <p>Setter for the field <code>restoreShopName</code>.</p>
	 *
	 * @param restoreShopName a {@link java.lang.String} object.
	 */
	public void setRestoreShopName(String restoreShopName) {
		this.restoreShopName = restoreShopName;
	}

	/**
	 * <p>Getter for the field <code>restoreTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRestoreTime() {
		return this.restoreTime;
	}
	/**
	 * <p>Setter for the field <code>restoreTime</code>.</p>
	 *
	 * @param restoreTime a {@link java.lang.String} object.
	 */
	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
	}

}
