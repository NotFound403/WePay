package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡领卡链接获取接口
 *
 * @author auto create
 * @since 1.0, 2017-07-21 20:48:40
 */
public class AlipayMarketingCardActivateurlApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1473629646238645844L;

	/**
	 * 会员卡开卡表单提交后回调地址。
1.该地址不可带参数，如需回传参数，可设置out_string入参。
	 */
	@ApiField("callback")
	private String callback;

	/**
	 * 需要关注的生活号AppId。若需要在领卡页面展示“关注生活号”提示，可设置此参数为待关注的生活号AppId。生活号快速接入详见：https://doc.open.alipay.com/docs/doc.htm?treeId=193&articleId=105933&docType=1
	 */
	@ApiField("follow_app_id")
	private String followAppId;

	/**
	 * 扩展信息，会员领卡完成后将此参数原样带回商户页面。
	 */
	@ApiField("out_string")
	private String outString;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCallback() {
		return this.callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getFollowAppId() {
		return this.followAppId;
	}
	public void setFollowAppId(String followAppId) {
		this.followAppId = followAppId;
	}

	public String getOutString() {
		return this.outString;
	}
	public void setOutString(String outString) {
		this.outString = outString;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
