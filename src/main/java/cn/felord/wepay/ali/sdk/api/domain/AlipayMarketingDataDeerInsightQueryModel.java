package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取 H5 活动洞察信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataDeerInsightQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2577435854742987573L;

	/**
	 * 洞察名称，只能是数字、英文字母、横线或下划线
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 应用唯一标识
	 */
	@ApiField("app")
	private String app;

	/**
	 * 权限类型
	 */
	@ApiField("auth")
	private String auth;

	/**
	 * 如果未查询到洞察，是否强制新建一个返回
	 */
	@ApiField("force")
	private Boolean force;

	/**
	 * 是否强制更新该洞察为最新版洞察
	 */
	@ApiField("force_update")
	private Boolean forceUpdate;

	/**
	 * 业务空间唯一标识
	 */
	@ApiField("group_domain")
	private String groupDomain;

	/**
	 * 洞察唯一标识
	 */
	@ApiField("insight_domain")
	private String insightDomain;

	/**
	 * 业务指定的额外参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 调用服务的业务系统
	 */
	@ApiField("system")
	private String system;

	/**
	 * <p>Getter for the field <code>alias</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlias() {
		return this.alias;
	}
	/**
	 * <p>Setter for the field <code>alias</code>.</p>
	 *
	 * @param alias a {@link java.lang.String} object.
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * <p>Getter for the field <code>app</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApp() {
		return this.app;
	}
	/**
	 * <p>Setter for the field <code>app</code>.</p>
	 *
	 * @param app a {@link java.lang.String} object.
	 */
	public void setApp(String app) {
		this.app = app;
	}

	/**
	 * <p>Getter for the field <code>auth</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuth() {
		return this.auth;
	}
	/**
	 * <p>Setter for the field <code>auth</code>.</p>
	 *
	 * @param auth a {@link java.lang.String} object.
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}

	/**
	 * <p>Getter for the field <code>force</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getForce() {
		return this.force;
	}
	/**
	 * <p>Setter for the field <code>force</code>.</p>
	 *
	 * @param force a {@link java.lang.Boolean} object.
	 */
	public void setForce(Boolean force) {
		this.force = force;
	}

	/**
	 * <p>Getter for the field <code>forceUpdate</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getForceUpdate() {
		return this.forceUpdate;
	}
	/**
	 * <p>Setter for the field <code>forceUpdate</code>.</p>
	 *
	 * @param forceUpdate a {@link java.lang.Boolean} object.
	 */
	public void setForceUpdate(Boolean forceUpdate) {
		this.forceUpdate = forceUpdate;
	}

	/**
	 * <p>Getter for the field <code>groupDomain</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupDomain() {
		return this.groupDomain;
	}
	/**
	 * <p>Setter for the field <code>groupDomain</code>.</p>
	 *
	 * @param groupDomain a {@link java.lang.String} object.
	 */
	public void setGroupDomain(String groupDomain) {
		this.groupDomain = groupDomain;
	}

	/**
	 * <p>Getter for the field <code>insightDomain</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInsightDomain() {
		return this.insightDomain;
	}
	/**
	 * <p>Setter for the field <code>insightDomain</code>.</p>
	 *
	 * @param insightDomain a {@link java.lang.String} object.
	 */
	public void setInsightDomain(String insightDomain) {
		this.insightDomain = insightDomain;
	}

	/**
	 * <p>Getter for the field <code>params</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParams() {
		return this.params;
	}
	/**
	 * <p>Setter for the field <code>params</code>.</p>
	 *
	 * @param params a {@link java.lang.String} object.
	 */
	public void setParams(String params) {
		this.params = params;
	}

	/**
	 * <p>Getter for the field <code>system</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSystem() {
		return this.system;
	}
	/**
	 * <p>Setter for the field <code>system</code>.</p>
	 *
	 * @param system a {@link java.lang.String} object.
	 */
	public void setSystem(String system) {
		this.system = system;
	}

}
