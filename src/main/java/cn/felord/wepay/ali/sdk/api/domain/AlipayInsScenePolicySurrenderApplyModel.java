package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 退保受理
 *
 * @author auto create
 * @since 1.0, 2017-01-24 19:46:50
 */
public class AlipayInsScenePolicySurrenderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7335849175676372663L;

	/**
	 * 退保扩展参数 ;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 蚂蚁保险平台生成的保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
