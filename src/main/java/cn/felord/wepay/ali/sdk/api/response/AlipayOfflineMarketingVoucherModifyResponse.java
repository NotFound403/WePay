package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.modify response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketingVoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3732263965347224296L;

	/** 
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/** 
	 * 券模板状态,EFFECTIVE=生效，INVALID=失效
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

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

	/**
	 * <p>Setter for the field <code>voucherStatus</code>.</p>
	 *
	 * @param voucherStatus a {@link java.lang.String} object.
	 */
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}
	/**
	 * <p>Getter for the field <code>voucherStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVoucherStatus( ) {
		return this.voucherStatus;
	}

}
