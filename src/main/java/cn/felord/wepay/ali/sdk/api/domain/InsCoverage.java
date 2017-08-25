package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 险种
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsCoverage extends AlipayObject {

	private static final long serialVersionUID = 1521798157923313531L;

	/**
	 * 险种名称
	 */
	@ApiField("coverage_name")
	private String coverageName;

	/**
	 * 险种编号
	 */
	@ApiField("coverage_no")
	private String coverageNo;

	/**
	 * 险种失效时间
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 险种生效时间
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 不计免赔;0：默认不投保;
1：默认投保。
	 */
	@ApiField("iop")
	private Long iop;

	/**
	 * 不计免赔的保费
	 */
	@ApiField("iop_premium")
	private Long iopPremium;

	/**
	 * 保费;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保额;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * <p>Getter for the field <code>coverageName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCoverageName() {
		return this.coverageName;
	}
	/**
	 * <p>Setter for the field <code>coverageName</code>.</p>
	 *
	 * @param coverageName a {@link java.lang.String} object.
	 */
	public void setCoverageName(String coverageName) {
		this.coverageName = coverageName;
	}

	/**
	 * <p>Getter for the field <code>coverageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCoverageNo() {
		return this.coverageNo;
	}
	/**
	 * <p>Setter for the field <code>coverageNo</code>.</p>
	 *
	 * @param coverageNo a {@link java.lang.String} object.
	 */
	public void setCoverageNo(String coverageNo) {
		this.coverageNo = coverageNo;
	}

	/**
	 * <p>Getter for the field <code>effectEndTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEffectEndTime() {
		return this.effectEndTime;
	}
	/**
	 * <p>Setter for the field <code>effectEndTime</code>.</p>
	 *
	 * @param effectEndTime a {@link java.lang.String} object.
	 */
	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	/**
	 * <p>Getter for the field <code>effectStartTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEffectStartTime() {
		return this.effectStartTime;
	}
	/**
	 * <p>Setter for the field <code>effectStartTime</code>.</p>
	 *
	 * @param effectStartTime a {@link java.lang.String} object.
	 */
	public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	/**
	 * <p>Getter for the field <code>iop</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getIop() {
		return this.iop;
	}
	/**
	 * <p>Setter for the field <code>iop</code>.</p>
	 *
	 * @param iop a {@link java.lang.Long} object.
	 */
	public void setIop(Long iop) {
		this.iop = iop;
	}

	/**
	 * <p>Getter for the field <code>iopPremium</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getIopPremium() {
		return this.iopPremium;
	}
	/**
	 * <p>Setter for the field <code>iopPremium</code>.</p>
	 *
	 * @param iopPremium a {@link java.lang.Long} object.
	 */
	public void setIopPremium(Long iopPremium) {
		this.iopPremium = iopPremium;
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
