package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.generate response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorVoucherGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5659148767131134725L;

	/** 
	 * 核销码过期时间
	 */
	@ApiField("expired_date")
	private String expiredDate;

	/** 
	 * 地铁购票二维码编码，可自定义
	 */
	@ApiField("qr_code_no")
	private String qrCodeNo;

	/** 
	 * 地铁购票的核销码
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * <p>Setter for the field <code>expiredDate</code>.</p>
	 *
	 * @param expiredDate a {@link java.lang.String} object.
	 */
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	/**
	 * <p>Getter for the field <code>expiredDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpiredDate( ) {
		return this.expiredDate;
	}

	/**
	 * <p>Setter for the field <code>qrCodeNo</code>.</p>
	 *
	 * @param qrCodeNo a {@link java.lang.String} object.
	 */
	public void setQrCodeNo(String qrCodeNo) {
		this.qrCodeNo = qrCodeNo;
	}
	/**
	 * <p>Getter for the field <code>qrCodeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCodeNo( ) {
		return this.qrCodeNo;
	}

	/**
	 * <p>Setter for the field <code>ticketNo</code>.</p>
	 *
	 * @param ticketNo a {@link java.lang.String} object.
	 */
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	/**
	 * <p>Getter for the field <code>ticketNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTicketNo( ) {
		return this.ticketNo;
	}

}
