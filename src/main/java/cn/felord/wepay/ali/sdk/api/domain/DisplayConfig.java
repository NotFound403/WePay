package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券的描述信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DisplayConfig extends AlipayObject {

	private static final long serialVersionUID = 7342684794645292642L;

	/**
	 * 券的宣传语
含圈人的直领活动，且投放渠道选择了支付成功页或店铺的情况下必填
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 券的宣传图片文件ID
含圈人的直领活动，且投放渠道选择了店铺的情况下必填
	 */
	@ApiField("slogan_img")
	private String sloganImg;

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
	 * <p>Getter for the field <code>sloganImg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSloganImg() {
		return this.sloganImg;
	}
	/**
	 * <p>Setter for the field <code>sloganImg</code>.</p>
	 *
	 * @param sloganImg a {@link java.lang.String} object.
	 */
	public void setSloganImg(String sloganImg) {
		this.sloganImg = sloganImg;
	}

}
