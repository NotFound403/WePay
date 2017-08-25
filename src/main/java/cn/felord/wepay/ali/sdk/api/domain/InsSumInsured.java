package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保额
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsSumInsured extends AlipayObject {

	private static final long serialVersionUID = 1721341572186157778L;

	/**
	 * 保额默认值;单位分
	 */
	@ApiField("default_value")
	private Long defaultValue;

	/**
	 * 保额最大值;单位分,当sum_insured_type=MONEY_RANGE时该值有效
	 */
	@ApiField("max_value")
	private Long maxValue;

	/**
	 * 保额最小值;单位分,当sum_insured_type=MONEY_RANGE时该值有效
	 */
	@ApiField("min_value")
	private Long minValue;

	/**
	 * 保额类型;MONEY_RANGE:金额范围,MONEY_LIST:金额可选值,ENUM_VALUE:枚举值
	 */
	@ApiField("sum_insured_type")
	private String sumInsuredType;

	/**
	 * 保额列表;列表里的值单位为分,当sum_insured_type=MONEY_LIST时该值有效
	 */
	@ApiListField("sum_insureds")
	@ApiField("number")
	private List<Long> sumInsureds;

	/**
	 * <p>Getter for the field <code>defaultValue</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDefaultValue() {
		return this.defaultValue;
	}
	/**
	 * <p>Setter for the field <code>defaultValue</code>.</p>
	 *
	 * @param defaultValue a {@link java.lang.Long} object.
	 */
	public void setDefaultValue(Long defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * <p>Getter for the field <code>maxValue</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMaxValue() {
		return this.maxValue;
	}
	/**
	 * <p>Setter for the field <code>maxValue</code>.</p>
	 *
	 * @param maxValue a {@link java.lang.Long} object.
	 */
	public void setMaxValue(Long maxValue) {
		this.maxValue = maxValue;
	}

	/**
	 * <p>Getter for the field <code>minValue</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMinValue() {
		return this.minValue;
	}
	/**
	 * <p>Setter for the field <code>minValue</code>.</p>
	 *
	 * @param minValue a {@link java.lang.Long} object.
	 */
	public void setMinValue(Long minValue) {
		this.minValue = minValue;
	}

	/**
	 * <p>Getter for the field <code>sumInsuredType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSumInsuredType() {
		return this.sumInsuredType;
	}
	/**
	 * <p>Setter for the field <code>sumInsuredType</code>.</p>
	 *
	 * @param sumInsuredType a {@link java.lang.String} object.
	 */
	public void setSumInsuredType(String sumInsuredType) {
		this.sumInsuredType = sumInsuredType;
	}

	/**
	 * <p>Getter for the field <code>sumInsureds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getSumInsureds() {
		return this.sumInsureds;
	}
	/**
	 * <p>Setter for the field <code>sumInsureds</code>.</p>
	 *
	 * @param sumInsureds a {@link java.util.List} object.
	 */
	public void setSumInsureds(List<Long> sumInsureds) {
		this.sumInsureds = sumInsureds;
	}

}
