package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗创建带参二维码接口，场景信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Scene extends AlipayObject {

	private static final long serialVersionUID = 4696182464732175989L;

	/**
	 * 场景Id，最长32位，英文字母、数字以及下划线，开发者自定义
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * <p>Getter for the field <code>sceneId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSceneId() {
		return this.sceneId;
	}
	/**
	 * <p>Setter for the field <code>sceneId</code>.</p>
	 *
	 * @param sceneId a {@link java.lang.String} object.
	 */
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
