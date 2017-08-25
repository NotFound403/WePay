package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.UnfreezeOrderDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.unfreeze response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMicropayOrderUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7422989775199823717L;

	/** 
	 * 冻结订单详情结果
	 */
	@ApiField("unfreeze_order_detail")
	private UnfreezeOrderDetail unfreezeOrderDetail;

	/**
	 * <p>Setter for the field <code>unfreezeOrderDetail</code>.</p>
	 *
	 * @param unfreezeOrderDetail a {@link cn.felord.wepay.ali.sdk.api.domain.UnfreezeOrderDetail} object.
	 */
	public void setUnfreezeOrderDetail(UnfreezeOrderDetail unfreezeOrderDetail) {
		this.unfreezeOrderDetail = unfreezeOrderDetail;
	}
	/**
	 * <p>Getter for the field <code>unfreezeOrderDetail</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.UnfreezeOrderDetail} object.
	 */
	public UnfreezeOrderDetail getUnfreezeOrderDetail( ) {
		return this.unfreezeOrderDetail;
	}

}
