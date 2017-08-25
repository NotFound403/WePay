package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.promo.ticket.push response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarPromoTicketPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 3464356819734658839L;

	/** 
	 * 处理结果返回码
	 */
	@ApiField("sp_apply_no")
	private String spApplyNo;

	/**
	 * <p>Setter for the field <code>spApplyNo</code>.</p>
	 *
	 * @param spApplyNo a {@link java.lang.String} object.
	 */
	public void setSpApplyNo(String spApplyNo) {
		this.spApplyNo = spApplyNo;
	}
	/**
	 * <p>Getter for the field <code>spApplyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpApplyNo( ) {
		return this.spApplyNo;
	}

}
