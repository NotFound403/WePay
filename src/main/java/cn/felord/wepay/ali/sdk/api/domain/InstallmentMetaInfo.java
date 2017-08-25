package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 分期对象的元数据信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InstallmentMetaInfo extends AlipayObject {

	private static final long serialVersionUID = 1559176172794662315L;

	/**
	 * 结束期数，包含此值
	 */
	@ApiField("end_term")
	private Long endTerm;

	/**
	 * 开始期数，包含此值
	 */
	@ApiField("start_term")
	private Long startTerm;

	/**
	 * 数值
	 */
	@ApiField("value")
	private String value;

	/**
	 * <p>Getter for the field <code>endTerm</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getEndTerm() {
		return this.endTerm;
	}
	/**
	 * <p>Setter for the field <code>endTerm</code>.</p>
	 *
	 * @param endTerm a {@link java.lang.Long} object.
	 */
	public void setEndTerm(Long endTerm) {
		this.endTerm = endTerm;
	}

	/**
	 * <p>Getter for the field <code>startTerm</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getStartTerm() {
		return this.startTerm;
	}
	/**
	 * <p>Setter for the field <code>startTerm</code>.</p>
	 *
	 * @param startTerm a {@link java.lang.Long} object.
	 */
	public void setStartTerm(Long startTerm) {
		this.startTerm = startTerm;
	}

	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.String} object.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
