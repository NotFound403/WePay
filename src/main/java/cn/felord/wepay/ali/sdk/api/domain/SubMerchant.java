package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 二级商户信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SubMerchant extends AlipayObject {

	private static final long serialVersionUID = 5479826916896149942L;

	/**
	 * 二级商户的支付宝id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * <p>Getter for the field <code>merchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantId() {
		return this.merchantId;
	}
	/**
	 * <p>Setter for the field <code>merchantId</code>.</p>
	 *
	 * @param merchantId a {@link java.lang.String} object.
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
