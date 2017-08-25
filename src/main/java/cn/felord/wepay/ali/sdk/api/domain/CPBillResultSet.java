package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 社区物业平台物业费账单查询结果数据集合
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CPBillResultSet extends AlipayObject {

	private static final long serialVersionUID = 3646549226317431223L;

	/**
	 * 账期
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 费用类型
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 缴费截止日期
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 物业系统端房屋编号
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 出账日期
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 房屋门牌地址
	 */
	@ApiField("room_address")
	private String roomAddress;

	/**
	 * 账单条目当前状态，状态值：
FINISH_PAYMENT - 用户完成支付和销账
UNDER_PAYMENT - 账单锁定待用户完成支付
WAIT_PAYMENT - 待缴且未过缴费截止日期
OUT_OF_DATE - 未支付且已过缴费截止日期
	 */
	@ApiField("status")
	private String status;

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
	 * <p>Getter for the field <code>outRoomId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRoomId() {
		return this.outRoomId;
	}
	/**
	 * <p>Setter for the field <code>outRoomId</code>.</p>
	 *
	 * @param outRoomId a {@link java.lang.String} object.
	 */
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
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
