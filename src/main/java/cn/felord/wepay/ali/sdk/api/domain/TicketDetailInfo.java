package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 购票订单信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TicketDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7263651973229578378L;

	/**
	 * 总金额，元为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 终点站编码
	 */
	@ApiField("end_station")
	private String endStation;

	/**
	 * 终点站中文名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 票数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 起点站编码
	 */
	@ApiField("start_station")
	private String startStation;

	/**
	 * 起点站中文名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 单价，元为单位
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/**
	 * 票类型
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>endStation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndStation() {
		return this.endStation;
	}
	/**
	 * <p>Setter for the field <code>endStation</code>.</p>
	 *
	 * @param endStation a {@link java.lang.String} object.
	 */
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	/**
	 * <p>Getter for the field <code>endStationName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndStationName() {
		return this.endStationName;
	}
	/**
	 * <p>Setter for the field <code>endStationName</code>.</p>
	 *
	 * @param endStationName a {@link java.lang.String} object.
	 */
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	/**
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuantity() {
		return this.quantity;
	}
	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a {@link java.lang.String} object.
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * <p>Getter for the field <code>startStation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartStation() {
		return this.startStation;
	}
	/**
	 * <p>Setter for the field <code>startStation</code>.</p>
	 *
	 * @param startStation a {@link java.lang.String} object.
	 */
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	/**
	 * <p>Getter for the field <code>startStationName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartStationName() {
		return this.startStationName;
	}
	/**
	 * <p>Setter for the field <code>startStationName</code>.</p>
	 *
	 * @param startStationName a {@link java.lang.String} object.
	 */
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
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

	/**
	 * <p>Getter for the field <code>ticketPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTicketPrice() {
		return this.ticketPrice;
	}
	/**
	 * <p>Setter for the field <code>ticketPrice</code>.</p>
	 *
	 * @param ticketPrice a {@link java.lang.String} object.
	 */
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	/**
	 * <p>Getter for the field <code>ticketType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTicketType() {
		return this.ticketType;
	}
	/**
	 * <p>Setter for the field <code>ticketType</code>.</p>
	 *
	 * @param ticketType a {@link java.lang.String} object.
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
