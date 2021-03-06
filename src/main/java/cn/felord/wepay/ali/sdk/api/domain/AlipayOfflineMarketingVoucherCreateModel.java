package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券模板创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketingVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4752396624181592621L;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 券码池编号。该值调用：alipay.offline.marketing.voucher.code.upload接口生成
	 */
	@ApiField("code_inventory_id")
	private String codeInventoryId;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发放规则信息
	 */
	@ApiField("get_rule")
	private GetRuleInfo getRule;

	/**
	 * 外部流水号.需商家自己生成并保证每次请求的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券模板信息
	 */
	@ApiField("voucher_info")
	private VoucherInfo voucherInfo;

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
	 * <p>Getter for the field <code>codeInventoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeInventoryId() {
		return this.codeInventoryId;
	}
	/**
	 * <p>Setter for the field <code>codeInventoryId</code>.</p>
	 *
	 * @param codeInventoryId a {@link java.lang.String} object.
	 */
	public void setCodeInventoryId(String codeInventoryId) {
		this.codeInventoryId = codeInventoryId;
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
	 * <p>Getter for the field <code>getRule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.GetRuleInfo} object.
	 */
	public GetRuleInfo getGetRule() {
		return this.getRule;
	}
	/**
	 * <p>Setter for the field <code>getRule</code>.</p>
	 *
	 * @param getRule a {@link cn.felord.wepay.ali.sdk.api.domain.GetRuleInfo} object.
	 */
	public void setGetRule(GetRuleInfo getRule) {
		this.getRule = getRule;
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
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.VoucherInfo} object.
	 */
	public VoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	/**
	 * <p>Setter for the field <code>voucherInfo</code>.</p>
	 *
	 * @param voucherInfo a {@link cn.felord.wepay.ali.sdk.api.domain.VoucherInfo} object.
	 */
	public void setVoucherInfo(VoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
