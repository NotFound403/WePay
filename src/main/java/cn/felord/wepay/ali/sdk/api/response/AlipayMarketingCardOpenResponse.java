package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.MerchantCard;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.open response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardOpenResponse extends AlipayResponse {

	private static final long serialVersionUID = 6313343285629938676L;

	/** 
	 * 商户卡信息（包括支付宝分配的业务卡号）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

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

}
