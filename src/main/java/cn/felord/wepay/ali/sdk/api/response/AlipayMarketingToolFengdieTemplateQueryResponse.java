package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.FengdieTemplate;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.template.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingToolFengdieTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5123219122182838245L;

	/** 
	 * 开发者开发上传的H5模板列表
	 */
	@ApiListField("template")
	@ApiField("fengdie_template")
	private List<FengdieTemplate> template;

	/**
	 * <p>Setter for the field <code>template</code>.</p>
	 *
	 * @param template a {@link java.util.List} object.
	 */
	public void setTemplate(List<FengdieTemplate> template) {
		this.template = template;
	}
	/**
	 * <p>Getter for the field <code>template</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<FengdieTemplate> getTemplate( ) {
		return this.template;
	}

}
