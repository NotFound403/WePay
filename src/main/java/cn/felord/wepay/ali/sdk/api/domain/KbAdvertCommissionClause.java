package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 任务条款抽象模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 8682995463529167499L;

	/**
	 * 条款类型（条款类型是什么，下面填的条款就是什么）
PERCENTAGE_CLAUSE：比例分佣条款
QUOTA_CLAUSE：固定金额
MISSION_CLAIM_CLAUSE:专属认领人条款
	 */
	@ApiField("clause_type")
	private String clauseType;

	/**
	 * 比例分佣条款
	 */
	@ApiField("percentage_clause")
	private KbAdvertPercentageCommissionClause percentageClause;

	/**
	 * 专属人员条款
	 */
	@ApiField("preserve_clause")
	private KbAdvertPreserveCommissionClause preserveClause;

	/**
	 * 固定金额条款
	 */
	@ApiField("quota_clause")
	private KbAdvertQuotaCommissionClause quotaClause;

	/**
	 * <p>Getter for the field <code>clauseType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClauseType() {
		return this.clauseType;
	}
	/**
	 * <p>Setter for the field <code>clauseType</code>.</p>
	 *
	 * @param clauseType a {@link java.lang.String} object.
	 */
	public void setClauseType(String clauseType) {
		this.clauseType = clauseType;
	}

	/**
	 * <p>Getter for the field <code>percentageClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertPercentageCommissionClause} object.
	 */
	public KbAdvertPercentageCommissionClause getPercentageClause() {
		return this.percentageClause;
	}
	/**
	 * <p>Setter for the field <code>percentageClause</code>.</p>
	 *
	 * @param percentageClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertPercentageCommissionClause} object.
	 */
	public void setPercentageClause(KbAdvertPercentageCommissionClause percentageClause) {
		this.percentageClause = percentageClause;
	}

	/**
	 * <p>Getter for the field <code>preserveClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertPreserveCommissionClause} object.
	 */
	public KbAdvertPreserveCommissionClause getPreserveClause() {
		return this.preserveClause;
	}
	/**
	 * <p>Setter for the field <code>preserveClause</code>.</p>
	 *
	 * @param preserveClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertPreserveCommissionClause} object.
	 */
	public void setPreserveClause(KbAdvertPreserveCommissionClause preserveClause) {
		this.preserveClause = preserveClause;
	}

	/**
	 * <p>Getter for the field <code>quotaClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertQuotaCommissionClause} object.
	 */
	public KbAdvertQuotaCommissionClause getQuotaClause() {
		return this.quotaClause;
	}
	/**
	 * <p>Setter for the field <code>quotaClause</code>.</p>
	 *
	 * @param quotaClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertQuotaCommissionClause} object.
	 */
	public void setQuotaClause(KbAdvertQuotaCommissionClause quotaClause) {
		this.quotaClause = quotaClause;
	}

}
