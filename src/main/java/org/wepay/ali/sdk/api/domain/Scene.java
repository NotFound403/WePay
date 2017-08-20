package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗创建带参二维码接口，场景信息
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:27:01
 */
public class Scene extends AlipayObject {

	private static final long serialVersionUID = 4696182464732175989L;

	/**
	 * 场景Id，最长32位，英文字母、数字以及下划线，开发者自定义
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
