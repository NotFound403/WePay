package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.userblacklist.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceTransportOfflinepayUserblacklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6283439689119468555L;

	/** 
	 * 黑名单用户ID
	 */
	@ApiListField("black_list")
	@ApiField("string")
	private List<String> blackList;

	/**
	 * <p>Setter for the field <code>blackList</code>.</p>
	 *
	 * @param blackList a {@link java.util.List} object.
	 */
	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}
	/**
	 * <p>Getter for the field <code>blackList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getBlackList( ) {
		return this.blackList;
	}

}
