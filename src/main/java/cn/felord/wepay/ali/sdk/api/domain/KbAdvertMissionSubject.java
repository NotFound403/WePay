package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分佣任务的标的信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertMissionSubject extends AlipayObject {

	private static final long serialVersionUID = 1242927863972494698L;

	/**
	 * 分佣条款信息
	 */
	@ApiListField("commission_clause_list")
	@ApiField("kb_advert_commission_clause")
	private List<KbAdvertCommissionClause> commissionClauseList;

	/**
	 * 标的对象的业务ID，如果标的为商品，则subject_biz_id为商品ID
	 */
	@ApiField("subject_biz_id")
	private String subjectBizId;

	/**
	 * 标的类型
voucher-券
	 */
	@ApiField("subject_type")
	private String subjectType;

	/**
	 * <p>Getter for the field <code>commissionClauseList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertCommissionClause> getCommissionClauseList() {
		return this.commissionClauseList;
	}
	/**
	 * <p>Setter for the field <code>commissionClauseList</code>.</p>
	 *
	 * @param commissionClauseList a {@link java.util.List} object.
	 */
	public void setCommissionClauseList(List<KbAdvertCommissionClause> commissionClauseList) {
		this.commissionClauseList = commissionClauseList;
	}

	/**
	 * <p>Getter for the field <code>subjectBizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubjectBizId() {
		return this.subjectBizId;
	}
	/**
	 * <p>Setter for the field <code>subjectBizId</code>.</p>
	 *
	 * @param subjectBizId a {@link java.lang.String} object.
	 */
	public void setSubjectBizId(String subjectBizId) {
		this.subjectBizId = subjectBizId;
	}

	/**
	 * <p>Getter for the field <code>subjectType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubjectType() {
		return this.subjectType;
	}
	/**
	 * <p>Setter for the field <code>subjectType</code>.</p>
	 *
	 * @param subjectType a {@link java.lang.String} object.
	 */
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
