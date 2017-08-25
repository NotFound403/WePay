package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 风险评分infocode
 *
 * @author auto create
 * @version $Id: $Id
 */
public class RiskRankInfoCode extends AlipayObject {

	private static final long serialVersionUID = 2234917535419632966L;

	/**
	 * infocode
	 */
	@ApiField("code")
	private String code;

	/**
	 * 此infocode在总的得分中的贡献度
	 */
	@ApiField("contribution_degree")
	private Long contributionDegree;

	/**
	 * 风险描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 模型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>contributionDegree</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getContributionDegree() {
		return this.contributionDegree;
	}
	/**
	 * <p>Setter for the field <code>contributionDegree</code>.</p>
	 *
	 * @param contributionDegree a {@link java.lang.Long} object.
	 */
	public void setContributionDegree(Long contributionDegree) {
		this.contributionDegree = contributionDegree;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>modelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelName() {
		return this.modelName;
	}
	/**
	 * <p>Setter for the field <code>modelName</code>.</p>
	 *
	 * @param modelName a {@link java.lang.String} object.
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
