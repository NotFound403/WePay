package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 单品信息列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayItemGoodsList extends AlipayObject {

	private static final long serialVersionUID = 2867388724736357182L;

	/**
	 * 外部单品的描述信息（此字段暂时无用）
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 外部单品id列表，传入服务商、商户系统中的商品id。
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
