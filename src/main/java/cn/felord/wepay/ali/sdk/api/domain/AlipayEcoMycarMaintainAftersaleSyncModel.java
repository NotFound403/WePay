package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISV同步售后单状态
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainAftersaleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2597395955433511255L;

	/**
	 * 车主平台售后编号
	 */
	@ApiField("aftersale_no")
	private String aftersaleNo;

	/**
	 * 客服拒绝退款原因描述
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 1：受理 2：拒绝
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>aftersaleNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAftersaleNo() {
		return this.aftersaleNo;
	}
	/**
	 * <p>Setter for the field <code>aftersaleNo</code>.</p>
	 *
	 * @param aftersaleNo a {@link java.lang.String} object.
	 */
	public void setAftersaleNo(String aftersaleNo) {
		this.aftersaleNo = aftersaleNo;
	}

	/**
	 * <p>Getter for the field <code>refuseReason</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefuseReason() {
		return this.refuseReason;
	}
	/**
	 * <p>Setter for the field <code>refuseReason</code>.</p>
	 *
	 * @param refuseReason a {@link java.lang.String} object.
	 */
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
