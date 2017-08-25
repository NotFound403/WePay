package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券的集合信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CodeNOList extends AlipayObject {

	private static final long serialVersionUID = 6396431933693992251L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 对应TP活动码
	 */
	@ApiField("code_no")
	private String codeNo;

	/**
	 * 如果ticket_type为油券，则该字段1:石化，2:石油
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 券类型,1:油券
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 有效期
	 */
	@ApiField("valid_date")
	private String validDate;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
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
	 * <p>Getter for the field <code>subType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubType() {
		return this.subType;
	}
	/**
	 * <p>Setter for the field <code>subType</code>.</p>
	 *
	 * @param subType a {@link java.lang.String} object.
	 */
	public void setSubType(String subType) {
		this.subType = subType;
	}

	/**
	 * <p>Getter for the field <code>ticketType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTicketType() {
		return this.ticketType;
	}
	/**
	 * <p>Setter for the field <code>ticketType</code>.</p>
	 *
	 * @param ticketType a {@link java.lang.String} object.
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	/**
	 * <p>Getter for the field <code>validDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValidDate() {
		return this.validDate;
	}
	/**
	 * <p>Setter for the field <code>validDate</code>.</p>
	 *
	 * @param validDate a {@link java.lang.String} object.
	 */
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
