package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支用放款流水
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LendingRecords extends AlipayObject {

	private static final long serialVersionUID = 2743163648539521382L;

	/**
	 * 放款时间，精确到天
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 放款流水描述
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 放款额度，精确到小数点2位，单位（元）
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * <p>Getter for the field <code>date</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDate() {
		return this.date;
	}
	/**
	 * <p>Setter for the field <code>date</code>.</p>
	 *
	 * @param date a {@link java.util.Date} object.
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount() {
		return this.totalAmount;
	}
	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
