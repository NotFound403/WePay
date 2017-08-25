package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 老版本复杂Listlist对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class OldListListComplexMockModel extends AlipayObject {

	private static final long serialVersionUID = 6732225811183879429L;

	/**
	 * 复杂模型list
	 */
	@ApiListField("cm_list")
	@ApiField("old_complext_mock_model")
	private List<OldComplextMockModel> cmList;

	/**
	 * <p>Getter for the field <code>cmList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OldComplextMockModel> getCmList() {
		return this.cmList;
	}
	/**
	 * <p>Setter for the field <code>cmList</code>.</p>
	 *
	 * @param cmList a {@link java.util.List} object.
	 */
	public void setCmList(List<OldComplextMockModel> cmList) {
		this.cmList = cmList;
	}

}
