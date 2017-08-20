package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.MerchantInstConfig;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.config.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 17:12:49
 */
public class AlipayEbppMerchantConfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4882292179934228724L;

	/** 
	 * 商户机构配置信息
	 */
	@ApiListField("inst_configs")
	@ApiField("merchant_inst_config")
	private List<MerchantInstConfig> instConfigs;

	/** 
	 * 商户的用户ID
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	public void setInstConfigs(List<MerchantInstConfig> instConfigs) {
		this.instConfigs = instConfigs;
	}
	public List<MerchantInstConfig> getInstConfigs( ) {
		return this.instConfigs;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	public String getMerchantUserId( ) {
		return this.merchantUserId;
	}

}
