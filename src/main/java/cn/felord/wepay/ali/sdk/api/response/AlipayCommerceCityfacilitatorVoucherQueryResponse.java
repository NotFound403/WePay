package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4491833443916556954L;

	/** 
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 终点站
	 */
	@ApiField("end_station")
	private String endStation;

	/** 
	 * 终点站点名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/** 
	 * 订单中包含的票数
	 */
	@ApiField("quantity")
	private String quantity;

	/** 
	 * 起点站
	 */
	@ApiField("start_station")
	private String startStation;

	/** 
	 * 起始站点名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/** 
	 * 查询的该笔订单当前状态(SUCCESS、TRANSFER、FAIL等)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 票单价
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/** 
	 * 描述票种类
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount( ) {
		return this.amount;
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
	 * <p>Getter for the field <code>endStation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndStation( ) {
		return this.endStation;
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
	 * <p>Getter for the field <code>endStationName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEndStationName( ) {
		return this.endStationName;
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
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuantity( ) {
		return this.quantity;
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
	 * <p>Getter for the field <code>startStation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartStation( ) {
		return this.startStation;
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
	 * <p>Getter for the field <code>startStationName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartStationName( ) {
		return this.startStationName;
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

	/**
	 * <p>Setter for the field <code>ticketPrice</code>.</p>
	 *
	 * @param ticketPrice a {@link java.lang.String} object.
	 */
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	/**
	 * <p>Getter for the field <code>ticketPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTicketPrice( ) {
		return this.ticketPrice;
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
	 * <p>Getter for the field <code>ticketType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTicketType( ) {
		return this.ticketType;
	}

	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
