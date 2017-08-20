package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 活跃高价值用户返回
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AlipayHighValueCustomerResult extends AlipayObject {

	private static final long serialVersionUID = 5684228474166769251L;

	/**
	 * Z0-Z7
	 */
	@ApiField("level")
	private String level;

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
