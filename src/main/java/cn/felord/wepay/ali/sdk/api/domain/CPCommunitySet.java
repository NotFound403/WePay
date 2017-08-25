package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物业小区摘要信息列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CPCommunitySet extends AlipayObject {

	private static final long serialVersionUID = 7549116292512369369L;

	/**
	 * 支付宝社区小区统一编号。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 小区对应的物业公司支付宝账号PID（合作伙伴partner id）。物业公司给开发者做第三方应用授权后，开发者可获取物业公司PID。
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小区在物业系统中的唯一编号。若开发者传入过，则返回。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 小区当前状态,状态值：
PENDING_ONLINE 待上线
ONLINE - 上线
MAINTAIN - 维护中
OFFLINE - 下线
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>communityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommunityId() {
		return this.communityId;
	}
	/**
	 * <p>Setter for the field <code>communityId</code>.</p>
	 *
	 * @param communityId a {@link java.lang.String} object.
	 */
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	/**
	 * <p>Getter for the field <code>merchantPid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantPid() {
		return this.merchantPid;
	}
	/**
	 * <p>Setter for the field <code>merchantPid</code>.</p>
	 *
	 * @param merchantPid a {@link java.lang.String} object.
	 */
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	/**
	 * <p>Getter for the field <code>outCommunityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	/**
	 * <p>Setter for the field <code>outCommunityId</code>.</p>
	 *
	 * @param outCommunityId a {@link java.lang.String} object.
	 */
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
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
