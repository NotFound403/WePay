package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 外部商户同步电子发票至支付宝
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceSycnModel extends AlipayObject {

	private static final long serialVersionUID = 4118433945987988314L;

	/**
	 * 同步发票信息模型
	 */
	@ApiListField("invoice_info")
	@ApiField("invoice_model_content")
	private List<InvoiceModelContent> invoiceInfo;

	/**
	 * 商户的品牌名称简称,该字段需要接入前向发票管家申请，
m_short_name+sub_m_short_name具有唯一约束
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 支付宝为商户分配的商户门店简称，该字段需要接入前在发票管家申请
如：肯德基-杭州西湖区文一西路店：KFC-HZ-XH001
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * <p>Getter for the field <code>invoiceInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InvoiceModelContent> getInvoiceInfo() {
		return this.invoiceInfo;
	}
	/**
	 * <p>Setter for the field <code>invoiceInfo</code>.</p>
	 *
	 * @param invoiceInfo a {@link java.util.List} object.
	 */
	public void setInvoiceInfo(List<InvoiceModelContent> invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
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

}
