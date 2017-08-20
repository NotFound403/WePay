package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 删除圈人规则
 *
 * @author auto create
 * @since 1.0, 2016-12-12 17:43:21
 */
public class AlipayMarketingCampaignRuleCrowdDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8891536585822215358L;

	/**
	 * 签约商户下属子机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 对没有在使用的规则进行删除
	 */
	@ApiField("ruleid")
	private String ruleid;

	public String getMpid() {
		return this.mpid;
	}
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

	public String getRuleid() {
		return this.ruleid;
	}
	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

}
