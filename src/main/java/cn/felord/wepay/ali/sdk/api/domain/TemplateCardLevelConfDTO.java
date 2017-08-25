package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 会员卡级别配置信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TemplateCardLevelConfDTO extends AlipayObject {

	private static final long serialVersionUID = 2364491134768131451L;

	/**
	 * 会员级别 该级别和开卡接口中的levle要一致
	 */
	@ApiField("level")
	private String level;

	/**
	 * 会员级别描述
	 */
	@ApiField("level_desc")
	private String levelDesc;

	/**
	 * 会员级别对应icon， 通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("level_icon")
	private String levelIcon;

	/**
	 * 会员级别显示名称
	 */
	@ApiField("level_show_name")
	private String levelShowName;

	/**
	 * <p>Getter for the field <code>level</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevel() {
		return this.level;
	}
	/**
	 * <p>Setter for the field <code>level</code>.</p>
	 *
	 * @param level a {@link java.lang.String} object.
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * <p>Getter for the field <code>levelDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevelDesc() {
		return this.levelDesc;
	}
	/**
	 * <p>Setter for the field <code>levelDesc</code>.</p>
	 *
	 * @param levelDesc a {@link java.lang.String} object.
	 */
	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

	/**
	 * <p>Getter for the field <code>levelIcon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevelIcon() {
		return this.levelIcon;
	}
	/**
	 * <p>Setter for the field <code>levelIcon</code>.</p>
	 *
	 * @param levelIcon a {@link java.lang.String} object.
	 */
	public void setLevelIcon(String levelIcon) {
		this.levelIcon = levelIcon;
	}

	/**
	 * <p>Getter for the field <code>levelShowName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLevelShowName() {
		return this.levelShowName;
	}
	/**
	 * <p>Setter for the field <code>levelShowName</code>.</p>
	 *
	 * @param levelShowName a {@link java.lang.String} object.
	 */
	public void setLevelShowName(String levelShowName) {
		this.levelShowName = levelShowName;
	}

}
