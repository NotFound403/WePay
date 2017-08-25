package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 审核规则
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayItemAuditRule extends AlipayObject {

	private static final long serialVersionUID = 2494862426849576119L;

	/**
	 * 审核类型，商户授权模式此字段不需要填写。
	 */
	@ApiField("audit_type")
	private String auditType;

	/**
	 * true：需要审核、false：不需要审核，默认为不需要审核,商户授权模式此字段不需要填写。
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

	/**
	 * <p>Getter for the field <code>auditType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditType() {
		return this.auditType;
	}
	/**
	 * <p>Setter for the field <code>auditType</code>.</p>
	 *
	 * @param auditType a {@link java.lang.String} object.
	 */
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	/**
	 * <p>Getter for the field <code>needAudit</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getNeedAudit() {
		return this.needAudit;
	}
	/**
	 * <p>Setter for the field <code>needAudit</code>.</p>
	 *
	 * @param needAudit a {@link java.lang.Boolean} object.
	 */
	public void setNeedAudit(Boolean needAudit) {
		this.needAudit = needAudit;
	}

}
