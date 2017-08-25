package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 人员风险背景调查
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskBackgroundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5663514376488323373L;

	/**
	 * params+用于背调查询的输入信息+用户传入
	 */
	@ApiField("params")
	private String params;

	/**
	 * partner_name+唯一+作为标识调用者身份的字段+用户填入
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * <p>Getter for the field <code>params</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParams() {
		return this.params;
	}
	/**
	 * <p>Setter for the field <code>params</code>.</p>
	 *
	 * @param params a {@link java.lang.String} object.
	 */
	public void setParams(String params) {
		this.params = params;
	}

	/**
	 * <p>Getter for the field <code>partnerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerName() {
		return this.partnerName;
	}
	/**
	 * <p>Setter for the field <code>partnerName</code>.</p>
	 *
	 * @param partnerName a {@link java.lang.String} object.
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
