package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商圈会员交易信息订阅申请
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingMallTradeSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 2284416558464819567L;

	/**
	 * 卡模版id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * <p>Getter for the field <code>cardTemplateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	/**
	 * <p>Setter for the field <code>cardTemplateId</code>.</p>
	 *
	 * @param cardTemplateId a {@link java.lang.String} object.
	 */
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	/**
	 * <p>Getter for the field <code>mallId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMallId() {
		return this.mallId;
	}
	/**
	 * <p>Setter for the field <code>mallId</code>.</p>
	 *
	 * @param mallId a {@link java.lang.String} object.
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
