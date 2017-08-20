package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 删除物业社区通知通告
 *
 * @author auto create
 * @since 1.0, 2016-11-24 16:14:49
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

	public List<String> getCommunityIdSet() {
		return this.communityIdSet;
	}
	public void setCommunityIdSet(List<String> communityIdSet) {
		this.communityIdSet = communityIdSet;
	}

	public String getNoticeId() {
		return this.noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

}
