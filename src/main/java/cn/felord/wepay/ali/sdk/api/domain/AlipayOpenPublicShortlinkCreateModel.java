package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗短链自主生成接口
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

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
