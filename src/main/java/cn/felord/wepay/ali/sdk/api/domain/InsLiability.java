package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 险种责任
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsLiability extends AlipayObject {

	private static final long serialVersionUID = 4358958932173443612L;

	/**
	 * 责任描述
	 */
	@ApiField("liability_desc")
	private String liabilityDesc;

	/**
	 * 责任名称
	 */
	@ApiField("liability_name")
	private String liabilityName;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private InsSumInsured sumInsured;

	/**
	 * <p>Getter for the field <code>liabilityDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLiabilityDesc() {
		return this.liabilityDesc;
	}
	/**
	 * <p>Setter for the field <code>liabilityDesc</code>.</p>
	 *
	 * @param liabilityDesc a {@link java.lang.String} object.
	 */
	public void setLiabilityDesc(String liabilityDesc) {
		this.liabilityDesc = liabilityDesc;
	}

	/**
	 * <p>Getter for the field <code>liabilityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLiabilityName() {
		return this.liabilityName;
	}
	/**
	 * <p>Setter for the field <code>liabilityName</code>.</p>
	 *
	 * @param liabilityName a {@link java.lang.String} object.
	 */
	public void setLiabilityName(String liabilityName) {
		this.liabilityName = liabilityName;
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
