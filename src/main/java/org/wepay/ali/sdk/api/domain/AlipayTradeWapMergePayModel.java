package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * H5合并支付接口2.0
 *
 * @author auto create
 * @since 1.0, 2017-03-14 19:15:29
 */
public class AlipayTradeWapMergePayModel extends AlipayObject {

	private static final long serialVersionUID = 4383277523121755886L;

	/**
	 * 如果预创建成功，支付宝返回该预下单号，后续商户使用该预下单号请求支付宝支付接口
	 */
	@ApiField("pre_order_no")
	private String preOrderNo;

	public String getPreOrderNo() {
		return this.preOrderNo;
	}
	public void setPreOrderNo(String preOrderNo) {
		this.preOrderNo = preOrderNo;
	}

}
