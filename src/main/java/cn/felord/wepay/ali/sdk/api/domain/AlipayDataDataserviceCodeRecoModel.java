package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 改api为数立提供验证码识别服务。isv可以通过该接口，使用我们的图片识别能力。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceCodeRecoModel extends AlipayObject {

	private static final long serialVersionUID = 3158818882588986476L;

	/**
	 * 参数配置：内容包括验证码之类，长度，是否可分割等
	 */
	@ApiField("config")
	private String config;

	/**
	 * 图片的内容(以base64位编码)，大小不超过10k
	 */
	@ApiField("content")
	private String content;

	/**
	 * 策略，目前有2种，机器识别与人工打码（机器：machine；人工打码：manual）
	 */
	@ApiField("strategy")
	private String strategy;

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
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>strategy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStrategy() {
		return this.strategy;
	}
	/**
	 * <p>Setter for the field <code>strategy</code>.</p>
	 *
	 * @param strategy a {@link java.lang.String} object.
	 */
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}
