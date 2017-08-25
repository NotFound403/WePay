package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险产品对应的险种;
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsProdCoverage extends AlipayObject {

	private static final long serialVersionUID = 6534195525123192139L;

	/**
	 * 险种描述
	 */
	@ApiField("coverage_desc")
	private String coverageDesc;

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
	 * 是否定期险种
	 */
	@ApiField("is_fixed_period")
	private Boolean isFixedPeriod;

	/**
	 * 险种责任列表
	 */
	@ApiListField("liabilities")
	@ApiField("ins_liability")
	private List<InsLiability> liabilities;

	/**
	 * 可用的保障期限列表;约定“1D”代表一天，“1M”代表一个月,"1Y"代表一年
	 */
	@ApiListField("periods")
	@ApiField("string")
	private List<String> periods;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private InsSumInsured sumInsured;

	/**
	 * <p>Getter for the field <code>coverageDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCoverageDesc() {
		return this.coverageDesc;
	}
	/**
	 * <p>Setter for the field <code>coverageDesc</code>.</p>
	 *
	 * @param coverageDesc a {@link java.lang.String} object.
	 */
	public void setCoverageDesc(String coverageDesc) {
		this.coverageDesc = coverageDesc;
	}

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
	 * <p>Getter for the field <code>isFixedPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsFixedPeriod() {
		return this.isFixedPeriod;
	}
	/**
	 * <p>Setter for the field <code>isFixedPeriod</code>.</p>
	 *
	 * @param isFixedPeriod a {@link java.lang.Boolean} object.
	 */
	public void setIsFixedPeriod(Boolean isFixedPeriod) {
		this.isFixedPeriod = isFixedPeriod;
	}

	/**
	 * <p>Getter for the field <code>liabilities</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsLiability> getLiabilities() {
		return this.liabilities;
	}
	/**
	 * <p>Setter for the field <code>liabilities</code>.</p>
	 *
	 * @param liabilities a {@link java.util.List} object.
	 */
	public void setLiabilities(List<InsLiability> liabilities) {
		this.liabilities = liabilities;
	}

	/**
	 * <p>Getter for the field <code>periods</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getPeriods() {
		return this.periods;
	}
	/**
	 * <p>Setter for the field <code>periods</code>.</p>
	 *
	 * @param periods a {@link java.util.List} object.
	 */
	public void setPeriods(List<String> periods) {
		this.periods = periods;
	}

	/**
	 * <p>Getter for the field <code>sumInsured</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsSumInsured} object.
	 */
	public InsSumInsured getSumInsured() {
		return this.sumInsured;
	}
	/**
	 * <p>Setter for the field <code>sumInsured</code>.</p>
	 *
	 * @param sumInsured a {@link cn.felord.wepay.ali.sdk.api.domain.InsSumInsured} object.
	 */
	public void setSumInsured(InsSumInsured sumInsured) {
		this.sumInsured = sumInsured;
	}

}
