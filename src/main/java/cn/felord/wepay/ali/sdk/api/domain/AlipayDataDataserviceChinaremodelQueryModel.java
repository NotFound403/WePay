package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 中再核保结果查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceChinaremodelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5547617581148955625L;

	/**
	 * 体检记录id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 交易流水记录id
	 */
	@ApiField("trans_id")
	private String transId;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>ruleId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRuleId() {
		return this.ruleId;
	}
	/**
	 * <p>Setter for the field <code>ruleId</code>.</p>
	 *
	 * @param ruleId a {@link java.lang.String} object.
	 */
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	/**
	 * <p>Getter for the field <code>transId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransId() {
		return this.transId;
	}
	/**
	 * <p>Setter for the field <code>transId</code>.</p>
	 *
	 * @param transId a {@link java.lang.String} object.
	 */
	public void setTransId(String transId) {
		this.transId = transId;
	}

}
