package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.MerchantScreenHit;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.amlrisk.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdAmlriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1612229238762783329L;

	/** 
	 * 事件ID，由入参得来
	 */
	@ApiField("event_id")
	private String eventId;

	/** 
	 * 根据反洗钱风险检查，该商户是否有风险，有风险则为Yes，无风险则为No
	 */
	@ApiField("has_risk")
	private String hasRisk;

	/** 
	 * 商户ID，由入参得来
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 当发现有风险时，以列表形式表示风险详情，风险点可以有0个至多个。
	 */
	@ApiListField("risks")
	@ApiField("merchant_screen_hit")
	private List<MerchantScreenHit> risks;

	/**
	 * <p>Setter for the field <code>eventId</code>.</p>
	 *
	 * @param eventId a {@link java.lang.String} object.
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	/**
	 * <p>Getter for the field <code>eventId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEventId( ) {
		return this.eventId;
	}

	/**
	 * <p>Setter for the field <code>hasRisk</code>.</p>
	 *
	 * @param hasRisk a {@link java.lang.String} object.
	 */
	public void setHasRisk(String hasRisk) {
		this.hasRisk = hasRisk;
	}
	/**
	 * <p>Getter for the field <code>hasRisk</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHasRisk( ) {
		return this.hasRisk;
	}

	/**
	 * <p>Setter for the field <code>merchantId</code>.</p>
	 *
	 * @param merchantId a {@link java.lang.String} object.
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	/**
	 * <p>Getter for the field <code>merchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantId( ) {
		return this.merchantId;
	}

	/**
	 * <p>Setter for the field <code>risks</code>.</p>
	 *
	 * @param risks a {@link java.util.List} object.
	 */
	public void setRisks(List<MerchantScreenHit> risks) {
		this.risks = risks;
	}
	/**
	 * <p>Getter for the field <code>risks</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MerchantScreenHit> getRisks( ) {
		return this.risks;
	}

}
