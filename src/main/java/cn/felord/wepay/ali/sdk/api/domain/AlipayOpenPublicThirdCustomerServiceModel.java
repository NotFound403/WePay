package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 服务窗第三方渠道商配置接口，用于记录服务窗商户授权的第三方渠道商
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicThirdCustomerServiceModel extends AlipayObject {

	private static final long serialVersionUID = 8146141974261744598L;

	/**
	 * 服务窗商户在渠道商处对应的用户id
	 */
	@ApiField("channel_uid")
	private String channelUid;

	/**
	 * <p>Getter for the field <code>channelUid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelUid() {
		return this.channelUid;
	}
	/**
	 * <p>Setter for the field <code>channelUid</code>.</p>
	 *
	 * @param channelUid a {@link java.lang.String} object.
	 */
	public void setChannelUid(String channelUid) {
		this.channelUid = channelUid;
	}

}
