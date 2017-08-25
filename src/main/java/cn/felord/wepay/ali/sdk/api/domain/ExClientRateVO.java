package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 客户汇率
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExClientRateVO extends AlipayObject {

	private static final long serialVersionUID = 7427416952116191877L;

	/**
	 * 协议编号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 基准货币。汇率货币单位默认为1，即1货币单位的基础货币，对应非基准货币的价格
	 */
	@ApiField("base_ccy")
	private String baseCcy;

	/**
	 * 买入价格 为交易对手添加了点差后，基准货币的买入价格，直接面向终端客户
	 */
	@ApiField("bid_rate")
	private String bidRate;

	/**
	 * 终端客户买入价格 面向交易对手的基准货币买入价格，不包含终端客户点差
	 */
	@ApiField("client_bid_rate")
	private String clientBidRate;

	/**
	 * 客户id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 终端客户卖出价格 面向交易对手的基准货币卖出价格，不包含终端客户点差
	 */
	@ApiField("client_offer_rate")
	private String clientOfferRate;

	/**
	 * 基准货币/非基准货币
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/**
	 * 汇率的失效时间
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 汇率生成日期,yyyymmdd
	 */
	@ApiField("generate_date")
	private String generateDate;

	/**
	 * 汇率生成时间 与rateTime一致
	 */
	@ApiField("generate_time")
	private Date generateTime;

	/**
	 * 字典：T - 可交易，F - 仅作为参考，不可交易
	 */
	@ApiField("guaranteed")
	private String guaranteed;

	/**
	 * 远期或者掉期点价格到期日, yyyymmdd
	 */
	@ApiField("maturity_date")
	private String maturityDate;

	/**
	 * 基准货币买入的最大金额，对于单笔、累计交易
	 */
	@ApiField("maximum_bid_amount")
	private Long maximumBidAmount;

	/**
	 * 基准货币卖出的最大金额，对于单笔、累计交易
	 */
	@ApiField("maximum_offer_amount")
	private Long maximumOfferAmount;

	/**
	 * 汇率中间价
	 */
	@ApiField("mid_rate")
	private String midRate;

	/**
	 * 基准货币买入的最小金额，对于单笔交易
	 */
	@ApiField("minimum_bid_amount")
	private String minimumBidAmount;

	/**
	 * 基准货币卖出的最小金额，对于单笔交易
	 */
	@ApiField("minimum_offer_amount")
	private String minimumOfferAmount;

	/**
	 * 卖出价格 添加了交易对手点差后，基准货币的卖出价格，直接面向终端客户
	 */
	@ApiField("offer_rate")
	private String offerRate;

	/**
	 * 在岸离岸标识 ON - 在岸，OFF - 离岸
	 */
	@ApiField("on_off_shore")
	private String onOffShore;

	/**
	 * 该汇率的来源机构
	 */
	@ApiField("origin_rate_inst")
	private String originRateInst;

	/**
	 * 原始汇率来源机构，对该汇率的唯一标识
	 */
	@ApiField("origin_rate_ref")
	private String originRateRef;

	/**
	 * 汇率期限 字典：TODAY, TOMORROW, SPOT, O/N, T/N等标准期限
	 */
	@ApiField("period")
	private String period;

	/**
	 * 子协议扩展号 对不同商户/渠道的报价协议
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 非基准货币
	 */
	@ApiField("quote_ccy")
	private String quoteCcy;

	/**
	 * 标识单一货币对，每次汇率生成时变化，不重复
	 */
	@ApiField("rate_ref")
	private String rateRef;

	/**
	 * 汇率发布时间
	 */
	@ApiField("rate_time")
	private String rateTime;

	/**
	 * 字典: SPOT - 即期，FORWORD - 远期，SWAP - 掉期点
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 汇率类型为远期下，即期的买入价
	 */
	@ApiField("sp_bid")
	private String spBid;

	/**
	 * 汇率类型为远期下，即期的中间价
	 */
	@ApiField("sp_mid")
	private String spMid;

	/**
	 * 汇率类型为远期下，即期的卖出价
	 */
	@ApiField("sp_offer")
	private String spOffer;

	/**
	 * 报价中心内部标准产品编码
	 */
	@ApiField("standard_product_rate_id")
	private String standardProductRateId;

	/**
	 * 汇率的有效时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 子协议id
	 */
	@ApiField("sub_agreement_id")
	private String subAgreementId;

	/**
	 * 锁定汇率模式下，在新旧汇率交替时，仍可以使用旧汇率下单的最外时间
	 */
	@ApiField("threshold_time")
	private String thresholdTime;

	/**
	 * 时间所在的时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 交易货币类型 字典: DELIV - 原币交割，NDF - 非原币交割
	 */
	@ApiField("transaction_ccy_type")
	private String transactionCcyType;

	/**
	 * 保价过期时间
	 */
	@ApiField("valid_time")
	private String validTime;

	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId() {
		return this.agreementId;
	}
	/**
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	/**
	 * <p>Getter for the field <code>baseCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBaseCcy() {
		return this.baseCcy;
	}
	/**
	 * <p>Setter for the field <code>baseCcy</code>.</p>
	 *
	 * @param baseCcy a {@link java.lang.String} object.
	 */
	public void setBaseCcy(String baseCcy) {
		this.baseCcy = baseCcy;
	}

	/**
	 * <p>Getter for the field <code>bidRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBidRate() {
		return this.bidRate;
	}
	/**
	 * <p>Setter for the field <code>bidRate</code>.</p>
	 *
	 * @param bidRate a {@link java.lang.String} object.
	 */
	public void setBidRate(String bidRate) {
		this.bidRate = bidRate;
	}

	/**
	 * <p>Getter for the field <code>clientBidRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientBidRate() {
		return this.clientBidRate;
	}
	/**
	 * <p>Setter for the field <code>clientBidRate</code>.</p>
	 *
	 * @param clientBidRate a {@link java.lang.String} object.
	 */
	public void setClientBidRate(String clientBidRate) {
		this.clientBidRate = clientBidRate;
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
	 * <p>Getter for the field <code>clientOfferRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientOfferRate() {
		return this.clientOfferRate;
	}
	/**
	 * <p>Setter for the field <code>clientOfferRate</code>.</p>
	 *
	 * @param clientOfferRate a {@link java.lang.String} object.
	 */
	public void setClientOfferRate(String clientOfferRate) {
		this.clientOfferRate = clientOfferRate;
	}

	/**
	 * <p>Getter for the field <code>currencyPair</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrencyPair() {
		return this.currencyPair;
	}
	/**
	 * <p>Setter for the field <code>currencyPair</code>.</p>
	 *
	 * @param currencyPair a {@link java.lang.String} object.
	 */
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	/**
	 * <p>Getter for the field <code>expiryTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpiryTime() {
		return this.expiryTime;
	}
	/**
	 * <p>Setter for the field <code>expiryTime</code>.</p>
	 *
	 * @param expiryTime a {@link java.lang.String} object.
	 */
	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	/**
	 * <p>Getter for the field <code>generateDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGenerateDate() {
		return this.generateDate;
	}
	/**
	 * <p>Setter for the field <code>generateDate</code>.</p>
	 *
	 * @param generateDate a {@link java.lang.String} object.
	 */
	public void setGenerateDate(String generateDate) {
		this.generateDate = generateDate;
	}

	/**
	 * <p>Getter for the field <code>generateTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGenerateTime() {
		return this.generateTime;
	}
	/**
	 * <p>Setter for the field <code>generateTime</code>.</p>
	 *
	 * @param generateTime a {@link java.util.Date} object.
	 */
	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}

	/**
	 * <p>Getter for the field <code>guaranteed</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGuaranteed() {
		return this.guaranteed;
	}
	/**
	 * <p>Setter for the field <code>guaranteed</code>.</p>
	 *
	 * @param guaranteed a {@link java.lang.String} object.
	 */
	public void setGuaranteed(String guaranteed) {
		this.guaranteed = guaranteed;
	}

	/**
	 * <p>Getter for the field <code>maturityDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMaturityDate() {
		return this.maturityDate;
	}
	/**
	 * <p>Setter for the field <code>maturityDate</code>.</p>
	 *
	 * @param maturityDate a {@link java.lang.String} object.
	 */
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	/**
	 * <p>Getter for the field <code>maximumBidAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMaximumBidAmount() {
		return this.maximumBidAmount;
	}
	/**
	 * <p>Setter for the field <code>maximumBidAmount</code>.</p>
	 *
	 * @param maximumBidAmount a {@link java.lang.Long} object.
	 */
	public void setMaximumBidAmount(Long maximumBidAmount) {
		this.maximumBidAmount = maximumBidAmount;
	}

	/**
	 * <p>Getter for the field <code>maximumOfferAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMaximumOfferAmount() {
		return this.maximumOfferAmount;
	}
	/**
	 * <p>Setter for the field <code>maximumOfferAmount</code>.</p>
	 *
	 * @param maximumOfferAmount a {@link java.lang.Long} object.
	 */
	public void setMaximumOfferAmount(Long maximumOfferAmount) {
		this.maximumOfferAmount = maximumOfferAmount;
	}

	/**
	 * <p>Getter for the field <code>midRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMidRate() {
		return this.midRate;
	}
	/**
	 * <p>Setter for the field <code>midRate</code>.</p>
	 *
	 * @param midRate a {@link java.lang.String} object.
	 */
	public void setMidRate(String midRate) {
		this.midRate = midRate;
	}

	/**
	 * <p>Getter for the field <code>minimumBidAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinimumBidAmount() {
		return this.minimumBidAmount;
	}
	/**
	 * <p>Setter for the field <code>minimumBidAmount</code>.</p>
	 *
	 * @param minimumBidAmount a {@link java.lang.String} object.
	 */
	public void setMinimumBidAmount(String minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}

	/**
	 * <p>Getter for the field <code>minimumOfferAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinimumOfferAmount() {
		return this.minimumOfferAmount;
	}
	/**
	 * <p>Setter for the field <code>minimumOfferAmount</code>.</p>
	 *
	 * @param minimumOfferAmount a {@link java.lang.String} object.
	 */
	public void setMinimumOfferAmount(String minimumOfferAmount) {
		this.minimumOfferAmount = minimumOfferAmount;
	}

	/**
	 * <p>Getter for the field <code>offerRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOfferRate() {
		return this.offerRate;
	}
	/**
	 * <p>Setter for the field <code>offerRate</code>.</p>
	 *
	 * @param offerRate a {@link java.lang.String} object.
	 */
	public void setOfferRate(String offerRate) {
		this.offerRate = offerRate;
	}

	/**
	 * <p>Getter for the field <code>onOffShore</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOnOffShore() {
		return this.onOffShore;
	}
	/**
	 * <p>Setter for the field <code>onOffShore</code>.</p>
	 *
	 * @param onOffShore a {@link java.lang.String} object.
	 */
	public void setOnOffShore(String onOffShore) {
		this.onOffShore = onOffShore;
	}

	/**
	 * <p>Getter for the field <code>originRateInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginRateInst() {
		return this.originRateInst;
	}
	/**
	 * <p>Setter for the field <code>originRateInst</code>.</p>
	 *
	 * @param originRateInst a {@link java.lang.String} object.
	 */
	public void setOriginRateInst(String originRateInst) {
		this.originRateInst = originRateInst;
	}

	/**
	 * <p>Getter for the field <code>originRateRef</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginRateRef() {
		return this.originRateRef;
	}
	/**
	 * <p>Setter for the field <code>originRateRef</code>.</p>
	 *
	 * @param originRateRef a {@link java.lang.String} object.
	 */
	public void setOriginRateRef(String originRateRef) {
		this.originRateRef = originRateRef;
	}

	/**
	 * <p>Getter for the field <code>period</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPeriod() {
		return this.period;
	}
	/**
	 * <p>Setter for the field <code>period</code>.</p>
	 *
	 * @param period a {@link java.lang.String} object.
	 */
	public void setPeriod(String period) {
		this.period = period;
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
	 * <p>Getter for the field <code>quoteCcy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQuoteCcy() {
		return this.quoteCcy;
	}
	/**
	 * <p>Setter for the field <code>quoteCcy</code>.</p>
	 *
	 * @param quoteCcy a {@link java.lang.String} object.
	 */
	public void setQuoteCcy(String quoteCcy) {
		this.quoteCcy = quoteCcy;
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
	 * <p>Getter for the field <code>rateTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRateTime() {
		return this.rateTime;
	}
	/**
	 * <p>Setter for the field <code>rateTime</code>.</p>
	 *
	 * @param rateTime a {@link java.lang.String} object.
	 */
	public void setRateTime(String rateTime) {
		this.rateTime = rateTime;
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
	 * <p>Getter for the field <code>spBid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpBid() {
		return this.spBid;
	}
	/**
	 * <p>Setter for the field <code>spBid</code>.</p>
	 *
	 * @param spBid a {@link java.lang.String} object.
	 */
	public void setSpBid(String spBid) {
		this.spBid = spBid;
	}

	/**
	 * <p>Getter for the field <code>spMid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpMid() {
		return this.spMid;
	}
	/**
	 * <p>Setter for the field <code>spMid</code>.</p>
	 *
	 * @param spMid a {@link java.lang.String} object.
	 */
	public void setSpMid(String spMid) {
		this.spMid = spMid;
	}

	/**
	 * <p>Getter for the field <code>spOffer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpOffer() {
		return this.spOffer;
	}
	/**
	 * <p>Setter for the field <code>spOffer</code>.</p>
	 *
	 * @param spOffer a {@link java.lang.String} object.
	 */
	public void setSpOffer(String spOffer) {
		this.spOffer = spOffer;
	}

	/**
	 * <p>Getter for the field <code>standardProductRateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStandardProductRateId() {
		return this.standardProductRateId;
	}
	/**
	 * <p>Setter for the field <code>standardProductRateId</code>.</p>
	 *
	 * @param standardProductRateId a {@link java.lang.String} object.
	 */
	public void setStandardProductRateId(String standardProductRateId) {
		this.standardProductRateId = standardProductRateId;
	}

	/**
	 * <p>Getter for the field <code>startTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartTime() {
		return this.startTime;
	}
	/**
	 * <p>Setter for the field <code>startTime</code>.</p>
	 *
	 * @param startTime a {@link java.lang.String} object.
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * <p>Getter for the field <code>subAgreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubAgreementId() {
		return this.subAgreementId;
	}
	/**
	 * <p>Setter for the field <code>subAgreementId</code>.</p>
	 *
	 * @param subAgreementId a {@link java.lang.String} object.
	 */
	public void setSubAgreementId(String subAgreementId) {
		this.subAgreementId = subAgreementId;
	}

	/**
	 * <p>Getter for the field <code>thresholdTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThresholdTime() {
		return this.thresholdTime;
	}
	/**
	 * <p>Setter for the field <code>thresholdTime</code>.</p>
	 *
	 * @param thresholdTime a {@link java.lang.String} object.
	 */
	public void setThresholdTime(String thresholdTime) {
		this.thresholdTime = thresholdTime;
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
	 * <p>Getter for the field <code>validTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValidTime() {
		return this.validTime;
	}
	/**
	 * <p>Setter for the field <code>validTime</code>.</p>
	 *
	 * @param validTime a {@link java.lang.String} object.
	 */
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

}
