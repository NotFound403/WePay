package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.MerchantInstConfig;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.config.get response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>instConfigs</code>.</p>
	 *
	 * @param instConfigs a {@link java.util.List} object.
	 */
	public void setInstConfigs(List<MerchantInstConfig> instConfigs) {
		this.instConfigs = instConfigs;
	}
	/**
	 * <p>Getter for the field <code>instConfigs</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MerchantInstConfig> getInstConfigs( ) {
		return this.instConfigs;
	}

	/**
	 * <p>Setter for the field <code>merchantUserId</code>.</p>
	 *
	 * @param merchantUserId a {@link java.lang.String} object.
	 */
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	/**
	 * <p>Getter for the field <code>merchantUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantUserId( ) {
		return this.merchantUserId;
	}

}
