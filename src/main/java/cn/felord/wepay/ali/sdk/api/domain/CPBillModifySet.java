package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 社区物业平台待修改的物业费账单数据集合
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CPBillModifySet extends AlipayObject {

	private static final long serialVersionUID = 5739951181348977836L;

	/**
	 * 若账期需修改，则传入。账期用于缴费明细页归类和展示，可以使用不超过16个字符的有业务含义的字符串。
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 若应收金额需修改，则传入，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 待修改的物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 若费用类型需修改，则传入
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 若缴费截止日期需修改，则传入。格式固定为YYYYMMDD
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 若出账日期需修改，则传入，格式固定为YYYYMMDD
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 若房屋门牌地址需要修改，则传入该值
	 */
	@ApiField("room_address")
	private String roomAddress;

	/**
	 * <p>Getter for the field <code>acctPeriod</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAcctPeriod() {
		return this.acctPeriod;
	}
	/**
	 * <p>Setter for the field <code>acctPeriod</code>.</p>
	 *
	 * @param acctPeriod a {@link java.lang.String} object.
	 */
	public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

	/**
	 * <p>Getter for the field <code>billEntryAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillEntryAmount() {
		return this.billEntryAmount;
	}
	/**
	 * <p>Setter for the field <code>billEntryAmount</code>.</p>
	 *
	 * @param billEntryAmount a {@link java.lang.String} object.
	 */
	public void setBillEntryAmount(String billEntryAmount) {
		this.billEntryAmount = billEntryAmount;
	}

	/**
	 * <p>Getter for the field <code>billEntryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillEntryId() {
		return this.billEntryId;
	}
	/**
	 * <p>Setter for the field <code>billEntryId</code>.</p>
	 *
	 * @param billEntryId a {@link java.lang.String} object.
	 */
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

	/**
	 * <p>Getter for the field <code>costType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCostType() {
		return this.costType;
	}
	/**
	 * <p>Setter for the field <code>costType</code>.</p>
	 *
	 * @param costType a {@link java.lang.String} object.
	 */
	public void setCostType(String costType) {
		this.costType = costType;
	}

	/**
	 * <p>Getter for the field <code>deadline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeadline() {
		return this.deadline;
	}
	/**
	 * <p>Setter for the field <code>deadline</code>.</p>
	 *
	 * @param deadline a {@link java.lang.String} object.
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	/**
	 * <p>Getter for the field <code>releaseDay</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReleaseDay() {
		return this.releaseDay;
	}
	/**
	 * <p>Setter for the field <code>releaseDay</code>.</p>
	 *
	 * @param releaseDay a {@link java.lang.String} object.
	 */
	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	/**
	 * <p>Getter for the field <code>roomAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoomAddress() {
		return this.roomAddress;
	}
	/**
	 * <p>Setter for the field <code>roomAddress</code>.</p>
	 *
	 * @param roomAddress a {@link java.lang.String} object.
	 */
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}

}
