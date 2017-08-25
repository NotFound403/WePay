package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.Retailer;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.retailer.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMemberRetailerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448458269343441938L;

	/** 
	 * 零售商信息列表
	 */
	@ApiListField("retailer_list")
	@ApiField("retailer")
	private List<Retailer> retailerList;

	/**
	 * <p>Setter for the field <code>retailerList</code>.</p>
	 *
	 * @param retailerList a {@link java.util.List} object.
	 */
	public void setRetailerList(List<Retailer> retailerList) {
		this.retailerList = retailerList;
	}
	/**
	 * <p>Getter for the field <code>retailerList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Retailer> getRetailerList( ) {
		return this.retailerList;
	}

}
