package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡卡面样式
 *
 * @author auto create
 * @version $Id: $Id
 */
public class McardStylInfo extends AlipayObject {

	private static final long serialVersionUID = 2564413765774219686L;

	/**
	 * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；
尺寸不小于1020*643px；
图片不得有圆角，不得拉伸变形
	 */
	@ApiField("background_id")
	private String backgroundId;

	/**
	 * 背景色
	 */
	@ApiField("bg_color")
	private String bgColor;

	/**
	 * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
尺寸不小于500*500px的正方形；
请优先使用商家LOGO；
	 */
	@ApiField("logo_id")
	private String logoId;

	/**
	 * <p>Getter for the field <code>backgroundId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBackgroundId() {
		return this.backgroundId;
	}
	/**
	 * <p>Setter for the field <code>backgroundId</code>.</p>
	 *
	 * @param backgroundId a {@link java.lang.String} object.
	 */
	public void setBackgroundId(String backgroundId) {
		this.backgroundId = backgroundId;
	}

	/**
	 * <p>Getter for the field <code>bgColor</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBgColor() {
		return this.bgColor;
	}
	/**
	 * <p>Setter for the field <code>bgColor</code>.</p>
	 *
	 * @param bgColor a {@link java.lang.String} object.
	 */
	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	/**
	 * <p>Getter for the field <code>logoId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogoId() {
		return this.logoId;
	}
	/**
	 * <p>Setter for the field <code>logoId</code>.</p>
	 *
	 * @param logoId a {@link java.lang.String} object.
	 */
	public void setLogoId(String logoId) {
		this.logoId = logoId;
	}

}
