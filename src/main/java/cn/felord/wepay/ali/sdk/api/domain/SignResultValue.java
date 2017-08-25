package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 已生效的销账或出账机构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SignResultValue extends AlipayObject {

	private static final long serialVersionUID = 7168347146144553699L;

	/**
	 * 已生效的销账/出账机构
	 */
	@ApiField("effect_biz_value")
	private String effectBizValue;

	/**
	 * <p>Getter for the field <code>effectBizValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEffectBizValue() {
		return this.effectBizValue;
	}
	/**
	 * <p>Setter for the field <code>effectBizValue</code>.</p>
	 *
	 * @param effectBizValue a {@link java.lang.String} object.
	 */
	public void setEffectBizValue(String effectBizValue) {
		this.effectBizValue = effectBizValue;
	}

}
