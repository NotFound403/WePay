package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分佣任务的标的信息
 *
 * @author auto create
 * @since 1.0, 2017-01-13 11:53:39
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

	public List<KbAdvertCommissionClause> getCommissionClauseList() {
		return this.commissionClauseList;
	}
	public void setCommissionClauseList(List<KbAdvertCommissionClause> commissionClauseList) {
		this.commissionClauseList = commissionClauseList;
	}

	public String getSubjectBizId() {
		return this.subjectBizId;
	}
	public void setSubjectBizId(String subjectBizId) {
		this.subjectBizId = subjectBizId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
