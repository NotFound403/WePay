package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.MerchantCard;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2766467469594584739L;

	/** 
	 * 商户卡信息
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/** 
	 * 商户会员卡页面跳转到支付宝卡券详情页面的schema地址
	 */
	@ApiField("schema_url")
	private String schemaUrl;

	/**
	 * <p>Setter for the field <code>cardInfo</code>.</p>
	 *
	 * @param cardInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}
	/**
	 * <p>Getter for the field <code>cardInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public MerchantCard getCardInfo( ) {
		return this.cardInfo;
	}

	/**
	 * <p>Setter for the field <code>schemaUrl</code>.</p>
	 *
	 * @param schemaUrl a {@link java.lang.String} object.
	 */
	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}
	/**
	 * <p>Getter for the field <code>schemaUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSchemaUrl( ) {
		return this.schemaUrl;
	}

}
