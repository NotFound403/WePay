package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 二级分佣信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertCascadeCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 7225364537841973269L;

	/**
	 * 二级分佣条款信息
	 */
	@ApiListField("commission_clause_infos")
	@ApiField("kb_advert_commission_clause")
	private List<KbAdvertCommissionClause> commissionClauseInfos;

	/**
	 * 二级分佣任务认领人类型
PROMOTER：其他推广者
KOUBEI_PLATFORM：口碑平台
	 */
	@ApiField("commission_user_type")
	private String commissionUserType;

	/**
	 * <p>Getter for the field <code>commissionClauseInfos</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertCommissionClause> getCommissionClauseInfos() {
		return this.commissionClauseInfos;
	}
	/**
	 * <p>Setter for the field <code>commissionClauseInfos</code>.</p>
	 *
	 * @param commissionClauseInfos a {@link java.util.List} object.
	 */
	public void setCommissionClauseInfos(List<KbAdvertCommissionClause> commissionClauseInfos) {
		this.commissionClauseInfos = commissionClauseInfos;
	}

	/**
	 * <p>Getter for the field <code>commissionUserType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommissionUserType() {
		return this.commissionUserType;
	}
	/**
	 * <p>Setter for the field <code>commissionUserType</code>.</p>
	 *
	 * @param commissionUserType a {@link java.lang.String} object.
	 */
	public void setCommissionUserType(String commissionUserType) {
		this.commissionUserType = commissionUserType;
	}

}
