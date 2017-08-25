package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险营销活动发奖接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsMarketingCampaignPrizeSendModel extends AlipayObject {

	private static final long serialVersionUID = 3258459973354586243L;

	/**
	 * 账户id，如支付宝userId：2088102161835009
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账号类型
	 */
	@ApiField("account_type")
	private Long accountType;

	/**
	 * 营销保险活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 发奖规则因子
	 */
	@ApiListField("factors")
	@ApiField("ins_mkt_factor_d_t_o")
	private List<InsMktFactorDTO> factors;

	/**
	 * 发奖接口幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 请求流水Id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Getter for the field <code>accountId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountId() {
		return this.accountId;
	}
	/**
	 * <p>Setter for the field <code>accountId</code>.</p>
	 *
	 * @param accountId a {@link java.lang.String} object.
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * <p>Getter for the field <code>accountType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAccountType() {
		return this.accountType;
	}
	/**
	 * <p>Setter for the field <code>accountType</code>.</p>
	 *
	 * @param accountType a {@link java.lang.Long} object.
	 */
	public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

	/**
	 * <p>Getter for the field <code>campaignId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCampaignId() {
		return this.campaignId;
	}
	/**
	 * <p>Setter for the field <code>campaignId</code>.</p>
	 *
	 * @param campaignId a {@link java.lang.String} object.
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	/**
	 * <p>Getter for the field <code>factors</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsMktFactorDTO> getFactors() {
		return this.factors;
	}
	/**
	 * <p>Setter for the field <code>factors</code>.</p>
	 *
	 * @param factors a {@link java.util.List} object.
	 */
	public void setFactors(List<InsMktFactorDTO> factors) {
		this.factors = factors;
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
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
