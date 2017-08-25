package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.promorulecenter.rule.analyze response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPromorulecenterRuleAnalyzeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4613613998148495286L;

	/** 
	 * 未通过条件描述信息
	 */
	@ApiField("fail_condition_msg")
	private String failConditionMsg;

	/** 
	 * 未通过的条件
	 */
	@ApiField("fail_condition_name")
	private String failConditionName;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 服务调用是否成功
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 规则是否通过
	 */
	@ApiField("triggered")
	private String triggered;

	/**
	 * <p>Setter for the field <code>failConditionMsg</code>.</p>
	 *
	 * @param failConditionMsg a {@link java.lang.String} object.
	 */
	public void setFailConditionMsg(String failConditionMsg) {
		this.failConditionMsg = failConditionMsg;
	}
	/**
	 * <p>Getter for the field <code>failConditionMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFailConditionMsg( ) {
		return this.failConditionMsg;
	}

	/**
	 * <p>Setter for the field <code>failConditionName</code>.</p>
	 *
	 * @param failConditionName a {@link java.lang.String} object.
	 */
	public void setFailConditionName(String failConditionName) {
		this.failConditionName = failConditionName;
	}
	/**
	 * <p>Getter for the field <code>failConditionName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFailConditionName( ) {
		return this.failConditionName;
	}

	/**
	 * <p>Setter for the field <code>resultCode</code>.</p>
	 *
	 * @param resultCode a {@link java.lang.String} object.
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * <p>Getter for the field <code>resultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultCode( ) {
		return this.resultCode;
	}

	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.String} object.
	 */
	public void setSuccess(String success) {
		this.success = success;
	}
	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSuccess( ) {
		return this.success;
	}

	/**
	 * <p>Setter for the field <code>triggered</code>.</p>
	 *
	 * @param triggered a {@link java.lang.String} object.
	 */
	public void setTriggered(String triggered) {
		this.triggered = triggered;
	}
	/**
	 * <p>Getter for the field <code>triggered</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTriggered( ) {
		return this.triggered;
	}

}
