package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-04 18:48:14
 */
public class ZhimaCustomerCertificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6638187175241223578L;

	/** 
	 * 本次认证的唯一标识,商户需要记录
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
