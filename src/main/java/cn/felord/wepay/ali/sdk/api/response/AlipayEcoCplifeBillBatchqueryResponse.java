package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CPBillResultSet;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.bill.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-10 18:52:46
 */
public class AlipayEcoCplifeBillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6146433577511998935L;

	/** 
	 * 若查询到符合条件的账单条目，返回结果集
	 */
	@ApiListField("bill_result_set")
	@ApiField("c_p_bill_result_set")
	private List<CPBillResultSet> billResultSet;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 符合条件的总结果数
	 */
	@ApiField("total_bill_count")
	private Long totalBillCount;

	public void setBillResultSet(List<CPBillResultSet> billResultSet) {
		this.billResultSet = billResultSet;
	}
	public List<CPBillResultSet> getBillResultSet( ) {
		return this.billResultSet;
	}

	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	public void setTotalBillCount(Long totalBillCount) {
		this.totalBillCount = totalBillCount;
	}
	public Long getTotalBillCount( ) {
		return this.totalBillCount;
	}

}
