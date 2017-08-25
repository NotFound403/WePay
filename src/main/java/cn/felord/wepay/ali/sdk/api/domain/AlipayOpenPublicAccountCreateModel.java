package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 添加绑定商户会员号
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4439941625221367248L;

	/**
	 * 账户添加成功，在支付宝与其对应的协议号。如果账户重复添加，接口保证幂等依然视为添加成功，返回此前该账户在支付宝对应的协议号。其他异常该字段不存在。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	/**
	 * 开发者期望在服务窗首页看到的关于该用户的显示信息，最长10个字符
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 要绑定的商户会员对应的支付宝userid，2088开头长度为16位的字符串
	 */
	@ApiField("from_user_id")
	private String fromUserId;

	/**
	 * 要绑定的商户会员的真实姓名，最长10个汉字
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 备注信息，开发者可以通过该字段纪录其他的额外信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * <p>Getter for the field <code>agreementId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgreementId() {
		return this.agreementId;
	}
	/**
	 * <p>Setter for the field <code>agreementId</code>.</p>
	 *
	 * @param agreementId a {@link java.lang.String} object.
	 */
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	/**
	 * <p>Getter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBindAccountNo() {
		return this.bindAccountNo;
	}
	/**
	 * <p>Setter for the field <code>bindAccountNo</code>.</p>
	 *
	 * @param bindAccountNo a {@link java.lang.String} object.
	 */
	public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

	/**
	 * <p>Getter for the field <code>displayName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayName() {
		return this.displayName;
	}
	/**
	 * <p>Setter for the field <code>displayName</code>.</p>
	 *
	 * @param displayName a {@link java.lang.String} object.
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * <p>Getter for the field <code>fromUserId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFromUserId() {
		return this.fromUserId;
	}
	/**
	 * <p>Setter for the field <code>fromUserId</code>.</p>
	 *
	 * @param fromUserId a {@link java.lang.String} object.
	 */
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	/**
	 * <p>Getter for the field <code>realName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRealName() {
		return this.realName;
	}
	/**
	 * <p>Setter for the field <code>realName</code>.</p>
	 *
	 * @param realName a {@link java.lang.String} object.
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
