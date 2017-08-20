package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.userid.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-06 21:37:53
 */
public class AlipayUserAccountUseridBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3497112112994888891L;

	/** 
	 * 用户列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
