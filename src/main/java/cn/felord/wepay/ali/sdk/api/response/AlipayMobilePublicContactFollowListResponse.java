package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.contact.follow.list response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobilePublicContactFollowListResponse extends AlipayResponse {

	private static final long serialVersionUID = 3139913895274429838L;

	/** 
	 * 返回结果码，如200，标识成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 联系人关注者列表
	 */
	@ApiListField("contact_follow_list")
	@ApiField("string")
	private List<String> contactFollowList;

	/** {@inheritDoc} */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode( ) {
		return this.code;
	}

	/**
	 * <p>Setter for the field <code>contactFollowList</code>.</p>
	 *
	 * @param contactFollowList a {@link java.util.List} object.
	 */
	public void setContactFollowList(List<String> contactFollowList) {
		this.contactFollowList = contactFollowList;
	}
	/**
	 * <p>Getter for the field <code>contactFollowList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getContactFollowList( ) {
		return this.contactFollowList;
	}

}
