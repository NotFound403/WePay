package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券修改
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketingVoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1226724632189884798L;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发放次数限制
	 */
	@ApiField("get_count_limit")
	private PeriodInfo getCountLimit;

	/**
	 * 外部流水号.需商家自己生成并保证每次请求的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券信息
	 */
	@ApiField("voucher_info")
	private VoucherModifyInfo voucherInfo;

	/**
	 * <p>Getter for the field <code>budgetInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.BudgetInfo} object.
	 */
	public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}
	/**
	 * <p>Setter for the field <code>budgetInfo</code>.</p>
	 *
	 * @param budgetInfo a {@link cn.felord.wepay.ali.sdk.api.domain.BudgetInfo} object.
	 */
	public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>getCountLimit</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.PeriodInfo} object.
	 */
	public PeriodInfo getGetCountLimit() {
		return this.getCountLimit;
	}
	/**
	 * <p>Setter for the field <code>getCountLimit</code>.</p>
	 *
	 * @param getCountLimit a {@link cn.felord.wepay.ali.sdk.api.domain.PeriodInfo} object.
	 */
	public void setGetCountLimit(PeriodInfo getCountLimit) {
		this.getCountLimit = getCountLimit;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * <p>Getter for the field <code>voucherInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.VoucherModifyInfo} object.
	 */
	public VoucherModifyInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	/**
	 * <p>Setter for the field <code>voucherInfo</code>.</p>
	 *
	 * @param voucherInfo a {@link cn.felord.wepay.ali.sdk.api.domain.VoucherModifyInfo} object.
	 */
	public void setVoucherInfo(VoucherModifyInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
