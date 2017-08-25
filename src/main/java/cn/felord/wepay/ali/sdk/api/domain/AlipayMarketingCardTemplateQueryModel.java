package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡模板查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8675648992315878476L;

	/**
	 * 支付宝卡模板ID（模板创建接口返回的支付宝端模板ID）
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId() {
		return this.templateId;
	}
	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.String} object.
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
