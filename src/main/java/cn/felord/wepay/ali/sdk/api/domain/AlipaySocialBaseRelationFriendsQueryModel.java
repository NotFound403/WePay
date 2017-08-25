package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取好友列表信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySocialBaseRelationFriendsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6739564924261834318L;

	/**
	 * 获取类型。1=获取双向好友   2=获取双向+单向好友
	 */
	@ApiField("get_type")
	private Long getType;

	/**
	 * 好友列表中是否返回自己， true=返回   false=不返回    默认false
	 */
	@ApiField("include_self")
	private Boolean includeSelf;

	/**
	 * <p>Getter for the field <code>getType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getGetType() {
		return this.getType;
	}
	/**
	 * <p>Setter for the field <code>getType</code>.</p>
	 *
	 * @param getType a {@link java.lang.Long} object.
	 */
	public void setGetType(Long getType) {
		this.getType = getType;
	}

	/**
	 * <p>Getter for the field <code>includeSelf</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIncludeSelf() {
		return this.includeSelf;
	}
	/**
	 * <p>Setter for the field <code>includeSelf</code>.</p>
	 *
	 * @param includeSelf a {@link java.lang.Boolean} object.
	 */
	public void setIncludeSelf(Boolean includeSelf) {
		this.includeSelf = includeSelf;
	}

}
