package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.cs.channel.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayBossCsChannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8426431649133751941L;

	/** 
	 * 平均通话时长
	 */
	@ApiField("att")
	private String att;

	/** 
	 * 备注
	 */
	@ApiField("comment")
	private String comment;

	/** 
	 * 接通率
	 */
	@ApiField("connection_rate")
	private String connectionRate;

	/** 
	 * 通话中人数
	 */
	@ApiField("curr_agent_talking")
	private String currAgentTalking;

	/** 
	 * 在线小二数
	 */
	@ApiField("curr_agents_logged_in")
	private String currAgentsLoggedIn;

	/** 
	 * 排队数
	 */
	@ApiField("curr_number_waiting_calls")
	private String currNumberWaitingCalls;

	/** 
	 * 小休人数
	 */
	@ApiField("current_not_ready_agents")
	private String currentNotReadyAgents;

	/** 
	 * 等待人数
	 */
	@ApiField("current_ready_agents")
	private String currentReadyAgents;

	/** 
	 * 主键
	 */
	@ApiField("row_key")
	private String rowKey;

	/** 
	 * 流入量
	 */
	@ApiField("visitor_inflow")
	private String visitorInflow;

	/** 
	 * 应答量
	 */
	@ApiField("visitor_response")
	private String visitorResponse;

	/** 
	 * 应答量[转接]
	 */
	@ApiField("visitor_response_transfer")
	private String visitorResponseTransfer;

	/**
	 * <p>Setter for the field <code>att</code>.</p>
	 *
	 * @param att a {@link java.lang.String} object.
	 */
	public void setAtt(String att) {
		this.att = att;
	}
	/**
	 * <p>Getter for the field <code>att</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAtt( ) {
		return this.att;
	}

	/**
	 * <p>Setter for the field <code>comment</code>.</p>
	 *
	 * @param comment a {@link java.lang.String} object.
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * <p>Getter for the field <code>comment</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getComment( ) {
		return this.comment;
	}

	/**
	 * <p>Setter for the field <code>connectionRate</code>.</p>
	 *
	 * @param connectionRate a {@link java.lang.String} object.
	 */
	public void setConnectionRate(String connectionRate) {
		this.connectionRate = connectionRate;
	}
	/**
	 * <p>Getter for the field <code>connectionRate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConnectionRate( ) {
		return this.connectionRate;
	}

	/**
	 * <p>Setter for the field <code>currAgentTalking</code>.</p>
	 *
	 * @param currAgentTalking a {@link java.lang.String} object.
	 */
	public void setCurrAgentTalking(String currAgentTalking) {
		this.currAgentTalking = currAgentTalking;
	}
	/**
	 * <p>Getter for the field <code>currAgentTalking</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrAgentTalking( ) {
		return this.currAgentTalking;
	}

	/**
	 * <p>Setter for the field <code>currAgentsLoggedIn</code>.</p>
	 *
	 * @param currAgentsLoggedIn a {@link java.lang.String} object.
	 */
	public void setCurrAgentsLoggedIn(String currAgentsLoggedIn) {
		this.currAgentsLoggedIn = currAgentsLoggedIn;
	}
	/**
	 * <p>Getter for the field <code>currAgentsLoggedIn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrAgentsLoggedIn( ) {
		return this.currAgentsLoggedIn;
	}

	/**
	 * <p>Setter for the field <code>currNumberWaitingCalls</code>.</p>
	 *
	 * @param currNumberWaitingCalls a {@link java.lang.String} object.
	 */
	public void setCurrNumberWaitingCalls(String currNumberWaitingCalls) {
		this.currNumberWaitingCalls = currNumberWaitingCalls;
	}
	/**
	 * <p>Getter for the field <code>currNumberWaitingCalls</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrNumberWaitingCalls( ) {
		return this.currNumberWaitingCalls;
	}

	/**
	 * <p>Setter for the field <code>currentNotReadyAgents</code>.</p>
	 *
	 * @param currentNotReadyAgents a {@link java.lang.String} object.
	 */
	public void setCurrentNotReadyAgents(String currentNotReadyAgents) {
		this.currentNotReadyAgents = currentNotReadyAgents;
	}
	/**
	 * <p>Getter for the field <code>currentNotReadyAgents</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrentNotReadyAgents( ) {
		return this.currentNotReadyAgents;
	}

	/**
	 * <p>Setter for the field <code>currentReadyAgents</code>.</p>
	 *
	 * @param currentReadyAgents a {@link java.lang.String} object.
	 */
	public void setCurrentReadyAgents(String currentReadyAgents) {
		this.currentReadyAgents = currentReadyAgents;
	}
	/**
	 * <p>Getter for the field <code>currentReadyAgents</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrentReadyAgents( ) {
		return this.currentReadyAgents;
	}

	/**
	 * <p>Setter for the field <code>rowKey</code>.</p>
	 *
	 * @param rowKey a {@link java.lang.String} object.
	 */
	public void setRowKey(String rowKey) {
		this.rowKey = rowKey;
	}
	/**
	 * <p>Getter for the field <code>rowKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRowKey( ) {
		return this.rowKey;
	}

	/**
	 * <p>Setter for the field <code>visitorInflow</code>.</p>
	 *
	 * @param visitorInflow a {@link java.lang.String} object.
	 */
	public void setVisitorInflow(String visitorInflow) {
		this.visitorInflow = visitorInflow;
	}
	/**
	 * <p>Getter for the field <code>visitorInflow</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVisitorInflow( ) {
		return this.visitorInflow;
	}

	/**
	 * <p>Setter for the field <code>visitorResponse</code>.</p>
	 *
	 * @param visitorResponse a {@link java.lang.String} object.
	 */
	public void setVisitorResponse(String visitorResponse) {
		this.visitorResponse = visitorResponse;
	}
	/**
	 * <p>Getter for the field <code>visitorResponse</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVisitorResponse( ) {
		return this.visitorResponse;
	}

	/**
	 * <p>Setter for the field <code>visitorResponseTransfer</code>.</p>
	 *
	 * @param visitorResponseTransfer a {@link java.lang.String} object.
	 */
	public void setVisitorResponseTransfer(String visitorResponseTransfer) {
		this.visitorResponseTransfer = visitorResponseTransfer;
	}
	/**
	 * <p>Getter for the field <code>visitorResponseTransfer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVisitorResponseTransfer( ) {
		return this.visitorResponseTransfer;
	}

}
