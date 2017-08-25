package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蓝牙设备模板信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BeaconTemplate extends AlipayObject {

	private static final long serialVersionUID = 3577533622385466411L;

	/**
	 * 模板参数信息
	 */
	@ApiField("context")
	private String context;

	/**
	 * 模板ID
	 */
	@ApiField("templateid")
	private String templateid;

	/**
	 * <p>Getter for the field <code>context</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContext() {
		return this.context;
	}
	/**
	 * <p>Setter for the field <code>context</code>.</p>
	 *
	 * @param context a {@link java.lang.String} object.
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * <p>Getter for the field <code>templateid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateid() {
		return this.templateid;
	}
	/**
	 * <p>Setter for the field <code>templateid</code>.</p>
	 *
	 * @param templateid a {@link java.lang.String} object.
	 */
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}

}
