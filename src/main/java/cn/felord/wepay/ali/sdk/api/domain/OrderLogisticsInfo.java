package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务的物流信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OrderLogisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 8121911929355799472L;

	/**
	 * 消费者下单线下服务时，填写的服务地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 订单的物流扩展信息，包括服务开始时间、服务结束时间
	 */
	@ApiField("ext_info")
	private OrderLogisticsExtInfo extInfo;

	/**
	 * 消费者地址纬度（高德坐标系）
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 消费者地址经度（高德坐标系）
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商家电话绑定的消费者手机号（阿里小号）
	 */
	@ApiField("merchant_bind_mobile")
	private String merchantBindMobile;

	/**
	 * 联系电话
	 */
	@ApiField("mobile")
	private String mobile;

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
	 * <p>Getter for the field <code>contactName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactName() {
		return this.contactName;
	}
	/**
	 * <p>Setter for the field <code>contactName</code>.</p>
	 *
	 * @param contactName a {@link java.lang.String} object.
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OrderLogisticsExtInfo} object.
	 */
	public OrderLogisticsExtInfo getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link cn.felord.wepay.ali.sdk.api.domain.OrderLogisticsExtInfo} object.
	 */
	public void setExtInfo(OrderLogisticsExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>latitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLatitude() {
		return this.latitude;
	}
	/**
	 * <p>Setter for the field <code>latitude</code>.</p>
	 *
	 * @param latitude a {@link java.lang.String} object.
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * <p>Getter for the field <code>longitude</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLongitude() {
		return this.longitude;
	}
	/**
	 * <p>Setter for the field <code>longitude</code>.</p>
	 *
	 * @param longitude a {@link java.lang.String} object.
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * <p>Getter for the field <code>merchantBindMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantBindMobile() {
		return this.merchantBindMobile;
	}
	/**
	 * <p>Setter for the field <code>merchantBindMobile</code>.</p>
	 *
	 * @param merchantBindMobile a {@link java.lang.String} object.
	 */
	public void setMerchantBindMobile(String merchantBindMobile) {
		this.merchantBindMobile = merchantBindMobile;
	}

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
