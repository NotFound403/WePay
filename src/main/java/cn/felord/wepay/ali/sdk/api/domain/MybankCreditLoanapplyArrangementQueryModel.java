package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 网商银行融资平台协议查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoanapplyArrangementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2658321162233797423L;

	/**
	 * 产品代码，标识网商银行具体的产品，由网商银行预先分配好，接入方按网商银行的要求送。
	 */
	@ApiField("ar_pd_code")
	private String arPdCode;

	/**
	 * 客户id，网商银行唯一标识一个客户的id。此客户id是通过客户创建接口返回的。即调用此接口前必须先调用客户创建接口。
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 客户角色id，网商银行唯一标识一个客户角色的id。此id是通过客户创建接口返回的。即调用此接口前必须先调用客户创建接口。客户角色id+产品代码唯一确定一笔签约。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 站点类型，当前只支持ALIPAY。后续扩展可以支持TAOBAO等。目前这个字段必须传递ALIPAY。
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点数字id，例如支付宝id、淘宝id。接入方通过客户的支付宝或淘宝账号获取对应的userId。当site为ALIPAY时，site_user_id必须是支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * <p>Getter for the field <code>arPdCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArPdCode() {
		return this.arPdCode;
	}
	/**
	 * <p>Setter for the field <code>arPdCode</code>.</p>
	 *
	 * @param arPdCode a {@link java.lang.String} object.
	 */
	public void setArPdCode(String arPdCode) {
		this.arPdCode = arPdCode;
	}

	/**
	 * <p>Getter for the field <code>ipId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpId() {
		return this.ipId;
	}
	/**
	 * <p>Setter for the field <code>ipId</code>.</p>
	 *
	 * @param ipId a {@link java.lang.String} object.
	 */
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	/**
	 * <p>Getter for the field <code>ipRoleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpRoleId() {
		return this.ipRoleId;
	}
	/**
	 * <p>Setter for the field <code>ipRoleId</code>.</p>
	 *
	 * @param ipRoleId a {@link java.lang.String} object.
	 */
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	/**
	 * <p>Getter for the field <code>site</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSite() {
		return this.site;
	}
	/**
	 * <p>Setter for the field <code>site</code>.</p>
	 *
	 * @param site a {@link java.lang.String} object.
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * <p>Getter for the field <code>siteUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSiteUserId() {
		return this.siteUserId;
	}
	/**
	 * <p>Setter for the field <code>siteUserId</code>.</p>
	 *
	 * @param siteUserId a {@link java.lang.String} object.
	 */
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
