package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险产品业务标记
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsProdTag extends AlipayObject {

	private static final long serialVersionUID = 5365971271691569189L;

	/**
	 * 业务标记代码
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 业务标记值
	 */
	@ApiField("tag_value")
	private String tagValue;

	/**
	 * <p>Getter for the field <code>tagCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTagCode() {
		return this.tagCode;
	}
	/**
	 * <p>Setter for the field <code>tagCode</code>.</p>
	 *
	 * @param tagCode a {@link java.lang.String} object.
	 */
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	/**
	 * <p>Getter for the field <code>tagValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTagValue() {
		return this.tagValue;
	}
	/**
	 * <p>Setter for the field <code>tagValue</code>.</p>
	 *
	 * @param tagValue a {@link java.lang.String} object.
	 */
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
