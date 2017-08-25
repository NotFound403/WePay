package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 芝麻信用风险名单识别结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AliTrustRiskIdentify extends AlipayObject {

	private static final long serialVersionUID = 7298575456415821863L;

	/**
	 * 芝麻信用风险名单详情列表
	 */
	@ApiListField("details")
	@ApiField("zhima_risk_detail")
	private List<ZhimaRiskDetail> details;

	/**
	 * 当有风险时,为"T";无风险识别是为"F"
	 */
	@ApiField("is_risk")
	private String isRisk;

	/**
	 * 已废弃
	 */
	@ApiField("risk_tag")
	private String riskTag;

	/**
	 * <p>Getter for the field <code>details</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ZhimaRiskDetail> getDetails() {
		return this.details;
	}
	/**
	 * <p>Setter for the field <code>details</code>.</p>
	 *
	 * @param details a {@link java.util.List} object.
	 */
	public void setDetails(List<ZhimaRiskDetail> details) {
		this.details = details;
	}

	/**
	 * <p>Getter for the field <code>isRisk</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsRisk() {
		return this.isRisk;
	}
	/**
	 * <p>Setter for the field <code>isRisk</code>.</p>
	 *
	 * @param isRisk a {@link java.lang.String} object.
	 */
	public void setIsRisk(String isRisk) {
		this.isRisk = isRisk;
	}

	/**
	 * <p>Getter for the field <code>riskTag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRiskTag() {
		return this.riskTag;
	}
	/**
	 * <p>Setter for the field <code>riskTag</code>.</p>
	 *
	 * @param riskTag a {@link java.lang.String} object.
	 */
	public void setRiskTag(String riskTag) {
		this.riskTag = riskTag;
	}

}
