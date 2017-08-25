package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 停车卡查询收费信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarParkingCardidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2387318395362356878L;

	/**
	 * 如果商户订单号为空，停车场id和车牌号不能为空，商户订单号优先查询
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 用户支付成功而设备商状态没一起同步过来，手动执行查询
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 查询订单时间（不传值为当日时间），格式"yyyy-MM-dd"
	 */
	@ApiField("sel_time")
	private String selTime;

	/**
	 * 车主平台交易号，不能跟停车场编号和车牌号同时为空
	 */
	@ApiField("transaction_no")
	private String transactionNo;

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
	 * <p>Getter for the field <code>selTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSelTime() {
		return this.selTime;
	}
	/**
	 * <p>Setter for the field <code>selTime</code>.</p>
	 *
	 * @param selTime a {@link java.lang.String} object.
	 */
	public void setSelTime(String selTime) {
		this.selTime = selTime;
	}

	/**
	 * <p>Getter for the field <code>transactionNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionNo() {
		return this.transactionNo;
	}
	/**
	 * <p>Setter for the field <code>transactionNo</code>.</p>
	 *
	 * @param transactionNo a {@link java.lang.String} object.
	 */
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

}
