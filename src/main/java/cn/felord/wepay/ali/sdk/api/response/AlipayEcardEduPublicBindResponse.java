package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.public.bind response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcardEduPublicBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6555799294962742377L;

	/** 
	 * 机构编码
	 */
	@ApiField("agent_code")
	private String agentCode;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 成功
	 */
	@ApiField("return_code")
	private String returnCode;

	/**
	 * <p>Setter for the field <code>agentCode</code>.</p>
	 *
	 * @param agentCode a {@link java.lang.String} object.
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	/**
	 * <p>Getter for the field <code>agentCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgentCode( ) {
		return this.agentCode;
	}

	/**
	 * <p>Setter for the field <code>cardNo</code>.</p>
	 *
	 * @param cardNo a {@link java.lang.String} object.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * <p>Getter for the field <code>cardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCardNo( ) {
		return this.cardNo;
	}

	/**
	 * <p>Setter for the field <code>returnCode</code>.</p>
	 *
	 * @param returnCode a {@link java.lang.String} object.
	 */
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	/**
	 * <p>Getter for the field <code>returnCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getReturnCode( ) {
		return this.returnCode;
	}

}
