package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险营销优惠预核销
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsMarketingDiscountPreuseModel extends AlipayObject {

	private static final long serialVersionUID = 4259843343854947652L;

	/**
	 * 保险营销账号Id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 保险营销账号类型
	 */
	@ApiField("account_type")
	private Long accountType;

	/**
	 * 保险营销业务类型
	 */
	@ApiField("business_type")
	private Long businessType;

	/**
	 * 优惠决策因子
	 */
	@ApiListField("factors")
	@ApiField("ins_mkt_factor_d_t_o")
	private List<InsMktFactorDTO> factors;

	/**
	 * 营销市场列表
	 */
	@ApiListField("market_types")
	@ApiField("number")
	private List<Long> marketTypes;

	/**
	 * 权益活动列表
	 */
	@ApiListField("mkt_coupon_campaigns")
	@ApiField("ins_mkt_coupon_cmpgn_base_d_t_o")
	private List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns;

	/**
	 * 用户选择的权益列表
	 */
	@ApiListField("mkt_coupons")
	@ApiField("ins_mkt_coupon_base_d_t_o")
	private List<InsMktCouponBaseDTO> mktCoupons;

	/**
	 * 营销标的列表
	 */
	@ApiListField("mkt_objects")
	@ApiField("ins_mkt_object_d_t_o")
	private List<InsMktObjectDTO> mktObjects;

	/**
	 * 请求流水id
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
	 * <p>Getter for the field <code>businessType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBusinessType() {
		return this.businessType;
	}
	/**
	 * <p>Setter for the field <code>businessType</code>.</p>
	 *
	 * @param businessType a {@link java.lang.Long} object.
	 */
	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
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
	 * <p>Getter for the field <code>marketTypes</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getMarketTypes() {
		return this.marketTypes;
	}
	/**
	 * <p>Setter for the field <code>marketTypes</code>.</p>
	 *
	 * @param marketTypes a {@link java.util.List} object.
	 */
	public void setMarketTypes(List<Long> marketTypes) {
		this.marketTypes = marketTypes;
	}

	/**
	 * <p>Getter for the field <code>mktCouponCampaigns</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsMktCouponCmpgnBaseDTO> getMktCouponCampaigns() {
		return this.mktCouponCampaigns;
	}
	/**
	 * <p>Setter for the field <code>mktCouponCampaigns</code>.</p>
	 *
	 * @param mktCouponCampaigns a {@link java.util.List} object.
	 */
	public void setMktCouponCampaigns(List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns) {
		this.mktCouponCampaigns = mktCouponCampaigns;
	}

	/**
	 * <p>Getter for the field <code>mktCoupons</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsMktCouponBaseDTO> getMktCoupons() {
		return this.mktCoupons;
	}
	/**
	 * <p>Setter for the field <code>mktCoupons</code>.</p>
	 *
	 * @param mktCoupons a {@link java.util.List} object.
	 */
	public void setMktCoupons(List<InsMktCouponBaseDTO> mktCoupons) {
		this.mktCoupons = mktCoupons;
	}

	/**
	 * <p>Getter for the field <code>mktObjects</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsMktObjectDTO> getMktObjects() {
		return this.mktObjects;
	}
	/**
	 * <p>Setter for the field <code>mktObjects</code>.</p>
	 *
	 * @param mktObjects a {@link java.util.List} object.
	 */
	public void setMktObjects(List<InsMktObjectDTO> mktObjects) {
		this.mktObjects = mktObjects;
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
