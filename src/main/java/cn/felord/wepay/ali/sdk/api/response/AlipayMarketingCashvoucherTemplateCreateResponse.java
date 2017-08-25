package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashvoucher.template.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCashvoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8397454327881411952L;

	/** 
	 * 模板支付确认链接
	 */
	@ApiField("confirm_uri")
	private String confirmUri;

	/** 
	 * 资金订单号，模板支付时需要
	 */
	@ApiField("fund_order_no")
	private String fundOrderNo;

	/** 
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * <p>Setter for the field <code>confirmUri</code>.</p>
	 *
	 * @param confirmUri a {@link java.lang.String} object.
	 */
	public void setConfirmUri(String confirmUri) {
		this.confirmUri = confirmUri;
	}
	/**
	 * <p>Getter for the field <code>confirmUri</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConfirmUri( ) {
		return this.confirmUri;
	}

	/**
	 * <p>Setter for the field <code>fundOrderNo</code>.</p>
	 *
	 * @param fundOrderNo a {@link java.lang.String} object.
	 */
	public void setFundOrderNo(String fundOrderNo) {
		this.fundOrderNo = fundOrderNo;
	}
	/**
	 * <p>Getter for the field <code>fundOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundOrderNo( ) {
		return this.fundOrderNo;
	}

	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.String} object.
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId( ) {
		return this.templateId;
	}

}
