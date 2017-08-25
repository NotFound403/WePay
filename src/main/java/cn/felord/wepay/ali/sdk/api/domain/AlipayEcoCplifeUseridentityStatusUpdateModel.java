package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 社区物业业主鉴权状态更新
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoCplifeUseridentityStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 1788683927877585931L;

	/**
	 * 业务明细
	 */
	@ApiField("biz_details")
	private String bizDetails;

	/**
	 * 当前业务状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 业务单据ID
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * <p>Getter for the field <code>bizDetails</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizDetails() {
		return this.bizDetails;
	}
	/**
	 * <p>Setter for the field <code>bizDetails</code>.</p>
	 *
	 * @param bizDetails a {@link java.lang.String} object.
	 */
	public void setBizDetails(String bizDetails) {
		this.bizDetails = bizDetails;
	}

	/**
	 * <p>Getter for the field <code>bizState</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizState() {
		return this.bizState;
	}
	/**
	 * <p>Setter for the field <code>bizState</code>.</p>
	 *
	 * @param bizState a {@link java.lang.String} object.
	 */
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	/**
	 * <p>Getter for the field <code>reqId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReqId() {
		return this.reqId;
	}
	/**
	 * <p>Setter for the field <code>reqId</code>.</p>
	 *
	 * @param reqId a {@link java.lang.String} object.
	 */
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
