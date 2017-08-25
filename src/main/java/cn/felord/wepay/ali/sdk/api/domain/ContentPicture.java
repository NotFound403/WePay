package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 内容图片
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ContentPicture extends AlipayObject {

	private static final long serialVersionUID = 3571793217142125732L;

	/**
	 * 调用alipay.offline.material.image.upload，将图片上传到素材中心后，生成的ID
	 */
	@ApiField("location")
	private String location;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * "DISH"："菜品"，"ENVIRONMENT"："环境"，"SHOPHEAD"："门头照"，"OTHER"："其他"
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>location</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLocation() {
		return this.location;
	}
	/**
	 * <p>Setter for the field <code>location</code>.</p>
	 *
	 * @param location a {@link java.lang.String} object.
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
