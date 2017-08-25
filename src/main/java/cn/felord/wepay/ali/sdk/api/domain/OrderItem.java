package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单明细
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OrderItem extends AlipayObject {

	private static final long serialVersionUID = 6212325386844494138L;

	/**
	 * 店铺所在具体位置
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 店铺品类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 店铺所在的市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 订购的服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 订单联系人
	 */
	@ApiField("contacts")
	private String contacts;

	/**
	 * 门店创建人(已删除)
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 过期时间
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 上架时间
	 */
	@ApiField("online_time")
	private String onlineTime;

	/**
	 * TO_DO-未实施,DOING-实施中,TO_CONFIRM-待商户确认,DONE-已完成,MERCHANT_REJECTED-商户已回绝,MERCHANT_CANCELLED-商户已取消,ISV_REJECTED-服务商已回绝,ISV_CANCELLED-服务商已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单所属人联系方式（手机或者座机）
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 店铺所在的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺状态（ONLINE--已上架 OFFLINE--未上架 AVAILABLE--已开通 INIT--未开通 EXPIRED--已过期）
	 */
	@ApiField("shop_status")
	private String shopStatus;

	/**
	 * 待服务商接单
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

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
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Getter for the field <code>commodityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityId() {
		return this.commodityId;
	}
	/**
	 * <p>Setter for the field <code>commodityId</code>.</p>
	 *
	 * @param commodityId a {@link java.lang.String} object.
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * <p>Getter for the field <code>contacts</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContacts() {
		return this.contacts;
	}
	/**
	 * <p>Setter for the field <code>contacts</code>.</p>
	 *
	 * @param contacts a {@link java.lang.String} object.
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	/**
	 * <p>Getter for the field <code>creator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreator() {
		return this.creator;
	}
	/**
	 * <p>Setter for the field <code>creator</code>.</p>
	 *
	 * @param creator a {@link java.lang.String} object.
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * <p>Getter for the field <code>expireDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpireDate() {
		return this.expireDate;
	}
	/**
	 * <p>Setter for the field <code>expireDate</code>.</p>
	 *
	 * @param expireDate a {@link java.lang.String} object.
	 */
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
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
	 * <p>Getter for the field <code>merchantPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantPid() {
		return this.merchantPid;
	}
	/**
	 * <p>Setter for the field <code>merchantPid</code>.</p>
	 *
	 * @param merchantPid a {@link java.lang.String} object.
	 */
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	/**
	 * <p>Getter for the field <code>onlineTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOnlineTime() {
		return this.onlineTime;
	}
	/**
	 * <p>Setter for the field <code>onlineTime</code>.</p>
	 *
	 * @param onlineTime a {@link java.lang.String} object.
	 */
	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	/**
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatus() {
		return this.orderStatus;
	}
	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link java.lang.String} object.
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * <p>Getter for the field <code>phoneNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPhoneNo() {
		return this.phoneNo;
	}
	/**
	 * <p>Setter for the field <code>phoneNo</code>.</p>
	 *
	 * @param phoneNo a {@link java.lang.String} object.
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * <p>Getter for the field <code>province</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProvince() {
		return this.province;
	}
	/**
	 * <p>Setter for the field <code>province</code>.</p>
	 *
	 * @param province a {@link java.lang.String} object.
	 */
	public void setProvince(String province) {
		this.province = province;
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
	 * <p>Getter for the field <code>shopStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopStatus() {
		return this.shopStatus;
	}
	/**
	 * <p>Setter for the field <code>shopStatus</code>.</p>
	 *
	 * @param shopStatus a {@link java.lang.String} object.
	 */
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
