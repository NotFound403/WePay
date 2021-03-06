package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.OpenActivity;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.activity.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiQualityTestCloudacptActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6399419568635739876L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("open_activity")
	private List<OpenActivity> activityList;

	/**
	 * <p>Setter for the field <code>activityList</code>.</p>
	 *
	 * @param activityList a {@link java.util.List} object.
	 */
	public void setActivityList(List<OpenActivity> activityList) {
		this.activityList = activityList;
	}
	/**
	 * <p>Getter for the field <code>activityList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OpenActivity> getActivityList( ) {
		return this.activityList;
	}

}
