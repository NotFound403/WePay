package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashlessvoucher.template.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCashlessvoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5671335842522463437L;

	/** 
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.String} object.
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId( ) {
		return this.templateId;
	}

}
