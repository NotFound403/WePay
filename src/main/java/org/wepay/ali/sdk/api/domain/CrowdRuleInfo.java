package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 圈人规则信息
 *
 * @author auto create
 * @since 1.0, 2016-12-12 17:43:08
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

	public String getRuledesc() {
		return this.ruledesc;
	}
	public void setRuledesc(String ruledesc) {
		this.ruledesc = ruledesc;
	}

	public String getRuleid() {
		return this.ruleid;
	}
	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
