package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketingVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6891756562444946612L;

	/** 
	 * 活动id，过渡方案的兼容字段
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 券模板id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * <p>Setter for the field <code>activityId</code>.</p>
	 *
	 * @param activityId a {@link java.lang.String} object.
	 */
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	/**
	 * <p>Getter for the field <code>activityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActivityId( ) {
		return this.activityId;
	}

	/**
	 * <p>Setter for the field <code>voucherId</code>.</p>
	 *
	 * @param voucherId a {@link java.lang.String} object.
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	/**
	 * <p>Getter for the field <code>voucherId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
