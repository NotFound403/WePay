package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 贷款费用信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LoanChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 7833849655665372837L;

	/**
	 * 费用编码
	 */
	@ApiField("charge_code")
	private String chargeCode;

	/**
	 * 费用名称
	 */
	@ApiField("charge_name")
	private String chargeName;

	/**
	 * 分段费率
	 */
	@ApiField("instal_chrg_rate")
	private InstallmentValue instalChrgRate;

	/**
	 * <p>Getter for the field <code>chargeCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeCode() {
		return this.chargeCode;
	}
	/**
	 * <p>Setter for the field <code>chargeCode</code>.</p>
	 *
	 * @param chargeCode a {@link java.lang.String} object.
	 */
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	/**
	 * <p>Getter for the field <code>chargeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeName() {
		return this.chargeName;
	}
	/**
	 * <p>Setter for the field <code>chargeName</code>.</p>
	 *
	 * @param chargeName a {@link java.lang.String} object.
	 */
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	/**
	 * <p>Getter for the field <code>instalChrgRate</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InstallmentValue} object.
	 */
	public InstallmentValue getInstalChrgRate() {
		return this.instalChrgRate;
	}
	/**
	 * <p>Setter for the field <code>instalChrgRate</code>.</p>
	 *
	 * @param instalChrgRate a {@link cn.felord.wepay.ali.sdk.api.domain.InstallmentValue} object.
	 */
	public void setInstalChrgRate(InstallmentValue instalChrgRate) {
		this.instalChrgRate = instalChrgRate;
	}

}
