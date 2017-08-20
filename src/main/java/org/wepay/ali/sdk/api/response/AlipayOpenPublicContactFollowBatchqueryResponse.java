package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.ContactFollower;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.contact.follow.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-08 11:56:17
 */
public class AlipayOpenPublicContactFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6356255694583265438L;

	/** 
	 * 联系人关注者列表
	 */
	@ApiListField("contact_follow_list")
	@ApiField("contact_follower")
	private List<ContactFollower> contactFollowList;

	public void setContactFollowList(List<ContactFollower> contactFollowList) {
		this.contactFollowList = contactFollowList;
	}
	public List<ContactFollower> getContactFollowList( ) {
		return this.contactFollowList;
	}

}
