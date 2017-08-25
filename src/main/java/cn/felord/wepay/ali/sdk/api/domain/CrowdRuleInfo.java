package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 圈人规则信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CrowdRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 2122537559495482981L;

	/**
	 * 规则描述
	 */
	@ApiField("ruledesc")
	private String ruledesc;

	/**
	 * 规则id
	 */
	@ApiField("ruleid")
	private String ruleid;

	/**
	 * 圈人规则的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>ruledesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRuledesc() {
		return this.ruledesc;
	}
	/**
	 * <p>Setter for the field <code>ruledesc</code>.</p>
	 *
	 * @param ruledesc a {@link java.lang.String} object.
	 */
	public void setRuledesc(String ruledesc) {
		this.ruledesc = ruledesc;
	}

	/**
	 * <p>Getter for the field <code>ruleid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRuleid() {
		return this.ruleid;
	}
	/**
	 * <p>Setter for the field <code>ruleid</code>.</p>
	 *
	 * @param ruleid a {@link java.lang.String} object.
	 */
	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
