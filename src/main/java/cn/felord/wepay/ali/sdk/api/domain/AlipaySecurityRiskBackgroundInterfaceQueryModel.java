package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 人员风险背景调查(远程接口调用)
 *
 * @author auto create
 * @since 1.0, 2017-05-31 19:27:48
 */
public class AlipaySecurityRiskBackgroundInterfaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7531586519861489456L;

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

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
