package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 输出的机构账单模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class JfExportInstBillModel extends AlipayObject {

	private static final long serialVersionUID = 1128753684548197451L;

	/**
	 * 账单金额，单位为：RMB元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 余额，单位为：RMB元。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 滞纳金，单位为：RMB元。
	 */
	@ApiField("bill_fines")
	private String billFines;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构流水号
	 */
	@ApiField("inst_bill_no")
	private String instBillNo;

	/**
	 * 账单拥有者姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 唯一标识，每次查询均保证唯一性，但是不保证幂等性
	 */
	@ApiField("uniq_id")
	private String uniqId;

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
	 * <p>Getter for the field <code>balance</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBalance() {
		return this.balance;
	}
	/**
	 * <p>Setter for the field <code>balance</code>.</p>
	 *
	 * @param balance a {@link java.lang.String} object.
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	/**
	 * <p>Getter for the field <code>billDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillDate() {
		return this.billDate;
	}
	/**
	 * <p>Setter for the field <code>billDate</code>.</p>
	 *
	 * @param billDate a {@link java.lang.String} object.
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	/**
	 * <p>Getter for the field <code>billFines</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillFines() {
		return this.billFines;
	}
	/**
	 * <p>Setter for the field <code>billFines</code>.</p>
	 *
	 * @param billFines a {@link java.lang.String} object.
	 */
	public void setBillFines(String billFines) {
		this.billFines = billFines;
	}

	/**
	 * <p>Getter for the field <code>billKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillKey() {
		return this.billKey;
	}
	/**
	 * <p>Setter for the field <code>billKey</code>.</p>
	 *
	 * @param billKey a {@link java.lang.String} object.
	 */
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	/**
	 * <p>Getter for the field <code>extendField</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendField() {
		return this.extendField;
	}
	/**
	 * <p>Setter for the field <code>extendField</code>.</p>
	 *
	 * @param extendField a {@link java.lang.String} object.
	 */
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	/**
	 * <p>Getter for the field <code>instBillNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstBillNo() {
		return this.instBillNo;
	}
	/**
	 * <p>Setter for the field <code>instBillNo</code>.</p>
	 *
	 * @param instBillNo a {@link java.lang.String} object.
	 */
	public void setInstBillNo(String instBillNo) {
		this.instBillNo = instBillNo;
	}

	/**
	 * <p>Getter for the field <code>ownerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerName() {
		return this.ownerName;
	}
	/**
	 * <p>Setter for the field <code>ownerName</code>.</p>
	 *
	 * @param ownerName a {@link java.lang.String} object.
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * <p>Getter for the field <code>uniqId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqId() {
		return this.uniqId;
	}
	/**
	 * <p>Setter for the field <code>uniqId</code>.</p>
	 *
	 * @param uniqId a {@link java.lang.String} object.
	 */
	public void setUniqId(String uniqId) {
		this.uniqId = uniqId;
	}

}
