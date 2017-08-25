package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 单品信息列表（数据）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataItemGoodsList extends AlipayObject {

	private static final long serialVersionUID = 8439684661982591244L;

	/**
	 * 单品的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 单品id列表
	 */
	@ApiListField("goods_list")
	@ApiField("string")
	private List<String> goodsList;

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
	 * <p>Getter for the field <code>goodsList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getGoodsList() {
		return this.goodsList;
	}
	/**
	 * <p>Setter for the field <code>goodsList</code>.</p>
	 *
	 * @param goodsList a {@link java.util.List} object.
	 */
	public void setGoodsList(List<String> goodsList) {
		this.goodsList = goodsList;
	}

}
