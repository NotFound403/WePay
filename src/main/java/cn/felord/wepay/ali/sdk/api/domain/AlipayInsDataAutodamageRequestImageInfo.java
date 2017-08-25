package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 车险图像定损请求中的图像信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsDataAutodamageRequestImageInfo extends AlipayObject {

	private static final long serialVersionUID = 5387299276917251498L;

	/**
	 * 图像文件名称
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 图像文件在存储上的路径
	 */
	@ApiField("image_path")
	private String imagePath;

	/**
	 * <p>Getter for the field <code>imageName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageName() {
		return this.imageName;
	}
	/**
	 * <p>Setter for the field <code>imageName</code>.</p>
	 *
	 * @param imageName a {@link java.lang.String} object.
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * <p>Getter for the field <code>imagePath</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImagePath() {
		return this.imagePath;
	}
	/**
	 * <p>Setter for the field <code>imagePath</code>.</p>
	 *
	 * @param imagePath a {@link java.lang.String} object.
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
