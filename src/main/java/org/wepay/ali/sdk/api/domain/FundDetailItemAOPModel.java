package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 主记录+对应资金明细信息列表模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class FundDetailItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 3894851923165311846L;

	/**
	 * 主记录+对应资金明细信息模型列表
	 */
	@ApiListField("single_fund_detail_item_aopmodel_list")
	@ApiField("single_fund_detail_item_a_o_p_model")
	private List<SingleFundDetailItemAOPModel> singleFundDetailItemAopmodelList;

	public List<SingleFundDetailItemAOPModel> getSingleFundDetailItemAopmodelList() {
		return this.singleFundDetailItemAopmodelList;
	}
	public void setSingleFundDetailItemAopmodelList(List<SingleFundDetailItemAOPModel> singleFundDetailItemAopmodelList) {
		this.singleFundDetailItemAopmodelList = singleFundDetailItemAopmodelList;
	}

}
