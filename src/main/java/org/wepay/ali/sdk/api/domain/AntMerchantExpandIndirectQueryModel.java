package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 间连商户查询
 *
 * @author auto create
 * @since 1.0, 2017-04-11 18:05:48
 */
public class AntMerchantExpandIndirectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2515368296543185988L;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一，与sub_merchant_id二选一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，与external_id二选一必传
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
