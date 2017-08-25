package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertCommissionClauseResponse extends AlipayObject {

	private static final long serialVersionUID = 2656983855455381594L;

	/**
	 * 比例分佣规则
只有type=PERCENTAGE_CLAUSE才会有值
	 */
	@ApiField("percentage_clause")
	private KbAdvertCommissionClausePercentageResponse percentageClause;

	/**
	 * 定额分佣规则
只有type=QUOTA_CLAUSE才会有值
	 */
	@ApiField("quota_clause")
	private KbAdvertCommissionClauseQuotaResponse quotaClause;

	/**
	 * 分佣规则类型
PERCENTAGE_CLAUSE-比例
QUOTA_CLAUSE-定额
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>percentageClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClausePercentageResponse} object.
	 */
	public KbAdvertCommissionClausePercentageResponse getPercentageClause() {
		return this.percentageClause;
	}
	/**
	 * <p>Setter for the field <code>percentageClause</code>.</p>
	 *
	 * @param percentageClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClausePercentageResponse} object.
	 */
	public void setPercentageClause(KbAdvertCommissionClausePercentageResponse percentageClause) {
		this.percentageClause = percentageClause;
	}

	/**
	 * <p>Getter for the field <code>quotaClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClauseQuotaResponse} object.
	 */
	public KbAdvertCommissionClauseQuotaResponse getQuotaClause() {
		return this.quotaClause;
	}
	/**
	 * <p>Setter for the field <code>quotaClause</code>.</p>
	 *
	 * @param quotaClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClauseQuotaResponse} object.
	 */
	public void setQuotaClause(KbAdvertCommissionClauseQuotaResponse quotaClause) {
		this.quotaClause = quotaClause;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
