package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取数据反馈模板
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaDataFeedbackurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1518373195595757967L;

	/**
	 * 在支付宝商户版注册支付宝账号id
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
