package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 内容风险识别结果查询接口服务
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityRiskContentResultGetModel extends AlipayObject {

	private static final long serialVersionUID = 4566344843169312241L;

	/**
	 * 应用场景
	 */
	@ApiField("app_scene")
	private String appScene;

	/**
	 * alipay.security.risk.content.analyze （内容风险识别接口服务）中的内容业务ID，用于进行异步识别结果的索引查询
	 */
	@ApiField("app_scene_data_id")
	private String appSceneDataId;

	/**
	 * <p>Getter for the field <code>appScene</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppScene() {
		return this.appScene;
	}
	/**
	 * <p>Setter for the field <code>appScene</code>.</p>
	 *
	 * @param appScene a {@link java.lang.String} object.
	 */
	public void setAppScene(String appScene) {
		this.appScene = appScene;
	}

	/**
	 * <p>Getter for the field <code>appSceneDataId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppSceneDataId() {
		return this.appSceneDataId;
	}
	/**
	 * <p>Setter for the field <code>appSceneDataId</code>.</p>
	 *
	 * @param appSceneDataId a {@link java.lang.String} object.
	 */
	public void setAppSceneDataId(String appSceneDataId) {
		this.appSceneDataId = appSceneDataId;
	}

}
