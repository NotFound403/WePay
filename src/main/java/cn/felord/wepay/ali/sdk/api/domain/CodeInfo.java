package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗创建带参二维码接口，开发者自定义信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CodeInfo extends AlipayObject {

	private static final long serialVersionUID = 6719968982376534366L;

	/**
	 * 跳转URL，扫码关注服务窗后会直接跳转到此URL
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 场景信息
	 */
	@ApiField("scene")
	private Scene scene;

	/**
	 * <p>Getter for the field <code>gotoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGotoUrl() {
		return this.gotoUrl;
	}
	/**
	 * <p>Setter for the field <code>gotoUrl</code>.</p>
	 *
	 * @param gotoUrl a {@link java.lang.String} object.
	 */
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	/**
	 * <p>Getter for the field <code>scene</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Scene} object.
	 */
	public Scene getScene() {
		return this.scene;
	}
	/**
	 * <p>Setter for the field <code>scene</code>.</p>
	 *
	 * @param scene a {@link cn.felord.wepay.ali.sdk.api.domain.Scene} object.
	 */
	public void setScene(Scene scene) {
		this.scene = scene;
	}

}
