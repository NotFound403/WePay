package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户动态码通知配置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class TemplateMdcodeNotifyConfDTO extends AlipayObject {

	private static final long serialVersionUID = 1627624745917958249L;

	/**
	 * 扩展参数信息；
格式为key-value键值对；
支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数。
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 商户接收发码通知的地址链接；
只支持https地址；
用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>extParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtParams() {
		return this.extParams;
	}
	/**
	 * <p>Setter for the field <code>extParams</code>.</p>
	 *
	 * @param extParams a {@link java.lang.String} object.
	 */
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	/**
	 * <p>Getter for the field <code>url</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrl() {
		return this.url;
	}
	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
