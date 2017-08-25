package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 实时查询欠费单返回对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryInstBillInfo extends AlipayObject {

	private static final long serialVersionUID = 5338336984755659268L;

	/**
	 * 账单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账单日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 明细说明
	 */
	@ApiListField("bill_detail")
	@ApiField("query_inst_bill_detail")
	private List<QueryInstBillDetail> billDetail;

	/**
	 * 滞纳金
	 */
	@ApiField("bill_fines")
	private String billFines;

	/**
	 * 账单流水
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 户名
	 */
	@ApiField("bill_user_name")
	private String billUserName;

	/**
	 * JDBXINHUI
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 查询欠费单的惟一标识
	 */
	@ApiField("charge_uniq_id")
	private String chargeUniqId;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 销账机构给出账机构分配的ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 扩展属性
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 业务类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部流水号
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 错误信息
	 */
	@ApiField("return_message")
	private String returnMessage;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

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
	 * <p>Getter for the field <code>billDetail</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QueryInstBillDetail> getBillDetail() {
		return this.billDetail;
	}
	/**
	 * <p>Setter for the field <code>billDetail</code>.</p>
	 *
	 * @param billDetail a {@link java.util.List} object.
	 */
	public void setBillDetail(List<QueryInstBillDetail> billDetail) {
		this.billDetail = billDetail;
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
	 * <p>Getter for the field <code>billUserName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillUserName() {
		return this.billUserName;
	}
	/**
	 * <p>Setter for the field <code>billUserName</code>.</p>
	 *
	 * @param billUserName a {@link java.lang.String} object.
	 */
	public void setBillUserName(String billUserName) {
		this.billUserName = billUserName;
	}

	/**
	 * <p>Getter for the field <code>chargeInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInst() {
		return this.chargeInst;
	}
	/**
	 * <p>Setter for the field <code>chargeInst</code>.</p>
	 *
	 * @param chargeInst a {@link java.lang.String} object.
	 */
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	/**
	 * <p>Getter for the field <code>chargeUniqId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeUniqId() {
		return this.chargeUniqId;
	}
	/**
	 * <p>Setter for the field <code>chargeUniqId</code>.</p>
	 *
	 * @param chargeUniqId a {@link java.lang.String} object.
	 */
	public void setChargeUniqId(String chargeUniqId) {
		this.chargeUniqId = chargeUniqId;
	}

	/**
	 * <p>Getter for the field <code>chargeoffInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	/**
	 * <p>Setter for the field <code>chargeoffInst</code>.</p>
	 *
	 * @param chargeoffInst a {@link java.lang.String} object.
	 */
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	/**
	 * <p>Getter for the field <code>companyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyId() {
		return this.companyId;
	}
	/**
	 * <p>Setter for the field <code>companyId</code>.</p>
	 *
	 * @param companyId a {@link java.lang.String} object.
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	/**
	 * <p>Getter for the field <code>extend</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtend() {
		return this.extend;
	}
	/**
	 * <p>Setter for the field <code>extend</code>.</p>
	 *
	 * @param extend a {@link java.lang.String} object.
	 */
	public void setExtend(String extend) {
		this.extend = extend;
	}

	/**
	 * <p>Getter for the field <code>orderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderType() {
		return this.orderType;
	}
	/**
	 * <p>Setter for the field <code>orderType</code>.</p>
	 *
	 * @param orderType a {@link java.lang.String} object.
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * <p>Getter for the field <code>outId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutId() {
		return this.outId;
	}
	/**
	 * <p>Setter for the field <code>outId</code>.</p>
	 *
	 * @param outId a {@link java.lang.String} object.
	 */
	public void setOutId(String outId) {
		this.outId = outId;
	}

	/**
	 * <p>Getter for the field <code>returnMessage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReturnMessage() {
		return this.returnMessage;
	}
	/**
	 * <p>Setter for the field <code>returnMessage</code>.</p>
	 *
	 * @param returnMessage a {@link java.lang.String} object.
	 */
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	/**
	 * <p>Getter for the field <code>subOrderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubOrderType() {
		return this.subOrderType;
	}
	/**
	 * <p>Setter for the field <code>subOrderType</code>.</p>
	 *
	 * @param subOrderType a {@link java.lang.String} object.
	 */
	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

}
