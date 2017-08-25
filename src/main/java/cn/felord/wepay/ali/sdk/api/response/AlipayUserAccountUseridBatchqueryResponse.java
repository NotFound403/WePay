package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.userid.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAccountUseridBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3497112112994888891L;

	/** 
	 * 用户列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	/**
	 * <p>Setter for the field <code>userIdList</code>.</p>
	 *
	 * @param userIdList a {@link java.util.List} object.
	 */
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	/**
	 * <p>Getter for the field <code>userIdList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
