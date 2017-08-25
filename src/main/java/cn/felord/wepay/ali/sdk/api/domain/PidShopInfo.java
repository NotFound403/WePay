package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 招商pid和pid对应的门第列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class PidShopInfo extends AlipayObject {

	private static final long serialVersionUID = 3722644688636178653L;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * pid下的门店列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid() {
		return this.pid;
	}
	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * <p>Getter for the field <code>shopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getShopIds() {
		return this.shopIds;
	}
	/**
	 * <p>Setter for the field <code>shopIds</code>.</p>
	 *
	 * @param shopIds a {@link java.util.List} object.
	 */
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
