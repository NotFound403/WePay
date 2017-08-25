package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.activateurl.apply response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardActivateurlApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4439649512457185581L;

	/** 
	 * 会员卡领卡链接。商户获取此链接后可投放到服务窗消息、店铺二维码等。
	 */
	@ApiField("apply_card_url")
	private String applyCardUrl;

	/**
	 * <p>Setter for the field <code>applyCardUrl</code>.</p>
	 *
	 * @param applyCardUrl a {@link java.lang.String} object.
	 */
	public void setApplyCardUrl(String applyCardUrl) {
		this.applyCardUrl = applyCardUrl;
	}
	/**
	 * <p>Getter for the field <code>applyCardUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyCardUrl( ) {
		return this.applyCardUrl;
	}

}
