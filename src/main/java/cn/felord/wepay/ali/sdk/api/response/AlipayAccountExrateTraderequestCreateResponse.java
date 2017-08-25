package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.traderequest.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayAccountExrateTraderequestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2664685266964951897L;

	/** 
	 * 成交汇率的基准币种
	 */
	@ApiField("base_ccy")
	private String baseCcy;

	/** 
	 * 原请求客户号
	 */
	@ApiField("client_id")
	private String clientId;

	/** 
	 * 对应金额
	 */
	@ApiField("contra_amount")
	private String contraAmount;

	/** 
	 * 对应币种
	 */
	@ApiField("contra_ccy")
	private String contraCcy;

	/** 
	 * FX返回关联该笔业务单据的交易号
	 */
	@ApiField("deal_ref")
	private String dealRef;

	/** 
	 * 成交汇率
	 */
	@ApiField("dealt_rate")
	private String dealtRate;

	/** 
	 * 该请求是否为重复发送。当为true时，结果码和结果描述，为该交易当前的处理情况。
	 */
	@ApiField("duplicate")
	private String duplicate;

	/** 
	 * 请求类型
字典：H - HedgeAdvise , T - TradeAdvise。
	 */
	@ApiField("msg_type")
	private String msgType;

	/** 
	 * 业务唯一单据号
	 */
	@ApiField("requested_message_id")
	private String requestedMessageId;

	/** 
	 * 汇率使用状态,字典：QUALIFY, EXCEPTION。请求汇率是否被使用，QUALIFY - 与请求汇率一致，EXCEPTION - 未使用请求汇率
	 */
	@ApiField("requested_rate_status")
	private String requestedRateStatus;

	/** 
	 * 请求返回类型，字典，同步受理返回 acknowledge：ACK ;  异步成交回执 executtion  report：EXEC
	 */
	@ApiField("response_type")
	private String responseType;

	/** 
	 * 交易方向
	 */
	@ApiField("side")
	private String side;

	/** 
	 * 交易金额
	 */
	@ApiField("transaction_amount")
	private String transactionAmount;

	/** 
	 * 交易币种
	 */
	@ApiField("transaction_ccy")
	private String transactionCcy;

	/** 
	 * 起息日
	 */
	@ApiField("value_date")
	private String valueDate;

	/**
	 * <p>Setter for the field <code>baseCcy</code>.</p>
	 *
	 * @param baseCcy a {@link java.lang.String} object.
	 */
	public void setBaseCcy(String baseCcy) {
		this.baseCcy = baseCcy;
	}
	/**
	 * <p>Getter for the field <code>baseCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBaseCcy( ) {
		return this.baseCcy;
	}

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
	 * @param duplicate a {@link java.lang.String} object.
	 */
	public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}
	/**
	 * <p>Getter for the field <code>duplicate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDuplicate( ) {
		return this.duplicate;
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
	 * <p>Setter for the field <code>requestedMessageId</code>.</p>
	 *
	 * @param requestedMessageId a {@link java.lang.String} object.
	 */
	public void setRequestedMessageId(String requestedMessageId) {
		this.requestedMessageId = requestedMessageId;
	}
	/**
	 * <p>Getter for the field <code>requestedMessageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestedMessageId( ) {
		return this.requestedMessageId;
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
	 * <p>Setter for the field <code>responseType</code>.</p>
	 *
	 * @param responseType a {@link java.lang.String} object.
	 */
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	/**
	 * <p>Getter for the field <code>responseType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResponseType( ) {
		return this.responseType;
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
