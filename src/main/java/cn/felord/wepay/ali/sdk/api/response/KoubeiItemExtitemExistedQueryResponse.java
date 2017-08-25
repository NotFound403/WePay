package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.existed.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemExtitemExistedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8592473781877544589L;

	/** 
	 * 商品库中存在的商品编码
	 */
	@ApiListField("existed_list")
	@ApiField("string")
	private List<String> existedList;

	/**
	 * <p>Setter for the field <code>existedList</code>.</p>
	 *
	 * @param existedList a {@link java.util.List} object.
	 */
	public void setExistedList(List<String> existedList) {
		this.existedList = existedList;
	}
	/**
	 * <p>Getter for the field <code>existedList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getExistedList( ) {
		return this.existedList;
	}

}
