package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.ListListSmMockModel;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listsmlist.api response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:34:02
 */
public class AlipayMobilePublicStdMockListsmlistApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 4548186429959737171L;

	/** 
	 * 简单对象嵌套List
	 */
	@ApiListField("list_sm_model_list")
	@ApiField("list_list_sm_mock_model")
	private List<ListListSmMockModel> listSmModelList;

	public void setListSmModelList(List<ListListSmMockModel> listSmModelList) {
		this.listSmModelList = listSmModelList;
	}
	public List<ListListSmMockModel> getListSmModelList( ) {
		return this.listSmModelList;
	}

}
