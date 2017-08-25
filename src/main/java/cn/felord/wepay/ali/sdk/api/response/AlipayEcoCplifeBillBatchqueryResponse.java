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
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>billResultSet</code>.</p>
	 *
	 * @param billResultSet a {@link java.util.List} object.
	 */
	public void setBillResultSet(List<CPBillResultSet> billResultSet) {
		this.billResultSet = billResultSet;
	}
	/**
	 * <p>Getter for the field <code>billResultSet</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CPBillResultSet> getBillResultSet( ) {
		return this.billResultSet;
	}

	/**
	 * <p>Setter for the field <code>currentPageNum</code>.</p>
	 *
	 * @param currentPageNum a {@link java.lang.Long} object.
	 */
	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	/**
	 * <p>Getter for the field <code>currentPageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	/**
	 * <p>Setter for the field <code>totalBillCount</code>.</p>
	 *
	 * @param totalBillCount a {@link java.lang.Long} object.
	 */
	public void setTotalBillCount(Long totalBillCount) {
		this.totalBillCount = totalBillCount;
	}
	/**
	 * <p>Getter for the field <code>totalBillCount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalBillCount( ) {
		return this.totalBillCount;
	}

}
