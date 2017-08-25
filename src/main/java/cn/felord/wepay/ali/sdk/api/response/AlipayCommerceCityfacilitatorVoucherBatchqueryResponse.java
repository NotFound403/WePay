package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.TicketDetailInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8218266685893958373L;

	/** 
	 * 查询到的订单信息列表
	 */
	@ApiListField("tickets")
	@ApiField("ticket_detail_info")
	private List<TicketDetailInfo> tickets;

	/**
	 * <p>Setter for the field <code>tickets</code>.</p>
	 *
	 * @param tickets a {@link java.util.List} object.
	 */
	public void setTickets(List<TicketDetailInfo> tickets) {
		this.tickets = tickets;
	}
	/**
	 * <p>Getter for the field <code>tickets</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TicketDetailInfo> getTickets( ) {
		return this.tickets;
	}

}
