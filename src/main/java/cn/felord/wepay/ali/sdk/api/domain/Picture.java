package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 图片
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Picture extends AlipayObject {

	private static final long serialVersionUID = 4538812886286685282L;

	/**
	 * 调用alipay.offline.material.image.upload接口将图片上传到素材中心后，生成的ID
	 */
	@ApiField("location")
	private String location;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

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

}
