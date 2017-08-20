package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.auth.send response.
 * 
 * @author auto create
 * @since 1.0, 2015-05-15 09:36:22
 */
public class AlipayTrustUserAuthSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7856674628724892554L;

	/** 
	 * 当授权通知发送成功时，为T；否则用业务错误码表示
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
