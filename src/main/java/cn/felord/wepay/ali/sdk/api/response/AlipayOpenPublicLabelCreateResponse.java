package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1294257964477311435L;

	/** 
	 * 支付宝返回的标签ID，开发者后续通过该ID进行标签的查询、修改、删除等操作
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 开发者传入name的值
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Long} object.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getId( ) {
		return this.id;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName( ) {
		return this.name;
	}

}
