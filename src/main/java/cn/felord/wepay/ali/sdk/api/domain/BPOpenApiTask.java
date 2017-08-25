package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 流程任务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BPOpenApiTask extends AlipayObject {

	private static final long serialVersionUID = 5325258191611476259L;

	/**
	 * 处理地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 详情展示地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 审批节点中文显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 审批节点code
	 */
	@ApiField("name")
	private String name;

	/**
	 * 可点击的操作
	 */
	@ApiField("operate_transition")
	private String operateTransition;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 处理人花名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 加签类型
	 */
	@ApiField("sign_type")
	private String signType;

	/**
	 * 状态:CREATED,TAKEN,TEMP_SAVE,COMPLETED,CANCELED
	 */
	@ApiField("state")
	private String state;

	/**
	 * 节点类型：UserTask，SystemTask
	 */
	@ApiField("type")
	private String type;

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
	 * <p>Getter for the field <code>operateTransition</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateTransition() {
		return this.operateTransition;
	}
	/**
	 * <p>Setter for the field <code>operateTransition</code>.</p>
	 *
	 * @param operateTransition a {@link java.lang.String} object.
	 */
	public void setOperateTransition(String operateTransition) {
		this.operateTransition = operateTransition;
	}

	/**
	 * <p>Getter for the field <code>operator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperator() {
		return this.operator;
	}
	/**
	 * <p>Setter for the field <code>operator</code>.</p>
	 *
	 * @param operator a {@link java.lang.String} object.
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * <p>Getter for the field <code>operatorName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorName() {
		return this.operatorName;
	}
	/**
	 * <p>Setter for the field <code>operatorName</code>.</p>
	 *
	 * @param operatorName a {@link java.lang.String} object.
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	/**
	 * <p>Getter for the field <code>signType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSignType() {
		return this.signType;
	}
	/**
	 * <p>Setter for the field <code>signType</code>.</p>
	 *
	 * @param signType a {@link java.lang.String} object.
	 */
	public void setSignType(String signType) {
		this.signType = signType;
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
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
