package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.IsvMerchantInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.isv.merchant.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingToolIsvMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4194421875559479217L;

	/** 
	 * 商户信息列表
	 */
	@ApiListField("merchant_infos")
	@ApiField("isv_merchant_info")
	private List<IsvMerchantInfo> merchantInfos;

	/**
	 * <p>Setter for the field <code>merchantInfos</code>.</p>
	 *
	 * @param merchantInfos a {@link java.util.List} object.
	 */
	public void setMerchantInfos(List<IsvMerchantInfo> merchantInfos) {
		this.merchantInfos = merchantInfos;
	}
	/**
	 * <p>Getter for the field <code>merchantInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<IsvMerchantInfo> getMerchantInfos( ) {
		return this.merchantInfos;
	}

}
