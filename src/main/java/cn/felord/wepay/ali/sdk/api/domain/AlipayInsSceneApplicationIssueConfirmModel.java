package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 投保订单出单确认
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneApplicationIssueConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2286368138873377448L;

	/**
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * <p>Getter for the field <code>applicationNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	/**
	 * <p>Setter for the field <code>applicationNo</code>.</p>
	 *
	 * @param applicationNo a {@link java.lang.String} object.
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

}
