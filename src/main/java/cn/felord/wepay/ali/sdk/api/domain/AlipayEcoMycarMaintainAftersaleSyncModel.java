package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * ISV同步售后单状态
 *
 * @author auto create
 * @since 1.0, 2016-10-19 18:42:36
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

	public String getAftersaleNo() {
		return this.aftersaleNo;
	}
	public void setAftersaleNo(String aftersaleNo) {
		this.aftersaleNo = aftersaleNo;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}