package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑外部券使用接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketingVoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 8854359936919784777L;

	/**
	 * 约定的扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部活动id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部交易信息
	 */
	@ApiField("external_trade_info")
	private VoucherUserExternalTradeInfo externalTradeInfo;

	/**
	 * 外部券码
	 */
	@ApiField("external_voucher_code")
	private String externalVoucherCode;

	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendParams() {
		return this.extendParams;
	}
	/**
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link java.lang.String} object.
	 */
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	/**
	 * <p>Getter for the field <code>externalId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalId() {
		return this.externalId;
	}
	/**
	 * <p>Setter for the field <code>externalId</code>.</p>
	 *
	 * @param externalId a {@link java.lang.String} object.
	 */
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * <p>Getter for the field <code>externalTradeInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.VoucherUserExternalTradeInfo} object.
	 */
	public VoucherUserExternalTradeInfo getExternalTradeInfo() {
		return this.externalTradeInfo;
	}
	/**
	 * <p>Setter for the field <code>externalTradeInfo</code>.</p>
	 *
	 * @param externalTradeInfo a {@link cn.felord.wepay.ali.sdk.api.domain.VoucherUserExternalTradeInfo} object.
	 */
	public void setExternalTradeInfo(VoucherUserExternalTradeInfo externalTradeInfo) {
		this.externalTradeInfo = externalTradeInfo;
	}

	/**
	 * <p>Getter for the field <code>externalVoucherCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalVoucherCode() {
		return this.externalVoucherCode;
	}
	/**
	 * <p>Setter for the field <code>externalVoucherCode</code>.</p>
	 *
	 * @param externalVoucherCode a {@link java.lang.String} object.
	 */
	public void setExternalVoucherCode(String externalVoucherCode) {
		this.externalVoucherCode = externalVoucherCode;
	}

}
