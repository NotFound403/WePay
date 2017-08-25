package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.InvoiceTitleModel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.list.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppInvoiceTitleListGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4819378557616598587L;

	/** 
	 * 抬头列表
	 */
	@ApiListField("title_list")
	@ApiField("invoice_title_model")
	private List<InvoiceTitleModel> titleList;

	/**
	 * <p>Setter for the field <code>titleList</code>.</p>
	 *
	 * @param titleList a {@link java.util.List} object.
	 */
	public void setTitleList(List<InvoiceTitleModel> titleList) {
		this.titleList = titleList;
	}
	/**
	 * <p>Getter for the field <code>titleList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InvoiceTitleModel> getTitleList( ) {
		return this.titleList;
	}

}
