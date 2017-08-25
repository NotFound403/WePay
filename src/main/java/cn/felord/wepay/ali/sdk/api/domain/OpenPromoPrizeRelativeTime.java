package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 开放活动－奖品适用门店
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OpenPromoPrizeRelativeTime extends AlipayObject {

	private static final long serialVersionUID = 6297521762274283735L;

	/**
	 * 时间维度,
     MI：表示 分
     H：表示 时
     D：表示 日
     W：表示 周
     M：表示 月
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 相对值
	 */
	@ApiField("value")
	private String value;

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
