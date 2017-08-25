package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外汇交易请求对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TradeRequestVO extends AlipayObject {

	private static final long serialVersionUID = 8663585895389738524L;

	/**
	 * globalnet收单机构
	 */
	@ApiField("acquirer")
	private String acquirer;

	/**
	 * 收单成员id(gn站点成员编号）
	 */
	@ApiField("acquirer_mem_id")
	private String acquirerMemId;

	/**
	 * 反洗钱处理标志
	 */
	@ApiField("aml_status")
	private String amlStatus;

	/**
	 * 业务事件码
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 交易请求发起时间
	 */
	@ApiField("client_advice_timestamp")
	private Date clientAdviceTimestamp;

	/**
	 * 接入平台业务订单号
	 */
	@ApiField("client_business_id")
	private String clientBusinessId;

	/**
	 * 用于定义FX交易的客户，由购结汇中心统一分配
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 接入平台唯一序列号
	 */
	@ApiField("client_message_id")
	private String clientMessageId;

	/**
	 * 客户请求序号:  客户侧的流水号，由客户上送
	 */
	@ApiField("client_ref")
	private String clientRef;

	/**
	 * 接入平台
	 */
	@ApiField("client_system")
	private String clientSystem;

	/**
	 * 端到端传递的事件代码
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端到端流水号
	 */
	@ApiField("cnl_no")
	private String cnlNo;

	/**
	 * 端到端传递的产品代码
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

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
	 * 扩展字段
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 机构实体
	 */
	@ApiField("inst_entity")
	private String instEntity;

	/**
	 * 是否锁价,字典N否，Y是
	 */
	@ApiField("is_locked")
	private String isLocked;

	/**
	 * globalnet发卡机构
	 */
	@ApiField("issuer")
	private String issuer;

	/**
	 * 发卡成员id(gn站点成员编号）
	 */
	@ApiField("issuer_mem_id")
	private String issuerMemId;

	/**
	 * 商户MCC代码
	 */
	@ApiField("merchant_mcc")
	private String merchantMcc;

	/**
	 * 请求类型： T - TradeAdvise。
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 操作动作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 是否可部分成交,字典：Y，N。
	 */
	@ApiField("partial_trade")
	private String partialTrade;

	/**
	 * 交易商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付渠道
	 */
	@ApiField("payment_provider")
	private String paymentProvider;

	/**
	 * 支付类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 对客产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 客户协议扩展号，用于支持同一客户在不同场景下所需的汇率模式
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 请求汇率基准币种
	 */
	@ApiField("rate_base_ccy")
	private String rateBaseCcy;

	/**
	 * 汇率的唯一编码
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率请求模式,字典：
REQ - 按客户请求(含滑点)成交，若该价格失效，则交易失败；
ACP - 汇率失效或请求中不带汇率，接受该客户协议的最新汇率，实际成交汇率以GlobalFX为准；
MAN- 无论如何都受理请求汇率
	 */
	@ApiField("rate_request_mode")
	private String rateRequestMode;

	/**
	 * 汇率类型，字典：SPOT，FORWARD，SWAP。
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 备用字段
	 */
	@ApiField("reference_field1")
	private String referenceField1;

	/**
	 * 备用字段2
	 */
	@ApiField("reference_field2")
	private String referenceField2;

	/**
	 * 备用字段3
	 */
	@ApiField("reference_field3")
	private String referenceField3;

	/**
	 * 本次交易请求关联的原交易号。
	 */
	@ApiField("related_message_id")
	private String relatedMessageId;

	/**
	 * 业务唯一单据号
	 */
	@ApiField("request_message_id")
	private String requestMessageId;

	/**
	 * 请求交易汇率
	 */
	@ApiField("requested_rate")
	private String requestedRate;

	/**
	 * NDF交割下，实际交割币种的金额
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * 交割币种
	 */
	@ApiField("settlement_ccy")
	private String settlementCcy;

	/**
	 * 交易方向
	 */
	@ApiField("side")
	private String side;

	/**
	 * 汇率上浮滑点 : BP单位，即汇率单位的万分之一。仅在“请求汇率模式”为REQ时有效，在请求汇率/汇率编码对应的汇率的基础上，Side为BUY时上浮滑点，Side为SELL时下浮滑点
	 */
	@ApiField("slip_point")
	private String slipPoint;

	/**
	 * 客户所在的时区，按照标准时区。
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 租户信息
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 上层业务应用发起交易时间
	 */
	@ApiField("trade_timestamp")
	private Date tradeTimestamp;

	/**
	 * 成交模式,按成交价格产生方式，起息日是否明确，交易日期是否明确，交易金额是否部分成交等维度产生的标识组合出的模式
	 */
	@ApiField("trade_type")
	private String tradeType;

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
	 * 交易币种交割方式,字典：DELIV，NDF。当Client的实际交割货币与交易币种不一致时，送NDF。
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 交易类型使用。字典：SALE，REFUND，CHARGEBACK，CHARGEBACK_REVERSE，CANCELLATION等
	 */
	@ApiField("transaction_type")
	private String transactionType;

	/**
	 * 发起交易的用户或商户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 起息日期YYYYMMDD
	 */
	@ApiField("value_date")
	private String valueDate;

	/**
	 * <p>Getter for the field <code>acquirer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAcquirer() {
		return this.acquirer;
	}
	/**
	 * <p>Setter for the field <code>acquirer</code>.</p>
	 *
	 * @param acquirer a {@link java.lang.String} object.
	 */
	public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}

	/**
	 * <p>Getter for the field <code>acquirerMemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAcquirerMemId() {
		return this.acquirerMemId;
	}
	/**
	 * <p>Setter for the field <code>acquirerMemId</code>.</p>
	 *
	 * @param acquirerMemId a {@link java.lang.String} object.
	 */
	public void setAcquirerMemId(String acquirerMemId) {
		this.acquirerMemId = acquirerMemId;
	}

	/**
	 * <p>Getter for the field <code>amlStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmlStatus() {
		return this.amlStatus;
	}
	/**
	 * <p>Setter for the field <code>amlStatus</code>.</p>
	 *
	 * @param amlStatus a {@link java.lang.String} object.
	 */
	public void setAmlStatus(String amlStatus) {
		this.amlStatus = amlStatus;
	}

	/**
	 * <p>Getter for the field <code>bizEvCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizEvCode() {
		return this.bizEvCode;
	}
	/**
	 * <p>Setter for the field <code>bizEvCode</code>.</p>
	 *
	 * @param bizEvCode a {@link java.lang.String} object.
	 */
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	/**
	 * <p>Getter for the field <code>bizPdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizPdCode() {
		return this.bizPdCode;
	}
	/**
	 * <p>Setter for the field <code>bizPdCode</code>.</p>
	 *
	 * @param bizPdCode a {@link java.lang.String} object.
	 */
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	/**
	 * <p>Getter for the field <code>clientAdviceTimestamp</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getClientAdviceTimestamp() {
		return this.clientAdviceTimestamp;
	}
	/**
	 * <p>Setter for the field <code>clientAdviceTimestamp</code>.</p>
	 *
	 * @param clientAdviceTimestamp a {@link java.util.Date} object.
	 */
	public void setClientAdviceTimestamp(Date clientAdviceTimestamp) {
		this.clientAdviceTimestamp = clientAdviceTimestamp;
	}

	/**
	 * <p>Getter for the field <code>clientBusinessId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientBusinessId() {
		return this.clientBusinessId;
	}
	/**
	 * <p>Setter for the field <code>clientBusinessId</code>.</p>
	 *
	 * @param clientBusinessId a {@link java.lang.String} object.
	 */
	public void setClientBusinessId(String clientBusinessId) {
		this.clientBusinessId = clientBusinessId;
	}

	/**
	 * <p>Getter for the field <code>clientId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientId() {
		return this.clientId;
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
	 * <p>Getter for the field <code>clientMessageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientMessageId() {
		return this.clientMessageId;
	}
	/**
	 * <p>Setter for the field <code>clientMessageId</code>.</p>
	 *
	 * @param clientMessageId a {@link java.lang.String} object.
	 */
	public void setClientMessageId(String clientMessageId) {
		this.clientMessageId = clientMessageId;
	}

	/**
	 * <p>Getter for the field <code>clientRef</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientRef() {
		return this.clientRef;
	}
	/**
	 * <p>Setter for the field <code>clientRef</code>.</p>
	 *
	 * @param clientRef a {@link java.lang.String} object.
	 */
	public void setClientRef(String clientRef) {
		this.clientRef = clientRef;
	}

	/**
	 * <p>Getter for the field <code>clientSystem</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientSystem() {
		return this.clientSystem;
	}
	/**
	 * <p>Setter for the field <code>clientSystem</code>.</p>
	 *
	 * @param clientSystem a {@link java.lang.String} object.
	 */
	public void setClientSystem(String clientSystem) {
		this.clientSystem = clientSystem;
	}

	/**
	 * <p>Getter for the field <code>cnlEvCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCnlEvCode() {
		return this.cnlEvCode;
	}
	/**
	 * <p>Setter for the field <code>cnlEvCode</code>.</p>
	 *
	 * @param cnlEvCode a {@link java.lang.String} object.
	 */
	public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

	/**
	 * <p>Getter for the field <code>cnlNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCnlNo() {
		return this.cnlNo;
	}
	/**
	 * <p>Setter for the field <code>cnlNo</code>.</p>
	 *
	 * @param cnlNo a {@link java.lang.String} object.
	 */
	public void setCnlNo(String cnlNo) {
		this.cnlNo = cnlNo;
	}

	/**
	 * <p>Getter for the field <code>cnlPdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCnlPdCode() {
		return this.cnlPdCode;
	}
	/**
	 * <p>Setter for the field <code>cnlPdCode</code>.</p>
	 *
	 * @param cnlPdCode a {@link java.lang.String} object.
	 */
	public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
	}

	/**
	 * <p>Getter for the field <code>contraAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContraAmount() {
		return this.contraAmount;
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
	 * <p>Getter for the field <code>contraCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContraCcy() {
		return this.contraCcy;
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
	 * <p>Getter for the field <code>extension</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtension() {
		return this.extension;
	}
	/**
	 * <p>Setter for the field <code>extension</code>.</p>
	 *
	 * @param extension a {@link java.lang.String} object.
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * <p>Getter for the field <code>instEntity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstEntity() {
		return this.instEntity;
	}
	/**
	 * <p>Setter for the field <code>instEntity</code>.</p>
	 *
	 * @param instEntity a {@link java.lang.String} object.
	 */
	public void setInstEntity(String instEntity) {
		this.instEntity = instEntity;
	}

	/**
	 * <p>Getter for the field <code>isLocked</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsLocked() {
		return this.isLocked;
	}
	/**
	 * <p>Setter for the field <code>isLocked</code>.</p>
	 *
	 * @param isLocked a {@link java.lang.String} object.
	 */
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * <p>Getter for the field <code>issuer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIssuer() {
		return this.issuer;
	}
	/**
	 * <p>Setter for the field <code>issuer</code>.</p>
	 *
	 * @param issuer a {@link java.lang.String} object.
	 */
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * <p>Getter for the field <code>issuerMemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIssuerMemId() {
		return this.issuerMemId;
	}
	/**
	 * <p>Setter for the field <code>issuerMemId</code>.</p>
	 *
	 * @param issuerMemId a {@link java.lang.String} object.
	 */
	public void setIssuerMemId(String issuerMemId) {
		this.issuerMemId = issuerMemId;
	}

	/**
	 * <p>Getter for the field <code>merchantMcc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantMcc() {
		return this.merchantMcc;
	}
	/**
	 * <p>Setter for the field <code>merchantMcc</code>.</p>
	 *
	 * @param merchantMcc a {@link java.lang.String} object.
	 */
	public void setMerchantMcc(String merchantMcc) {
		this.merchantMcc = merchantMcc;
	}

	/**
	 * <p>Getter for the field <code>msgType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsgType() {
		return this.msgType;
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
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	/**
	 * <p>Getter for the field <code>partialTrade</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartialTrade() {
		return this.partialTrade;
	}
	/**
	 * <p>Setter for the field <code>partialTrade</code>.</p>
	 *
	 * @param partialTrade a {@link java.lang.String} object.
	 */
	public void setPartialTrade(String partialTrade) {
		this.partialTrade = partialTrade;
	}

	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}
	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * <p>Getter for the field <code>paymentProvider</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentProvider() {
		return this.paymentProvider;
	}
	/**
	 * <p>Setter for the field <code>paymentProvider</code>.</p>
	 *
	 * @param paymentProvider a {@link java.lang.String} object.
	 */
	public void setPaymentProvider(String paymentProvider) {
		this.paymentProvider = paymentProvider;
	}

	/**
	 * <p>Getter for the field <code>paymentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentType() {
		return this.paymentType;
	}
	/**
	 * <p>Setter for the field <code>paymentType</code>.</p>
	 *
	 * @param paymentType a {@link java.lang.String} object.
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * <p>Getter for the field <code>productId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductId() {
		return this.productId;
	}
	/**
	 * <p>Setter for the field <code>productId</code>.</p>
	 *
	 * @param productId a {@link java.lang.String} object.
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * <p>Getter for the field <code>profileId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProfileId() {
		return this.profileId;
	}
	/**
	 * <p>Setter for the field <code>profileId</code>.</p>
	 *
	 * @param profileId a {@link java.lang.String} object.
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	/**
	 * <p>Getter for the field <code>rateBaseCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRateBaseCcy() {
		return this.rateBaseCcy;
	}
	/**
	 * <p>Setter for the field <code>rateBaseCcy</code>.</p>
	 *
	 * @param rateBaseCcy a {@link java.lang.String} object.
	 */
	public void setRateBaseCcy(String rateBaseCcy) {
		this.rateBaseCcy = rateBaseCcy;
	}

	/**
	 * <p>Getter for the field <code>rateRef</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRateRef() {
		return this.rateRef;
	}
	/**
	 * <p>Setter for the field <code>rateRef</code>.</p>
	 *
	 * @param rateRef a {@link java.lang.String} object.
	 */
	public void setRateRef(String rateRef) {
		this.rateRef = rateRef;
	}

	/**
	 * <p>Getter for the field <code>rateRequestMode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRateRequestMode() {
		return this.rateRequestMode;
	}
	/**
	 * <p>Setter for the field <code>rateRequestMode</code>.</p>
	 *
	 * @param rateRequestMode a {@link java.lang.String} object.
	 */
	public void setRateRequestMode(String rateRequestMode) {
		this.rateRequestMode = rateRequestMode;
	}

	/**
	 * <p>Getter for the field <code>rateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRateType() {
		return this.rateType;
	}
	/**
	 * <p>Setter for the field <code>rateType</code>.</p>
	 *
	 * @param rateType a {@link java.lang.String} object.
	 */
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	/**
	 * <p>Getter for the field <code>referenceField1</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReferenceField1() {
		return this.referenceField1;
	}
	/**
	 * <p>Setter for the field <code>referenceField1</code>.</p>
	 *
	 * @param referenceField1 a {@link java.lang.String} object.
	 */
	public void setReferenceField1(String referenceField1) {
		this.referenceField1 = referenceField1;
	}

	/**
	 * <p>Getter for the field <code>referenceField2</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReferenceField2() {
		return this.referenceField2;
	}
	/**
	 * <p>Setter for the field <code>referenceField2</code>.</p>
	 *
	 * @param referenceField2 a {@link java.lang.String} object.
	 */
	public void setReferenceField2(String referenceField2) {
		this.referenceField2 = referenceField2;
	}

	/**
	 * <p>Getter for the field <code>referenceField3</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReferenceField3() {
		return this.referenceField3;
	}
	/**
	 * <p>Setter for the field <code>referenceField3</code>.</p>
	 *
	 * @param referenceField3 a {@link java.lang.String} object.
	 */
	public void setReferenceField3(String referenceField3) {
		this.referenceField3 = referenceField3;
	}

	/**
	 * <p>Getter for the field <code>relatedMessageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRelatedMessageId() {
		return this.relatedMessageId;
	}
	/**
	 * <p>Setter for the field <code>relatedMessageId</code>.</p>
	 *
	 * @param relatedMessageId a {@link java.lang.String} object.
	 */
	public void setRelatedMessageId(String relatedMessageId) {
		this.relatedMessageId = relatedMessageId;
	}

	/**
	 * <p>Getter for the field <code>requestMessageId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestMessageId() {
		return this.requestMessageId;
	}
	/**
	 * <p>Setter for the field <code>requestMessageId</code>.</p>
	 *
	 * @param requestMessageId a {@link java.lang.String} object.
	 */
	public void setRequestMessageId(String requestMessageId) {
		this.requestMessageId = requestMessageId;
	}

	/**
	 * <p>Getter for the field <code>requestedRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestedRate() {
		return this.requestedRate;
	}
	/**
	 * <p>Setter for the field <code>requestedRate</code>.</p>
	 *
	 * @param requestedRate a {@link java.lang.String} object.
	 */
	public void setRequestedRate(String requestedRate) {
		this.requestedRate = requestedRate;
	}

	/**
	 * <p>Getter for the field <code>settlementAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSettlementAmount() {
		return this.settlementAmount;
	}
	/**
	 * <p>Setter for the field <code>settlementAmount</code>.</p>
	 *
	 * @param settlementAmount a {@link java.lang.String} object.
	 */
	public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	/**
	 * <p>Getter for the field <code>settlementCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSettlementCcy() {
		return this.settlementCcy;
	}
	/**
	 * <p>Setter for the field <code>settlementCcy</code>.</p>
	 *
	 * @param settlementCcy a {@link java.lang.String} object.
	 */
	public void setSettlementCcy(String settlementCcy) {
		this.settlementCcy = settlementCcy;
	}

	/**
	 * <p>Getter for the field <code>side</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSide() {
		return this.side;
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
	 * <p>Getter for the field <code>slipPoint</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSlipPoint() {
		return this.slipPoint;
	}
	/**
	 * <p>Setter for the field <code>slipPoint</code>.</p>
	 *
	 * @param slipPoint a {@link java.lang.String} object.
	 */
	public void setSlipPoint(String slipPoint) {
		this.slipPoint = slipPoint;
	}

	/**
	 * <p>Getter for the field <code>timeZone</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimeZone() {
		return this.timeZone;
	}
	/**
	 * <p>Setter for the field <code>timeZone</code>.</p>
	 *
	 * @param timeZone a {@link java.lang.String} object.
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * <p>Getter for the field <code>tntInstId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTntInstId() {
		return this.tntInstId;
	}
	/**
	 * <p>Setter for the field <code>tntInstId</code>.</p>
	 *
	 * @param tntInstId a {@link java.lang.String} object.
	 */
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	/**
	 * <p>Getter for the field <code>tradeTimestamp</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getTradeTimestamp() {
		return this.tradeTimestamp;
	}
	/**
	 * <p>Setter for the field <code>tradeTimestamp</code>.</p>
	 *
	 * @param tradeTimestamp a {@link java.util.Date} object.
	 */
	public void setTradeTimestamp(Date tradeTimestamp) {
		this.tradeTimestamp = tradeTimestamp;
	}

	/**
	 * <p>Getter for the field <code>tradeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeType() {
		return this.tradeType;
	}
	/**
	 * <p>Setter for the field <code>tradeType</code>.</p>
	 *
	 * @param tradeType a {@link java.lang.String} object.
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	/**
	 * <p>Getter for the field <code>transactionAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionAmount() {
		return this.transactionAmount;
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
	 * <p>Getter for the field <code>transactionCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionCcy() {
		return this.transactionCcy;
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
	 * <p>Getter for the field <code>transactionCcyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionCcyType() {
		return this.transactionCcyType;
	}
	/**
	 * <p>Setter for the field <code>transactionCcyType</code>.</p>
	 *
	 * @param transactionCcyType a {@link java.lang.String} object.
	 */
	public void setTransactionCcyType(String transactionCcyType) {
		this.transactionCcyType = transactionCcyType;
	}

	/**
	 * <p>Getter for the field <code>transactionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionType() {
		return this.transactionType;
	}
	/**
	 * <p>Setter for the field <code>transactionType</code>.</p>
	 *
	 * @param transactionType a {@link java.lang.String} object.
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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

	/**
	 * <p>Getter for the field <code>valueDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValueDate() {
		return this.valueDate;
	}
	/**
	 * <p>Setter for the field <code>valueDate</code>.</p>
	 *
	 * @param valueDate a {@link java.lang.String} object.
	 */
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

}
