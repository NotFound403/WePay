package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.RepaymentRecords;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.repaymentrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-29 11:34:40
 */
public class AlipayEcapiprodDrawndnRepaymentrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1845829292135662989L;

	/** 
	 * 还款流水
	 */
	@ApiListField("repayment_records")
	@ApiField("repayment_records")
	private List<RepaymentRecords> repaymentRecords;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRepaymentRecords(List<RepaymentRecords> repaymentRecords) {
		this.repaymentRecords = repaymentRecords;
	}
	public List<RepaymentRecords> getRepaymentRecords( ) {
		return this.repaymentRecords;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
