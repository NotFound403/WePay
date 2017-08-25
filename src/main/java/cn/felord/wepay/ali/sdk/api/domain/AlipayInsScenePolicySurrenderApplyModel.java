package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 退保受理
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>bizData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizData() {
		return this.bizData;
	}
	/**
	 * <p>Setter for the field <code>bizData</code>.</p>
	 *
	 * @param bizData a {@link java.lang.String} object.
	 */
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	/**
	 * <p>Getter for the field <code>policyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPolicyNo() {
		return this.policyNo;
	}
	/**
	 * <p>Setter for the field <code>policyNo</code>.</p>
	 *
	 * @param policyNo a {@link java.lang.String} object.
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
