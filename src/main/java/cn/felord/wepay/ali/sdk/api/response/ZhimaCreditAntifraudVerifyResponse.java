package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.verify response.
 *
 * @author auto create
 * @version $Id: $Id
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
	 * <p>Setter for the field <code>verifyCode</code>.</p>
	 *
	 * @param verifyCode a {@link java.util.List} object.
	 */
	public void setVerifyCode(List<String> verifyCode) {
		this.verifyCode = verifyCode;
	}
	/**
	 * <p>Getter for the field <code>verifyCode</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getVerifyCode( ) {
		return this.verifyCode;
	}

}
