package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4546217614357494186L;

	/** 
	 * 口碑体系内部商品的唯一标识，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 即入参中的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId( ) {
		return this.itemId;
	}

	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId( ) {
		return this.requestId;
	}

}
