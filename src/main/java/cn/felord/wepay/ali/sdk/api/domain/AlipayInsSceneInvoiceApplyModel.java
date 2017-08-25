package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险发票申请
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1316334712481897883L;

	/**
	 * 发票寄送类型;ELECTRONIC:电子发票;PAPER:纸质发票；BOTH:电子+纸质
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 发票收件人
	 */
	@ApiField("invoice_addressee")
	private InsAddressee invoiceAddressee;

	/**
	 * 发票申请明细
	 */
	@ApiField("invoice_apply_item")
	private InsInvoiceApplyItem invoiceApplyItem;

	/**
	 * 申请发票开票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票抬头;收取发票的公司名称或个人姓名
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 开票类型;1:增值税普通发票（公司） ;2:增值税普通发票（个人） ;3:增值税专用发票.
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 商户业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户生成的发票申请请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * <p>Getter for the field <code>deliveryType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeliveryType() {
		return this.deliveryType;
	}
	/**
	 * <p>Setter for the field <code>deliveryType</code>.</p>
	 *
	 * @param deliveryType a {@link java.lang.String} object.
	 */
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/**
	 * <p>Getter for the field <code>invoiceAddressee</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsAddressee} object.
	 */
	public InsAddressee getInvoiceAddressee() {
		return this.invoiceAddressee;
	}
	/**
	 * <p>Setter for the field <code>invoiceAddressee</code>.</p>
	 *
	 * @param invoiceAddressee a {@link cn.felord.wepay.ali.sdk.api.domain.InsAddressee} object.
	 */
	public void setInvoiceAddressee(InsAddressee invoiceAddressee) {
		this.invoiceAddressee = invoiceAddressee;
	}

	/**
	 * <p>Getter for the field <code>invoiceApplyItem</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsInvoiceApplyItem} object.
	 */
	public InsInvoiceApplyItem getInvoiceApplyItem() {
		return this.invoiceApplyItem;
	}
	/**
	 * <p>Setter for the field <code>invoiceApplyItem</code>.</p>
	 *
	 * @param invoiceApplyItem a {@link cn.felord.wepay.ali.sdk.api.domain.InsInvoiceApplyItem} object.
	 */
	public void setInvoiceApplyItem(InsInvoiceApplyItem invoiceApplyItem) {
		this.invoiceApplyItem = invoiceApplyItem;
	}

	/**
	 * <p>Getter for the field <code>invoiceDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	/**
	 * <p>Setter for the field <code>invoiceDate</code>.</p>
	 *
	 * @param invoiceDate a {@link java.util.Date} object.
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * <p>Getter for the field <code>invoiceTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	/**
	 * <p>Setter for the field <code>invoiceTitle</code>.</p>
	 *
	 * @param invoiceTitle a {@link java.lang.String} object.
	 */
	public void setInvoiceTitle(String invoiceTitle) {
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
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
