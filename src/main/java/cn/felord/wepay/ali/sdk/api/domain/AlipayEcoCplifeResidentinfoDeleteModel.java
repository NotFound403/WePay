package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 删除物业小区住户信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeResidentinfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5278747475577134663L;

	/**
	 * 待删除的住户所在的小区ID(支付宝平台统一小区ID标识)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 待删除住户在物业系统中的唯一标示,一次至多传入200条用户ID
	 */
	@ApiListField("out_resident_id_set")
	@ApiField("string")
	private List<String> outResidentIdSet;

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
	 * <p>Getter for the field <code>outResidentIdSet</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getOutResidentIdSet() {
		return this.outResidentIdSet;
	}
	/**
	 * <p>Setter for the field <code>outResidentIdSet</code>.</p>
	 *
	 * @param outResidentIdSet a {@link java.util.List} object.
	 */
	public void setOutResidentIdSet(List<String> outResidentIdSet) {
		this.outResidentIdSet = outResidentIdSet;
	}

}
