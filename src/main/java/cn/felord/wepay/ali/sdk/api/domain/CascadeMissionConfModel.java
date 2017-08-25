package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 二级分佣任务配置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CascadeMissionConfModel extends AlipayObject {

	private static final long serialVersionUID = 4852317897754167345L;

	/**
	 * 分佣条款列表
1、二级分佣，如果认领人类型为Promote，则不能设置独家（clause_type=MISSION_CLAIM_CLAUSE）
2、二级分用，最大金额无需设置，而是系统自动计算
	 */
	@ApiListField("commission_clause")
	@ApiField("kb_advert_commission_clause")
	private List<KbAdvertCommissionClause> commissionClause;

	/**
	 * 二级分佣认领人类型
PROMOTER:第三方推广者
KOUBEI_PLATFORM：口碑平台推广
	 */
	@ApiField("commission_user_type")
	private String commissionUserType;

	/**
	 * <p>Getter for the field <code>commissionClause</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertCommissionClause> getCommissionClause() {
		return this.commissionClause;
	}
	/**
	 * <p>Setter for the field <code>commissionClause</code>.</p>
	 *
	 * @param commissionClause a {@link java.util.List} object.
	 */
	public void setCommissionClause(List<KbAdvertCommissionClause> commissionClause) {
		this.commissionClause = commissionClause;
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
