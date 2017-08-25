package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车主营销平台券核销结果通知
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarPromoTicketPushModel extends AlipayObject {

	private static final long serialVersionUID = 2574114948787355726L;

	/**
	 * 核销流水
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 核销状态，0：成功，1：失败
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 对应TP活动码
	 */
	@ApiField("code_no")
	private String codeNo;

	/**
	 * 券ID
	 */
	@ApiField("ticket_id")
	private String ticketId;

	/**
	 * <p>Getter for the field <code>applyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyNo() {
		return this.applyNo;
	}
	/**
	 * <p>Setter for the field <code>applyNo</code>.</p>
	 *
	 * @param applyNo a {@link java.lang.String} object.
	 */
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	/**
	 * <p>Getter for the field <code>applyStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyStatus() {
		return this.applyStatus;
	}
	/**
	 * <p>Setter for the field <code>applyStatus</code>.</p>
	 *
	 * @param applyStatus a {@link java.lang.String} object.
	 */
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	/**
	 * <p>Getter for the field <code>codeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeNo() {
		return this.codeNo;
	}
	/**
	 * <p>Setter for the field <code>codeNo</code>.</p>
	 *
	 * @param codeNo a {@link java.lang.String} object.
	 */
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	/**
	 * <p>Getter for the field <code>ticketId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTicketId() {
		return this.ticketId;
	}
	/**
	 * <p>Setter for the field <code>ticketId</code>.</p>
	 *
	 * @param ticketId a {@link java.lang.String} object.
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

}
