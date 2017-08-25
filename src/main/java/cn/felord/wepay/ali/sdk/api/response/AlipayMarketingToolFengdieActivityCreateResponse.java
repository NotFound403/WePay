package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingToolFengdieActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3897443779864727139L;

	/** 
	 * H5应用的唯一id
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.Long} object.
	 */
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getActivityId( ) {
		return this.activityId;
	}

}
