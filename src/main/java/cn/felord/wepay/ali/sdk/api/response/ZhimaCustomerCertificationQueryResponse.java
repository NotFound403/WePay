package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCustomerCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1717655439784315296L;

	/** 
	 * 认证过程成认证过的各渠道的状态,中间材料等数据
	 */
	@ApiField("channel_statuses")
	private String channelStatuses;

	/** 
	 * 如果认证没有通过会显示失败原因,更详细的情况在channel_statuses参数里面
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证是否通过,通过为true,不通过为false
	 */
	@ApiField("passed")
	private String passed;

	/**
	 * <p>Setter for the field <code>channelStatuses</code>.</p>
	 *
	 * @param channelStatuses a {@link java.lang.String} object.
	 */
	public void setChannelStatuses(String channelStatuses) {
		this.channelStatuses = channelStatuses;
	}
	/**
	 * <p>Getter for the field <code>channelStatuses</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelStatuses( ) {
		return this.channelStatuses;
	}

	/**
	 * <p>Setter for the field <code>failedReason</code>.</p>
	 *
	 * @param failedReason a {@link java.lang.String} object.
	 */
	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}
	/**
	 * <p>Getter for the field <code>failedReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFailedReason( ) {
		return this.failedReason;
	}

	/**
	 * <p>Setter for the field <code>passed</code>.</p>
	 *
	 * @param passed a {@link java.lang.String} object.
	 */
	public void setPassed(String passed) {
		this.passed = passed;
	}
	/**
	 * <p>Getter for the field <code>passed</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassed( ) {
		return this.passed;
	}

}
