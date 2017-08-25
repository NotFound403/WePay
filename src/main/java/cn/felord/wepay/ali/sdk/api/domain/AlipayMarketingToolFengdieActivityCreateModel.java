package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建凤蝶H5应用
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingToolFengdieActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3399112656625385314L;

	/**
	 * H5应用初始化数据
	 */
	@ApiField("activity")
	private FengdieActivityCreateData activity;

	/**
	 * 凤蝶模板包唯一id，从alipay.marketing.tool.fengdie.template.query接口中获取
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * <p>Getter for the field <code>activity</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.FengdieActivityCreateData} object.
	 */
	public FengdieActivityCreateData getActivity() {
		return this.activity;
	}
	/**
	 * <p>Setter for the field <code>activity</code>.</p>
	 *
	 * @param activity a {@link cn.felord.wepay.ali.sdk.api.domain.FengdieActivityCreateData} object.
	 */
	public void setActivity(FengdieActivityCreateData activity) {
		this.activity = activity;
	}

	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTemplateId() {
		return this.templateId;
	}
	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.Long} object.
	 */
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
