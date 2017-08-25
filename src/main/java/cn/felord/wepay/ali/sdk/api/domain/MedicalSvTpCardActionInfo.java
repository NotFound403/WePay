package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 医疗服务平台card行动点信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MedicalSvTpCardActionInfo extends AlipayObject {

	private static final long serialVersionUID = 2671328471946435474L;

	/**
	 * 模板消息中行动编码，动态参数信息
备注：行动点编码根据模板类型定义
	 */
	@ApiField("action_code")
	private String actionCode;

	/**
	 * 模板消息中行动名称,开发者自定义
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 模板消息中实际操作链接，开发者自定义
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * <p>Getter for the field <code>actionCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionCode() {
		return this.actionCode;
	}
	/**
	 * <p>Setter for the field <code>actionCode</code>.</p>
	 *
	 * @param actionCode a {@link java.lang.String} object.
	 */
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	/**
	 * <p>Getter for the field <code>actionName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionName() {
		return this.actionName;
	}
	/**
	 * <p>Setter for the field <code>actionName</code>.</p>
	 *
	 * @param actionName a {@link java.lang.String} object.
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * <p>Getter for the field <code>actionUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionUrl() {
		return this.actionUrl;
	}
	/**
	 * <p>Setter for the field <code>actionUrl</code>.</p>
	 *
	 * @param actionUrl a {@link java.lang.String} object.
	 */
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

}
