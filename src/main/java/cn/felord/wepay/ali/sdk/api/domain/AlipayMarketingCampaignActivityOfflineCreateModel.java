package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 能够创商户建领券活动,后续支持
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignActivityOfflineCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3181883363734512556L;

	/**
	 * 预算信息
	 */
	@ApiField("budget")
	private OpenPromoBudget budget;

	/**
	 * 活动信息
	 */
	@ApiField("camp")
	private OpenPromoCamp camp;

	/**
	 * 活动创建单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 奖品信息
	 */
	@ApiField("prize")
	private OpenPromoPrize prize;

	/**
	 * <p>Getter for the field <code>budget</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoBudget} object.
	 */
	public OpenPromoBudget getBudget() {
		return this.budget;
	}
	/**
	 * <p>Setter for the field <code>budget</code>.</p>
	 *
	 * @param budget a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoBudget} object.
	 */
	public void setBudget(OpenPromoBudget budget) {
		this.budget = budget;
	}

	/**
	 * <p>Getter for the field <code>camp</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoCamp} object.
	 */
	public OpenPromoCamp getCamp() {
		return this.camp;
	}
	/**
	 * <p>Setter for the field <code>camp</code>.</p>
	 *
	 * @param camp a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoCamp} object.
	 */
	public void setCamp(OpenPromoCamp camp) {
		this.camp = camp;
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
	 * <p>Getter for the field <code>prize</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoPrize} object.
	 */
	public OpenPromoPrize getPrize() {
		return this.prize;
	}
	/**
	 * <p>Setter for the field <code>prize</code>.</p>
	 *
	 * @param prize a {@link cn.felord.wepay.ali.sdk.api.domain.OpenPromoPrize} object.
	 */
	public void setPrize(OpenPromoPrize prize) {
		this.prize = prize;
	}

}
