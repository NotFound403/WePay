package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统标的
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KbAdvertSubjectResponse extends AlipayObject {

	private static final long serialVersionUID = 1118123817144439774L;

	/**
	 * 分佣规则
	 */
	@ApiField("commission_clause")
	private KbAdvertCommissionClauseResponse commissionClause;

	/**
	 * 标的类型
voucher-券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券标的
只有type=voucher才会有值
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucherResponse voucher;

	public KbAdvertCommissionClauseResponse getCommissionClause() {
		return this.commissionClause;
	}
	public void setCommissionClause(KbAdvertCommissionClauseResponse commissionClause) {
		this.commissionClause = commissionClause;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public KbAdvertSubjectVoucherResponse getVoucher() {
		return this.voucher;
	}
	public void setVoucher(KbAdvertSubjectVoucherResponse voucher) {
		this.voucher = voucher;
	}

}
