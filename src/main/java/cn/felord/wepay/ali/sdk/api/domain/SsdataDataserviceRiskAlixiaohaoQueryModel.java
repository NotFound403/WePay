package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询阿里通信小号信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceRiskAlixiaohaoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5329375844725163756L;

	/**
	 * 电话号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * <p>Getter for the field <code>mobileNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobileNo() {
		return this.mobileNo;
	}
	/**
	 * <p>Setter for the field <code>mobileNo</code>.</p>
	 *
	 * @param mobileNo a {@link java.lang.String} object.
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
