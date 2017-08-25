package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 仪表盘详细信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DashBoardMeta extends AlipayObject {

	private static final long serialVersionUID = 3411619532856586942L;

	/**
	 * 授权状态，值为true或者false
	 */
	@ApiField("auth_status")
	private Boolean authStatus;

	/**
	 * 仪表盘创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 仪表盘ID
	 */
	@ApiField("dashboard_id")
	private String dashboardId;

	/**
	 * 仪表盘名称
	 */
	@ApiField("dashboard_name")
	private String dashboardName;

	/**
	 * <p>Getter for the field <code>authStatus</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getAuthStatus() {
		return this.authStatus;
	}
	/**
	 * <p>Setter for the field <code>authStatus</code>.</p>
	 *
	 * @param authStatus a {@link java.lang.Boolean} object.
	 */
	public void setAuthStatus(Boolean authStatus) {
		this.authStatus = authStatus;
	}

	/**
	 * <p>Getter for the field <code>createTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateTime() {
		return this.createTime;
	}
	/**
	 * <p>Setter for the field <code>createTime</code>.</p>
	 *
	 * @param createTime a {@link java.lang.String} object.
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

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
	 * <p>Getter for the field <code>dashboardName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDashboardName() {
		return this.dashboardName;
	}
	/**
	 * <p>Setter for the field <code>dashboardName</code>.</p>
	 *
	 * @param dashboardName a {@link java.lang.String} object.
	 */
	public void setDashboardName(String dashboardName) {
		this.dashboardName = dashboardName;
	}

}
