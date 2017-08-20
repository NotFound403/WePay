package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CPAliveBillEntrySet;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.bill.modify response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-10 18:56:10
 */
public class AlipayEcoCplifeBillModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7627145899653211372L;

	/** 
	 * 不允许修改（支付中或者支付完成）的账单明细条目列表
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
