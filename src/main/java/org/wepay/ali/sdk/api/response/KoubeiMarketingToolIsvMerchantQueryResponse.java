package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.IsvMerchantInfo;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.isv.merchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-25 10:42:12
 */
public class KoubeiMarketingToolIsvMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4194421875559479217L;

	/** 
	 * 商户信息列表
	 */
	@ApiListField("merchant_infos")
	@ApiField("isv_merchant_info")
	private List<IsvMerchantInfo> merchantInfos;

	public void setMerchantInfos(List<IsvMerchantInfo> merchantInfos) {
		this.merchantInfos = merchantInfos;
	}
	public List<IsvMerchantInfo> getMerchantInfos( ) {
		return this.merchantInfos;
	}

}
