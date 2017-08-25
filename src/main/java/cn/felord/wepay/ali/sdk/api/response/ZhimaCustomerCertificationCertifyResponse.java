package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.certify response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCustomerCertificationCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1543912883831962789L;

	/** 
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取,认证完成返回的biz_no和请求的一致
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 如果认证没有通过会显示失败原因,如果需要详细的失败原因请使用认证查询接口
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证是否通过,通过为true,不通过为false
	 */
	@ApiField("passed")
	private String passed;

	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo( ) {
		return this.bizNo;
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
