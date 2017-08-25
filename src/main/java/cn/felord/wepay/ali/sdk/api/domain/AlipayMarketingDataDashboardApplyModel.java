package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 仪表盘授权
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataDashboardApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7218924924284276542L;

	/**
	 * 仪表盘ID列表
	 */
	@ApiListField("dashboard_ids")
	@ApiField("string")
	private List<String> dashboardIds;

	/**
	 * <p>Getter for the field <code>dashboardIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getDashboardIds() {
		return this.dashboardIds;
	}
	/**
	 * <p>Setter for the field <code>dashboardIds</code>.</p>
	 *
	 * @param dashboardIds a {@link java.util.List} object.
	 */
	public void setDashboardIds(List<String> dashboardIds) {
		this.dashboardIds = dashboardIds;
	}

}
