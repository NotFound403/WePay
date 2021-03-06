package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.add response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppBillAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2264629912997439912L;

	/** 
	 * 支付宝的业务订单号，具有唯一性。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 外部订单号，由于对账时回传给外部商户
	 */
	@ApiField("bank_bill_no")
	private String bankBillNo;

	/** 
	 * 账单的账期，例如201203表示2012年3月的账单。
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 出账机构中文名称。
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/** 
	 * 扩展属性，该属性值现在用于确保只有一个人可以支付成功
用法：多个人对同一笔外部欠费单创建多个账单时，确保该值不变
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 输出机构的业务流水号，需要保证唯一性。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 拥有该账单的用户姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 账单的服务费
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

	/**
	 * <p>Setter for the field <code>alipayOrderNo</code>.</p>
	 *
	 * @param alipayOrderNo a {@link java.lang.String} object.
	 */
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	/**
	 * <p>Getter for the field <code>alipayOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	/**
	 * <p>Setter for the field <code>bankBillNo</code>.</p>
	 *
	 * @param bankBillNo a {@link java.lang.String} object.
	 */
	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}
	/**
	 * <p>Getter for the field <code>bankBillNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankBillNo( ) {
		return this.bankBillNo;
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
	 * <p>Getter for the field <code>billDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillDate( ) {
		return this.billDate;
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
	 * <p>Getter for the field <code>billKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillKey( ) {
		return this.billKey;
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
	 * <p>Getter for the field <code>chargeInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	/**
	 * <p>Setter for the field <code>chargeInstName</code>.</p>
	 *
	 * @param chargeInstName a {@link java.lang.String} object.
	 */
	public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}
	/**
	 * <p>Getter for the field <code>chargeInstName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInstName( ) {
		return this.chargeInstName;
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
	 * <p>Getter for the field <code>extendField</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendField( ) {
		return this.extendField;
	}

	/**
	 * <p>Setter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @param merchantOrderNo a {@link java.lang.String} object.
	 */
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	/**
	 * <p>Getter for the field <code>merchantOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
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
	 * <p>Getter for the field <code>orderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderType( ) {
		return this.orderType;
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
	 * <p>Getter for the field <code>ownerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerName( ) {
		return this.ownerName;
	}

	/**
	 * <p>Setter for the field <code>payAmount</code>.</p>
	 *
	 * @param payAmount a {@link java.lang.String} object.
	 */
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	/**
	 * <p>Getter for the field <code>payAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmount( ) {
		return this.payAmount;
	}

	/**
	 * <p>Setter for the field <code>serviceAmount</code>.</p>
	 *
	 * @param serviceAmount a {@link java.lang.String} object.
	 */
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	/**
	 * <p>Getter for the field <code>serviceAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceAmount( ) {
		return this.serviceAmount;
	}

	/**
	 * <p>Setter for the field <code>subOrderType</code>.</p>
	 *
	 * @param subOrderType a {@link java.lang.String} object.
	 */
	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}
	/**
	 * <p>Getter for the field <code>subOrderType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubOrderType( ) {
		return this.subOrderType;
	}

}
