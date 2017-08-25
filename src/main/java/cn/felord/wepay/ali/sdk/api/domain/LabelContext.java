package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 标签组发圈人条件
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LabelContext extends AlipayObject {

	private static final long serialVersionUID = 1148871194764483786L;

	/**
	 * 标签组发圈人的单个过滤器信息
	 */
	@ApiField("a")
	private LabelFilter a;

	/**
	 * <p>Getter for the field <code>a</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.LabelFilter} object.
	 */
	public LabelFilter getA() {
		return this.a;
	}
	/**
	 * <p>Setter for the field <code>a</code>.</p>
	 *
	 * @param a a {@link cn.felord.wepay.ali.sdk.api.domain.LabelFilter} object.
	 */
	public void setA(LabelFilter a) {
		this.a = a;
	}

}
