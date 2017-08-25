package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 小程序生成推广二维码接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2221723786355456931L;

	/**
	 * 对应的二维码描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 小程序的启动参数，打开小程序的query ，在小程序 onLaunch的方法中获取
	 */
	@ApiField("query_param")
	private String queryParam;

	/**
	 * page/component/component-pages/view/view为小程序中能访问到的页面路径
	 */
	@ApiField("url_param")
	private String urlParam;

	/**
	 * <p>Getter for the field <code>describe</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescribe() {
		return this.describe;
	}
	/**
	 * <p>Setter for the field <code>describe</code>.</p>
	 *
	 * @param describe a {@link java.lang.String} object.
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	/**
	 * <p>Getter for the field <code>queryParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQueryParam() {
		return this.queryParam;
	}
	/**
	 * <p>Setter for the field <code>queryParam</code>.</p>
	 *
	 * @param queryParam a {@link java.lang.String} object.
	 */
	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	/**
	 * <p>Getter for the field <code>urlParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrlParam() {
		return this.urlParam;
	}
	/**
	 * <p>Setter for the field <code>urlParam</code>.</p>
	 *
	 * @param urlParam a {@link java.lang.String} object.
	 */
	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

}
