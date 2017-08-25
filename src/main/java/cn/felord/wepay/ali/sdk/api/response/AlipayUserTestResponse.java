package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.test response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 1672261255994548888L;

	/** 
	 * 返回值
	 */
	@ApiField("ret1")
	private String ret1;

	/**
	 * <p>Setter for the field <code>ret1</code>.</p>
	 *
	 * @param ret1 a {@link java.lang.String} object.
	 */
	public void setRet1(String ret1) {
		this.ret1 = ret1;
	}
	/**
	 * <p>Getter for the field <code>ret1</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRet1( ) {
		return this.ret1;
	}

}
