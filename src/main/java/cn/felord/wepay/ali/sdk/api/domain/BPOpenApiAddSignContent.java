package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 加签内容
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BPOpenApiAddSignContent extends AlipayObject {

	private static final long serialVersionUID = 2625822351591735988L;

	/**
	 * 自定义的条件跳转。JSON格式
	 */
	@ApiListField("additional_lines")
	@ApiField("string")
	private List<String> additionalLines;

	/**
	 * 任务处理人的域账号列表
	 */
	@ApiField("assignee")
	private String assignee;

	/**
	 * 自定义操作
	 */
	@ApiField("deal_actions")
	private String dealActions;

	/**
	 * 任务处理链接。如果不填，则使用流程平台默认地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 详情查看地址。如果不填写，则使用流程平台默认详情地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 处理节点展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * <p>Getter for the field <code>additionalLines</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getAdditionalLines() {
		return this.additionalLines;
	}
	/**
	 * <p>Setter for the field <code>additionalLines</code>.</p>
	 *
	 * @param additionalLines a {@link java.util.List} object.
	 */
	public void setAdditionalLines(List<String> additionalLines) {
		this.additionalLines = additionalLines;
	}

	/**
	 * <p>Getter for the field <code>assignee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssignee() {
		return this.assignee;
	}
	/**
	 * <p>Setter for the field <code>assignee</code>.</p>
	 *
	 * @param assignee a {@link java.lang.String} object.
	 */
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	/**
	 * <p>Getter for the field <code>dealActions</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDealActions() {
		return this.dealActions;
	}
	/**
	 * <p>Setter for the field <code>dealActions</code>.</p>
	 *
	 * @param dealActions a {@link java.lang.String} object.
	 */
	public void setDealActions(String dealActions) {
		this.dealActions = dealActions;
	}

	/**
	 * <p>Getter for the field <code>dealUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDealUrl() {
		return this.dealUrl;
	}
	/**
	 * <p>Setter for the field <code>dealUrl</code>.</p>
	 *
	 * @param dealUrl a {@link java.lang.String} object.
	 */
	public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}

	/**
	 * <p>Getter for the field <code>detailUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDetailUrl() {
		return this.detailUrl;
	}
	/**
	 * <p>Setter for the field <code>detailUrl</code>.</p>
	 *
	 * @param detailUrl a {@link java.lang.String} object.
	 */
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	/**
	 * <p>Getter for the field <code>displayName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayName() {
		return this.displayName;
	}
	/**
	 * <p>Setter for the field <code>displayName</code>.</p>
	 *
	 * @param displayName a {@link java.lang.String} object.
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
