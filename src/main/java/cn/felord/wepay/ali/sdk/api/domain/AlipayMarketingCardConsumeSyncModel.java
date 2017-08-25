package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 会员卡消费记录同步
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardConsumeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1162625434552699925L;

	/**
	 * 用户实际付的现金金额
1.针对预付卡面额的核销金额在use_benefit_list展现，作为权益金额
2.权益金额不叠加在该金额上
	 */
	@ApiField("act_pay_amount")
	private String actPayAmount;

	/**
	 * 卡信息（交易后的实际卡信息）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/**
	 * 获取权益列表
	 */
	@ApiListField("gain_benefit_list")
	@ApiField("benefit_info_detail")
	private List<BenefitInfoDetail> gainBenefitList;

	/**
	 * 备注信息，现有直接填写门店信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门店编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 产生该笔交易时，用户出具的凭证类型
ALIPAY：支付宝电子卡
ENTITY：实体卡
OTHER：其他
	 */
	@ApiField("swipe_cert_type")
	private String swipeCertType;

	/**
	 * 支付宝业务卡号，开卡接口中返回获取
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号类型
BIZ_CARD：支付宝业务卡号
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	/**
	 * 交易金额：本次交易的实际总金额（可认为标价金额）
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易名称
为空时根据交易类型提供默认名称
	 */
	@ApiField("trade_name")
	private String tradeName;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 线下交易时间（是用户付款的交易时间）
当交易时间晚于上次消费记录同步时间，则会发生卡信息变更
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	/**
	 * 交易类型
开卡：OPEN
消费：TRADE
充值：DEPOSIT
退卡：RETURN
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 实际消耗的权益
	 */
	@ApiListField("use_benefit_list")
	@ApiField("benefit_info_detail")
	private List<BenefitInfoDetail> useBenefitList;

	/**
	 * <p>Getter for the field <code>actPayAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActPayAmount() {
		return this.actPayAmount;
	}
	/**
	 * <p>Setter for the field <code>actPayAmount</code>.</p>
	 *
	 * @param actPayAmount a {@link java.lang.String} object.
	 */
	public void setActPayAmount(String actPayAmount) {
		this.actPayAmount = actPayAmount;
	}

	/**
	 * <p>Getter for the field <code>cardInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public MerchantCard getCardInfo() {
		return this.cardInfo;
	}
	/**
	 * <p>Setter for the field <code>cardInfo</code>.</p>
	 *
	 * @param cardInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}

	/**
	 * <p>Getter for the field <code>gainBenefitList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BenefitInfoDetail> getGainBenefitList() {
		return this.gainBenefitList;
	}
	/**
	 * <p>Setter for the field <code>gainBenefitList</code>.</p>
	 *
	 * @param gainBenefitList a {@link java.util.List} object.
	 */
	public void setGainBenefitList(List<BenefitInfoDetail> gainBenefitList) {
		this.gainBenefitList = gainBenefitList;
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
	 * <p>Getter for the field <code>shopCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopCode() {
		return this.shopCode;
	}
	/**
	 * <p>Setter for the field <code>shopCode</code>.</p>
	 *
	 * @param shopCode a {@link java.lang.String} object.
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	/**
	 * <p>Getter for the field <code>swipeCertType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSwipeCertType() {
		return this.swipeCertType;
	}
	/**
	 * <p>Setter for the field <code>swipeCertType</code>.</p>
	 *
	 * @param swipeCertType a {@link java.lang.String} object.
	 */
	public void setSwipeCertType(String swipeCertType) {
		this.swipeCertType = swipeCertType;
	}

	/**
	 * <p>Getter for the field <code>targetCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	/**
	 * <p>Setter for the field <code>targetCardNo</code>.</p>
	 *
	 * @param targetCardNo a {@link java.lang.String} object.
	 */
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	/**
	 * <p>Getter for the field <code>targetCardNoType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	/**
	 * <p>Setter for the field <code>targetCardNoType</code>.</p>
	 *
	 * @param targetCardNoType a {@link java.lang.String} object.
	 */
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

	/**
	 * <p>Getter for the field <code>tradeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeAmount() {
		return this.tradeAmount;
	}
	/**
	 * <p>Setter for the field <code>tradeAmount</code>.</p>
	 *
	 * @param tradeAmount a {@link java.lang.String} object.
	 */
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	/**
	 * <p>Getter for the field <code>tradeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeName() {
		return this.tradeName;
	}
	/**
	 * <p>Setter for the field <code>tradeName</code>.</p>
	 *
	 * @param tradeName a {@link java.lang.String} object.
	 */
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
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

	/**
	 * <p>Getter for the field <code>tradeTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getTradeTime() {
		return this.tradeTime;
	}
	/**
	 * <p>Setter for the field <code>tradeTime</code>.</p>
	 *
	 * @param tradeTime a {@link java.util.Date} object.
	 */
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
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
	 * <p>Getter for the field <code>useBenefitList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BenefitInfoDetail> getUseBenefitList() {
		return this.useBenefitList;
	}
	/**
	 * <p>Setter for the field <code>useBenefitList</code>.</p>
	 *
	 * @param useBenefitList a {@link java.util.List} object.
	 */
	public void setUseBenefitList(List<BenefitInfoDetail> useBenefitList) {
		this.useBenefitList = useBenefitList;
	}

}
