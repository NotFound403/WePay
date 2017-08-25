package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户检测(机构名 + 支付宝外标）是否存在，如果存在返回对应的uid
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAccountInstitutionCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7364858479353179172L;

	/**
	 * 描述机构的名称
	 */
	@ApiField("institution_name")
	private String institutionName;

	/**
	 * 登录号，可以是手机号码或者邮箱号码
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * <p>Getter for the field <code>institutionName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstitutionName() {
		return this.institutionName;
	}
	/**
	 * <p>Setter for the field <code>institutionName</code>.</p>
	 *
	 * @param institutionName a {@link java.lang.String} object.
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

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
