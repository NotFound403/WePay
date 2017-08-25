package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 扫码存放码值的类型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDecodeData extends AlipayObject {

	private static final long serialVersionUID = 2749152414994264211L;

	/**
	 * 钱包二维码码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
