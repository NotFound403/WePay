package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险批单申请接口
 *
 * @author auto create
 * @since 1.0, 2016-12-29 17:49:22
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

	public List<InsEndorseItem> getEndorseItems() {
		return this.endorseItems;
	}
	public void setEndorseItems(List<InsEndorseItem> endorseItems) {
		this.endorseItems = endorseItems;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
