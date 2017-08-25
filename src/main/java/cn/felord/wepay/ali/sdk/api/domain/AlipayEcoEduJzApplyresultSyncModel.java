package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 兼职平台报名同步接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduJzApplyresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3182421641371141858L;

	/**
	 * 报名编号（通过调用报名信息同步接口返回）
	 */
	@ApiField("apply_third_id")
	private String applyThirdId;

	/**
	 * 备注
	 */
	@ApiField("audit_remark")
	private String auditRemark;

	/**
	 * 报名结果状态
	 */
	@ApiField("listing_status")
	private String listingStatus;

	/**
	 * <p>Getter for the field <code>applyThirdId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyThirdId() {
		return this.applyThirdId;
	}
	/**
	 * <p>Setter for the field <code>applyThirdId</code>.</p>
	 *
	 * @param applyThirdId a {@link java.lang.String} object.
	 */
	public void setApplyThirdId(String applyThirdId) {
		this.applyThirdId = applyThirdId;
	}

	/**
	 * <p>Getter for the field <code>auditRemark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditRemark() {
		return this.auditRemark;
	}
	/**
	 * <p>Setter for the field <code>auditRemark</code>.</p>
	 *
	 * @param auditRemark a {@link java.lang.String} object.
	 */
	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

	/**
	 * <p>Getter for the field <code>listingStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getListingStatus() {
		return this.listingStatus;
	}
	/**
	 * <p>Setter for the field <code>listingStatus</code>.</p>
	 *
	 * @param listingStatus a {@link java.lang.String} object.
	 */
	public void setListingStatus(String listingStatus) {
		this.listingStatus = listingStatus;
	}

}
