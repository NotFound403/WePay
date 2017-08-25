package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 卡模板样式信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TemplateStyleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4364676526187121647L;

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
	 * 品牌商名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 钱包端显示名称（字符串长度）
	 */
	@ApiField("card_show_name")
	private String cardShowName;

	/**
	 * 卡片颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 特色信息，用于领卡预览
	 */
	@ApiListField("feature_descriptions")
	@ApiField("string")
	private List<String> featureDescriptions;

	/**
	 * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
尺寸不小于500*500px的正方形；
请优先使用商家LOGO；
	 */
	@ApiField("logo_id")
	private String logoId;

	/**
	 * 标语
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 标语图片， 通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("slogan_img_id")
	private String sloganImgId;

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
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName() {
		return this.brandName;
	}
	/**
	 * <p>Setter for the field <code>brandName</code>.</p>
	 *
	 * @param brandName a {@link java.lang.String} object.
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * <p>Getter for the field <code>cardShowName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardShowName() {
		return this.cardShowName;
	}
	/**
	 * <p>Setter for the field <code>cardShowName</code>.</p>
	 *
	 * @param cardShowName a {@link java.lang.String} object.
	 */
	public void setCardShowName(String cardShowName) {
		this.cardShowName = cardShowName;
	}

	/**
	 * <p>Getter for the field <code>color</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getColor() {
		return this.color;
	}
	/**
	 * <p>Setter for the field <code>color</code>.</p>
	 *
	 * @param color a {@link java.lang.String} object.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * <p>Getter for the field <code>featureDescriptions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getFeatureDescriptions() {
		return this.featureDescriptions;
	}
	/**
	 * <p>Setter for the field <code>featureDescriptions</code>.</p>
	 *
	 * @param featureDescriptions a {@link java.util.List} object.
	 */
	public void setFeatureDescriptions(List<String> featureDescriptions) {
		this.featureDescriptions = featureDescriptions;
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

	/**
	 * <p>Getter for the field <code>slogan</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSlogan() {
		return this.slogan;
	}
	/**
	 * <p>Setter for the field <code>slogan</code>.</p>
	 *
	 * @param slogan a {@link java.lang.String} object.
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	/**
	 * <p>Getter for the field <code>sloganImgId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSloganImgId() {
		return this.sloganImgId;
	}
	/**
	 * <p>Setter for the field <code>sloganImgId</code>.</p>
	 *
	 * @param sloganImgId a {@link java.lang.String} object.
	 */
	public void setSloganImgId(String sloganImgId) {
		this.sloganImgId = sloganImgId;
	}

}
