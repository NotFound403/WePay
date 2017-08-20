package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 兑换券核销接口
 *
 * @author auto create
 * @since 1.0, 2017-06-19 11:26:47
 */
public class AlipayMarketingExchangevoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 6391628593558748359L;

	/**
	 * 外部业务号，用户幂等控制。相同voucher_id和out_biz_no被认为是同一次核销
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户ID ，必须保证待使用的券ID归属于该支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 待使用的券id ，来自发券接口alipay.marketing.voucher.send
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
