package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.data.upload.initialize response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantDataUploadInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4545374475724715359L;

	/** 
	 * 行业模板
	 */
	@ApiField("template_url")
	private String templateUrl;

	/**
	 * <p>Setter for the field <code>templateUrl</code>.</p>
	 *
	 * @param templateUrl a {@link java.lang.String} object.
	 */
	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}
	/**
	 * <p>Getter for the field <code>templateUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateUrl( ) {
		return this.templateUrl;
	}

}
