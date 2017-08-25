package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 模板开卡配置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TemplateOpenCardConfDTO extends AlipayObject {

	private static final long serialVersionUID = 5123375913172196279L;

	/**
	 * 配置，预留字段，暂时不用
	 */
	@ApiField("conf")
	private String conf;

	/**
	 * ISV：外部系统
MER：直连商户
	 */
	@ApiField("open_card_source_type")
	private String openCardSourceType;

	/**
	 * 开卡连接，必须http、https开头
	 */
	@ApiField("open_card_url")
	private String openCardUrl;

	/**
	 * 渠道APPID，提供领卡页面的服务提供方
	 */
	@ApiField("source_app_id")
	private String sourceAppId;

	/**
	 * <p>Getter for the field <code>conf</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConf() {
		return this.conf;
	}
	/**
	 * <p>Setter for the field <code>conf</code>.</p>
	 *
	 * @param conf a {@link java.lang.String} object.
	 */
	public void setConf(String conf) {
		this.conf = conf;
	}

	/**
	 * <p>Getter for the field <code>openCardSourceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenCardSourceType() {
		return this.openCardSourceType;
	}
	/**
	 * <p>Setter for the field <code>openCardSourceType</code>.</p>
	 *
	 * @param openCardSourceType a {@link java.lang.String} object.
	 */
	public void setOpenCardSourceType(String openCardSourceType) {
		this.openCardSourceType = openCardSourceType;
	}

	/**
	 * <p>Getter for the field <code>openCardUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenCardUrl() {
		return this.openCardUrl;
	}
	/**
	 * <p>Setter for the field <code>openCardUrl</code>.</p>
	 *
	 * @param openCardUrl a {@link java.lang.String} object.
	 */
	public void setOpenCardUrl(String openCardUrl) {
		this.openCardUrl = openCardUrl;
	}

	/**
	 * <p>Getter for the field <code>sourceAppId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceAppId() {
		return this.sourceAppId;
	}
	/**
	 * <p>Setter for the field <code>sourceAppId</code>.</p>
	 *
	 * @param sourceAppId a {@link java.lang.String} object.
	 */
	public void setSourceAppId(String sourceAppId) {
		this.sourceAppId = sourceAppId;
	}

}
