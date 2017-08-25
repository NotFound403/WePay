package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 周期性使用时段规则
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenPromoPrizeDimension extends AlipayObject {

	private static final long serialVersionUID = 5734272724343235961L;

	/**
	 * 时间维度,
W：表示 周[1,4,5]
MIOD：表示 每天X分钟[0,1439]
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 参考dimension 后面的值
	 */
	@ApiListField("values")
	@ApiField("number")
	private List<Long> values;

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
	 * <p>Getter for the field <code>values</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getValues() {
		return this.values;
	}
	/**
	 * <p>Setter for the field <code>values</code>.</p>
	 *
	 * @param values a {@link java.util.List} object.
	 */
	public void setValues(List<Long> values) {
		this.values = values;
	}

}
