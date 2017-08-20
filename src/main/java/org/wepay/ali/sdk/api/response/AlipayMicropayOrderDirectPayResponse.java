package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.domain.SinglePayDetail;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.direct.pay response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-15 16:27:00
 */
public class AlipayMicropayOrderDirectPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1749441242924648116L;

	/** 
	 * 单笔直接支付返回结果
	 */
	@ApiField("single_pay_detail")
	private SinglePayDetail singlePayDetail;

	public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
		this.singlePayDetail = singlePayDetail;
	}
	public SinglePayDetail getSinglePayDetail( ) {
		return this.singlePayDetail;
	}

}
