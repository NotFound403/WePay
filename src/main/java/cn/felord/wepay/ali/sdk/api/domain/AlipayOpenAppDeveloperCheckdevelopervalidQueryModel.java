package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝账号入驻开放平台有效性检查
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppDeveloperCheckdevelopervalidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7394352284625745487L;

	/**
	 * 支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * <p>Getter for the field <code>logonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogonId() {
		return this.logonId;
	}
	/**
	 * <p>Setter for the field <code>logonId</code>.</p>
	 *
	 * @param logonId a {@link java.lang.String} object.
	 */
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
