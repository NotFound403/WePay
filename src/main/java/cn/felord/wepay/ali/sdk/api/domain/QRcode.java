package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 汽车超人，QRcode二元组类型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QRcode extends AlipayObject {

	private static final long serialVersionUID = 6424986416776332661L;

	/**
	 * 用户ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * qrcode地址
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	/**
	 * <p>Getter for the field <code>cardId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardId() {
		return this.cardId;
	}
	/**
	 * <p>Setter for the field <code>cardId</code>.</p>
	 *
	 * @param cardId a {@link java.lang.String} object.
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	/**
	 * <p>Getter for the field <code>qrcodeUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	/**
	 * <p>Setter for the field <code>qrcodeUrl</code>.</p>
	 *
	 * @param qrcodeUrl a {@link java.lang.String} object.
	 */
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

}
