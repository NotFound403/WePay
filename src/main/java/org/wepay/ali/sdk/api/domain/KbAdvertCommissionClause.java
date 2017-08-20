package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 任务条款抽象模型
 *
 * @author auto create
 * @since 1.0, 2017-01-20 17:41:05
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

	public String getClauseType() {
		return this.clauseType;
	}
	public void setClauseType(String clauseType) {
		this.clauseType = clauseType;
	}

	public KbAdvertPercentageCommissionClause getPercentageClause() {
		return this.percentageClause;
	}
	public void setPercentageClause(KbAdvertPercentageCommissionClause percentageClause) {
		this.percentageClause = percentageClause;
	}

	public KbAdvertPreserveCommissionClause getPreserveClause() {
		return this.preserveClause;
	}
	public void setPreserveClause(KbAdvertPreserveCommissionClause preserveClause) {
		this.preserveClause = preserveClause;
	}

	public KbAdvertQuotaCommissionClause getQuotaClause() {
		return this.quotaClause;
	}
	public void setQuotaClause(KbAdvertQuotaCommissionClause quotaClause) {
		this.quotaClause = quotaClause;
	}

}
