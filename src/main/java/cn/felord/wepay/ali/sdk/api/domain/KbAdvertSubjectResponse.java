package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统标的
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>commissionClause</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClauseResponse} object.
	 */
	public KbAdvertCommissionClauseResponse getCommissionClause() {
		return this.commissionClause;
	}
	/**
	 * <p>Setter for the field <code>commissionClause</code>.</p>
	 *
	 * @param commissionClause a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertCommissionClauseResponse} object.
	 */
	public void setCommissionClause(KbAdvertCommissionClauseResponse commissionClause) {
		this.commissionClause = commissionClause;
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
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertSubjectVoucherResponse} object.
	 */
	public KbAdvertSubjectVoucherResponse getVoucher() {
		return this.voucher;
	}
	/**
	 * <p>Setter for the field <code>voucher</code>.</p>
	 *
	 * @param voucher a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertSubjectVoucherResponse} object.
	 */
	public void setVoucher(KbAdvertSubjectVoucherResponse voucher) {
		this.voucher = voucher;
	}

}
