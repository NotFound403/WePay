package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.verify response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-14 17:17:49
 */
public class ZhimaCreditAntifraudVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5591759169475985338L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * <a href="https://doc.open.alipay.com/docs/doc.htm?treeId=272&articleId=105917&docType=1">验证code列表</a>
	 */
	@ApiListField("verify_code")
	@ApiField("string")
	private List<String> verifyCode;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setVerifyCode(List<String> verifyCode) {
		this.verifyCode = verifyCode;
	}
	public List<String> getVerifyCode( ) {
		return this.verifyCode;
	}

}
