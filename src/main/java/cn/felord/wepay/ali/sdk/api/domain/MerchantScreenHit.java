package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户反洗钱风险检查发现的风险，包含命中的实体类型和命中详情等信息。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MerchantScreenHit extends AlipayObject {

	private static final long serialVersionUID = 4851835563499913886L;

	/**
	 * 送检的实体类型，如CEO，控股人，等
	 */
	@ApiField("input_type")
	private String inputType;

	/**
	 * 命中详情
	 */
	@ApiField("risk_detail")
	private String riskDetail;

	/**
	 * <p>Getter for the field <code>inputType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInputType() {
		return this.inputType;
	}
	/**
	 * <p>Setter for the field <code>inputType</code>.</p>
	 *
	 * @param inputType a {@link java.lang.String} object.
	 */
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	 * <p>Getter for the field <code>riskDetail</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskDetail() {
		return this.riskDetail;
	}
	/**
	 * <p>Setter for the field <code>riskDetail</code>.</p>
	 *
	 * @param riskDetail a {@link java.lang.String} object.
	 */
	public void setRiskDetail(String riskDetail) {
		this.riskDetail = riskDetail;
	}

}
