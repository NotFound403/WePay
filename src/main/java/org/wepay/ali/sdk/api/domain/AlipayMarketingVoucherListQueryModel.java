package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询券列表
 *
 * @author auto create
 * @since 1.0, 2017-06-19 11:28:18
 */
public class AlipayMarketingVoucherListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5513713255387737444L;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
