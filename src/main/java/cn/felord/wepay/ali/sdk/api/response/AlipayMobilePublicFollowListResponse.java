package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.Data;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.follow.list response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicFollowListResponse extends AlipayResponse {

	private static final long serialVersionUID = 7676987581258945931L;

	/** 
	 * 返回结果码，如200，标识成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 当前组的值
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 用户数据
	 */
	@ApiField("data")
	private Data data;

	/** 
	 * 与nextUserId对应，标准Alipay UserId
	 */
	@ApiField("next_alipay_user_id")
	private String nextAlipayUserId;

	/** 
	 * 查询分组的userid
	 */
	@ApiField("next_user_id")
	private String nextUserId;

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

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
	 * <p>Setter for the field <code>data</code>.</p>
	 *
	 * @param data a {@link cn.felord.wepay.ali.sdk.api.domain.Data} object.
	 */
	public void setData(Data data) {
		this.data = data;
	}
	/**
	 * <p>Getter for the field <code>data</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Data} object.
	 */
	public Data getData( ) {
		return this.data;
	}

	/**
	 * <p>Setter for the field <code>nextAlipayUserId</code>.</p>
	 *
	 * @param nextAlipayUserId a {@link java.lang.String} object.
	 */
	public void setNextAlipayUserId(String nextAlipayUserId) {
		this.nextAlipayUserId = nextAlipayUserId;
	}
	/**
	 * <p>Getter for the field <code>nextAlipayUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNextAlipayUserId( ) {
		return this.nextAlipayUserId;
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

}
