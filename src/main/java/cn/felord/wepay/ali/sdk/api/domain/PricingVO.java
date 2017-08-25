package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 源汇率
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PricingVO extends AlipayObject {

	private static final long serialVersionUID = 8671215981275979588L;

	/**
	 * 买入价
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 基准币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 基本币种单位
	 */
	@ApiField("currency_unit")
	private Long currencyUnit;

	/**
	 * 汇率失效时间yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expiry_timestamp")
	private String expiryTimestamp;

	/**
	 * 汇率生成时间 用来做幂等 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("generate_timestamp")
	private String generateTimestamp;

	/**
	 * 远期或者掉期到期时间 yyyyMMdd
	 */
	@ApiField("maturity_date")
	private String maturityDate;

	/**
	 * 该价格的最大买入量
	 */
	@ApiField("maximum_bid_amount")
	private Long maximumBidAmount;

	/**
	 * 该价格的最大卖出量
	 */
	@ApiField("maximum_offer_amount")
	private Long maximumOfferAmount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 中间价
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 该价格的最小买入量
	 */
	@ApiField("minimum_bid_amount")
	private Long minimumBidAmount;

	/**
	 * 该价格的最小卖出量
	 */
	@ApiField("minimum_offer_amount")
	private Long minimumOfferAmount;

	/**
	 * 卖出价
	 */
	@ApiField("offer")
	private String offer;

	/**
	 * 标准期限TODAY TOM SPOT 1D 1W 1M 1Y
	 */
	@ApiField("period")
	private String period;

	/**
	 * 源汇率参考id 唯一id
	 */
	@ApiField("rate_reference_id")
	private String rateReferenceId;

	/**
	 * 汇率类型 SPOT FORWARD
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 即期买入价
	 */
	@ApiField("spot_bid")
	private String spotBid;

	/**
	 * 即期中间价
	 */
	@ApiField("spot_mid")
	private String spotMid;

	/**
	 * 即期卖出价
	 */
	@ApiField("spot_offer")
	private String spotOffer;

	/**
	 * 汇率生效时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_timestamp")
	private String startTimestamp;

	/**
	 * 货币对
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 汇率缓冲时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("threshold_timestamp")
	private String thresholdTimestamp;

	/**
	 * 锁汇失效时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_timestamp")
	private String validTimestamp;

	/**
	 * <p>Getter for the field <code>bid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBid() {
		return this.bid;
	}
	/**
	 * <p>Setter for the field <code>bid</code>.</p>
	 *
	 * @param bid a {@link java.lang.String} object.
	 */
	public void setBid(String bid) {
		this.bid = bid;
	}

	/**
	 * <p>Getter for the field <code>currency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrency() {
		return this.currency;
	}
	/**
	 * <p>Setter for the field <code>currency</code>.</p>
	 *
	 * @param currency a {@link java.lang.String} object.
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * <p>Getter for the field <code>currencyUnit</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrencyUnit() {
		return this.currencyUnit;
	}
	/**
	 * <p>Setter for the field <code>currencyUnit</code>.</p>
	 *
	 * @param currencyUnit a {@link java.lang.Long} object.
	 */
	public void setCurrencyUnit(Long currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

	/**
	 * <p>Getter for the field <code>expiryTimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpiryTimestamp() {
		return this.expiryTimestamp;
	}
	/**
	 * <p>Setter for the field <code>expiryTimestamp</code>.</p>
	 *
	 * @param expiryTimestamp a {@link java.lang.String} object.
	 */
	public void setExpiryTimestamp(String expiryTimestamp) {
		this.expiryTimestamp = expiryTimestamp;
	}

	/**
	 * <p>Getter for the field <code>generateTimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGenerateTimestamp() {
		return this.generateTimestamp;
	}
	/**
	 * <p>Setter for the field <code>generateTimestamp</code>.</p>
	 *
	 * @param generateTimestamp a {@link java.lang.String} object.
	 */
	public void setGenerateTimestamp(String generateTimestamp) {
		this.generateTimestamp = generateTimestamp;
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
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>mid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMid() {
		return this.mid;
	}
	/**
	 * <p>Setter for the field <code>mid</code>.</p>
	 *
	 * @param mid a {@link java.lang.String} object.
	 */
	public void setMid(String mid) {
		this.mid = mid;
	}

	/**
	 * <p>Getter for the field <code>minimumBidAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMinimumBidAmount() {
		return this.minimumBidAmount;
	}
	/**
	 * <p>Setter for the field <code>minimumBidAmount</code>.</p>
	 *
	 * @param minimumBidAmount a {@link java.lang.Long} object.
	 */
	public void setMinimumBidAmount(Long minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}

	/**
	 * <p>Getter for the field <code>minimumOfferAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMinimumOfferAmount() {
		return this.minimumOfferAmount;
	}
	/**
	 * <p>Setter for the field <code>minimumOfferAmount</code>.</p>
	 *
	 * @param minimumOfferAmount a {@link java.lang.Long} object.
	 */
	public void setMinimumOfferAmount(Long minimumOfferAmount) {
		this.minimumOfferAmount = minimumOfferAmount;
	}

	/**
	 * <p>Getter for the field <code>offer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOffer() {
		return this.offer;
	}
	/**
	 * <p>Setter for the field <code>offer</code>.</p>
	 *
	 * @param offer a {@link java.lang.String} object.
	 */
	public void setOffer(String offer) {
		this.offer = offer;
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
	 * <p>Getter for the field <code>rateReferenceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRateReferenceId() {
		return this.rateReferenceId;
	}
	/**
	 * <p>Setter for the field <code>rateReferenceId</code>.</p>
	 *
	 * @param rateReferenceId a {@link java.lang.String} object.
	 */
	public void setRateReferenceId(String rateReferenceId) {
		this.rateReferenceId = rateReferenceId;
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
	 * <p>Getter for the field <code>spotBid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpotBid() {
		return this.spotBid;
	}
	/**
	 * <p>Setter for the field <code>spotBid</code>.</p>
	 *
	 * @param spotBid a {@link java.lang.String} object.
	 */
	public void setSpotBid(String spotBid) {
		this.spotBid = spotBid;
	}

	/**
	 * <p>Getter for the field <code>spotMid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpotMid() {
		return this.spotMid;
	}
	/**
	 * <p>Setter for the field <code>spotMid</code>.</p>
	 *
	 * @param spotMid a {@link java.lang.String} object.
	 */
	public void setSpotMid(String spotMid) {
		this.spotMid = spotMid;
	}

	/**
	 * <p>Getter for the field <code>spotOffer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpotOffer() {
		return this.spotOffer;
	}
	/**
	 * <p>Setter for the field <code>spotOffer</code>.</p>
	 *
	 * @param spotOffer a {@link java.lang.String} object.
	 */
	public void setSpotOffer(String spotOffer) {
		this.spotOffer = spotOffer;
	}

	/**
	 * <p>Getter for the field <code>startTimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStartTimestamp() {
		return this.startTimestamp;
	}
	/**
	 * <p>Setter for the field <code>startTimestamp</code>.</p>
	 *
	 * @param startTimestamp a {@link java.lang.String} object.
	 */
	public void setStartTimestamp(String startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	/**
	 * <p>Getter for the field <code>symbol</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSymbol() {
		return this.symbol;
	}
	/**
	 * <p>Setter for the field <code>symbol</code>.</p>
	 *
	 * @param symbol a {@link java.lang.String} object.
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * <p>Getter for the field <code>thresholdTimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThresholdTimestamp() {
		return this.thresholdTimestamp;
	}
	/**
	 * <p>Setter for the field <code>thresholdTimestamp</code>.</p>
	 *
	 * @param thresholdTimestamp a {@link java.lang.String} object.
	 */
	public void setThresholdTimestamp(String thresholdTimestamp) {
		this.thresholdTimestamp = thresholdTimestamp;
	}

	/**
	 * <p>Getter for the field <code>validTimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValidTimestamp() {
		return this.validTimestamp;
	}
	/**
	 * <p>Setter for the field <code>validTimestamp</code>.</p>
	 *
	 * @param validTimestamp a {@link java.lang.String} object.
	 */
	public void setValidTimestamp(String validTimestamp) {
		this.validTimestamp = validTimestamp;
	}

}
