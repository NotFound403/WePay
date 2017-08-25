package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 集分宝账户流水详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PointAccountLog extends AlipayObject {

	private static final long serialVersionUID = 5557418567556732444L;

	/**
	 * 账务流水号,与"我的集分宝"页面流水号保持一致
	 */
	@ApiField("account_log_id")
	private String accountLogId;

	/**
	 * 该笔交易后该账户余额，值为集分宝个数
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号,集分宝充值时淘宝传递给微账务的订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易金额,集分宝个数,如果个数小于0则是支出,大于0是收入
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * 子交易代码
	 */
	@ApiField("sub_trans_code")
	private String subTransCode;

	/**
	 * 子交易代码对应中文翻译,如果不想依赖我们的枚举可以使用这个值
	 */
	@ApiField("sub_trans_code_cn")
	private String subTransCodeCn;

	/**
	 * 交易代码
	 */
	@ApiField("trans_code")
	private String transCode;

	/**
	 * 账务执行时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	/**
	 * 交易备注信息
	 */
	@ApiField("trans_memo")
	private String transMemo;

	/**
	 * <p>Getter for the field <code>accountLogId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountLogId() {
		return this.accountLogId;
	}
	/**
	 * <p>Setter for the field <code>accountLogId</code>.</p>
	 *
	 * @param accountLogId a {@link java.lang.String} object.
	 */
	public void setAccountLogId(String accountLogId) {
		this.accountLogId = accountLogId;
	}

	/**
	 * <p>Getter for the field <code>balance</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBalance() {
		return this.balance;
	}
	/**
	 * <p>Setter for the field <code>balance</code>.</p>
	 *
	 * @param balance a {@link java.lang.Long} object.
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>pointAmount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPointAmount() {
		return this.pointAmount;
	}
	/**
	 * <p>Setter for the field <code>pointAmount</code>.</p>
	 *
	 * @param pointAmount a {@link java.lang.Long} object.
	 */
	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

	/**
	 * <p>Getter for the field <code>subTransCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubTransCode() {
		return this.subTransCode;
	}
	/**
	 * <p>Setter for the field <code>subTransCode</code>.</p>
	 *
	 * @param subTransCode a {@link java.lang.String} object.
	 */
	public void setSubTransCode(String subTransCode) {
		this.subTransCode = subTransCode;
	}

	/**
	 * <p>Getter for the field <code>subTransCodeCn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubTransCodeCn() {
		return this.subTransCodeCn;
	}
	/**
	 * <p>Setter for the field <code>subTransCodeCn</code>.</p>
	 *
	 * @param subTransCodeCn a {@link java.lang.String} object.
	 */
	public void setSubTransCodeCn(String subTransCodeCn) {
		this.subTransCodeCn = subTransCodeCn;
	}

	/**
	 * <p>Getter for the field <code>transCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransCode() {
		return this.transCode;
	}
	/**
	 * <p>Setter for the field <code>transCode</code>.</p>
	 *
	 * @param transCode a {@link java.lang.String} object.
	 */
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	/**
	 * <p>Getter for the field <code>transDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getTransDate() {
		return this.transDate;
	}
	/**
	 * <p>Setter for the field <code>transDate</code>.</p>
	 *
	 * @param transDate a {@link java.util.Date} object.
	 */
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	/**
	 * <p>Getter for the field <code>transMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransMemo() {
		return this.transMemo;
	}
	/**
	 * <p>Setter for the field <code>transMemo</code>.</p>
	 *
	 * @param transMemo a {@link java.lang.String} object.
	 */
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
