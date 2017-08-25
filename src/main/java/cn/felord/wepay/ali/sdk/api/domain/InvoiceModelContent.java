package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 发票详情模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvoiceModelContent extends AlipayObject {

	private static final long serialVersionUID = 1578571434996288117L;

	/**
	 * key=value，每组键值对以回车分割
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 下载的发票文件类型
可选值：
pdf（发票原文件）
jpg（发票原文件缩略图）
	 */
	@ApiField("file_download_type")
	private String fileDownloadType;

	/**
	 * 文件下载地址，当同步发票tax_type=PLAIN时，必传；
此处的链接请务必传入可下载PDF的链接
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 发票金额，大于0且精确到小数点两位，以元为单位
需要传入税价合计金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码，国税局生成的唯一值，不可为空串
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票内容项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_content")
	private List<InvoiceItemContent> invoiceContent;

	/**
	 * 发票日期，用户填写，目前精确到日
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票防伪码
	 */
	@ApiField("invoice_fake_code")
	private String invoiceFakeCode;

	/**
	 * 原始发票PDF文件流
	 */
	@ApiField("invoice_file_data")
	private String invoiceFileData;

	/**
	 * 发票原始文件jpg文件地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/**
	 * 发票号码，国税局生成的唯一号码，不可为空串；
使用时请注意，invoice_no+invoice_code唯一，不能重复
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票开具操作人
	 */
	@ApiField("invoice_operator")
	private String invoiceOperator;

	/**
	 * 发票title
	 */
	@ApiField("invoice_title")
	private InvoiceTitleModel invoiceTitle;

	/**
	 * 发票类型，按照可选值只传入英文部分，该字段严格要求大小写
可选值:
blue（蓝票）
red（红票）
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 仅用于同步红票，原始蓝票发票代码，同步红票时必传
	 */
	@ApiField("original_blue_invoice_code")
	private String originalBlueInvoiceCode;

	/**
	 * 仅用于同步红票，原始蓝票发票号码，同步红票时必传
	 */
	@ApiField("original_blue_invoice_no")
	private String originalBlueInvoiceNo;

	/**
	 * 商户交易流水号，不可为空串;
传入红票时请注意，此字段的值要和蓝票保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户唯一开票申请业务流水号，同一个isv下不能重复
	 */
	@ApiField("out_invoice_id")
	private String outInvoiceId;

	/**
	 * 开票单位地址
	 */
	@ApiField("register_address")
	private String registerAddress;

	/**
	 * 开票单位开户行账号
	 */
	@ApiField("register_bank_account")
	private String registerBankAccount;

	/**
	 * 开票单位开户行名称
	 */
	@ApiField("register_bank_name")
	private String registerBankName;

	/**
	 * 开票单位
	 */
	@ApiField("register_name")
	private String registerName;

	/**
	 * 纳税人识别号，不可为空串
	 */
	@ApiField("register_no")
	private String registerNo;

	/**
	 * 开票人电话，支持座机和手机两种格式
	 */
	@ApiField("register_phone_no")
	private String registerPhoneNo;

	/**
	 * 价税合计
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/**
	 * 税额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税种
可选值：
PLAIN（普票的情况）
SPECIAL（专票的情况）
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 支付宝用户id,当同步的是蓝票时，必传。红票时不需传。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>extendFields</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendFields() {
		return this.extendFields;
	}
	/**
	 * <p>Setter for the field <code>extendFields</code>.</p>
	 *
	 * @param extendFields a {@link java.lang.String} object.
	 */
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	/**
	 * <p>Getter for the field <code>fileDownloadType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileDownloadType() {
		return this.fileDownloadType;
	}
	/**
	 * <p>Setter for the field <code>fileDownloadType</code>.</p>
	 *
	 * @param fileDownloadType a {@link java.lang.String} object.
	 */
	public void setFileDownloadType(String fileDownloadType) {
		this.fileDownloadType = fileDownloadType;
	}

	/**
	 * <p>Getter for the field <code>fileDownloadUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	/**
	 * <p>Setter for the field <code>fileDownloadUrl</code>.</p>
	 *
	 * @param fileDownloadUrl a {@link java.lang.String} object.
	 */
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
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
	 * <p>Getter for the field <code>invoiceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	/**
	 * <p>Setter for the field <code>invoiceCode</code>.</p>
	 *
	 * @param invoiceCode a {@link java.lang.String} object.
	 */
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	/**
	 * <p>Getter for the field <code>invoiceContent</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InvoiceItemContent> getInvoiceContent() {
		return this.invoiceContent;
	}
	/**
	 * <p>Setter for the field <code>invoiceContent</code>.</p>
	 *
	 * @param invoiceContent a {@link java.util.List} object.
	 */
	public void setInvoiceContent(List<InvoiceItemContent> invoiceContent) {
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
	 * <p>Getter for the field <code>invoiceFakeCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceFakeCode() {
		return this.invoiceFakeCode;
	}
	/**
	 * <p>Setter for the field <code>invoiceFakeCode</code>.</p>
	 *
	 * @param invoiceFakeCode a {@link java.lang.String} object.
	 */
	public void setInvoiceFakeCode(String invoiceFakeCode) {
		this.invoiceFakeCode = invoiceFakeCode;
	}

	/**
	 * <p>Getter for the field <code>invoiceFileData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceFileData() {
		return this.invoiceFileData;
	}
	/**
	 * <p>Setter for the field <code>invoiceFileData</code>.</p>
	 *
	 * @param invoiceFileData a {@link java.lang.String} object.
	 */
	public void setInvoiceFileData(String invoiceFileData) {
		this.invoiceFileData = invoiceFileData;
	}

	/**
	 * <p>Getter for the field <code>invoiceImgUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceImgUrl() {
		return this.invoiceImgUrl;
	}
	/**
	 * <p>Setter for the field <code>invoiceImgUrl</code>.</p>
	 *
	 * @param invoiceImgUrl a {@link java.lang.String} object.
	 */
	public void setInvoiceImgUrl(String invoiceImgUrl) {
		this.invoiceImgUrl = invoiceImgUrl;
	}

	/**
	 * <p>Getter for the field <code>invoiceNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	/**
	 * <p>Setter for the field <code>invoiceNo</code>.</p>
	 *
	 * @param invoiceNo a {@link java.lang.String} object.
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * <p>Getter for the field <code>invoiceOperator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceOperator() {
		return this.invoiceOperator;
	}
	/**
	 * <p>Setter for the field <code>invoiceOperator</code>.</p>
	 *
	 * @param invoiceOperator a {@link java.lang.String} object.
	 */
	public void setInvoiceOperator(String invoiceOperator) {
		this.invoiceOperator = invoiceOperator;
	}

	/**
	 * <p>Getter for the field <code>invoiceTitle</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceTitleModel} object.
	 */
	public InvoiceTitleModel getInvoiceTitle() {
		return this.invoiceTitle;
	}
	/**
	 * <p>Setter for the field <code>invoiceTitle</code>.</p>
	 *
	 * @param invoiceTitle a {@link cn.felord.wepay.ali.sdk.api.domain.InvoiceTitleModel} object.
	 */
	public void setInvoiceTitle(InvoiceTitleModel invoiceTitle) {
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
	 * <p>Getter for the field <code>originalBlueInvoiceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalBlueInvoiceCode() {
		return this.originalBlueInvoiceCode;
	}
	/**
	 * <p>Setter for the field <code>originalBlueInvoiceCode</code>.</p>
	 *
	 * @param originalBlueInvoiceCode a {@link java.lang.String} object.
	 */
	public void setOriginalBlueInvoiceCode(String originalBlueInvoiceCode) {
		this.originalBlueInvoiceCode = originalBlueInvoiceCode;
	}

	/**
	 * <p>Getter for the field <code>originalBlueInvoiceNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOriginalBlueInvoiceNo() {
		return this.originalBlueInvoiceNo;
	}
	/**
	 * <p>Setter for the field <code>originalBlueInvoiceNo</code>.</p>
	 *
	 * @param originalBlueInvoiceNo a {@link java.lang.String} object.
	 */
	public void setOriginalBlueInvoiceNo(String originalBlueInvoiceNo) {
		this.originalBlueInvoiceNo = originalBlueInvoiceNo;
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
	 * <p>Getter for the field <code>outInvoiceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutInvoiceId() {
		return this.outInvoiceId;
	}
	/**
	 * <p>Setter for the field <code>outInvoiceId</code>.</p>
	 *
	 * @param outInvoiceId a {@link java.lang.String} object.
	 */
	public void setOutInvoiceId(String outInvoiceId) {
		this.outInvoiceId = outInvoiceId;
	}

	/**
	 * <p>Getter for the field <code>registerAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisterAddress() {
		return this.registerAddress;
	}
	/**
	 * <p>Setter for the field <code>registerAddress</code>.</p>
	 *
	 * @param registerAddress a {@link java.lang.String} object.
	 */
	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	/**
	 * <p>Getter for the field <code>registerBankAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisterBankAccount() {
		return this.registerBankAccount;
	}
	/**
	 * <p>Setter for the field <code>registerBankAccount</code>.</p>
	 *
	 * @param registerBankAccount a {@link java.lang.String} object.
	 */
	public void setRegisterBankAccount(String registerBankAccount) {
		this.registerBankAccount = registerBankAccount;
	}

	/**
	 * <p>Getter for the field <code>registerBankName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisterBankName() {
		return this.registerBankName;
	}
	/**
	 * <p>Setter for the field <code>registerBankName</code>.</p>
	 *
	 * @param registerBankName a {@link java.lang.String} object.
	 */
	public void setRegisterBankName(String registerBankName) {
		this.registerBankName = registerBankName;
	}

	/**
	 * <p>Getter for the field <code>registerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisterName() {
		return this.registerName;
	}
	/**
	 * <p>Setter for the field <code>registerName</code>.</p>
	 *
	 * @param registerName a {@link java.lang.String} object.
	 */
	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}

	/**
	 * <p>Getter for the field <code>registerNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisterNo() {
		return this.registerNo;
	}
	/**
	 * <p>Setter for the field <code>registerNo</code>.</p>
	 *
	 * @param registerNo a {@link java.lang.String} object.
	 */
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	/**
	 * <p>Getter for the field <code>registerPhoneNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRegisterPhoneNo() {
		return this.registerPhoneNo;
	}
	/**
	 * <p>Setter for the field <code>registerPhoneNo</code>.</p>
	 *
	 * @param registerPhoneNo a {@link java.lang.String} object.
	 */
	public void setRegisterPhoneNo(String registerPhoneNo) {
		this.registerPhoneNo = registerPhoneNo;
	}

	/**
	 * <p>Getter for the field <code>sumAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSumAmount() {
		return this.sumAmount;
	}
	/**
	 * <p>Setter for the field <code>sumAmount</code>.</p>
	 *
	 * @param sumAmount a {@link java.lang.String} object.
	 */
	public void setSumAmount(String sumAmount) {
		this.sumAmount = sumAmount;
	}

	/**
	 * <p>Getter for the field <code>taxAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaxAmount() {
		return this.taxAmount;
	}
	/**
	 * <p>Setter for the field <code>taxAmount</code>.</p>
	 *
	 * @param taxAmount a {@link java.lang.String} object.
	 */
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * <p>Getter for the field <code>taxType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaxType() {
		return this.taxType;
	}
	/**
	 * <p>Setter for the field <code>taxType</code>.</p>
	 *
	 * @param taxType a {@link java.lang.String} object.
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
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
