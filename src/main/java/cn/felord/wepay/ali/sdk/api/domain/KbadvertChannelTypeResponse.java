package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 渠道类型配置
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbadvertChannelTypeResponse extends AlipayObject {

	private static final long serialVersionUID = 3866424991312169229L;

	/**
	 * 渠道描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 排序，暂时无用
	 */
	@ApiField("order")
	private String order;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * <p>Getter for the field <code>order</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrder() {
		return this.order;
	}
	/**
	 * <p>Setter for the field <code>order</code>.</p>
	 *
	 * @param order a {@link java.lang.String} object.
	 */
	public void setOrder(String order) {
		this.order = order;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
