package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 简单模型嵌套list
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ListListSmMockModel extends AlipayObject {

	private static final long serialVersionUID = 4548293459177257439L;

	/**
	 * 简单模型列表
	 */
	@ApiListField("list_simple_model_list")
	@ApiField("simple_mock_model")
	private List<SimpleMockModel> listSimpleModelList;

	/**
	 * <p>Getter for the field <code>listSimpleModelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<SimpleMockModel> getListSimpleModelList() {
		return this.listSimpleModelList;
	}
	/**
	 * <p>Setter for the field <code>listSimpleModelList</code>.</p>
	 *
	 * @param listSimpleModelList a {@link java.util.List} object.
	 */
	public void setListSimpleModelList(List<SimpleMockModel> listSimpleModelList) {
		this.listSimpleModelList = listSimpleModelList;
	}

}
