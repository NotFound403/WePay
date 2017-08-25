package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 活跃高价值用户返回
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayHighValueCustomerResult extends AlipayObject {

	private static final long serialVersionUID = 5684228474166769251L;

	/**
	 * Z0-Z7
	 */
	@ApiField("level")
	private String level;

	/**
	 * <p>Getter for the field <code>level</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevel() {
		return this.level;
	}
	/**
	 * <p>Setter for the field <code>level</code>.</p>
	 *
	 * @param level a {@link java.lang.String} object.
	 */
	public void setLevel(String level) {
		this.level = level;
	}

}
