package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商品券模板（数据）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataItemVoucherTemplete extends AlipayObject {

	private static final long serialVersionUID = 8757134397645248631L;

	/**
	 * 延迟生效时间（手动领取条件下，可跟valid_period组合使用）
	 */
	@ApiField("delay_minute")
	private Long delayMinute;

	/**
	 * 券使用规则描述，包括描述标题及描述内容列表
	 */
	@ApiListField("desc_details")
	@ApiField("alipay_data_item_description")
	private List<AlipayDataItemDescription> descDetails;

	/**
	 * 折扣率，填写0~1间的小数且不包括0和1，如八折则传入0.8
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/**
	 * 外部单品列表
	 */
	@ApiField("external_goods_list")
	private AlipayDataItemGoodsList externalGoodsList;

	/**
	 * 使用时间规则，控制商品的生效时间
	 */
	@ApiField("limit_period_info_list")
	private AlipayDataItemLimitPeriodInfo limitPeriodInfoList;

	/**
	 * 商品原金额，只有单品代金券有，丽人行业需要填写此字段
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 券原折扣
	 */
	@ApiField("original_rate")
	private String originalRate;

	/**
	 * 单品代金券中的减至金额
	 */
	@ApiField("reduce_to_amount")
	private String reduceToAmount;

	/**
	 * 折扣金额取整规则 AUTO_ROUNDING_YUAN：自动抹零到元 AUTO_ROUNDING_JIAO：自动抹零到角 ROUNDING_UP_YUAN：四舍五入到元 ROUNDING_UP_JIAO：四舍五入到角
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_quantity")
	private String thresholdQuantity;

	/**
	 * 领券之后多长时间内可以核销，单位：分钟，传入数值需大于1440（一天）
	 */
	@ApiField("valid_period")
	private Long validPeriod;

	/**
	 * 价值金额
CASH类型为代金券金额
DISCOUNT类型为优惠封顶金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券的描述信息，目前客户端将统一展示“折扣须知”
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型：单品代金券为CASH类型，全场折扣券为DISCOUNT类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * <p>Getter for the field <code>delayMinute</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDelayMinute() {
		return this.delayMinute;
	}
	/**
	 * <p>Setter for the field <code>delayMinute</code>.</p>
	 *
	 * @param delayMinute a {@link java.lang.Long} object.
	 */
	public void setDelayMinute(Long delayMinute) {
		this.delayMinute = delayMinute;
	}

	/**
	 * <p>Getter for the field <code>descDetails</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayDataItemDescription> getDescDetails() {
		return this.descDetails;
	}
	/**
	 * <p>Setter for the field <code>descDetails</code>.</p>
	 *
	 * @param descDetails a {@link java.util.List} object.
	 */
	public void setDescDetails(List<AlipayDataItemDescription> descDetails) {
		this.descDetails = descDetails;
	}

	/**
	 * <p>Getter for the field <code>discountRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDiscountRate() {
		return this.discountRate;
	}
	/**
	 * <p>Setter for the field <code>discountRate</code>.</p>
	 *
	 * @param discountRate a {@link java.lang.String} object.
	 */
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * <p>Getter for the field <code>externalGoodsList</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemGoodsList} object.
	 */
	public AlipayDataItemGoodsList getExternalGoodsList() {
		return this.externalGoodsList;
	}
	/**
	 * <p>Setter for the field <code>externalGoodsList</code>.</p>
	 *
	 * @param externalGoodsList a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemGoodsList} object.
	 */
	public void setExternalGoodsList(AlipayDataItemGoodsList externalGoodsList) {
		this.externalGoodsList = externalGoodsList;
	}

	/**
	 * <p>Getter for the field <code>limitPeriodInfoList</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemLimitPeriodInfo} object.
	 */
	public AlipayDataItemLimitPeriodInfo getLimitPeriodInfoList() {
		return this.limitPeriodInfoList;
	}
	/**
	 * <p>Setter for the field <code>limitPeriodInfoList</code>.</p>
	 *
	 * @param limitPeriodInfoList a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayDataItemLimitPeriodInfo} object.
	 */
	public void setLimitPeriodInfoList(AlipayDataItemLimitPeriodInfo limitPeriodInfoList) {
		this.limitPeriodInfoList = limitPeriodInfoList;
	}

	/**
	 * <p>Getter for the field <code>originalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalAmount() {
		return this.originalAmount;
	}
	/**
	 * <p>Setter for the field <code>originalAmount</code>.</p>
	 *
	 * @param originalAmount a {@link java.lang.String} object.
	 */
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	/**
	 * <p>Getter for the field <code>originalRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalRate() {
		return this.originalRate;
	}
	/**
	 * <p>Setter for the field <code>originalRate</code>.</p>
	 *
	 * @param originalRate a {@link java.lang.String} object.
	 */
	public void setOriginalRate(String originalRate) {
		this.originalRate = originalRate;
	}

	/**
	 * <p>Getter for the field <code>reduceToAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReduceToAmount() {
		return this.reduceToAmount;
	}
	/**
	 * <p>Setter for the field <code>reduceToAmount</code>.</p>
	 *
	 * @param reduceToAmount a {@link java.lang.String} object.
	 */
	public void setReduceToAmount(String reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}

	/**
	 * <p>Getter for the field <code>roundingRule</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoundingRule() {
		return this.roundingRule;
	}
	/**
	 * <p>Setter for the field <code>roundingRule</code>.</p>
	 *
	 * @param roundingRule a {@link java.lang.String} object.
	 */
	public void setRoundingRule(String roundingRule) {
		this.roundingRule = roundingRule;
	}

	/**
	 * <p>Getter for the field <code>thresholdAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	/**
	 * <p>Setter for the field <code>thresholdAmount</code>.</p>
	 *
	 * @param thresholdAmount a {@link java.lang.String} object.
	 */
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	/**
	 * <p>Getter for the field <code>thresholdQuantity</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThresholdQuantity() {
		return this.thresholdQuantity;
	}
	/**
	 * <p>Setter for the field <code>thresholdQuantity</code>.</p>
	 *
	 * @param thresholdQuantity a {@link java.lang.String} object.
	 */
	public void setThresholdQuantity(String thresholdQuantity) {
		this.thresholdQuantity = thresholdQuantity;
	}

	/**
	 * <p>Getter for the field <code>validPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getValidPeriod() {
		return this.validPeriod;
	}
	/**
	 * <p>Setter for the field <code>validPeriod</code>.</p>
	 *
	 * @param validPeriod a {@link java.lang.Long} object.
	 */
	public void setValidPeriod(Long validPeriod) {
		this.validPeriod = validPeriod;
	}

	/**
	 * <p>Getter for the field <code>valueAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValueAmount() {
		return this.valueAmount;
	}
	/**
	 * <p>Setter for the field <code>valueAmount</code>.</p>
	 *
	 * @param valueAmount a {@link java.lang.String} object.
	 */
	public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}

	/**
	 * <p>Getter for the field <code>voucherDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	/**
	 * <p>Setter for the field <code>voucherDesc</code>.</p>
	 *
	 * @param voucherDesc a {@link java.lang.String} object.
	 */
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	/**
	 * <p>Getter for the field <code>voucherType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherType() {
		return this.voucherType;
	}
	/**
	 * <p>Setter for the field <code>voucherType</code>.</p>
	 *
	 * @param voucherType a {@link java.lang.String} object.
	 */
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
