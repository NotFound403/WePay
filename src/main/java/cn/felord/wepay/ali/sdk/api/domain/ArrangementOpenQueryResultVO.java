package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 合约查询结果bean
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ArrangementOpenQueryResultVO extends AlipayObject {

	private static final long serialVersionUID = 7413392213262323699L;

	/**
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 合约状态
未生效：UN_INVALID
已取消：CANCEL
已生效：VALID
已失效：INVALID
	 */
	@ApiField("ar_status")
	private String arStatus;

	/**
	 * JSON结构的扩展字段，备用字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 有效期截止时间
	 */
	@ApiField("invalid_date")
	private Date invalidDate;

	/**
	 * 签约时间
	 */
	@ApiField("sign_date")
	private Date signDate;

	/**
	 * 有效期起始时间
	 */
	@ApiField("valid_date")
	private Date validDate;

	/**
	 * <p>Getter for the field <code>arNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArNo() {
		return this.arNo;
	}
	/**
	 * <p>Setter for the field <code>arNo</code>.</p>
	 *
	 * @param arNo a {@link java.lang.String} object.
	 */
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	/**
	 * <p>Getter for the field <code>arStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getArStatus() {
		return this.arStatus;
	}
	/**
	 * <p>Setter for the field <code>arStatus</code>.</p>
	 *
	 * @param arStatus a {@link java.lang.String} object.
	 */
	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}

	/**
	 * <p>Getter for the field <code>extData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtData() {
		return this.extData;
	}
	/**
	 * <p>Setter for the field <code>extData</code>.</p>
	 *
	 * @param extData a {@link java.lang.String} object.
	 */
	public void setExtData(String extData) {
		this.extData = extData;
	}

	/**
	 * <p>Getter for the field <code>invalidDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getInvalidDate() {
		return this.invalidDate;
	}
	/**
	 * <p>Setter for the field <code>invalidDate</code>.</p>
	 *
	 * @param invalidDate a {@link java.util.Date} object.
	 */
	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	/**
	 * <p>Getter for the field <code>signDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getSignDate() {
		return this.signDate;
	}
	/**
	 * <p>Setter for the field <code>signDate</code>.</p>
	 *
	 * @param signDate a {@link java.util.Date} object.
	 */
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	/**
	 * <p>Getter for the field <code>validDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getValidDate() {
		return this.validDate;
	}
	/**
	 * <p>Setter for the field <code>validDate</code>.</p>
	 *
	 * @param validDate a {@link java.util.Date} object.
	 */
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

}
