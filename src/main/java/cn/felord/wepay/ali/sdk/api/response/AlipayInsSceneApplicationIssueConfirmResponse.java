package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.issue.confirm response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneApplicationIssueConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7862293897477356918L;

	/** 
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * <p>Setter for the field <code>applicationNo</code>.</p>
	 *
	 * @param applicationNo a {@link java.lang.String} object.
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	/**
	 * <p>Getter for the field <code>applicationNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

}
