package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 余利宝交易详情信息数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class YLBTransDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4786743364935184784L;

	/**
	 * 余利宝交易金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 交易到账时间
	 */
	@ApiField("trans_account_date")
	private Date transAccountDate;

	/**
	 * 交易时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	/**
	 * 交易名称，如正常申购、正常赎回、收益发放、份额强增、份额强减
	 */
	@ApiField("trans_name")
	private String transName;

	/**
	 * 交易状态，如success-成功、failure-失败、inprocess-进行中等
	 */
	@ApiField("trans_status")
	private String transStatus;

	/**
	 * 交易类型，如正常申购、正常赎回、收益发放、份额强增、份额强减
	 */
	@ApiField("trans_type")
	private String transType;

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
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo() {
		return this.bizNo;
	}
	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>transAccountDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getTransAccountDate() {
		return this.transAccountDate;
	}
	/**
	 * <p>Setter for the field <code>transAccountDate</code>.</p>
	 *
	 * @param transAccountDate a {@link java.util.Date} object.
	 */
	public void setTransAccountDate(Date transAccountDate) {
		this.transAccountDate = transAccountDate;
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
	 * <p>Getter for the field <code>transName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransName() {
		return this.transName;
	}
	/**
	 * <p>Setter for the field <code>transName</code>.</p>
	 *
	 * @param transName a {@link java.lang.String} object.
	 */
	public void setTransName(String transName) {
		this.transName = transName;
	}

	/**
	 * <p>Getter for the field <code>transStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransStatus() {
		return this.transStatus;
	}
	/**
	 * <p>Setter for the field <code>transStatus</code>.</p>
	 *
	 * @param transStatus a {@link java.lang.String} object.
	 */
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	/**
	 * <p>Getter for the field <code>transType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransType() {
		return this.transType;
	}
	/**
	 * <p>Setter for the field <code>transType</code>.</p>
	 *
	 * @param transType a {@link java.lang.String} object.
	 */
	public void setTransType(String transType) {
		this.transType = transType;
	}

}
