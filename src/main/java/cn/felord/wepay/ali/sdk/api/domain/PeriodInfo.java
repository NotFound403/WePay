package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 周期模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 6391163583548298762L;

	/**
	 * 单位
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 周期值
	 */
	@ApiField("value")
	private Long value;

	/**
	 * <p>Getter for the field <code>dimension</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDimension() {
		return this.dimension;
	}
	/**
	 * <p>Setter for the field <code>dimension</code>.</p>
	 *
	 * @param dimension a {@link java.lang.String} object.
	 */
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getValue() {
		return this.value;
	}
	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.Long} object.
	 */
	public void setValue(Long value) {
		this.value = value;
	}

}
