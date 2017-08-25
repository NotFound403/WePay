package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 圈人规则查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignRuleRulelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3375972341367833992L;

	/**
	 * 签约商户下属子机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 页码，从1开始
	 */
	@ApiField("pageno")
	private String pageno;

	/**
	 * 每页大小
	 */
	@ApiField("pagesize")
	private String pagesize;

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
	 * <p>Getter for the field <code>pageno</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageno() {
		return this.pageno;
	}
	/**
	 * <p>Setter for the field <code>pageno</code>.</p>
	 *
	 * @param pageno a {@link java.lang.String} object.
	 */
	public void setPageno(String pageno) {
		this.pageno = pageno;
	}

	/**
	 * <p>Getter for the field <code>pagesize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPagesize() {
		return this.pagesize;
	}
	/**
	 * <p>Setter for the field <code>pagesize</code>.</p>
	 *
	 * @param pagesize a {@link java.lang.String} object.
	 */
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

}
