package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 子菜单对象模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SubButton extends AlipayObject {

	private static final long serialVersionUID = 7499275226321449415L;

	/**
	 * 当actionType为link时，该参数为url链接； 
当actionType为out时，该参数为用户自定义参数； 
当actionType为tel时，该参数为电话号码。 
当action_type为map时，该参数为查看地图的关键字。
 当action_type为consumption时，该参数可不传。 
该参数最长255个字符，不允许冒号等特殊字符。
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 菜单类型：
out——事件型菜单；
link——链接型菜单；
tel——点击拨打电话；
map——点击查看地图；
consumption——点击查看用户与生活号管理员账号之间的消费记录
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * icon图片url，必须是http协议的url，尺寸为60X60，最大不超过5M，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 菜单名称，icon菜单名称不超过5个汉字，文本菜单名称不超过9个汉字，编码格式为GBK
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>actionParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionParam() {
		return this.actionParam;
	}
	/**
	 * <p>Setter for the field <code>actionParam</code>.</p>
	 *
	 * @param actionParam a {@link java.lang.String} object.
	 */
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	/**
	 * <p>Getter for the field <code>actionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionType() {
		return this.actionType;
	}
	/**
	 * <p>Setter for the field <code>actionType</code>.</p>
	 *
	 * @param actionType a {@link java.lang.String} object.
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	/**
	 * <p>Getter for the field <code>icon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIcon() {
		return this.icon;
	}
	/**
	 * <p>Setter for the field <code>icon</code>.</p>
	 *
	 * @param icon a {@link java.lang.String} object.
	 */
	public void setIcon(String icon) {
		this.icon = icon;
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
