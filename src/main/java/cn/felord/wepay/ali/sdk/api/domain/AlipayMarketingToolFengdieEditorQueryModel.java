package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 唤起凤蝶H5编辑器
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingToolFengdieEditorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7473192195987175579L;

	/**
	 * 凤蝶H5应用唯一id，通过alipay.marketing.tool.fengdie.activity.create接口时自动生成
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 在凤蝶编辑器中点击“发布”按钮后，如果发布成功则跳转到该地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getActivityId() {
		return this.activityId;
	}
	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.Long} object.
	 */
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	/**
	 * <p>Getter for the field <code>redirectUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	/**
	 * <p>Setter for the field <code>redirectUrl</code>.</p>
	 *
	 * @param redirectUrl a {@link java.lang.String} object.
	 */
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
