package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 主记录+对应资金明细信息列表模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FundDetailItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 3894851923165311846L;

	/**
	 * 主记录+对应资金明细信息模型列表
	 */
	@ApiListField("single_fund_detail_item_aopmodel_list")
	@ApiField("single_fund_detail_item_a_o_p_model")
	private List<SingleFundDetailItemAOPModel> singleFundDetailItemAopmodelList;

	/**
	 * <p>Getter for the field <code>singleFundDetailItemAopmodelList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<SingleFundDetailItemAOPModel> getSingleFundDetailItemAopmodelList() {
		return this.singleFundDetailItemAopmodelList;
	}
	/**
	 * <p>Setter for the field <code>singleFundDetailItemAopmodelList</code>.</p>
	 *
	 * @param singleFundDetailItemAopmodelList a {@link java.util.List} object.
	 */
	public void setSingleFundDetailItemAopmodelList(List<SingleFundDetailItemAOPModel> singleFundDetailItemAopmodelList) {
		this.singleFundDetailItemAopmodelList = singleFundDetailItemAopmodelList;
	}

}
