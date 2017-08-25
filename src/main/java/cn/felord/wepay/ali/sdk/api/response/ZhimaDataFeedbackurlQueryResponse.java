package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.feedbackurl.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaDataFeedbackurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1647572917986579388L;

	/** 
	 * 反馈模板地址
	 */
	@ApiField("feedback_url")
	private String feedbackUrl;

	/**
	 * <p>Setter for the field <code>feedbackUrl</code>.</p>
	 *
	 * @param feedbackUrl a {@link java.lang.String} object.
	 */
	public void setFeedbackUrl(String feedbackUrl) {
		this.feedbackUrl = feedbackUrl;
	}
	/**
	 * <p>Getter for the field <code>feedbackUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFeedbackUrl( ) {
		return this.feedbackUrl;
	}

}
