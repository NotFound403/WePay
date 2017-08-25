package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.advice.accept response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAccountExrateAdviceAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 6662445226425153354L;

	/** 
	 * 客户号：用于定义FX交易的客户，由外汇交易中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/** 
	 * 对应金额，选输项
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/** 
	 * 相应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/** 
	 * FX中心的处理序号
	 */
	@ApiField("deal_ref")
	private String dealRef;

	/** 
	 * 实际成交的汇率，原FXRateUsed。
	 */
	@ApiField("dealt_rate")
	private String dealtRate;

	/** 
	 * 是否重复消息
	 */
	@ApiField("duplicate")
	private Boolean duplicate;

	/** 
	 * 交易请求号
	 */
	@ApiField("messag_id")
	private String messagId;

	/** 
	 * 请求类型
字典：H - HedgeAdvise , T - TradeAdvise。锁价模式下先发送Hedge，在发送对应的Trade。非锁价模式下，可直接发送Trade
	 */
	@ApiField("msg_type")
	private String msgType;

	/** 
	 * 汇率使用状态
字典：QUALIFY, EXCEPTION。请求汇率是否被使用，QUALIFY - 与请求汇率一致，EXCEPTION - 未使用请求汇率
	 */
	@ApiField("requested_rate_status")
	private String requestedRateStatus;

	/** 
	 * 买卖方向：BUY,SELL。客户视角对交易货币的操作。该字段为必填，与原TransactionType的对应关系如下：
SALE - SELL
REFUND - BUY
CHARGEBACK - BUY
CHARGEBACK_RESEVSE - SELL
CANCELLATION - 使用原交易的side"
r1
	 */
	@ApiField("side")
	private String side;

	/** 
	 * 交易金额
	 */
	@ApiField("transaction_amount")
	private String transactionAmount;

	/** 
	 * 交易币种: 客户视角的交易买卖币种
	 */
	@ApiField("transaction_ccy")
	private String transactionCcy;

	/** 
	 * 起息日期 :  YYYYMMDD，客户期望的资金交割日期
	 */
	@ApiField("value_date")
	private String valueDate;

	/**
	 * <p>Setter for the field <code>clientId</code>.</p>
	 *
	 * @param clientId a {@link java.lang.String} object.
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * <p>Getter for the field <code>clientId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientId( ) {
		return this.clientId;
	}

	/**
	 * <p>Setter for the field <code>contraAmount</code>.</p>
	 *
	 * @param contraAmount a {@link java.lang.String} object.
	 */
	public void setContraAmount(String contraAmount) {
		this.contraAmount = contraAmount;
	}
	/**
	 * <p>Getter for the field <code>contraAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContraAmount( ) {
		return this.contraAmount;
	}

	/**
	 * <p>Setter for the field <code>contraCcy</code>.</p>
	 *
	 * @param contraCcy a {@link java.lang.String} object.
	 */
	public void setContraCcy(String contraCcy) {
		this.contraCcy = contraCcy;
	}
	/**
	 * <p>Getter for the field <code>contraCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContraCcy( ) {
		return this.contraCcy;
	}

	/**
	 * <p>Setter for the field <code>dealRef</code>.</p>
	 *
	 * @param dealRef a {@link java.lang.String} object.
	 */
	public void setDealRef(String dealRef) {
		this.dealRef = dealRef;
	}
	/**
	 * <p>Getter for the field <code>dealRef</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDealRef( ) {
		return this.dealRef;
	}

	/**
	 * <p>Setter for the field <code>dealtRate</code>.</p>
	 *
	 * @param dealtRate a {@link java.lang.String} object.
	 */
	public void setDealtRate(String dealtRate) {
		this.dealtRate = dealtRate;
	}
	/**
	 * <p>Getter for the field <code>dealtRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDealtRate( ) {
		return this.dealtRate;
	}

	/**
	 * <p>Setter for the field <code>duplicate</code>.</p>
	 *
	 * @param duplicate a {@link java.lang.Boolean} object.
	 */
	public void setDuplicate(Boolean duplicate) {
		this.duplicate = duplicate;
	}
	/**
	 * <p>Getter for the field <code>duplicate</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getDuplicate( ) {
		return this.duplicate;
	}

	/**
	 * <p>Setter for the field <code>messagId</code>.</p>
	 *
	 * @param messagId a {@link java.lang.String} object.
	 */
	public void setMessagId(String messagId) {
		this.messagId = messagId;
	}
	/**
	 * <p>Getter for the field <code>messagId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessagId( ) {
		return this.messagId;
	}

	/**
	 * <p>Setter for the field <code>msgType</code>.</p>
	 *
	 * @param msgType a {@link java.lang.String} object.
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	/**
	 * <p>Getter for the field <code>msgType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsgType( ) {
		return this.msgType;
	}

	/**
	 * <p>Setter for the field <code>requestedRateStatus</code>.</p>
	 *
	 * @param requestedRateStatus a {@link java.lang.String} object.
	 */
	public void setRequestedRateStatus(String requestedRateStatus) {
		this.requestedRateStatus = requestedRateStatus;
	}
	/**
	 * <p>Getter for the field <code>requestedRateStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestedRateStatus( ) {
		return this.requestedRateStatus;
	}

	/**
	 * <p>Setter for the field <code>side</code>.</p>
	 *
	 * @param side a {@link java.lang.String} object.
	 */
	public void setSide(String side) {
		this.side = side;
	}
	/**
	 * <p>Getter for the field <code>side</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSide( ) {
		return this.side;
	}

	/**
	 * <p>Setter for the field <code>transactionAmount</code>.</p>
	 *
	 * @param transactionAmount a {@link java.lang.String} object.
	 */
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	/**
	 * <p>Getter for the field <code>transactionAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionAmount( ) {
		return this.transactionAmount;
	}

	/**
	 * <p>Setter for the field <code>transactionCcy</code>.</p>
	 *
	 * @param transactionCcy a {@link java.lang.String} object.
	 */
	public void setTransactionCcy(String transactionCcy) {
		this.transactionCcy = transactionCcy;
	}
	/**
	 * <p>Getter for the field <code>transactionCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionCcy( ) {
		return this.transactionCcy;
	}

	/**
	 * <p>Setter for the field <code>valueDate</code>.</p>
	 *
	 * @param valueDate a {@link java.lang.String} object.
	 */
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	/**
	 * <p>Getter for the field <code>valueDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValueDate( ) {
		return this.valueDate;
	}

}
