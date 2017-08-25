package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.QueryGroup;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicGroupBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5274367159925232727L;

	/** 
	 * 用户分组列表，包含每个分组的id、name、以及规则模型
	 */
	@ApiListField("groups")
	@ApiField("query_group")
	private List<QueryGroup> groups;

	/**
	 * <p>Setter for the field <code>groups</code>.</p>
	 *
	 * @param groups a {@link java.util.List} object.
	 */
	public void setGroups(List<QueryGroup> groups) {
		this.groups = groups;
	}
	/**
	 * <p>Getter for the field <code>groups</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QueryGroup> getGroups( ) {
		return this.groups;
	}

}
