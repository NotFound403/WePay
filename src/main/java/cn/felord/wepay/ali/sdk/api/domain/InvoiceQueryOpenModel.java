package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 发票查询输出模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceQueryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2487479162289318576L;

	/**
	 * 申请发起方，
描述开票申请的发起角色，由销售方（PAYEE）或购买方（PAYER）发起。
	 */
	@ApiField("apply_from")
	private String applyFrom;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

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
	 * 发票代码
	 */
	@ApiField("einv_code")
	private String einvCode;

	/**
	 * 发票号码
	 */
	@ApiField("einv_no")
	private String einvNo;

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
	 * 发票明细项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_query_open_model")
	private List<InvoiceItemQueryOpenModel> invoiceContent;

	/**
	 * 发票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 支付宝发票id，全局唯一
	 */
	@ApiField("invoice_id")
	private String invoiceId;

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
	 * 购买方发票抬头信息
	 */
	@ApiField("invoice_title")
	private InvoiceTitleQueryOpenModel invoiceTitle;

	/**
	 * 发票类型：蓝票/红票
BLUE（蓝票）/RED（红票）
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 仅用于红冲，仅用于红冲，对应红冲对应的原始蓝票的发票号码
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 仅用于红冲，仅用于红冲，对应红冲对应的原始蓝票的发票号码
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
	 * 发票文件预览图
	 */
	@ApiField("preview_image_url")
	private String previewImageUrl;

	/**
	 * 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。
如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003
要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 合计税额
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/**
	 * 交易发生时间
	 */
	@ApiField("trade_date")
	private String tradeDate;

	/**
	 * 支付宝用户id，支付宝用户的唯一标识。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>applyFrom</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyFrom() {
		return this.applyFrom;
	}
	/**
	 * <p>Setter for the field <code>applyFrom</code>.</p>
	 *
	 * @param applyFrom a {@link java.lang.String} object.
	 */
	public void setApplyFrom(String applyFrom) {
		this.applyFrom = applyFrom;
	}

	/**
	 * <p>Getter for the field <code>checkCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCheckCode() {
		return this.checkCode;
	}
	/**
	 * <p>Setter for the field <code>checkCode</code>.</p>
	 *
	 * @param checkCode a {@link java.lang.String} object.
	 */
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

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
	 * <p>Getter for the field <code>einvCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEinvCode() {
		return this.einvCode;
	}
	/**
	 * <p>Setter for the field <code>einvCode</code>.</p>
	 *
	 * @param einvCode a {@link java.lang.String} object.
	 */
	public void setEinvCode(String einvCode) {
		this.einvCode = einvCode;
	}

	/**
	 * <p>Getter for the field <code>einvNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEinvNo() {
		return this.einvNo;
	}
	/**
	 * <p>Setter for the field <code>einvNo</code>.</p>
	 *
	 * @param einvNo a {@link java.lang.String} object.
	 */
	public void setEinvNo(String einvNo) {
		this.einvNo = einvNo;
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
	public List<InvoiceItemQueryOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}
	/**
	 * <p>Setter for the field <code>invoiceContent</code>.</p>
	 *
	 * @param invoiceContent a {@link java.util.List} object.
	 */
	public void setInvoiceContent(List<InvoiceItemQueryOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	/**
	 * <p>Getter for the field <code>invoiceDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	/**
	 * <p>Setter for the field <code>invoiceDate</code>.</p>
	 *
	 * @param invoiceDate a {@link java.lang.String} object.
	 */
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * <p>Getter for the field <code>invoiceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceId() {
		return this.invoiceId;
	}
	/**
	 * <p>Setter for the field <code>invoiceId</code>.</p>
	 *
	 * @param invoiceId a {@link java.lang.String} object.
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
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
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceTitleQueryOpenModel} object.
	 */
	public InvoiceTitleQueryOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}
	/**
	 * <p>Setter for the field <code>invoiceTitle</code>.</p>
	 *
	 * @param invoiceTitle a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceTitleQueryOpenModel} object.
	 */
	public void setInvoiceTitle(InvoiceTitleQueryOpenModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	/**
	 * <p>Getter for the field <code>invoiceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceType() {
		return this.invoiceType;
	}
	/**
	 * <p>Setter for the field <code>invoiceType</code>.</p>
	 *
	 * @param invoiceType a {@link java.lang.String} object.
	 */
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	/**
	 * <p>Getter for the field <code>mShortName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getmShortName() {
		return this.mShortName;
	}
	/**
	 * <p>Setter for the field <code>mShortName</code>.</p>
	 *
	 * @param mShortName a {@link java.lang.String} object.
	 */
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
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
	 * <p>Getter for the field <code>previewImageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPreviewImageUrl() {
		return this.previewImageUrl;
	}
	/**
	 * <p>Setter for the field <code>previewImageUrl</code>.</p>
	 *
	 * @param previewImageUrl a {@link java.lang.String} object.
	 */
	public void setPreviewImageUrl(String previewImageUrl) {
		this.previewImageUrl = previewImageUrl;
	}

	/**
	 * <p>Getter for the field <code>subMShortName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubMShortName() {
		return this.subMShortName;
	}
	/**
	 * <p>Setter for the field <code>subMShortName</code>.</p>
	 *
	 * @param subMShortName a {@link java.lang.String} object.
	 */
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
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

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
