package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 发票申请模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5766897282359754491L;

	/**
	 * 复核人
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 操作员
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 不含税金额
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

	/**
	 * 发票金额（加税合计）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票内容项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_apply_open_model")
	private List<InvoiceItemApplyOpenModel> invoiceContent;

	/**
	 * 发票类型：
增值税普通电子发票(PLAIN)
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title")
	private InvoiceTitleApplyOpenModel invoiceTitle;

	/**
	 * 仅用于红冲，对应红冲对应的原始蓝票的发票代码，红冲时该字段必填，开蓝票时该字段不需填
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 仅用于红冲，对应红冲对应的原始蓝票的发票号码，红冲时该字段必填，开蓝票时该字段不需填
	 */
	@ApiField("ori_blue_inv_no")
	private String oriBlueInvNo;

	/**
	 * 发起方生成的开票申请唯一id，要求发起方全局唯一，支付宝依据其进行幂等控制。
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 申请开票对应的商户交易流水号，该流水号必须保证在同商户范围内全局唯一。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 销售方地址
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/**
	 * 销售方开户账户
	 */
	@ApiField("payee_bank_account")
	private String payeeBankAccount;

	/**
	 * 销售方开户行
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/**
	 * 销售方名称，对应于销售方纳税人识别号的名称
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/**
	 * 销售方纳税人识别号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 销售方电话
	 */
	@ApiField("payee_tel")
	private String payeeTel;

	/**
	 * 购买方联系方式-邮箱，商家开蓝票时，该字段必填，使用该邮箱向购买方发送发票pdf文件。其它情况均可不传
	 */
	@ApiField("payer_contact_email")
	private String payerContactEmail;

	/**
	 * 购买方联系方式，依据税控厂商的要求，如若底层税控对接的是浙江航信，该字段必传，其它情况可不传
	 */
	@ApiField("payer_contact_mobile")
	private String payerContactMobile;

	/**
	 * 合计税额
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/**
	 * 商户在税控服务开通后，税控厂商会向商户分配秘钥并提供token的生成方法，商户或ISV利用该方法生成token以获得此次调用的操作权限。目前对于阿里平台来说，不需要校验该权限，如果底层税控对接的是阿里平台的话，该字段可不填，其它的税控厂商该字段为必填
	 */
	@ApiField("tax_token")
	private String taxToken;

	/**
	 * 交易发生时间,依据税控厂商要求，目前底层税控对接的是浙江航信的话，该字段必填
	 */
	@ApiField("trade_date")
	private String tradeDate;

	/**
	 * <p>Getter for the field <code>checker</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChecker() {
		return this.checker;
	}
	/**
	 * <p>Setter for the field <code>checker</code>.</p>
	 *
	 * @param checker a {@link java.lang.String} object.
	 */
	public void setChecker(String checker) {
		this.checker = checker;
	}

	/**
	 * <p>Getter for the field <code>clerk</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClerk() {
		return this.clerk;
	}
	/**
	 * <p>Setter for the field <code>clerk</code>.</p>
	 *
	 * @param clerk a {@link java.lang.String} object.
	 */
	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	/**
	 * <p>Getter for the field <code>exTaxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExTaxAmount() {
		return this.exTaxAmount;
	}
	/**
	 * <p>Setter for the field <code>exTaxAmount</code>.</p>
	 *
	 * @param exTaxAmount a {@link java.lang.String} object.
	 */
	public void setExTaxAmount(String exTaxAmount) {
		this.exTaxAmount = exTaxAmount;
	}

	/**
	 * <p>Getter for the field <code>invoiceAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	/**
	 * <p>Setter for the field <code>invoiceAmount</code>.</p>
	 *
	 * @param invoiceAmount a {@link java.lang.String} object.
	 */
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	/**
	 * <p>Getter for the field <code>invoiceContent</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InvoiceItemApplyOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}
	/**
	 * <p>Setter for the field <code>invoiceContent</code>.</p>
	 *
	 * @param invoiceContent a {@link java.util.List} object.
	 */
	public void setInvoiceContent(List<InvoiceItemApplyOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	/**
	 * <p>Getter for the field <code>invoiceKind</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	/**
	 * <p>Setter for the field <code>invoiceKind</code>.</p>
	 *
	 * @param invoiceKind a {@link java.lang.String} object.
	 */
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	/**
	 * <p>Getter for the field <code>invoiceMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceMemo() {
		return this.invoiceMemo;
	}
	/**
	 * <p>Setter for the field <code>invoiceMemo</code>.</p>
	 *
	 * @param invoiceMemo a {@link java.lang.String} object.
	 */
	public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
	}

	/**
	 * <p>Getter for the field <code>invoiceTitle</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceTitleApplyOpenModel} object.
	 */
	public InvoiceTitleApplyOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}
	/**
	 * <p>Setter for the field <code>invoiceTitle</code>.</p>
	 *
	 * @param invoiceTitle a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceTitleApplyOpenModel} object.
	 */
	public void setInvoiceTitle(InvoiceTitleApplyOpenModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	/**
	 * <p>Getter for the field <code>oriBlueInvCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriBlueInvCode() {
		return this.oriBlueInvCode;
	}
	/**
	 * <p>Setter for the field <code>oriBlueInvCode</code>.</p>
	 *
	 * @param oriBlueInvCode a {@link java.lang.String} object.
	 */
	public void setOriBlueInvCode(String oriBlueInvCode) {
		this.oriBlueInvCode = oriBlueInvCode;
	}

	/**
	 * <p>Getter for the field <code>oriBlueInvNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriBlueInvNo() {
		return this.oriBlueInvNo;
	}
	/**
	 * <p>Setter for the field <code>oriBlueInvNo</code>.</p>
	 *
	 * @param oriBlueInvNo a {@link java.lang.String} object.
	 */
	public void setOriBlueInvNo(String oriBlueInvNo) {
		this.oriBlueInvNo = oriBlueInvNo;
	}

	/**
	 * <p>Getter for the field <code>outApplyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutApplyId() {
		return this.outApplyId;
	}
	/**
	 * <p>Setter for the field <code>outApplyId</code>.</p>
	 *
	 * @param outApplyId a {@link java.lang.String} object.
	 */
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	/**
	 * <p>Getter for the field <code>outTradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	/**
	 * <p>Setter for the field <code>outTradeNo</code>.</p>
	 *
	 * @param outTradeNo a {@link java.lang.String} object.
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	/**
	 * <p>Getter for the field <code>payee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayee() {
		return this.payee;
	}
	/**
	 * <p>Setter for the field <code>payee</code>.</p>
	 *
	 * @param payee a {@link java.lang.String} object.
	 */
	public void setPayee(String payee) {
		this.payee = payee;
	}

	/**
	 * <p>Getter for the field <code>payeeAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeAddress() {
		return this.payeeAddress;
	}
	/**
	 * <p>Setter for the field <code>payeeAddress</code>.</p>
	 *
	 * @param payeeAddress a {@link java.lang.String} object.
	 */
	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	/**
	 * <p>Getter for the field <code>payeeBankAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeBankAccount() {
		return this.payeeBankAccount;
	}
	/**
	 * <p>Setter for the field <code>payeeBankAccount</code>.</p>
	 *
	 * @param payeeBankAccount a {@link java.lang.String} object.
	 */
	public void setPayeeBankAccount(String payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}

	/**
	 * <p>Getter for the field <code>payeeBankName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeBankName() {
		return this.payeeBankName;
	}
	/**
	 * <p>Setter for the field <code>payeeBankName</code>.</p>
	 *
	 * @param payeeBankName a {@link java.lang.String} object.
	 */
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}

	/**
	 * <p>Getter for the field <code>payeeRegisterName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeRegisterName() {
		return this.payeeRegisterName;
	}
	/**
	 * <p>Setter for the field <code>payeeRegisterName</code>.</p>
	 *
	 * @param payeeRegisterName a {@link java.lang.String} object.
	 */
	public void setPayeeRegisterName(String payeeRegisterName) {
		this.payeeRegisterName = payeeRegisterName;
	}

	/**
	 * <p>Getter for the field <code>payeeRegisterNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	/**
	 * <p>Setter for the field <code>payeeRegisterNo</code>.</p>
	 *
	 * @param payeeRegisterNo a {@link java.lang.String} object.
	 */
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	/**
	 * <p>Getter for the field <code>payeeTel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayeeTel() {
		return this.payeeTel;
	}
	/**
	 * <p>Setter for the field <code>payeeTel</code>.</p>
	 *
	 * @param payeeTel a {@link java.lang.String} object.
	 */
	public void setPayeeTel(String payeeTel) {
		this.payeeTel = payeeTel;
	}

	/**
	 * <p>Getter for the field <code>payerContactEmail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerContactEmail() {
		return this.payerContactEmail;
	}
	/**
	 * <p>Setter for the field <code>payerContactEmail</code>.</p>
	 *
	 * @param payerContactEmail a {@link java.lang.String} object.
	 */
	public void setPayerContactEmail(String payerContactEmail) {
		this.payerContactEmail = payerContactEmail;
	}

	/**
	 * <p>Getter for the field <code>payerContactMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayerContactMobile() {
		return this.payerContactMobile;
	}
	/**
	 * <p>Setter for the field <code>payerContactMobile</code>.</p>
	 *
	 * @param payerContactMobile a {@link java.lang.String} object.
	 */
	public void setPayerContactMobile(String payerContactMobile) {
		this.payerContactMobile = payerContactMobile;
	}

	/**
	 * <p>Getter for the field <code>sumTaxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSumTaxAmount() {
		return this.sumTaxAmount;
	}
	/**
	 * <p>Setter for the field <code>sumTaxAmount</code>.</p>
	 *
	 * @param sumTaxAmount a {@link java.lang.String} object.
	 */
	public void setSumTaxAmount(String sumTaxAmount) {
		this.sumTaxAmount = sumTaxAmount;
	}

	/**
	 * <p>Getter for the field <code>taxToken</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaxToken() {
		return this.taxToken;
	}
	/**
	 * <p>Setter for the field <code>taxToken</code>.</p>
	 *
	 * @param taxToken a {@link java.lang.String} object.
	 */
	public void setTaxToken(String taxToken) {
		this.taxToken = taxToken;
	}

	/**
	 * <p>Getter for the field <code>tradeDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeDate() {
		return this.tradeDate;
	}
	/**
	 * <p>Setter for the field <code>tradeDate</code>.</p>
	 *
	 * @param tradeDate a {@link java.lang.String} object.
	 */
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

}
