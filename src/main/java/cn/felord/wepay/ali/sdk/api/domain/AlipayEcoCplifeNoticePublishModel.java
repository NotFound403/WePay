package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 发布物业通知公告
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeNoticePublishModel extends AlipayObject {

	private static final long serialVersionUID = 7487982638157555753L;

	/**
	 * 待发布通知的目标物业小区ID列表，使用支付宝平台统一的小区ID编码。
	 */
	@ApiListField("community_id_set")
	@ApiField("string")
	private List<String> communityIdSet;

	/**
	 * 待发送的通知内容
	 */
	@ApiField("notice_details")
	private CplifeNoticeDetail noticeDetails;

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
	 * <p>Getter for the field <code>noticeDetails</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CplifeNoticeDetail} object.
	 */
	public CplifeNoticeDetail getNoticeDetails() {
		return this.noticeDetails;
	}
	/**
	 * <p>Setter for the field <code>noticeDetails</code>.</p>
	 *
	 * @param noticeDetails a {@link cn.felord.wepay.ali.sdk.api.domain.CplifeNoticeDetail} object.
	 */
	public void setNoticeDetails(CplifeNoticeDetail noticeDetails) {
		this.noticeDetails = noticeDetails;
	}

}
