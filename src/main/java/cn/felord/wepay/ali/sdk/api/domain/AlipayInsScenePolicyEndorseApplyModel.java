package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险批单申请接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsScenePolicyEndorseApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4488161348867733936L;

	/**
	 * 批单项列表
	 */
	@ApiListField("endorse_items")
	@ApiField("ins_endorse_item")
	private List<InsEndorseItem> endorseItems;

	/**
	 * 商户生成的批改请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 保单凭证号;蚂蚁保险平台生成的保单凭证号,用户可以通过此单号去保险公司查询保单信息.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 批单来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * <p>Getter for the field <code>endorseItems</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsEndorseItem> getEndorseItems() {
		return this.endorseItems;
	}
	/**
	 * <p>Setter for the field <code>endorseItems</code>.</p>
	 *
	 * @param endorseItems a {@link java.util.List} object.
	 */
	public void setEndorseItems(List<InsEndorseItem> endorseItems) {
		this.endorseItems = endorseItems;
	}

	/**
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	/**
	 * <p>Getter for the field <code>policyNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPolicyNo() {
		return this.policyNo;
	}
	/**
	 * <p>Setter for the field <code>policyNo</code>.</p>
	 *
	 * @param policyNo a {@link java.lang.String} object.
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

}
