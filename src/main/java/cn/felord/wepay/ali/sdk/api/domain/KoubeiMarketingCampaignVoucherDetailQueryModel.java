package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑券详情查询接口
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class KoubeiMarketingCampaignVoucherDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5519118976829177512L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

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
