package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.CPAliveBillEntrySet;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.bill.delete response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-10 18:52:02
 */
public class AlipayEcoCplifeBillDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1299373414329269964L;

	/** 
	 * 不允许删除（支付中或者支付完成）的账单明细条目列表
	 */
	@ApiListField("alive_bill_entry_list")
	@ApiField("c_p_alive_bill_entry_set")
	private List<CPAliveBillEntrySet> aliveBillEntryList;

	public void setAliveBillEntryList(List<CPAliveBillEntrySet> aliveBillEntryList) {
		this.aliveBillEntryList = aliveBillEntryList;
	}
	public List<CPAliveBillEntrySet> getAliveBillEntryList( ) {
		return this.aliveBillEntryList;
	}

}
