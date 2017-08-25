package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.LendingRecords;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.lendingrecord.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodDrawndnLendingrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1398937316564445391L;

	/** 
	 * 放款流水
	 */
	@ApiListField("lending_records")
	@ApiField("lending_records")
	private List<LendingRecords> lendingRecords;

	/** 
	 * 代表一次请求的唯一编号，用于追溯问题，多方联调查询问题时，ISV 可以提供该RequestId给网关，网关用来查询本次请求的具体日志
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Setter for the field <code>lendingRecords</code>.</p>
	 *
	 * @param lendingRecords a {@link java.util.List} object.
	 */
	public void setLendingRecords(List<LendingRecords> lendingRecords) {
		this.lendingRecords = lendingRecords;
	}
	/**
	 * <p>Getter for the field <code>lendingRecords</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<LendingRecords> getLendingRecords( ) {
		return this.lendingRecords;
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
