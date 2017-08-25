package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 仪表盘取消授权
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataDashboardCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8619631849665724699L;

	/**
	 * 批量取消仪表盘授权
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
