package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券明细信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class VoucherDetail extends AlipayObject {

	private static final long serialVersionUID = 3396728634531455736L;

	/**
	 * 优惠券面额，它应该会等于商家出资加上其他出资方出资
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 券id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 优惠券备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商家出资（特指发起交易的商家出资金额）
	 */
	@ApiField("merchant_contribute")
	private String merchantContribute;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其他出资方出资金额，可能是支付宝，可能是品牌商，或者其他方，也可能是他们的一起出资
	 */
	@ApiField("other_contribute")
	private String otherContribute;

	/**
	 * 如果使用的这张券是用户购买的，则该字段代表用户在购买这张券时平台优惠的金额
	 */
	@ApiField("purchase_ant_contribute")
	private String purchaseAntContribute;

	/**
	 * 如果使用的这张券是用户购买的，则该字段代表用户在购买这张券时用户实际付款的金额
	 */
	@ApiField("purchase_buyer_contribute")
	private String purchaseBuyerContribute;

	/**
	 * 如果使用的这张券是用户购买的，则该字段代表用户在购买这张券时商户优惠的金额
	 */
	@ApiField("purchase_merchant_contribute")
	private String purchaseMerchantContribute;

	/**
	 * 当前有三种类型：
ALIPAY_FIX_VOUCHER - 全场代金券
ALIPAY_DISCOUNT_VOUCHER - 折扣券
ALIPAY_ITEM_VOUCHER - 单品优惠
注：不排除将来新增其他类型的可能，商家接入时注意兼容性避免硬编码
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>merchantContribute</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantContribute() {
		return this.merchantContribute;
	}
	/**
	 * <p>Setter for the field <code>merchantContribute</code>.</p>
	 *
	 * @param merchantContribute a {@link java.lang.String} object.
	 */
	public void setMerchantContribute(String merchantContribute) {
		this.merchantContribute = merchantContribute;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>otherContribute</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOtherContribute() {
		return this.otherContribute;
	}
	/**
	 * <p>Setter for the field <code>otherContribute</code>.</p>
	 *
	 * @param otherContribute a {@link java.lang.String} object.
	 */
	public void setOtherContribute(String otherContribute) {
		this.otherContribute = otherContribute;
	}

	/**
	 * <p>Getter for the field <code>purchaseAntContribute</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPurchaseAntContribute() {
		return this.purchaseAntContribute;
	}
	/**
	 * <p>Setter for the field <code>purchaseAntContribute</code>.</p>
	 *
	 * @param purchaseAntContribute a {@link java.lang.String} object.
	 */
	public void setPurchaseAntContribute(String purchaseAntContribute) {
		this.purchaseAntContribute = purchaseAntContribute;
	}

	/**
	 * <p>Getter for the field <code>purchaseBuyerContribute</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPurchaseBuyerContribute() {
		return this.purchaseBuyerContribute;
	}
	/**
	 * <p>Setter for the field <code>purchaseBuyerContribute</code>.</p>
	 *
	 * @param purchaseBuyerContribute a {@link java.lang.String} object.
	 */
	public void setPurchaseBuyerContribute(String purchaseBuyerContribute) {
		this.purchaseBuyerContribute = purchaseBuyerContribute;
	}

	/**
	 * <p>Getter for the field <code>purchaseMerchantContribute</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPurchaseMerchantContribute() {
		return this.purchaseMerchantContribute;
	}
	/**
	 * <p>Setter for the field <code>purchaseMerchantContribute</code>.</p>
	 *
	 * @param purchaseMerchantContribute a {@link java.lang.String} object.
	 */
	public void setPurchaseMerchantContribute(String purchaseMerchantContribute) {
		this.purchaseMerchantContribute = purchaseMerchantContribute;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
