package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.xwbtest.purchase response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdXwbtestPurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4623816833543112996L;

	/** 
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("add")
	private String add;

	/** 
	 * 1
	 */
	@ApiField("as")
	private String as;

	/** 
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiListField("del")
	@ApiField("boolean")
	private List<Boolean> del;

	/** 
	 * 参数描述必须1通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("idcard")
	private String idcard;

	/**
	 * <p>Setter for the field <code>add</code>.</p>
	 *
	 * @param add a {@link java.lang.String} object.
	 */
	public void setAdd(String add) {
		this.add = add;
	}
	/**
	 * <p>Getter for the field <code>add</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdd( ) {
		return this.add;
	}

	/**
	 * <p>Setter for the field <code>as</code>.</p>
	 *
	 * @param as a {@link java.lang.String} object.
	 */
	public void setAs(String as) {
		this.as = as;
	}
	/**
	 * <p>Getter for the field <code>as</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAs( ) {
		return this.as;
	}

	/**
	 * <p>Setter for the field <code>del</code>.</p>
	 *
	 * @param del a {@link java.util.List} object.
	 */
	public void setDel(List<Boolean> del) {
		this.del = del;
	}
	/**
	 * <p>Getter for the field <code>del</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Boolean> getDel( ) {
		return this.del;
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
	 * <p>Getter for the field <code>idcard</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdcard( ) {
		return this.idcard;
	}

}
