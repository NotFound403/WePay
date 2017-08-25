package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 生活记录信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class NewsfeedLabelInfo extends AlipayObject {

	private static final long serialVersionUID = 7723249692923119143L;

	/**
	 * 根据主谓宾的格式生成动态的标题，此字段为谓语
	 */
	@ApiField("action")
	private String action;

	/**
	 * label行的跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

	/**
	 * 根据主谓宾的格式生成动态的标题，此字段为宾语
	 */
	@ApiField("target")
	private String target;

	/**
	 * <p>Getter for the field <code>action</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAction() {
		return this.action;
	}
	/**
	 * <p>Setter for the field <code>action</code>.</p>
	 *
	 * @param action a {@link java.lang.String} object.
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * <p>Getter for the field <code>scheme</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getScheme() {
		return this.scheme;
	}
	/**
	 * <p>Setter for the field <code>scheme</code>.</p>
	 *
	 * @param scheme a {@link java.lang.String} object.
	 */
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	/**
	 * <p>Getter for the field <code>target</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTarget() {
		return this.target;
	}
	/**
	 * <p>Setter for the field <code>target</code>.</p>
	 *
	 * @param target a {@link java.lang.String} object.
	 */
	public void setTarget(String target) {
		this.target = target;
	}

}
