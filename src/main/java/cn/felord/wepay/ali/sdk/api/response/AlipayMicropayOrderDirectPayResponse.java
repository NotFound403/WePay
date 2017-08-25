package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.SinglePayDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.direct.pay response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMicropayOrderDirectPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1749441242924648116L;

	/** 
	 * 单笔直接支付返回结果
	 */
	@ApiField("single_pay_detail")
	private SinglePayDetail singlePayDetail;

	/**
	 * <p>Setter for the field <code>singlePayDetail</code>.</p>
	 *
	 * @param singlePayDetail a {@link cn.felord.wepay.ali.sdk.api.domain.SinglePayDetail} object.
	 */
	public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
		this.singlePayDetail = singlePayDetail;
	}
	/**
	 * <p>Getter for the field <code>singlePayDetail</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.SinglePayDetail} object.
	 */
	public SinglePayDetail getSinglePayDetail( ) {
		return this.singlePayDetail;
	}

}
