package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商品券模板
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayItemVoucherTemplete extends AlipayObject {

	private static final long serialVersionUID = 8637775976989518963L;

	/**
	 * 延迟生效时间（手动领取条件下，可跟valid_period组合使用）
	 */
	@ApiField("delay_minute")
	private Long delayMinute;

	/**
	 * 券使用规则描述，包括描述标题及描述内容列表。子参数只支持title、details；其余参数暂不支持，请不要填写。
	 */
	@ApiListField("desc_details")
	@ApiField("alipay_item_description")
	private List<AlipayItemDescription> descDetails;

	/**
	 * 折扣率，填写0-1间的小数且不包括0和1，如八折则传入0.8。（折扣券类型必选字段，代金券不需要）
	 */
	@ApiField("discount_rate")
	private Long discountRate;

	/**
	 * 外部单品列表
	 */
	@ApiField("external_goods_list")
	private AlipayItemGoodsList externalGoodsList;

	/**
	 * 使用时间规则，控制商品的生效时间。
时间单位：MINUTE、HOUR、WEEK_DAY、DAY、WEEK、MONTH
限制规则：INCLUDE、INCLUDE_INTERVAL
例如：每周日、周二的 0点-23点59分
"limit_period_info_list":[{"rule":"INCLUDE","unit":"WEEK_DAY","value":"7,2"},{"rule":"INCLUDE_INTERVAL","unit":"MINUTE","value":"0,1439"}]
	 */
	@ApiListField("limit_period_info_list")
	@ApiField("alipay_item_limit_period_info")
	private List<AlipayItemLimitPeriodInfo> limitPeriodInfoList;

	/**
	 * 商品原金额，单位（元），（代金券类型可选字段，折扣券不需要）
	 */
	@ApiField("original_amount")
	private Long originalAmount;

	/**
	 * 券原折扣,0-1之间，做展示使用（折扣券类型可选字段，代金券不需要）
	 */
	@ApiField("original_rate")
	private Long originalRate;

	/**
	 * 减至金额，单位（元），代表券可抵扣至多少（代金券类型可选字段，折扣券不需要）
	 */
	@ApiField("reduce_to_amount")
	private Long reduceToAmount;

	/**
	 * 折扣金额取整规则
AUTO_ROUNDING_YUAN：自动抹零到元
AUTO_ROUNDING_JIAO：自动抹零到角
ROUNDING_UP_YUAN：四舍五入到元
ROUNDING_UP_JIAO：四舍五入到角
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 起步金额，单位（元）
	 */
	@ApiField("threshold_amount")
	private Long thresholdAmount;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_quantity")
	private Long thresholdQuantity;

	/**
	 * 领券之后多长时间内可以核销，单位：分钟，传入数值需大于1440（一天）
	 */
	@ApiField("valid_period")
	private Long validPeriod;

	/**
	 * 价值金额，单位（元）
CASH类型为代金券金额
DISCOUNT类型为优惠封顶金额
在代金券类型时，value_amout与reduce_to_amount不能同时为空，不能同时不为空。
	 */
	@ApiField("value_amount")
	private Long valueAmount;

	/**
	 * 券的描述信息，目前客户端将统一展示“折扣须知”
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型，DISCOUNT（折扣券）、CASH（代金券）
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
	public List<AlipayItemDescription> getDescDetails() {
		return this.descDetails;
	}
	/**
	 * <p>Setter for the field <code>descDetails</code>.</p>
	 *
	 * @param descDetails a {@link java.util.List} object.
	 */
	public void setDescDetails(List<AlipayItemDescription> descDetails) {
		this.descDetails = descDetails;
	}

	/**
	 * <p>Getter for the field <code>discountRate</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDiscountRate() {
		return this.discountRate;
	}
	/**
	 * <p>Setter for the field <code>discountRate</code>.</p>
	 *
	 * @param discountRate a {@link java.lang.Long} object.
	 */
	public void setDiscountRate(Long discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * <p>Getter for the field <code>externalGoodsList</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemGoodsList} object.
	 */
	public AlipayItemGoodsList getExternalGoodsList() {
		return this.externalGoodsList;
	}
	/**
	 * <p>Setter for the field <code>externalGoodsList</code>.</p>
	 *
	 * @param externalGoodsList a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemGoodsList} object.
	 */
	public void setExternalGoodsList(AlipayItemGoodsList externalGoodsList) {
		this.externalGoodsList = externalGoodsList;
	}

	/**
	 * <p>Getter for the field <code>limitPeriodInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayItemLimitPeriodInfo> getLimitPeriodInfoList() {
		return this.limitPeriodInfoList;
	}
	/**
	 * <p>Setter for the field <code>limitPeriodInfoList</code>.</p>
	 *
	 * @param limitPeriodInfoList a {@link java.util.List} object.
	 */
	public void setLimitPeriodInfoList(List<AlipayItemLimitPeriodInfo> limitPeriodInfoList) {
		this.limitPeriodInfoList = limitPeriodInfoList;
	}

	/**
	 * <p>Getter for the field <code>originalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOriginalAmount() {
		return this.originalAmount;
	}
	/**
	 * <p>Setter for the field <code>originalAmount</code>.</p>
	 *
	 * @param originalAmount a {@link java.lang.Long} object.
	 */
	public void setOriginalAmount(Long originalAmount) {
		this.originalAmount = originalAmount;
	}

	/**
	 * <p>Getter for the field <code>originalRate</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getOriginalRate() {
		return this.originalRate;
	}
	/**
	 * <p>Setter for the field <code>originalRate</code>.</p>
	 *
	 * @param originalRate a {@link java.lang.Long} object.
	 */
	public void setOriginalRate(Long originalRate) {
		this.originalRate = originalRate;
	}

	/**
	 * <p>Getter for the field <code>reduceToAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getReduceToAmount() {
		return this.reduceToAmount;
	}
	/**
	 * <p>Setter for the field <code>reduceToAmount</code>.</p>
	 *
	 * @param reduceToAmount a {@link java.lang.Long} object.
	 */
	public void setReduceToAmount(Long reduceToAmount) {
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
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getThresholdAmount() {
		return this.thresholdAmount;
	}
	/**
	 * <p>Setter for the field <code>thresholdAmount</code>.</p>
	 *
	 * @param thresholdAmount a {@link java.lang.Long} object.
	 */
	public void setThresholdAmount(Long thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	/**
	 * <p>Getter for the field <code>thresholdQuantity</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getThresholdQuantity() {
		return this.thresholdQuantity;
	}
	/**
	 * <p>Setter for the field <code>thresholdQuantity</code>.</p>
	 *
	 * @param thresholdQuantity a {@link java.lang.Long} object.
	 */
	public void setThresholdQuantity(Long thresholdQuantity) {
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
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getValueAmount() {
		return this.valueAmount;
	}
	/**
	 * <p>Setter for the field <code>valueAmount</code>.</p>
	 *
	 * @param valueAmount a {@link java.lang.Long} object.
	 */
	public void setValueAmount(Long valueAmount) {
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
