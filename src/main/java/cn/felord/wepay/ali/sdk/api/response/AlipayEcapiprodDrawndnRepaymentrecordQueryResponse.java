package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.RepaymentRecords;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.repaymentrecord.query response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>repaymentRecords</code>.</p>
	 *
	 * @param repaymentRecords a {@link java.util.List} object.
	 */
	public void setRepaymentRecords(List<RepaymentRecords> repaymentRecords) {
		this.repaymentRecords = repaymentRecords;
	}
	/**
	 * <p>Getter for the field <code>repaymentRecords</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<RepaymentRecords> getRepaymentRecords( ) {
		return this.repaymentRecords;
	}

	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId( ) {
		return this.requestId;
	}

}
