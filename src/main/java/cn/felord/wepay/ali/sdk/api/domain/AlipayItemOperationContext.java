package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商品操作上下文
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayItemOperationContext extends AlipayObject {

	private static final long serialVersionUID = 1253396837362522168L;

	/**
	 * 商品创建者，商户授权模式此值不需要填写。
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 操作角色类型，授权授权模式下此值不需要填写。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 商户ID，如果商户传入此值，将以此商户ID作为业务主体，商户授权模式此值不需要填写。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * <p>Getter for the field <code>creator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreator() {
		return this.creator;
	}
	/**
	 * <p>Setter for the field <code>creator</code>.</p>
	 *
	 * @param creator a {@link java.lang.String} object.
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * <p>Getter for the field <code>opRole</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpRole() {
		return this.opRole;
	}
	/**
	 * <p>Setter for the field <code>opRole</code>.</p>
	 *
	 * @param opRole a {@link java.lang.String} object.
	 */
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
	}
	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
