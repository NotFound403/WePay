package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.delete response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdFingerprintDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2551223372394799125L;

	/** 
	 * 去注册阶段服务端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含服务端的去注册数据。
	 */
	@ApiField("server_response")
	private String serverResponse;

	/**
	 * <p>Setter for the field <code>serverResponse</code>.</p>
	 *
	 * @param serverResponse a {@link java.lang.String} object.
	 */
	public void setServerResponse(String serverResponse) {
		this.serverResponse = serverResponse;
	}
	/**
	 * <p>Getter for the field <code>serverResponse</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServerResponse( ) {
		return this.serverResponse;
	}

}
