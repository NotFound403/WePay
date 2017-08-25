package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.third.customer.service response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicThirdCustomerServiceResponse extends AlipayResponse {

	private static final long serialVersionUID = 5178971484985161123L;

	/** 
	 * 授权给第三方渠道商的服务窗名称
	 */
	@ApiField("public_name")
	private String publicName;

	/**
	 * <p>Setter for the field <code>publicName</code>.</p>
	 *
	 * @param publicName a {@link java.lang.String} object.
	 */
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
	/**
	 * <p>Getter for the field <code>publicName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicName( ) {
		return this.publicName;
	}

}
