package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.Retailer;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.retailer.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-06 10:47:45
 */
public class KoubeiMemberRetailerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448458269343441938L;

	/** 
	 * 零售商信息列表
	 */
	@ApiListField("retailer_list")
	@ApiField("retailer")
	private List<Retailer> retailerList;

	public void setRetailerList(List<Retailer> retailerList) {
		this.retailerList = retailerList;
	}
	public List<Retailer> getRetailerList( ) {
		return this.retailerList;
	}

}
