package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.follow.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1732687938188784363L;

	/** 
	 * 本次调用获取的userId个数，最大值为10000
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 查询分组的userid
	 */
	@ApiField("next_user_id")
	private String nextUserId;

	/** 
	 * 用户的userId列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.String} object.
	 */
	public void setCount(String count) {
		this.count = count;
	}
	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCount( ) {
		return this.count;
	}

	/**
	 * <p>Setter for the field <code>nextUserId</code>.</p>
	 *
	 * @param nextUserId a {@link java.lang.String} object.
	 */
	public void setNextUserId(String nextUserId) {
		this.nextUserId = nextUserId;
	}
	/**
	 * <p>Getter for the field <code>nextUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNextUserId( ) {
		return this.nextUserId;
	}

	/**
	 * <p>Setter for the field <code>userIdList</code>.</p>
	 *
	 * @param userIdList a {@link java.util.List} object.
	 */
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	/**
	 * <p>Getter for the field <code>userIdList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
