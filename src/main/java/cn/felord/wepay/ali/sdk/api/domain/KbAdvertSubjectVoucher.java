package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统标的(券)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertSubjectVoucher extends AlipayObject {

	private static final long serialVersionUID = 6554277586117881662L;

	/**
	 * 品牌名称(支持模糊匹配)
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 适用城市(命中一个即可搜出)
	 */
	@ApiListField("city_ids")
	@ApiField("string")
	private List<String> cityIds;

	/**
	 * 商家名称(支持模糊匹配)
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * OBTAIN：认领（默认值）
BUY：购买
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称(支持模糊匹配)
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券类型
LIMIT-单品券
NO_LIMIT_DISCOUNT-全场折扣券
NO_LIMIT_CASH-全场代金券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName() {
		return this.brandName;
	}
	/**
	 * <p>Setter for the field <code>brandName</code>.</p>
	 *
	 * @param brandName a {@link java.lang.String} object.
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * <p>Getter for the field <code>cityIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCityIds() {
		return this.cityIds;
	}
	/**
	 * <p>Setter for the field <code>cityIds</code>.</p>
	 *
	 * @param cityIds a {@link java.util.List} object.
	 */
	public void setCityIds(List<String> cityIds) {
		this.cityIds = cityIds;
	}

	/**
	 * <p>Getter for the field <code>merchantName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantName() {
		return this.merchantName;
	}
	/**
	 * <p>Setter for the field <code>merchantName</code>.</p>
	 *
	 * @param merchantName a {@link java.lang.String} object.
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	/**
	 * <p>Getter for the field <code>purchaseMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	/**
	 * <p>Setter for the field <code>purchaseMode</code>.</p>
	 *
	 * @param purchaseMode a {@link java.lang.String} object.
	 */
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	/**
	 * <p>Getter for the field <code>voucherId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherId() {
		return this.voucherId;
	}
	/**
	 * <p>Setter for the field <code>voucherId</code>.</p>
	 *
	 * @param voucherId a {@link java.lang.String} object.
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	/**
	 * <p>Getter for the field <code>voucherName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherName() {
		return this.voucherName;
	}
	/**
	 * <p>Setter for the field <code>voucherName</code>.</p>
	 *
	 * @param voucherName a {@link java.lang.String} object.
	 */
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
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
