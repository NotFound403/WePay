package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 用于查询用户数据
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Data extends AlipayObject {

	private static final long serialVersionUID = 6654418917494866958L;

	/**
	 * 用户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	/**
	 * <p>Getter for the field <code>userIdList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getUserIdList() {
		return this.userIdList;
	}
	/**
	 * <p>Setter for the field <code>userIdList</code>.</p>
	 *
	 * @param userIdList a {@link java.util.List} object.
	 */
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
