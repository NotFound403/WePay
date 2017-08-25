package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 圈人标签查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignRuleTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6474597856284647381L;

	/**
	 * 签约商户下属机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * <p>Getter for the field <code>mpid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMpid() {
		return this.mpid;
	}
	/**
	 * <p>Setter for the field <code>mpid</code>.</p>
	 *
	 * @param mpid a {@link java.lang.String} object.
	 */
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

}
