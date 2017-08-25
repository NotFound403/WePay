package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取关注者列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicFollowBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4126315194572925779L;

	/**
	 * 当关注者数量超过10000时使用，本次拉取数据中第一个用户的userId，从上次接口调用返回值中获取。第一次调用置空
	 */
	@ApiField("next_user_id")
	private String nextUserId;

	/**
	 * <p>Getter for the field <code>nextUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNextUserId() {
		return this.nextUserId;
	}
	/**
	 * <p>Setter for the field <code>nextUserId</code>.</p>
	 *
	 * @param nextUserId a {@link java.lang.String} object.
	 */
	public void setNextUserId(String nextUserId) {
		this.nextUserId = nextUserId;
	}

}
