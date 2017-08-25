package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单同步接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8346824464777253394L;

	/**
	 * 车牌
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 如果是停车卡缴费，则填入停车卡卡号，否则为'*'
	 */
	@ApiField("card_number")
	private String cardNumber;

	/**
	 * 停车时长（以分为单位）
	 */
	@ApiField("in_duration")
	private String inDuration;

	/**
	 * 入场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 支付宝支付流水，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 设备商订单状态，0：成功，1：失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单创建时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 设备商订单号，由ISV系统生成
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * ISV停车场ID，由ISV提供，同一个isv或商户范围内唯一
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 支付宝停车场id，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 停车场名称，由ISV定义，尽量与高德地图上的一致
	 */
	@ApiField("parking_name")
	private String parkingName;

	/**
	 * 缴费金额，保留小数点后两位
	 */
	@ApiField("pay_money")
	private String payMoney;

	/**
	 * 缴费时间, 格式"YYYYMM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 付款方式，1：支付宝在线缴费 ，2：支付宝代扣缴费
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 停车缴费支付宝用户的ID，请ISV保证用户ID的正确性，以免导致用户在停车平台查询不到相关的订单信息
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>carNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarNumber() {
		return this.carNumber;
	}
	/**
	 * <p>Setter for the field <code>carNumber</code>.</p>
	 *
	 * @param carNumber a {@link java.lang.String} object.
	 */
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	/**
	 * <p>Getter for the field <code>cardNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNumber() {
		return this.cardNumber;
	}
	/**
	 * <p>Setter for the field <code>cardNumber</code>.</p>
	 *
	 * @param cardNumber a {@link java.lang.String} object.
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * <p>Getter for the field <code>inDuration</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInDuration() {
		return this.inDuration;
	}
	/**
	 * <p>Setter for the field <code>inDuration</code>.</p>
	 *
	 * @param inDuration a {@link java.lang.String} object.
	 */
	public void setInDuration(String inDuration) {
		this.inDuration = inDuration;
	}

	/**
	 * <p>Getter for the field <code>inTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInTime() {
		return this.inTime;
	}
	/**
	 * <p>Setter for the field <code>inTime</code>.</p>
	 *
	 * @param inTime a {@link java.lang.String} object.
	 */
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

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
	 * <p>Getter for the field <code>orderTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderTime() {
		return this.orderTime;
	}
	/**
	 * <p>Setter for the field <code>orderTime</code>.</p>
	 *
	 * @param orderTime a {@link java.lang.String} object.
	 */
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	/**
	 * <p>Setter for the field <code>outOrderNo</code>.</p>
	 *
	 * @param outOrderNo a {@link java.lang.String} object.
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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
	 * <p>Getter for the field <code>parkingId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParkingId() {
		return this.parkingId;
	}
	/**
	 * <p>Setter for the field <code>parkingId</code>.</p>
	 *
	 * @param parkingId a {@link java.lang.String} object.
	 */
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
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
	 * <p>Getter for the field <code>payMoney</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayMoney() {
		return this.payMoney;
	}
	/**
	 * <p>Setter for the field <code>payMoney</code>.</p>
	 *
	 * @param payMoney a {@link java.lang.String} object.
	 */
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}

	/**
	 * <p>Getter for the field <code>payTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayTime() {
		return this.payTime;
	}
	/**
	 * <p>Setter for the field <code>payTime</code>.</p>
	 *
	 * @param payTime a {@link java.lang.String} object.
	 */
	public void setPayTime(String payTime) {
		this.payTime = payTime;
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
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
