package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑券详情查询接口
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * <p>Getter for the field <code>voucherId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherId() {
		return this.voucherId;
	}
	/**
	 * <p>Setter for the field <code>voucherId</code>.</p>
	 *
	 * @param voucherId a {@link java.lang.String} object.
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
