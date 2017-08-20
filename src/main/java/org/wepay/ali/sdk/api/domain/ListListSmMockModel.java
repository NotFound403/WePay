package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 简单模型嵌套list
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class ListListSmMockModel extends AlipayObject {

	private static final long serialVersionUID = 4548293459177257439L;

	/**
	 * 简单模型列表
	 */
	@ApiListField("list_simple_model_list")
	@ApiField("simple_mock_model")
	private List<SimpleMockModel> listSimpleModelList;

	public List<SimpleMockModel> getListSimpleModelList() {
		return this.listSimpleModelList;
	}
	public void setListSimpleModelList(List<SimpleMockModel> listSimpleModelList) {
		this.listSimpleModelList = listSimpleModelList;
	}

}
