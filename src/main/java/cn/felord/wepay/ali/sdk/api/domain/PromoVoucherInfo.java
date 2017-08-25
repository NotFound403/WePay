package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 店铺券信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PromoVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 4241639739776692761L;

	/**
	 * 折扣（折扣券类型才有）
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 是否是自动领取券
	 */
	@ApiField("is_auto_obtain")
	private String isAutoObtain;

	/**
	 * 是否是商圈发的券 true/false
	 */
	@ApiField("is_mall_voucher")
	private String isMallVoucher;

	/**
	 * 券品牌名称
	 */
	@ApiField("item_brand_name")
	private String itemBrandName;

	/**
	 * 券有效期结束时间
	 */
	@ApiField("item_gmt_end")
	private Date itemGmtEnd;

	/**
	 * 商品有效期开始时间
	 */
	@ApiField("item_gmt_start")
	private Date itemGmtStart;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券图片地址
	 */
	@ApiField("item_logo")
	private String itemLogo;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 买a送b 送单品名称
	 */
	@ApiField("send_item_name")
	private String sendItemName;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 券使用门槛金额(元)
	 */
	@ApiField("use_condition_amount")
	private String useConditionAmount;

	/**
	 * 代金券 减至券 兑换券 换购券 金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券跳转地址(h5)
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	/**
	 * DISCOUNT_ALL, // 折扣券(全场)
DISCOUNT_SINGLE, // 折扣券(单品)
CASH_ALL, // 代金券(全场)
CASH_SINGLE, // 代金券(单品)

// 以下券全部是单品券
EXCHANGE, // 兑换券(直接兑换，加钱兑换)
EXCHANGE_BUY, // 换购券
REDUCE_TO, // 减至券
BUY_SEND_SAME, // 买就送券(买a送a)
BUY_SEND_OTHER; // 买就送券(买a送b)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * <p>Getter for the field <code>discount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscount() {
		return this.discount;
	}
	/**
	 * <p>Setter for the field <code>discount</code>.</p>
	 *
	 * @param discount a {@link java.lang.String} object.
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	/**
	 * <p>Getter for the field <code>isAutoObtain</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsAutoObtain() {
		return this.isAutoObtain;
	}
	/**
	 * <p>Setter for the field <code>isAutoObtain</code>.</p>
	 *
	 * @param isAutoObtain a {@link java.lang.String} object.
	 */
	public void setIsAutoObtain(String isAutoObtain) {
		this.isAutoObtain = isAutoObtain;
	}

	/**
	 * <p>Getter for the field <code>isMallVoucher</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsMallVoucher() {
		return this.isMallVoucher;
	}
	/**
	 * <p>Setter for the field <code>isMallVoucher</code>.</p>
	 *
	 * @param isMallVoucher a {@link java.lang.String} object.
	 */
	public void setIsMallVoucher(String isMallVoucher) {
		this.isMallVoucher = isMallVoucher;
	}

	/**
	 * <p>Getter for the field <code>itemBrandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemBrandName() {
		return this.itemBrandName;
	}
	/**
	 * <p>Setter for the field <code>itemBrandName</code>.</p>
	 *
	 * @param itemBrandName a {@link java.lang.String} object.
	 */
	public void setItemBrandName(String itemBrandName) {
		this.itemBrandName = itemBrandName;
	}

	/**
	 * <p>Getter for the field <code>itemGmtEnd</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getItemGmtEnd() {
		return this.itemGmtEnd;
	}
	/**
	 * <p>Setter for the field <code>itemGmtEnd</code>.</p>
	 *
	 * @param itemGmtEnd a {@link java.util.Date} object.
	 */
	public void setItemGmtEnd(Date itemGmtEnd) {
		this.itemGmtEnd = itemGmtEnd;
	}

	/**
	 * <p>Getter for the field <code>itemGmtStart</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getItemGmtStart() {
		return this.itemGmtStart;
	}
	/**
	 * <p>Setter for the field <code>itemGmtStart</code>.</p>
	 *
	 * @param itemGmtStart a {@link java.util.Date} object.
	 */
	public void setItemGmtStart(Date itemGmtStart) {
		this.itemGmtStart = itemGmtStart;
	}

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * <p>Getter for the field <code>itemLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemLogo() {
		return this.itemLogo;
	}
	/**
	 * <p>Setter for the field <code>itemLogo</code>.</p>
	 *
	 * @param itemLogo a {@link java.lang.String} object.
	 */
	public void setItemLogo(String itemLogo) {
		this.itemLogo = itemLogo;
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
	 * <p>Getter for the field <code>sendItemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendItemName() {
		return this.sendItemName;
	}
	/**
	 * <p>Setter for the field <code>sendItemName</code>.</p>
	 *
	 * @param sendItemName a {@link java.lang.String} object.
	 */
	public void setSendItemName(String sendItemName) {
		this.sendItemName = sendItemName;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>shopName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * <p>Setter for the field <code>shopName</code>.</p>
	 *
	 * @param shopName a {@link java.lang.String} object.
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * <p>Getter for the field <code>useConditionAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUseConditionAmount() {
		return this.useConditionAmount;
	}
	/**
	 * <p>Setter for the field <code>useConditionAmount</code>.</p>
	 *
	 * @param useConditionAmount a {@link java.lang.String} object.
	 */
	public void setUseConditionAmount(String useConditionAmount) {
		this.useConditionAmount = useConditionAmount;
	}

	/**
	 * <p>Getter for the field <code>valueAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValueAmount() {
		return this.valueAmount;
	}
	/**
	 * <p>Setter for the field <code>valueAmount</code>.</p>
	 *
	 * @param valueAmount a {@link java.lang.String} object.
	 */
	public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}

	/**
	 * <p>Getter for the field <code>voucherDetailUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherDetailUrl() {
		return this.voucherDetailUrl;
	}
	/**
	 * <p>Setter for the field <code>voucherDetailUrl</code>.</p>
	 *
	 * @param voucherDetailUrl a {@link java.lang.String} object.
	 */
	public void setVoucherDetailUrl(String voucherDetailUrl) {
		this.voucherDetailUrl = voucherDetailUrl;
	}

	/**
	 * <p>Getter for the field <code>voucherType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherType() {
		return this.voucherType;
	}
	/**
	 * <p>Setter for the field <code>voucherType</code>.</p>
	 *
	 * @param voucherType a {@link java.lang.String} object.
	 */
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
