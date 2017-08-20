package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 贷款费用信息
 *
 * @author auto create
 * @since 1.0, 2017-05-19 11:45:39
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

	public String getChargeCode() {
		return this.chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public String getChargeName() {
		return this.chargeName;
	}
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	public InstallmentValue getInstalChrgRate() {
		return this.instalChrgRate;
	}
	public void setInstalChrgRate(InstallmentValue instalChrgRate) {
		this.instalChrgRate = instalChrgRate;
	}

}
