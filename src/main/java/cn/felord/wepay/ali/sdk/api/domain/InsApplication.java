package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 投保申请信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsApplication extends AlipayObject {

	private static final long serialVersionUID = 1499984515212379158L;

	/**
	 * 投保参数 ,每个产品特有的投保参数,如航空险的航班信息;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 份数
	 */
	@ApiField("copies")
	private Long copies;

	/**
	 * 失效时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 保险标的
	 */
	@ApiField("ins_object")
	private InsObject insObject;

	/**
	 * 被保险人
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保费
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * <p>Getter for the field <code>bizData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizData() {
		return this.bizData;
	}
	/**
	 * <p>Setter for the field <code>bizData</code>.</p>
	 *
	 * @param bizData a {@link java.lang.String} object.
	 */
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	/**
	 * <p>Getter for the field <code>copies</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCopies() {
		return this.copies;
	}
	/**
	 * <p>Setter for the field <code>copies</code>.</p>
	 *
	 * @param copies a {@link java.lang.Long} object.
	 */
	public void setCopies(Long copies) {
		this.copies = copies;
	}

	/**
	 * <p>Getter for the field <code>effectEndTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEffectEndTime() {
		return this.effectEndTime;
	}
	/**
	 * <p>Setter for the field <code>effectEndTime</code>.</p>
	 *
	 * @param effectEndTime a {@link java.util.Date} object.
	 */
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	/**
	 * <p>Getter for the field <code>effectStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	/**
	 * <p>Setter for the field <code>effectStartTime</code>.</p>
	 *
	 * @param effectStartTime a {@link java.util.Date} object.
	 */
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	/**
	 * <p>Getter for the field <code>insObject</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsObject} object.
	 */
	public InsObject getInsObject() {
		return this.insObject;
	}
	/**
	 * <p>Setter for the field <code>insObject</code>.</p>
	 *
	 * @param insObject a {@link cn.felord.wepay.ali.sdk.api.domain.InsObject} object.
	 */
	public void setInsObject(InsObject insObject) {
		this.insObject = insObject;
	}

	/**
	 * <p>Getter for the field <code>insured</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getInsured() {
		return this.insured;
	}
	/**
	 * <p>Setter for the field <code>insured</code>.</p>
	 *
	 * @param insured a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setInsured(InsPerson insured) {
		this.insured = insured;
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
	 * <p>Getter for the field <code>premium</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPremium() {
		return this.premium;
	}
	/**
	 * <p>Setter for the field <code>premium</code>.</p>
	 *
	 * @param premium a {@link java.lang.Long} object.
	 */
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	/**
	 * <p>Getter for the field <code>sumInsured</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSumInsured() {
		return this.sumInsured;
	}
	/**
	 * <p>Setter for the field <code>sumInsured</code>.</p>
	 *
	 * @param sumInsured a {@link java.lang.Long} object.
	 */
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
