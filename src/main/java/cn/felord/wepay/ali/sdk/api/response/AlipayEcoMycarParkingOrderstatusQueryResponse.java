package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.orderstatus.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingOrderstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1564172385655213451L;

	/** 
	 * 支付宝交易流水号订单
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 车平台订单
	 */
	@ApiField("car_order_id")
	private String carOrderId;

	/** 
	 * 设备商订单id
	 */
	@ApiField("equipment_order_id")
	private String equipmentOrderId;

	/** 
	 * 支付金额
	 */
	@ApiField("pay_money")
	private String payMoney;

	/** 
	 * 支付状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付的时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费）
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 返回状态(1为成功,0为失败)
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Setter for the field <code>alipayOrderId</code>.</p>
	 *
	 * @param alipayOrderId a {@link java.lang.String} object.
	 */
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	/**
	 * <p>Getter for the field <code>alipayOrderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

	/**
	 * <p>Setter for the field <code>carOrderId</code>.</p>
	 *
	 * @param carOrderId a {@link java.lang.String} object.
	 */
	public void setCarOrderId(String carOrderId) {
		this.carOrderId = carOrderId;
	}
	/**
	 * <p>Getter for the field <code>carOrderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCarOrderId( ) {
		return this.carOrderId;
	}

	/**
	 * <p>Setter for the field <code>equipmentOrderId</code>.</p>
	 *
	 * @param equipmentOrderId a {@link java.lang.String} object.
	 */
	public void setEquipmentOrderId(String equipmentOrderId) {
		this.equipmentOrderId = equipmentOrderId;
	}
	/**
	 * <p>Getter for the field <code>equipmentOrderId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEquipmentOrderId( ) {
		return this.equipmentOrderId;
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
	 * <p>Getter for the field <code>payMoney</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayMoney( ) {
		return this.payMoney;
	}

	/**
	 * <p>Setter for the field <code>payStatus</code>.</p>
	 *
	 * @param payStatus a {@link java.lang.String} object.
	 */
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	/**
	 * <p>Getter for the field <code>payStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayStatus( ) {
		return this.payStatus;
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
	 * <p>Getter for the field <code>payTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayTime( ) {
		return this.payTime;
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
	 * <p>Getter for the field <code>payType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayType( ) {
		return this.payType;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus( ) {
		return this.status;
	}

}
