package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPersonalizedExtensionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7297621747928429327L;

	/** 
	 * 扩展区套id，创建个性化扩展区成功后，支付宝会将该字段返回，后续扩展区上下线或者扩展区删除都会用到这个值。
	 */
	@ApiField("extension_key")
	private String extensionKey;

	/**
	 * <p>Setter for the field <code>extensionKey</code>.</p>
	 *
	 * @param extensionKey a {@link java.lang.String} object.
	 */
	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}
	/**
	 * <p>Getter for the field <code>extensionKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtensionKey( ) {
		return this.extensionKey;
	}

}
