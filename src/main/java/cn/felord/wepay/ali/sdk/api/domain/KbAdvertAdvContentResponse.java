package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统广告内容
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertAdvContentResponse extends AlipayObject {

	private static final long serialVersionUID = 6241861834683667222L;

	/**
	 * 二维码类型的内容模型（当content_type为codec时，返回该模型）
	 */
	@ApiField("content_codec")
	private KbAdvertContentCodec contentCodec;

	/**
	 * 口令红包类型的内容模型（当content_type为passwordRed时，返回该模型）
	 */
	@ApiField("content_password")
	private KbAdvertContentPassword contentPassword;

	/**
	 * 吱口令类型的内容模型（当content_type为shareCode时，返回该模型）
	 */
	@ApiListField("content_share_code")
	@ApiField("kb_advert_content_share_code")
	private List<KbAdvertContentShareCode> contentShareCode;

	/**
	 * 短链接类型的内容模型（当content_type为shortLink时，返回该模型）
	 */
	@ApiField("content_short_link")
	private KbAdvertContentShortLink contentShortLink;

	/**
	 * 广告内容类型；
shortLink：短链接；
codec：二维码；
passwordRed：口令红包；
shareCode：吱口令；
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * <p>Getter for the field <code>contentCodec</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentCodec} object.
	 */
	public KbAdvertContentCodec getContentCodec() {
		return this.contentCodec;
	}
	/**
	 * <p>Setter for the field <code>contentCodec</code>.</p>
	 *
	 * @param contentCodec a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentCodec} object.
	 */
	public void setContentCodec(KbAdvertContentCodec contentCodec) {
		this.contentCodec = contentCodec;
	}

	/**
	 * <p>Getter for the field <code>contentPassword</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentPassword} object.
	 */
	public KbAdvertContentPassword getContentPassword() {
		return this.contentPassword;
	}
	/**
	 * <p>Setter for the field <code>contentPassword</code>.</p>
	 *
	 * @param contentPassword a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentPassword} object.
	 */
	public void setContentPassword(KbAdvertContentPassword contentPassword) {
		this.contentPassword = contentPassword;
	}

	/**
	 * <p>Getter for the field <code>contentShareCode</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<KbAdvertContentShareCode> getContentShareCode() {
		return this.contentShareCode;
	}
	/**
	 * <p>Setter for the field <code>contentShareCode</code>.</p>
	 *
	 * @param contentShareCode a {@link java.util.List} object.
	 */
	public void setContentShareCode(List<KbAdvertContentShareCode> contentShareCode) {
		this.contentShareCode = contentShareCode;
	}

	/**
	 * <p>Getter for the field <code>contentShortLink</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentShortLink} object.
	 */
	public KbAdvertContentShortLink getContentShortLink() {
		return this.contentShortLink;
	}
	/**
	 * <p>Setter for the field <code>contentShortLink</code>.</p>
	 *
	 * @param contentShortLink a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentShortLink} object.
	 */
	public void setContentShortLink(KbAdvertContentShortLink contentShortLink) {
		this.contentShortLink = contentShortLink;
	}

	/**
	 * <p>Getter for the field <code>contentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentType() {
		return this.contentType;
	}
	/**
	 * <p>Setter for the field <code>contentType</code>.</p>
	 *
	 * @param contentType a {@link java.lang.String} object.
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
