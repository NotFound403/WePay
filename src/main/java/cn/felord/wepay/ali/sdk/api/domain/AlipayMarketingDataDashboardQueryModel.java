package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 仪表盘查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataDashboardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8144897319658267184L;

	/**
	 * 仪表盘ID
	 */
	@ApiField("dashboard_id")
	private String dashboardId;

	/**
	 * 仪表盘过滤条件
	 */
	@ApiListField("param")
	@ApiField("dashboard_param")
	private List<DashboardParam> param;

	/**
	 * <p>Getter for the field <code>dashboardId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDashboardId() {
		return this.dashboardId;
	}
	/**
	 * <p>Setter for the field <code>dashboardId</code>.</p>
	 *
	 * @param dashboardId a {@link java.lang.String} object.
	 */
	public void setDashboardId(String dashboardId) {
		this.dashboardId = dashboardId;
	}

	/**
	 * <p>Getter for the field <code>param</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<DashboardParam> getParam() {
		return this.param;
	}
	/**
	 * <p>Setter for the field <code>param</code>.</p>
	 *
	 * @param param a {@link java.util.List} object.
	 */
	public void setParam(List<DashboardParam> param) {
		this.param = param;
	}

}
