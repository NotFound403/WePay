package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 芝麻授权参数
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZmAuthParams extends AlipayObject {

	private static final long serialVersionUID = 5761985553515745724L;

	/**
	 * 商户在芝麻端申请的appId
	 */
	@ApiField("buckle_app_id")
	private String buckleAppId;

	/**
	 * 商户在芝麻端申请的merchantId
	 */
	@ApiField("buckle_merchant_id")
	private String buckleMerchantId;

	/**
	 * <p>Getter for the field <code>buckleAppId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuckleAppId() {
		return this.buckleAppId;
	}
	/**
	 * <p>Setter for the field <code>buckleAppId</code>.</p>
	 *
	 * @param buckleAppId a {@link java.lang.String} object.
	 */
	public void setBuckleAppId(String buckleAppId) {
		this.buckleAppId = buckleAppId;
	}

	/**
	 * <p>Getter for the field <code>buckleMerchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBuckleMerchantId() {
		return this.buckleMerchantId;
	}
	/**
	 * <p>Setter for the field <code>buckleMerchantId</code>.</p>
	 *
	 * @param buckleMerchantId a {@link java.lang.String} object.
	 */
	public void setBuckleMerchantId(String buckleMerchantId) {
		this.buckleMerchantId = buckleMerchantId;
	}

}
