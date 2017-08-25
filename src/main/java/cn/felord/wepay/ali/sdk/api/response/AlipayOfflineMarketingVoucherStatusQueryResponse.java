package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.status.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketingVoucherStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6455215266566639347L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 券模板id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/** 
	 * 券模板状态。EFFECTIVE=生效，INVALID=失效。
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo( ) {
		return this.extInfo;
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
