package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 芝麻授权参数
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:32:21
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

	public String getBuckleAppId() {
		return this.buckleAppId;
	}
	public void setBuckleAppId(String buckleAppId) {
		this.buckleAppId = buckleAppId;
	}

	public String getBuckleMerchantId() {
		return this.buckleMerchantId;
	}
	public void setBuckleMerchantId(String buckleMerchantId) {
		this.buckleMerchantId = buckleMerchantId;
	}

}
