package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部指定买家
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ExtUserInfo extends AlipayObject {

	private static final long serialVersionUID = 7546548624477496667L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU等。如有其它类型需要支持，请与蚂蚁金服工作人员联系。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 是否强制校验付款人身份信息[统一接口定义，T:强制校验，F：不强制
	 */
	@ApiField("fix_buyer")
	private String fixBuyer;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo() {
		return this.certNo;
	}
	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * <p>Getter for the field <code>certType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertType() {
		return this.certType;
	}
	/**
	 * <p>Setter for the field <code>certType</code>.</p>
	 *
	 * @param certType a {@link java.lang.String} object.
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}

	/**
	 * <p>Getter for the field <code>fixBuyer</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFixBuyer() {
		return this.fixBuyer;
	}
	/**
	 * <p>Setter for the field <code>fixBuyer</code>.</p>
	 *
	 * @param fixBuyer a {@link java.lang.String} object.
	 */
	public void setFixBuyer(String fixBuyer) {
		this.fixBuyer = fixBuyer;
	}

	/**
	 * <p>Getter for the field <code>mobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * <p>Setter for the field <code>mobile</code>.</p>
	 *
	 * @param mobile a {@link java.lang.String} object.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
