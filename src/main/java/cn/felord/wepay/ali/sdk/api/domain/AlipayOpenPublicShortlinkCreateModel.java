package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗短链自主生成接口
 *
 * @author auto create
 * @since 1.0, 2017-07-04 10:40:37
 */
public class AlipayOpenPublicShortlinkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6154725767291226734L;

	/**
	 * 对于场景ID的描述，商户自己定义
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 短链接对应的场景ID，该ID由商户自己定义
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
