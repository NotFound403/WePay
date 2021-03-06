package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ContactFollower;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.contact.follow.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicContactFollowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6356255694583265438L;

	/** 
	 * 联系人关注者列表
	 */
	@ApiListField("contact_follow_list")
	@ApiField("contact_follower")
	private List<ContactFollower> contactFollowList;

	/**
	 * <p>Setter for the field <code>contactFollowList</code>.</p>
	 *
	 * @param contactFollowList a {@link java.util.List} object.
	 */
	public void setContactFollowList(List<ContactFollower> contactFollowList) {
		this.contactFollowList = contactFollowList;
	}
	/**
	 * <p>Getter for the field <code>contactFollowList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ContactFollower> getContactFollowList( ) {
		return this.contactFollowList;
	}

}
