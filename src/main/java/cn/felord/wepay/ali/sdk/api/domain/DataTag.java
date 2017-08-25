package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 明细数据标签
 *
 * @author auto create
 * @version $Id: $Id
 */
public class DataTag extends AlipayObject {

	private static final long serialVersionUID = 2293761318288912467L;

	/**
	 * 聚合方式NONE,COUNT,COUNT_DISTINCT,DISTINCT,MIN,MAX,SUM
	 */
	@ApiField("aggregate")
	private String aggregate;

	/**
	 * 列别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 标签CODE
	 */
	@ApiField("code")
	private String code;

	/**
	 * <p>Getter for the field <code>aggregate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAggregate() {
		return this.aggregate;
	}
	/**
	 * <p>Setter for the field <code>aggregate</code>.</p>
	 *
	 * @param aggregate a {@link java.lang.String} object.
	 */
	public void setAggregate(String aggregate) {
		this.aggregate = aggregate;
	}

	/**
	 * <p>Getter for the field <code>alias</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlias() {
		return this.alias;
	}
	/**
	 * <p>Setter for the field <code>alias</code>.</p>
	 *
	 * @param alias a {@link java.lang.String} object.
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
