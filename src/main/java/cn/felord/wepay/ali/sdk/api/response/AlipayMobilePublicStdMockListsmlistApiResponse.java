package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ListListSmMockModel;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listsmlist.api response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicStdMockListsmlistApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 4548186429959737171L;

	/** 
	 * 简单对象嵌套List
	 */
	@ApiListField("list_sm_model_list")
	@ApiField("list_list_sm_mock_model")
	private List<ListListSmMockModel> listSmModelList;

	/**
	 * <p>Setter for the field <code>listSmModelList</code>.</p>
	 *
	 * @param listSmModelList a {@link java.util.List} object.
	 */
	public void setListSmModelList(List<ListListSmMockModel> listSmModelList) {
		this.listSmModelList = listSmModelList;
	}
	/**
	 * <p>Getter for the field <code>listSmModelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ListListSmMockModel> getListSmModelList( ) {
		return this.listSmModelList;
	}

}
