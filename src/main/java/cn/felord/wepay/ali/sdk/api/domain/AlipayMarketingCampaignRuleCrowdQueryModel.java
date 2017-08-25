package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 圈人规则详情查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignRuleCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7176383898731516733L;

	/**
	 * 签约商户下属机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 所要查询的规则id
	 */
	@ApiField("ruleid")
	private String ruleid;

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

}
