package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 行业平台外部查询请求
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDataExternalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6199851688886277563L;

	/**
	 * external_system_name
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/**
	 * is_transfer_uid
	 */
	@ApiField("is_transfer_uid")
	private Boolean isTransferUid;

	/**
	 * operate_type
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * query_condition
	 */
	@ApiField("query_condition")
	private String queryCondition;

	/**
	 * <p>Getter for the field <code>externalSystemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalSystemName() {
		return this.externalSystemName;
	}
	/**
	 * <p>Setter for the field <code>externalSystemName</code>.</p>
	 *
	 * @param externalSystemName a {@link java.lang.String} object.
	 */
	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

	/**
	 * <p>Getter for the field <code>isTransferUid</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsTransferUid() {
		return this.isTransferUid;
	}
	/**
	 * <p>Setter for the field <code>isTransferUid</code>.</p>
	 *
	 * @param isTransferUid a {@link java.lang.Boolean} object.
	 */
	public void setIsTransferUid(Boolean isTransferUid) {
		this.isTransferUid = isTransferUid;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
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
	 * <p>Getter for the field <code>queryCondition</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQueryCondition() {
		return this.queryCondition;
	}
	/**
	 * <p>Setter for the field <code>queryCondition</code>.</p>
	 *
	 * @param queryCondition a {@link java.lang.String} object.
	 */
	public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
	}

}
