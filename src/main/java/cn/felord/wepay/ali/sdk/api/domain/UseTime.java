package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券可用时间
 *
 * @author auto create
 * @version $Id: $Id
 */
public class UseTime extends AlipayObject {

	private static final long serialVersionUID = 8156473925854835265L;

	/**
	 * 券可用时段时间维度，目前支持周(W)
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 券可用时间段
可用时间段起止时间用逗号分隔，多个时间段之间用^分隔
如, "16:00:00,20:00:00^21:00:00,22:00:00"表示16点至20点，21点至22点可用
时间段不可重叠
	 */
	@ApiField("times")
	private String times;

	/**
	 * 券可用时间维度值
周维度的取值范围1-7(周一至周日)，多个可用时段用逗号分隔
如"1,3,5"，对应周一，周三，周五可用
	 */
	@ApiField("values")
	private String values;

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
	 * <p>Getter for the field <code>times</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimes() {
		return this.times;
	}
	/**
	 * <p>Setter for the field <code>times</code>.</p>
	 *
	 * @param times a {@link java.lang.String} object.
	 */
	public void setTimes(String times) {
		this.times = times;
	}

	/**
	 * <p>Getter for the field <code>values</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValues() {
		return this.values;
	}
	/**
	 * <p>Setter for the field <code>values</code>.</p>
	 *
	 * @param values a {@link java.lang.String} object.
	 */
	public void setValues(String values) {
		this.values = values;
	}

}
