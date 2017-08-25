package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统标的（券）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertSubjectVoucherResponse extends AlipayObject {

	private static final long serialVersionUID = 6825528786628139111L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 适用城市ID列表
	 */
	@ApiListField("city_ids")
	@ApiField("string")
	private List<String> cityIds;

	/**
	 * 背景图片
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 日库存
	 */
	@ApiField("daily_inventory")
	private String dailyInventory;

	/**
	 * 结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 上架时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 使用须知
	 */
	@ApiListField("manuals")
	@ApiField("kbadvert_voucher_manual")
	private List<KbadvertVoucherManual> manuals;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * BUY：购买模式
OBTAIN：认领
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 门店ID列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 起步金额
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 总库存
	 */
	@ApiField("total_inventory")
	private String totalInventory;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 以元为单位
	 */
	@ApiField("voucher_org_value")
	private String voucherOrgValue;

	/**
	 * 券类型
LIMIT-单品券
NO_LIMIT_DISCOUNT-全场折扣券
NO_LIMIT_CASH-全场代金券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券价值
	 */
	@ApiField("voucher_value")
	private String voucherValue;

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
	 * <p>Getter for the field <code>cover</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCover() {
		return this.cover;
	}
	/**
	 * <p>Setter for the field <code>cover</code>.</p>
	 *
	 * @param cover a {@link java.lang.String} object.
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}

	/**
	 * <p>Getter for the field <code>dailyInventory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDailyInventory() {
		return this.dailyInventory;
	}
	/**
	 * <p>Setter for the field <code>dailyInventory</code>.</p>
	 *
	 * @param dailyInventory a {@link java.lang.String} object.
	 */
	public void setDailyInventory(String dailyInventory) {
		this.dailyInventory = dailyInventory;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>gmtStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtStart() {
		return this.gmtStart;
	}
	/**
	 * <p>Setter for the field <code>gmtStart</code>.</p>
	 *
	 * @param gmtStart a {@link java.lang.String} object.
	 */
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	/**
	 * <p>Getter for the field <code>logo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogo() {
		return this.logo;
	}
	/**
	 * <p>Setter for the field <code>logo</code>.</p>
	 *
	 * @param logo a {@link java.lang.String} object.
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * <p>Getter for the field <code>manuals</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbadvertVoucherManual> getManuals() {
		return this.manuals;
	}
	/**
	 * <p>Setter for the field <code>manuals</code>.</p>
	 *
	 * @param manuals a {@link java.util.List} object.
	 */
	public void setManuals(List<KbadvertVoucherManual> manuals) {
		this.manuals = manuals;
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
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}
	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopIds() {
		return this.shopIds;
	}
	/**
	 * <p>Setter for the field <code>shopIds</code>.</p>
	 *
	 * @param shopIds a {@link java.util.List} object.
	 */
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	/**
	 * <p>Getter for the field <code>thresholdAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	/**
	 * <p>Setter for the field <code>thresholdAmount</code>.</p>
	 *
	 * @param thresholdAmount a {@link java.lang.String} object.
	 */
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	/**
	 * <p>Getter for the field <code>totalInventory</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalInventory() {
		return this.totalInventory;
	}
	/**
	 * <p>Setter for the field <code>totalInventory</code>.</p>
	 *
	 * @param totalInventory a {@link java.lang.String} object.
	 */
	public void setTotalInventory(String totalInventory) {
		this.totalInventory = totalInventory;
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
	 * <p>Getter for the field <code>voucherOrgValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherOrgValue() {
		return this.voucherOrgValue;
	}
	/**
	 * <p>Setter for the field <code>voucherOrgValue</code>.</p>
	 *
	 * @param voucherOrgValue a {@link java.lang.String} object.
	 */
	public void setVoucherOrgValue(String voucherOrgValue) {
		this.voucherOrgValue = voucherOrgValue;
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

	/**
	 * <p>Getter for the field <code>voucherValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherValue() {
		return this.voucherValue;
	}
	/**
	 * <p>Setter for the field <code>voucherValue</code>.</p>
	 *
	 * @param voucherValue a {@link java.lang.String} object.
	 */
	public void setVoucherValue(String voucherValue) {
		this.voucherValue = voucherValue;
	}

}
