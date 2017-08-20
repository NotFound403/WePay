package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.exsc.user.currentsign.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 17:12:42
 */
public class AlipayExscUserCurrentsignGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7612711175178323554L;

	/** 
	 * 返回结果的业务类型。当前签约绑卡业务类型 （current_sign）
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 业务处理结果
 true 无资金流入记录，本次是首次交易
 false 已有资金流入记录，本次不是首次交易
	 */
	@ApiField("success")
	private Boolean success;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
