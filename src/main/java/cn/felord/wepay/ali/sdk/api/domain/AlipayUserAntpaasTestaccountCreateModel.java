package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建测试支付宝账户
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAntpaasTestaccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1232814669483829724L;

	/**
	 * 认证等级，L1，L2，L3，L3可以开店
	 */
	@ApiField("account_level")
	private String accountLevel;

	/**
	 * 证件中的姓名，必须为中文，尽量不要超过6个汉字
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，IDENTITY_CARD 身份证，PASSPORT 护照，HK_MC_CARD 港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 登录名，如邮箱的值
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 登录名类型，EMAIL
	 */
	@ApiField("logon_type")
	private String logonType;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作类型，CREATION 仅创建, CERTIFY 仅认证, CREATION_AND_CERTIFY 创建+认证
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作者工号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 调用方IP地址
	 */
	@ApiField("remote_ip")
	private String remoteIp;

	/**
	 * 支付宝账户id，accountNo
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 账户状态，T Q
	 */
	@ApiField("user_status")
	private String userStatus;

	/**
	 * 账户类型，PERSON 个人 ORG 企业
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * <p>Getter for the field <code>accountLevel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountLevel() {
		return this.accountLevel;
	}
	/**
	 * <p>Setter for the field <code>accountLevel</code>.</p>
	 *
	 * @param accountLevel a {@link java.lang.String} object.
	 */
	public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}

	/**
	 * <p>Getter for the field <code>certName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertName() {
		return this.certName;
	}
	/**
	 * <p>Setter for the field <code>certName</code>.</p>
	 *
	 * @param certName a {@link java.lang.String} object.
	 */
	public void setCertName(String certName) {
		this.certName = certName;
	}

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

	/**
	 * <p>Getter for the field <code>logonType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogonType() {
		return this.logonType;
	}
	/**
	 * <p>Setter for the field <code>logonType</code>.</p>
	 *
	 * @param logonType a {@link java.lang.String} object.
	 */
	public void setLogonType(String logonType) {
		this.logonType = logonType;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>operationType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperationType() {
		return this.operationType;
	}
	/**
	 * <p>Setter for the field <code>operationType</code>.</p>
	 *
	 * @param operationType a {@link java.lang.String} object.
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>remoteIp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemoteIp() {
		return this.remoteIp;
	}
	/**
	 * <p>Setter for the field <code>remoteIp</code>.</p>
	 *
	 * @param remoteIp a {@link java.lang.String} object.
	 */
	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * <p>Getter for the field <code>userStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserStatus() {
		return this.userStatus;
	}
	/**
	 * <p>Setter for the field <code>userStatus</code>.</p>
	 *
	 * @param userStatus a {@link java.lang.String} object.
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 * <p>Getter for the field <code>userType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserType() {
		return this.userType;
	}
	/**
	 * <p>Setter for the field <code>userType</code>.</p>
	 *
	 * @param userType a {@link java.lang.String} object.
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
