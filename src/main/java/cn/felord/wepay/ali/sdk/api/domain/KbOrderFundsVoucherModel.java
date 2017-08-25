package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑订单资金凭证列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbOrderFundsVoucherModel extends AlipayObject {

	private static final long serialVersionUID = 2553231494684545214L;

	/**
	 * 资金流入账户,打款动作存在该字段
	 */
	@ApiField("account")
	private String account;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资金凭证ID
	 */
	@ApiField("funds_voucher_no")
	private String fundsVoucherNo;

	/**
	 * 资金流转发生时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 门店ID，打款动作存在该字段
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 资金流入外部门店ID，打款时存在该字段
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 资金类型  PAY/SETTLE/REFUND 对应 支付／打款／退款
	 */
	@ApiField("trans_type")
	private String transType;

	/**
	 * <p>Getter for the field <code>account</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccount() {
		return this.account;
	}
	/**
	 * <p>Setter for the field <code>account</code>.</p>
	 *
	 * @param account a {@link java.lang.String} object.
	 */
	public void setAccount(String account) {
		this.account = account;
	}

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
	 * <p>Getter for the field <code>fundsVoucherNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundsVoucherNo() {
		return this.fundsVoucherNo;
	}
	/**
	 * <p>Setter for the field <code>fundsVoucherNo</code>.</p>
	 *
	 * @param fundsVoucherNo a {@link java.lang.String} object.
	 */
	public void setFundsVoucherNo(String fundsVoucherNo) {
		this.fundsVoucherNo = fundsVoucherNo;
	}

	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.util.Date} object.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * <p>Getter for the field <code>storeId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStoreId() {
		return this.storeId;
	}
	/**
	 * <p>Setter for the field <code>storeId</code>.</p>
	 *
	 * @param storeId a {@link java.lang.String} object.
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
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
