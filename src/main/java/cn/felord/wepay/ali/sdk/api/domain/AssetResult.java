package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物料生产订单处理结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AssetResult extends AlipayObject {

	private static final long serialVersionUID = 6544168842545832791L;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 是否处理成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * <p>Getter for the field <code>assignItemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssignItemId() {
		return this.assignItemId;
	}
	/**
	 * <p>Setter for the field <code>assignItemId</code>.</p>
	 *
	 * @param assignItemId a {@link java.lang.String} object.
	 */
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
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
	 * <p>Getter for the field <code>errorDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorDesc() {
		return this.errorDesc;
	}
	/**
	 * <p>Setter for the field <code>errorDesc</code>.</p>
	 *
	 * @param errorDesc a {@link java.lang.String} object.
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSuccess() {
		return this.success;
	}
	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.Boolean} object.
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
