package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 比例分佣条款
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertPercentageCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 3528518598676391176L;

	/**
	 * 分佣封顶金额
	 */
	@ApiField("max")
	private String max;

	/**
	 * 分佣比例(100以内精度2位的非负小数)
例如30.04%，则输入  30.04
分佣比例存在浮动的下限，可通过业务文档获取实际值
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * <p>Getter for the field <code>max</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMax() {
		return this.max;
	}
	/**
	 * <p>Setter for the field <code>max</code>.</p>
	 *
	 * @param max a {@link java.lang.String} object.
	 */
	public void setMax(String max) {
		this.max = max;
	}

	/**
	 * <p>Getter for the field <code>rate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRate() {
		return this.rate;
	}
	/**
	 * <p>Setter for the field <code>rate</code>.</p>
	 *
	 * @param rate a {@link java.lang.String} object.
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}

}
