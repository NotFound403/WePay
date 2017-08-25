package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.data.external.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarDataExternalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4385488594579591576L;

	/** 
	 * 20
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/** 
	 * outter_response
	 */
	@ApiField("process_result")
	private String processResult;

	/**
	 * <p>Setter for the field <code>externalSystemName</code>.</p>
	 *
	 * @param externalSystemName a {@link java.lang.String} object.
	 */
	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}
	/**
	 * <p>Getter for the field <code>externalSystemName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalSystemName( ) {
		return this.externalSystemName;
	}

	/**
	 * <p>Setter for the field <code>processResult</code>.</p>
	 *
	 * @param processResult a {@link java.lang.String} object.
	 */
	public void setProcessResult(String processResult) {
		this.processResult = processResult;
	}
	/**
	 * <p>Getter for the field <code>processResult</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProcessResult( ) {
		return this.processResult;
	}

}
