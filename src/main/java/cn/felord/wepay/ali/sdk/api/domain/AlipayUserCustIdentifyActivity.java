package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * alipay.user.customer.identify接口专用结果对象，维护接口查询结果中的活动信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserCustIdentifyActivity extends AlipayObject {

	private static final long serialVersionUID = 3827119195424152918L;

	/**
	 * 活动扩展信息，预留字段。例如通过连接引导参加运营活动，包含活动链接（或者参与方式）及活动信息。
	 */
	@ApiField("activity_info")
	private String activityInfo;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * <p>Getter for the field <code>activityInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityInfo() {
		return this.activityInfo;
	}
	/**
	 * <p>Setter for the field <code>activityInfo</code>.</p>
	 *
	 * @param activityInfo a {@link java.lang.String} object.
	 */
	public void setActivityInfo(String activityInfo) {
		this.activityInfo = activityInfo;
	}

	/**
	 * <p>Getter for the field <code>activityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityName() {
		return this.activityName;
	}
	/**
	 * <p>Setter for the field <code>activityName</code>.</p>
	 *
	 * @param activityName a {@link java.lang.String} object.
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

}
