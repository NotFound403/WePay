package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 描述支付宝脱机交易主秘钥
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflinePayMasterKey extends AlipayObject {

	private static final long serialVersionUID = 4685742225275428638L;

	/**
	 * 秘钥id
	 */
	@ApiField("key_id")
	private Long keyId;

	/**
	 * 支付宝脱机服务公钥
	 */
	@ApiField("public_key")
	private String publicKey;

	/**
	 * <p>Getter for the field <code>keyId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getKeyId() {
		return this.keyId;
	}
	/**
	 * <p>Setter for the field <code>keyId</code>.</p>
	 *
	 * @param keyId a {@link java.lang.Long} object.
	 */
	public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}

	/**
	 * <p>Getter for the field <code>publicKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicKey() {
		return this.publicKey;
	}
	/**
	 * <p>Setter for the field <code>publicKey</code>.</p>
	 *
	 * @param publicKey a {@link java.lang.String} object.
	 */
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

}
