package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用于支付宝用户通过医院服务窗绑定当地社保卡
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceMedicalInstcardBindModel extends AlipayObject {

	private static final long serialVersionUID = 5375871775424842141L;

	/**
	 * 区域编码，使用国家行政区划代码，可参看
http://www.stats.gov.cn/tjsj/tjbz/xzqhdm
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 支付宝处理完请求后，如验证成功，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	@ApiField("return_url")
	private String returnUrl;

	/**
	 * <p>Getter for the field <code>cityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityCode() {
		return this.cityCode;
	}
	/**
	 * <p>Setter for the field <code>cityCode</code>.</p>
	 *
	 * @param cityCode a {@link java.lang.String} object.
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * <p>Getter for the field <code>returnUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReturnUrl() {
		return this.returnUrl;
	}
	/**
	 * <p>Setter for the field <code>returnUrl</code>.</p>
	 *
	 * @param returnUrl a {@link java.lang.String} object.
	 */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
