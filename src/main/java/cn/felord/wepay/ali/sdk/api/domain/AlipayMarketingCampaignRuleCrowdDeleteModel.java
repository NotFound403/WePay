package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 删除圈人规则
 *
 * @author auto create
 * @version $Id: $Id
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
