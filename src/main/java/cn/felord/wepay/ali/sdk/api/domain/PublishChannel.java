package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 投放渠道
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PublishChannel extends AlipayObject {

	private static final long serialVersionUID = 4159582474477442187L;

	/**
	 * 当type为MERCHANT_CROWD时，config需填入口令送的密码和图片，样例如下："config":"{\"PASSWORD\":\"口令送密码\",\"BACKGROUND_LOGO\":\"1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC\"}"
	 */
	@ApiField("config")
	private String config;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道类型，目前支持以下类型
QR_CODE：二维码投放
SHORT_LINK：短连接投放
SHOP_DETAIL：店铺页投放
PAYMENT_RESULT：支付成功页
MERCHANT_CROWD：口令送
URL_WITH_TOKEN：外部发奖活动，只有活动类型为DIRECT_SEND时才支持
EXTERNAL：外部投放，口碑需要感知任何投放内容
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>config</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConfig() {
		return this.config;
	}
	/**
	 * <p>Setter for the field <code>config</code>.</p>
	 *
	 * @param config a {@link java.lang.String} object.
	 */
	public void setConfig(String config) {
		this.config = config;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
