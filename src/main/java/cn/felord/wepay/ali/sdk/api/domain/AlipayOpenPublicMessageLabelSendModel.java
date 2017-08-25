package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 根据标签组发消息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMessageLabelSendModel extends AlipayObject {

	private static final long serialVersionUID = 4229976739348546171L;

	/**
	 * 根据标签圈人的过滤器
	 */
	@ApiField("filter")
	private Filter filter;

	/**
	 * 发送消息内容，支持文本消息和图文消息
	 */
	@ApiField("material")
	private Material material;

	/**
	 * <p>Getter for the field <code>filter</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Filter} object.
	 */
	public Filter getFilter() {
		return this.filter;
	}
	/**
	 * <p>Setter for the field <code>filter</code>.</p>
	 *
	 * @param filter a {@link cn.felord.wepay.ali.sdk.api.domain.Filter} object.
	 */
	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	/**
	 * <p>Getter for the field <code>material</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Material} object.
	 */
	public Material getMaterial() {
		return this.material;
	}
	/**
	 * <p>Setter for the field <code>material</code>.</p>
	 *
	 * @param material a {@link cn.felord.wepay.ali.sdk.api.domain.Material} object.
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}

}
