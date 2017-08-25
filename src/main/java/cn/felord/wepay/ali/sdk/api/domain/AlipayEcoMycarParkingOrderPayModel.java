package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 停车缴费代扣接口API
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 3694744144214525642L;

	/**
	 * 车牌，需要进行停车缴费代扣的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * ISV停车场ID，由ISV定义的停车场标识，系统唯一，parking_id和out_parking_id不能同时为空
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 支付宝合作商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，系统唯一, parking_id和out_parking_id不能同时为空
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 卖家支付宝用户号
卖家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数。与seller_logon_id不能同时为空
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家支付宝账号，可以为email或者手机号。
如果seller_id不为空，则以seller_id的值作为卖家账号，忽略本参数。
	 */
	@ApiField("seller_logon_id")
	private String sellerLogonId;

	/**
	 * 订单标题，描述订单用途
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单金额，精确到小数点后两位
	 */
	@ApiField("total_fee")
	private String totalFee;

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
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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
	 * <p>Getter for the field <code>sellerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerId() {
		return this.sellerId;
	}
	/**
	 * <p>Setter for the field <code>sellerId</code>.</p>
	 *
	 * @param sellerId a {@link java.lang.String} object.
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * <p>Getter for the field <code>sellerLogonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSellerLogonId() {
		return this.sellerLogonId;
	}
	/**
	 * <p>Setter for the field <code>sellerLogonId</code>.</p>
	 *
	 * @param sellerLogonId a {@link java.lang.String} object.
	 */
	public void setSellerLogonId(String sellerLogonId) {
		this.sellerLogonId = sellerLogonId;
	}

	/**
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * <p>Getter for the field <code>totalFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalFee() {
		return this.totalFee;
	}
	/**
	 * <p>Setter for the field <code>totalFee</code>.</p>
	 *
	 * @param totalFee a {@link java.lang.String} object.
	 */
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
