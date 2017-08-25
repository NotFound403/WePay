package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车生活停车平台录入停车场信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3817747482951556715L;

	/**
	 * 城市编号（国家统一标准编码）
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 停车场联系人支付宝账户，如果有则填入
	 */
	@ApiField("contact_alipay")
	private String contactAlipay;

	/**
	 * 停车场联系人邮箱，如果有则填入
	 */
	@ApiField("contact_emali")
	private String contactEmali;

	/**
	 * 停车场联系人手机，如果有则填入
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 停车场联系人，如果有则填入
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 停车场联系人座机，如果有则填入
	 */
	@ApiField("contact_tel")
	private String contactTel;

	/**
	 * 停车场联系人微信，如果有则填入
	 */
	@ApiField("contact_weixin")
	private String contactWeixin;

	/**
	 * 设备商名称
	 */
	@ApiField("equipment_name")
	private String equipmentName;

	/**
	 * 纬度，最长15位字符(包括小数点)，注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数的准确。高德经纬度询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，最长15位字符(包括小数点)，注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数的准确。高德经纬度询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * ISV停车场ID，由ISV提供，同一个isv或商户范围内唯一
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 停车场地址
	 */
	@ApiField("parking_address")
	private String parkingAddress;

	/**
	 * 停车场结束营业时间，格式 "HH:mm:ss"
	 */
	@ApiField("parking_end_time")
	private String parkingEndTime;

	/**
	 * 收费说明
	 */
	@ApiField("parking_fee_description")
	private String parkingFeeDescription;

	/**
	 * 停车场类型，1为小区停车场、2为商圈停车场、3为路面停车场、4为园区停车场、5为写字楼停车场、6为私人停车场
	 */
	@ApiField("parking_lot_type")
	private String parkingLotType;

	/**
	 * 停车场名称
	 */
	@ApiField("parking_name")
	private String parkingName;

	/**
	 * 停车位数目
	 */
	@ApiField("parking_number")
	private String parkingNumber;

	/**
	 * 停车场开始营业时间，格式 "HH:mm:ss"
	 */
	@ApiField("parking_start_time")
	private String parkingStartTime;

	/**
	 * 停车场类型(1为地面，2为地下，3为路边)（多个类型，中间用,隔开
	 */
	@ApiField("parking_type")
	private String parkingType;

	/**
	 * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费，3当面付)，如支持多种方式以','进行间隔
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 缴费模式（1为停车卡缴费，2为物料缴费，3为中央缴费机）
	 */
	@ApiField("payment_mode")
	private String paymentMode;

	/**
	 * 商圈id
	 */
	@ApiField("shopingmall_id")
	private String shopingmallId;

	/**
	 * 用户支付未离场的超时时间(以分钟为单位)
	 */
	@ApiField("time_out")
	private String timeOut;

	/**
	 * <p>Getter for the field <code>cityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityId() {
		return this.cityId;
	}
	/**
	 * <p>Setter for the field <code>cityId</code>.</p>
	 *
	 * @param cityId a {@link java.lang.String} object.
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	/**
	 * <p>Getter for the field <code>contactAlipay</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactAlipay() {
		return this.contactAlipay;
	}
	/**
	 * <p>Setter for the field <code>contactAlipay</code>.</p>
	 *
	 * @param contactAlipay a {@link java.lang.String} object.
	 */
	public void setContactAlipay(String contactAlipay) {
		this.contactAlipay = contactAlipay;
	}

	/**
	 * <p>Getter for the field <code>contactEmali</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactEmali() {
		return this.contactEmali;
	}
	/**
	 * <p>Setter for the field <code>contactEmali</code>.</p>
	 *
	 * @param contactEmali a {@link java.lang.String} object.
	 */
	public void setContactEmali(String contactEmali) {
		this.contactEmali = contactEmali;
	}

	/**
	 * <p>Getter for the field <code>contactMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactMobile() {
		return this.contactMobile;
	}
	/**
	 * <p>Setter for the field <code>contactMobile</code>.</p>
	 *
	 * @param contactMobile a {@link java.lang.String} object.
	 */
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
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
	 * <p>Getter for the field <code>contactTel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactTel() {
		return this.contactTel;
	}
	/**
	 * <p>Setter for the field <code>contactTel</code>.</p>
	 *
	 * @param contactTel a {@link java.lang.String} object.
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	/**
	 * <p>Getter for the field <code>contactWeixin</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContactWeixin() {
		return this.contactWeixin;
	}
	/**
	 * <p>Setter for the field <code>contactWeixin</code>.</p>
	 *
	 * @param contactWeixin a {@link java.lang.String} object.
	 */
	public void setContactWeixin(String contactWeixin) {
		this.contactWeixin = contactWeixin;
	}

	/**
	 * <p>Getter for the field <code>equipmentName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEquipmentName() {
		return this.equipmentName;
	}
	/**
	 * <p>Setter for the field <code>equipmentName</code>.</p>
	 *
	 * @param equipmentName a {@link java.lang.String} object.
	 */
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
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
	 * <p>Getter for the field <code>outParkingId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutParkingId() {
		return this.outParkingId;
	}
	/**
	 * <p>Setter for the field <code>outParkingId</code>.</p>
	 *
	 * @param outParkingId a {@link java.lang.String} object.
	 */
	public void setOutParkingId(String outParkingId) {
		this.outParkingId = outParkingId;
	}

	/**
	 * <p>Getter for the field <code>parkingAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingAddress() {
		return this.parkingAddress;
	}
	/**
	 * <p>Setter for the field <code>parkingAddress</code>.</p>
	 *
	 * @param parkingAddress a {@link java.lang.String} object.
	 */
	public void setParkingAddress(String parkingAddress) {
		this.parkingAddress = parkingAddress;
	}

	/**
	 * <p>Getter for the field <code>parkingEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingEndTime() {
		return this.parkingEndTime;
	}
	/**
	 * <p>Setter for the field <code>parkingEndTime</code>.</p>
	 *
	 * @param parkingEndTime a {@link java.lang.String} object.
	 */
	public void setParkingEndTime(String parkingEndTime) {
		this.parkingEndTime = parkingEndTime;
	}

	/**
	 * <p>Getter for the field <code>parkingFeeDescription</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingFeeDescription() {
		return this.parkingFeeDescription;
	}
	/**
	 * <p>Setter for the field <code>parkingFeeDescription</code>.</p>
	 *
	 * @param parkingFeeDescription a {@link java.lang.String} object.
	 */
	public void setParkingFeeDescription(String parkingFeeDescription) {
		this.parkingFeeDescription = parkingFeeDescription;
	}

	/**
	 * <p>Getter for the field <code>parkingLotType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingLotType() {
		return this.parkingLotType;
	}
	/**
	 * <p>Setter for the field <code>parkingLotType</code>.</p>
	 *
	 * @param parkingLotType a {@link java.lang.String} object.
	 */
	public void setParkingLotType(String parkingLotType) {
		this.parkingLotType = parkingLotType;
	}

	/**
	 * <p>Getter for the field <code>parkingName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingName() {
		return this.parkingName;
	}
	/**
	 * <p>Setter for the field <code>parkingName</code>.</p>
	 *
	 * @param parkingName a {@link java.lang.String} object.
	 */
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	/**
	 * <p>Getter for the field <code>parkingNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingNumber() {
		return this.parkingNumber;
	}
	/**
	 * <p>Setter for the field <code>parkingNumber</code>.</p>
	 *
	 * @param parkingNumber a {@link java.lang.String} object.
	 */
	public void setParkingNumber(String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	/**
	 * <p>Getter for the field <code>parkingStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingStartTime() {
		return this.parkingStartTime;
	}
	/**
	 * <p>Setter for the field <code>parkingStartTime</code>.</p>
	 *
	 * @param parkingStartTime a {@link java.lang.String} object.
	 */
	public void setParkingStartTime(String parkingStartTime) {
		this.parkingStartTime = parkingStartTime;
	}

	/**
	 * <p>Getter for the field <code>parkingType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingType() {
		return this.parkingType;
	}
	/**
	 * <p>Setter for the field <code>parkingType</code>.</p>
	 *
	 * @param parkingType a {@link java.lang.String} object.
	 */
	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}

	/**
	 * <p>Getter for the field <code>payType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayType() {
		return this.payType;
	}
	/**
	 * <p>Setter for the field <code>payType</code>.</p>
	 *
	 * @param payType a {@link java.lang.String} object.
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}

	/**
	 * <p>Getter for the field <code>paymentMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentMode() {
		return this.paymentMode;
	}
	/**
	 * <p>Setter for the field <code>paymentMode</code>.</p>
	 *
	 * @param paymentMode a {@link java.lang.String} object.
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * <p>Getter for the field <code>shopingmallId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopingmallId() {
		return this.shopingmallId;
	}
	/**
	 * <p>Setter for the field <code>shopingmallId</code>.</p>
	 *
	 * @param shopingmallId a {@link java.lang.String} object.
	 */
	public void setShopingmallId(String shopingmallId) {
		this.shopingmallId = shopingmallId;
	}

	/**
	 * <p>Getter for the field <code>timeOut</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeOut() {
		return this.timeOut;
	}
	/**
	 * <p>Setter for the field <code>timeOut</code>.</p>
	 *
	 * @param timeOut a {@link java.lang.String} object.
	 */
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

}
