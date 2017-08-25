package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.notice.publish response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8813778823743327738L;

	/** 
	 * 支付宝平台统一生产的通知公告唯一ID标示.
	 */
	@ApiField("notice_id")
	private String noticeId;

	/**
	 * <p>Setter for the field <code>noticeId</code>.</p>
	 *
	 * @param noticeId a {@link java.lang.String} object.
	 */
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	/**
	 * <p>Getter for the field <code>noticeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNoticeId( ) {
		return this.noticeId;
	}

}
