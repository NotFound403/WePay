package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * isv服务端日志同步格式
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ISVLogSync extends AlipayObject {

	private static final long serialVersionUID = 2449382215489378218L;

	/**
	 * 应用名
	 */
	@ApiField("application")
	private String application;

	/**
	 * isv自定义错误码， 该值传了表示接口调用业务失败或发生异常
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 异常堆栈
	 */
	@ApiField("exception_stack_trace")
	private String exceptionStackTrace;

	/**
	 * 执行时长，毫秒数。如果能取到尽量传入，涉及到接口耗时的监控
	 */
	@ApiField("execution_millis")
	private String executionMillis;

	/**
	 * 接口全限定名 包含远程rpc和内部调用
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * T 成功
F 失败
	 */
	@ApiField("success")
	private String success;

	/**
	 * 回流数据类型
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 时间戳
	 */
	@ApiField("timestamp")
	private String timestamp;

	/**
	 * <p>Getter for the field <code>application</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplication() {
		return this.application;
	}
	/**
	 * <p>Setter for the field <code>application</code>.</p>
	 *
	 * @param application a {@link java.lang.String} object.
	 */
	public void setApplication(String application) {
		this.application = application;
	}

	/**
	 * <p>Getter for the field <code>errorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorCode() {
		return this.errorCode;
	}
	/**
	 * <p>Setter for the field <code>errorCode</code>.</p>
	 *
	 * @param errorCode a {@link java.lang.String} object.
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * <p>Getter for the field <code>errorMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorMsg() {
		return this.errorMsg;
	}
	/**
	 * <p>Setter for the field <code>errorMsg</code>.</p>
	 *
	 * @param errorMsg a {@link java.lang.String} object.
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * <p>Getter for the field <code>exceptionStackTrace</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExceptionStackTrace() {
		return this.exceptionStackTrace;
	}
	/**
	 * <p>Setter for the field <code>exceptionStackTrace</code>.</p>
	 *
	 * @param exceptionStackTrace a {@link java.lang.String} object.
	 */
	public void setExceptionStackTrace(String exceptionStackTrace) {
		this.exceptionStackTrace = exceptionStackTrace;
	}

	/**
	 * <p>Getter for the field <code>executionMillis</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExecutionMillis() {
		return this.executionMillis;
	}
	/**
	 * <p>Setter for the field <code>executionMillis</code>.</p>
	 *
	 * @param executionMillis a {@link java.lang.String} object.
	 */
	public void setExecutionMillis(String executionMillis) {
		this.executionMillis = executionMillis;
	}

	/**
	 * <p>Getter for the field <code>interfaceName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInterfaceName() {
		return this.interfaceName;
	}
	/**
	 * <p>Setter for the field <code>interfaceName</code>.</p>
	 *
	 * @param interfaceName a {@link java.lang.String} object.
	 */
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSuccess() {
		return this.success;
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
	 * <p>Getter for the field <code>syncType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSyncType() {
		return this.syncType;
	}
	/**
	 * <p>Setter for the field <code>syncType</code>.</p>
	 *
	 * @param syncType a {@link java.lang.String} object.
	 */
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

	/**
	 * <p>Getter for the field <code>timestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTimestamp() {
		return this.timestamp;
	}
	/**
	 * <p>Setter for the field <code>timestamp</code>.</p>
	 *
	 * @param timestamp a {@link java.lang.String} object.
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
