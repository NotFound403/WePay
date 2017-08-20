package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取用户地理位置
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */
public class AlipayOpenPublicGisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5838557255658125277L;

	/**
	 * 该用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
