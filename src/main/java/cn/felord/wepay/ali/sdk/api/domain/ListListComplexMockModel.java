package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 复杂对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ListListComplexMockModel extends AlipayObject {

	private static final long serialVersionUID = 6315196415482365745L;

	/**
	 * 复杂对象list
	 */
	@ApiListField("cm_list")
	@ApiField("complext_mock_model")
	private List<ComplextMockModel> cmList;

	/**
	 * <p>Getter for the field <code>cmList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ComplextMockModel> getCmList() {
		return this.cmList;
	}
	/**
	 * <p>Setter for the field <code>cmList</code>.</p>
	 *
	 * @param cmList a {@link java.util.List} object.
	 */
	public void setCmList(List<ComplextMockModel> cmList) {
		this.cmList = cmList;
	}

}
