package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * xwbtest
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdXwbtestPurchaseModel extends AlipayObject {

	private static final long serialVersionUID = 6756855987543679856L;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("add")
	private String add;

	/**
	 * 西湖区文三路国际大厦
	 */
	@ApiField("address")
	private String address;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如1需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("idcard")
	private String idcard;

	/**
	 * s
	 */
	@ApiField("sdf")
	private AlipayKeyanClass sdf;

	/**
	 * 1 1
	 */
	@ApiListField("sdfx")
	@ApiField("string")
	private List<String> sdfx;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>add</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdd() {
		return this.add;
	}
	/**
	 * <p>Setter for the field <code>add</code>.</p>
	 *
	 * @param add a {@link java.lang.String} object.
	 */
	public void setAdd(String add) {
		this.add = add;
	}

	/**
	 * <p>Getter for the field <code>address</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * <p>Setter for the field <code>address</code>.</p>
	 *
	 * @param address a {@link java.lang.String} object.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * <p>Getter for the field <code>idcard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdcard() {
		return this.idcard;
	}
	/**
	 * <p>Setter for the field <code>idcard</code>.</p>
	 *
	 * @param idcard a {@link java.lang.String} object.
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	/**
	 * <p>Getter for the field <code>sdf</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayKeyanClass} object.
	 */
	public AlipayKeyanClass getSdf() {
		return this.sdf;
	}
	/**
	 * <p>Setter for the field <code>sdf</code>.</p>
	 *
	 * @param sdf a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayKeyanClass} object.
	 */
	public void setSdf(AlipayKeyanClass sdf) {
		this.sdf = sdf;
	}

	/**
	 * <p>Getter for the field <code>sdfx</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getSdfx() {
		return this.sdfx;
	}
	/**
	 * <p>Setter for the field <code>sdfx</code>.</p>
	 *
	 * @param sdfx a {@link java.util.List} object.
	 */
	public void setSdfx(List<String> sdfx) {
		this.sdfx = sdfx;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
