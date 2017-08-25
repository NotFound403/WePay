package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.contract.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcapiprodDrawndnContractGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5154138388936252537L;

	/** 
	 * 合同的内容文本	String	合同的内容文本，为HTML格式
	 */
	@ApiField("contract_content")
	private String contractContent;

	/** 
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Setter for the field <code>contractContent</code>.</p>
	 *
	 * @param contractContent a {@link java.lang.String} object.
	 */
	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}
	/**
	 * <p>Getter for the field <code>contractContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContractContent( ) {
		return this.contractContent;
	}

	/**
	 * <p>Setter for the field <code>contractNo</code>.</p>
	 *
	 * @param contractNo a {@link java.lang.String} object.
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	/**
	 * <p>Getter for the field <code>contractNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContractNo( ) {
		return this.contractNo;
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
