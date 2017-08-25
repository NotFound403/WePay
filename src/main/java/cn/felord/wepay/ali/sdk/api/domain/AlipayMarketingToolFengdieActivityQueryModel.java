package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询凤蝶H5页面详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingToolFengdieActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7716146825734519879L;

	/**
	 * H5应用的唯一id，调用alipay.marketing.tool.fengdie.activity.create获得
	 */
	@ApiField("activity_id")
	private Long activityId;

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

}
