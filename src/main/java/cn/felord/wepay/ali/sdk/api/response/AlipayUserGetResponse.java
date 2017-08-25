package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayUserDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1669146415147341183L;

	/** 
	 * 支付宝用户信息
	 */
	@ApiField("alipay_user_detail")
	private AlipayUserDetail alipayUserDetail;

	/**
	 * <p>Setter for the field <code>alipayUserDetail</code>.</p>
	 *
	 * @param alipayUserDetail a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayUserDetail} object.
	 */
	public void setAlipayUserDetail(AlipayUserDetail alipayUserDetail) {
		this.alipayUserDetail = alipayUserDetail;
	}
	/**
	 * <p>Getter for the field <code>alipayUserDetail</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayUserDetail} object.
	 */
	public AlipayUserDetail getAlipayUserDetail( ) {
		return this.alipayUserDetail;
	}

}
