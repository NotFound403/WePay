package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.crowd.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicGroupCrowdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7773486375985248911L;

	/** 
	 * 分组圈出的人群数量
	 */
	@ApiField("count")
	private String count;

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

}
