package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.SinglePayDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.confirmpayurl.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMicropayOrderConfirmpayurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3447642596588239825L;

	/** 
	 * SinglePayDetail信息
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
