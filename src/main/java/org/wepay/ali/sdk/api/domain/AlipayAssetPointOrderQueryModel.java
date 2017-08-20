package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户在调用集分宝发放接口后可以通过此接口查询发放情况
 *
 * @author auto create
 * @since 1.0, 2016-01-29 15:44:10
 */
public class AlipayAssetPointOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8319796935532585892L;

	/**
	 * isv提供的发放号订单号，由数字和字母组成，最大长度为32为，需要保证每笔发放的唯一性，集分宝系统会对该参数做唯一性控制。调用接口后集分宝系统会根据这个外部订单号查询发放的订单详情。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

}
