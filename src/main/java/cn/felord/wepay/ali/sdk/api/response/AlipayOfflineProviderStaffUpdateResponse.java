package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.staff.update response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderStaffUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3332646238929398794L;

	/** 
	 * 同步失败错误原因信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 同步操作完成后的结果
	 */
	@ApiField("operate_result")
	private String operateResult;

	/** 
	 * 同步员工的操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 员工pid
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 服务商员工staff_id
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * <p>Setter for the field <code>errorMsg</code>.</p>
	 *
	 * @param errorMsg a {@link java.lang.String} object.
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * <p>Getter for the field <code>errorMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	/**
	 * <p>Setter for the field <code>operateResult</code>.</p>
	 *
	 * @param operateResult a {@link java.lang.String} object.
	 */
	public void setOperateResult(String operateResult) {
		this.operateResult = operateResult;
	}
	/**
	 * <p>Getter for the field <code>operateResult</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateResult( ) {
		return this.operateResult;
	}

	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType( ) {
		return this.operateType;
	}

	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid( ) {
		return this.pid;
	}

	/**
	 * <p>Setter for the field <code>staffId</code>.</p>
	 *
	 * @param staffId a {@link java.lang.String} object.
	 */
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	/**
	 * <p>Getter for the field <code>staffId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStaffId( ) {
		return this.staffId;
	}

}
