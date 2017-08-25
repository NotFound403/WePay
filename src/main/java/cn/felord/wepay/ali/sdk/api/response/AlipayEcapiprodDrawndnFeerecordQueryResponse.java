package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.FeeRecords;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.feerecord.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodDrawndnFeerecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3753969694262593486L;

	/** 
	 * 费用交易流水
	 */
	@ApiListField("fee_records")
	@ApiField("fee_records")
	private List<FeeRecords> feeRecords;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Setter for the field <code>feeRecords</code>.</p>
	 *
	 * @param feeRecords a {@link java.util.List} object.
	 */
	public void setFeeRecords(List<FeeRecords> feeRecords) {
		this.feeRecords = feeRecords;
	}
	/**
	 * <p>Getter for the field <code>feeRecords</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<FeeRecords> getFeeRecords( ) {
		return this.feeRecords;
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
