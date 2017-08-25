package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 开卡组件表单配置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardFormtemplateSetModel extends AlipayObject {

	private static final long serialVersionUID = 6326374248276997243L;

	/**
	 * 会员卡开卡时的表单字段配置信息，可定义多个通用表单字段，最大不超过20个。
	 */
	@ApiField("fields")
	private OpenFormFieldDO fields;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * <p>Getter for the field <code>fields</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OpenFormFieldDO} object.
	 */
	public OpenFormFieldDO getFields() {
		return this.fields;
	}
	/**
	 * <p>Setter for the field <code>fields</code>.</p>
	 *
	 * @param fields a {@link cn.felord.wepay.ali.sdk.api.domain.OpenFormFieldDO} object.
	 */
	public void setFields(OpenFormFieldDO fields) {
		this.fields = fields;
	}

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
