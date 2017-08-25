package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 广告标的分页搜索接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiAdvertCommissionMissionSearchModel extends AlipayObject {

	private static final long serialVersionUID = 8358676268724562216L;

	/**
	 * 分佣规则类型(枚举值key对应于请求对象中复杂类型的key)
percentage_clause-比例
quota_clause-定额
	 */
	@ApiField("commission_clause_type")
	private String commissionClauseType;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页记录数，默认10，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 比例分佣规则
只有commission_clause_type=percentage_clause才能传值
	 */
	@ApiField("percentage_clause")
	private KbAdvertCommissionClausePercentage percentageClause;

	/**
	 * 定额分佣规则
只有commission_clause_type=quota_clause才能传值
	 */
	@ApiField("quota_clause")
	private KbAdvertCommissionClauseQuota quotaClause;

	/**
	 * 任务类型(枚举值key对应于请求对象中复杂类型的key)
voucher-券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券任务(支持模糊匹配)
只有type=voucher才能传值
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucher voucher;

	/**
	 * <p>Getter for the field <code>commissionClauseType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommissionClauseType() {
		return this.commissionClauseType;
	}
	/**
	 * <p>Setter for the field <code>commissionClauseType</code>.</p>
	 *
	 * @param commissionClauseType a {@link java.lang.String} object.
	 */
	public void setCommissionClauseType(String commissionClauseType) {
		this.commissionClauseType = commissionClauseType;
	}

	/**
	 * <p>Getter for the field <code>pageIndex</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageIndex() {
		return this.pageIndex;
	}
	/**
	 * <p>Setter for the field <code>pageIndex</code>.</p>
	 *
	 * @param pageIndex a {@link java.lang.String} object.
	 */
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * <p>Getter for the field <code>percentageClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClausePercentage} object.
	 */
	public KbAdvertCommissionClausePercentage getPercentageClause() {
		return this.percentageClause;
	}
	/**
	 * <p>Setter for the field <code>percentageClause</code>.</p>
	 *
	 * @param percentageClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClausePercentage} object.
	 */
	public void setPercentageClause(KbAdvertCommissionClausePercentage percentageClause) {
		this.percentageClause = percentageClause;
	}

	/**
	 * <p>Getter for the field <code>quotaClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClauseQuota} object.
	 */
	public KbAdvertCommissionClauseQuota getQuotaClause() {
		return this.quotaClause;
	}
	/**
	 * <p>Setter for the field <code>quotaClause</code>.</p>
	 *
	 * @param quotaClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClauseQuota} object.
	 */
	public void setQuotaClause(KbAdvertCommissionClauseQuota quotaClause) {
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

	/**
	 * <p>Getter for the field <code>voucher</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertSubjectVoucher} object.
	 */
	public KbAdvertSubjectVoucher getVoucher() {
		return this.voucher;
	}
	/**
	 * <p>Setter for the field <code>voucher</code>.</p>
	 *
	 * @param voucher a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertSubjectVoucher} object.
	 */
	public void setVoucher(KbAdvertSubjectVoucher voucher) {
		this.voucher = voucher;
	}

}
