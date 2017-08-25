package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 查询商品编码对应的商品是否存在
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemExtitemExistedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6596564855239735496L;

	/**
	 * 商品编码列表, 商品编码数量不超过100条。
	 */
	@ApiListField("code_list")
	@ApiField("string")
	private List<String> codeList;

	/**
	 * <p>Getter for the field <code>codeList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCodeList() {
		return this.codeList;
	}
	/**
	 * <p>Setter for the field <code>codeList</code>.</p>
	 *
	 * @param codeList a {@link java.util.List} object.
	 */
	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

}
