package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.MicroPayOrderDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMicropayOrderGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3786836522213761198L;

	/** 
	 * 冻结订单详情
	 */
	@ApiField("micro_pay_order_detail")
	private MicroPayOrderDetail microPayOrderDetail;

	/**
	 * <p>Setter for the field <code>microPayOrderDetail</code>.</p>
	 *
	 * @param microPayOrderDetail a {@link cn.felord.wepay.ali.sdk.api.domain.MicroPayOrderDetail} object.
	 */
	public void setMicroPayOrderDetail(MicroPayOrderDetail microPayOrderDetail) {
		this.microPayOrderDetail = microPayOrderDetail;
	}
	/**
	 * <p>Getter for the field <code>microPayOrderDetail</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MicroPayOrderDetail} object.
	 */
	public MicroPayOrderDetail getMicroPayOrderDetail( ) {
		return this.microPayOrderDetail;
	}

}
