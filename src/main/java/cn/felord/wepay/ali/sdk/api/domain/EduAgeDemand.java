package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 兼职平台贴子年龄
 *
 * @author auto create
 * @version $Id: $Id
 */
public class EduAgeDemand extends AlipayObject {

	private static final long serialVersionUID = 1449322135545879658L;

	/**
	 * 结束年龄
	 */
	@ApiField("age_end")
	private String ageEnd;

	/**
	 * 开始年龄
	 */
	@ApiField("age_start")
	private String ageStart;

	/**
	 * <p>Getter for the field <code>ageEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgeEnd() {
		return this.ageEnd;
	}
	/**
	 * <p>Setter for the field <code>ageEnd</code>.</p>
	 *
	 * @param ageEnd a {@link java.lang.String} object.
	 */
	public void setAgeEnd(String ageEnd) {
		this.ageEnd = ageEnd;
	}

	/**
	 * <p>Getter for the field <code>ageStart</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgeStart() {
		return this.ageStart;
	}
	/**
	 * <p>Setter for the field <code>ageStart</code>.</p>
	 *
	 * @param ageStart a {@link java.lang.String} object.
	 */
	public void setAgeStart(String ageStart) {
		this.ageStart = ageStart;
	}

}
