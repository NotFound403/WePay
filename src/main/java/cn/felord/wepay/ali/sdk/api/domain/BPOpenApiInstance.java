package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 流程实例
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BPOpenApiInstance extends AlipayObject {

	private static final long serialVersionUID = 4312222187187149575L;

	/**
	 * 业务上下文，JSON格式
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 创建人域账号
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 流程实例描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 创建到完成的毫秒数，未完结为0
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 完结时间,未完结时为空
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 最后更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最后更新人域账号
	 */
	@ApiField("modify_user")
	private String modifyUser;

	/**
	 * 流程配置名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父流程实例ID。用于描述父子流程
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 父流程实例所处的节点
	 */
	@ApiField("parent_node")
	private String parentNode;

	/**
	 * 优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * 前置流程ID。用于描述流程串联
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 前置流程从哪个节点发起的本流程
	 */
	@ApiField("source_node_name")
	private String sourceNodeName;

	/**
	 * 流程实例状态:CREATED,PROCESSING,COMPLETED,CANCELED
	 */
	@ApiField("state")
	private String state;

	/**
	 * 包含的任务列表
	 */
	@ApiListField("tasks")
	@ApiField("b_p_open_api_task")
	private List<BPOpenApiTask> tasks;

	/**
	 * <p>Getter for the field <code>bizContext</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizContext() {
		return this.bizContext;
	}
	/**
	 * <p>Setter for the field <code>bizContext</code>.</p>
	 *
	 * @param bizContext a {@link java.lang.String} object.
	 */
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	/**
	 * <p>Getter for the field <code>bizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizId() {
		return this.bizId;
	}
	/**
	 * <p>Setter for the field <code>bizId</code>.</p>
	 *
	 * @param bizId a {@link java.lang.String} object.
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	/**
	 * <p>Getter for the field <code>createUser</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateUser() {
		return this.createUser;
	}
	/**
	 * <p>Setter for the field <code>createUser</code>.</p>
	 *
	 * @param createUser a {@link java.lang.String} object.
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * <p>Getter for the field <code>duration</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getDuration() {
		return this.duration;
	}
	/**
	 * <p>Setter for the field <code>duration</code>.</p>
	 *
	 * @param duration a {@link java.lang.Long} object.
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.util.Date} object.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.util.Date} object.
	 */
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>gmtModified</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtModified() {
		return this.gmtModified;
	}
	/**
	 * <p>Setter for the field <code>gmtModified</code>.</p>
	 *
	 * @param gmtModified a {@link java.util.Date} object.
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * <p>Getter for the field <code>ipRoleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIpRoleId() {
		return this.ipRoleId;
	}
	/**
	 * <p>Setter for the field <code>ipRoleId</code>.</p>
	 *
	 * @param ipRoleId a {@link java.lang.String} object.
	 */
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	/**
	 * <p>Getter for the field <code>modifyUser</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModifyUser() {
		return this.modifyUser;
	}
	/**
	 * <p>Setter for the field <code>modifyUser</code>.</p>
	 *
	 * @param modifyUser a {@link java.lang.String} object.
	 */
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>parentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParentId() {
		return this.parentId;
	}
	/**
	 * <p>Setter for the field <code>parentId</code>.</p>
	 *
	 * @param parentId a {@link java.lang.String} object.
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * <p>Getter for the field <code>parentNode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParentNode() {
		return this.parentNode;
	}
	/**
	 * <p>Setter for the field <code>parentNode</code>.</p>
	 *
	 * @param parentNode a {@link java.lang.String} object.
	 */
	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}

	/**
	 * <p>Getter for the field <code>priority</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPriority() {
		return this.priority;
	}
	/**
	 * <p>Setter for the field <code>priority</code>.</p>
	 *
	 * @param priority a {@link java.lang.Long} object.
	 */
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * <p>Getter for the field <code>puid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPuid() {
		return this.puid;
	}
	/**
	 * <p>Setter for the field <code>puid</code>.</p>
	 *
	 * @param puid a {@link java.lang.String} object.
	 */
	public void setPuid(String puid) {
		this.puid = puid;
	}

	/**
	 * <p>Getter for the field <code>sourceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceId() {
		return this.sourceId;
	}
	/**
	 * <p>Setter for the field <code>sourceId</code>.</p>
	 *
	 * @param sourceId a {@link java.lang.String} object.
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * <p>Getter for the field <code>sourceNodeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceNodeName() {
		return this.sourceNodeName;
	}
	/**
	 * <p>Setter for the field <code>sourceNodeName</code>.</p>
	 *
	 * @param sourceNodeName a {@link java.lang.String} object.
	 */
	public void setSourceNodeName(String sourceNodeName) {
		this.sourceNodeName = sourceNodeName;
	}

	/**
	 * <p>Getter for the field <code>state</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * <p>Setter for the field <code>state</code>.</p>
	 *
	 * @param state a {@link java.lang.String} object.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * <p>Getter for the field <code>tasks</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BPOpenApiTask> getTasks() {
		return this.tasks;
	}
	/**
	 * <p>Setter for the field <code>tasks</code>.</p>
	 *
	 * @param tasks a {@link java.util.List} object.
	 */
	public void setTasks(List<BPOpenApiTask> tasks) {
		this.tasks = tasks;
	}

}
