package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 删除物业社区通知通告
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeNoticeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7243268367825248276L;

	/**
	 * 待删除通知的支付宝小区ID，如果为空，则在所有小区下线该通知.
	 */
	@ApiListField("community_id_set")
	@ApiField("string")
	private List<String> communityIdSet;

	/**
	 * 待删除的通知ID,(见alipay.eco.cplife.notice.publish接口返回参数列表.)
	 */
	@ApiField("notice_id")
	private String noticeId;

	/**
	 * <p>Getter for the field <code>communityIdSet</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCommunityIdSet() {
		return this.communityIdSet;
	}
	/**
	 * <p>Setter for the field <code>communityIdSet</code>.</p>
	 *
	 * @param communityIdSet a {@link java.util.List} object.
	 */
	public void setCommunityIdSet(List<String> communityIdSet) {
		this.communityIdSet = communityIdSet;
	}

	/**
	 * <p>Getter for the field <code>noticeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNoticeId() {
		return this.noticeId;
	}
	/**
	 * <p>Setter for the field <code>noticeId</code>.</p>
	 *
	 * @param noticeId a {@link java.lang.String} object.
	 */
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

}
