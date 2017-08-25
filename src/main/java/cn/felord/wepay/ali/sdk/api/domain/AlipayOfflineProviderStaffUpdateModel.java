package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 云纵员工信息同步到口碑
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineProviderStaffUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 3797399778494819121L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 行业类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客户端请求IP
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 新增员工的备注信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 要同步员工的邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 登录用户的staff_id
	 */
	@ApiField("login_staff_id")
	private String loginStaffId;

	/**
	 * 服务商pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 服务商id的类型
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	/**
	 * 云纵登录人员pid
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 同步云纵员工操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 流水号参数
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 修改删除员工的主键id
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 要同步员工的电话号码
	 */
	@ApiField("staff_mobile")
	private String staffMobile;

	/**
	 * 新增员工姓名
	 */
	@ApiField("staff_name")
	private String staffName;

	/**
	 * 员工类型
	 */
	@ApiField("staff_type")
	private String staffType;

	/**
	 * <p>Getter for the field <code>alipayNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayNo() {
		return this.alipayNo;
	}
	/**
	 * <p>Setter for the field <code>alipayNo</code>.</p>
	 *
	 * @param alipayNo a {@link java.lang.String} object.
	 */
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>clientIp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getClientIp() {
		return this.clientIp;
	}
	/**
	 * <p>Setter for the field <code>clientIp</code>.</p>
	 *
	 * @param clientIp a {@link java.lang.String} object.
	 */
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * <p>Getter for the field <code>email</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEmail() {
		return this.email;
	}
	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email a {@link java.lang.String} object.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * <p>Getter for the field <code>loginStaffId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginStaffId() {
		return this.loginStaffId;
	}
	/**
	 * <p>Setter for the field <code>loginStaffId</code>.</p>
	 *
	 * @param loginStaffId a {@link java.lang.String} object.
	 */
	public void setLoginStaffId(String loginStaffId) {
		this.loginStaffId = loginStaffId;
	}

	/**
	 * <p>Getter for the field <code>merchantId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantId() {
		return this.merchantId;
	}
	/**
	 * <p>Setter for the field <code>merchantId</code>.</p>
	 *
	 * @param merchantId a {@link java.lang.String} object.
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * <p>Getter for the field <code>merchantIdType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	/**
	 * <p>Setter for the field <code>merchantIdType</code>.</p>
	 *
	 * @param merchantIdType a {@link java.lang.String} object.
	 */
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

	/**
	 * <p>Getter for the field <code>opePid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpePid() {
		return this.opePid;
	}
	/**
	 * <p>Setter for the field <code>opePid</code>.</p>
	 *
	 * @param opePid a {@link java.lang.String} object.
	 */
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	/**
	 * <p>Getter for the field <code>operateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateType() {
		return this.operateType;
	}
	/**
	 * <p>Setter for the field <code>operateType</code>.</p>
	 *
	 * @param operateType a {@link java.lang.String} object.
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * <p>Getter for the field <code>roleType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRoleType() {
		return this.roleType;
	}
	/**
	 * <p>Setter for the field <code>roleType</code>.</p>
	 *
	 * @param roleType a {@link java.lang.String} object.
	 */
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	/**
	 * <p>Getter for the field <code>staffId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStaffId() {
		return this.staffId;
	}
	/**
	 * <p>Setter for the field <code>staffId</code>.</p>
	 *
	 * @param staffId a {@link java.lang.String} object.
	 */
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	/**
	 * <p>Getter for the field <code>staffMobile</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStaffMobile() {
		return this.staffMobile;
	}
	/**
	 * <p>Setter for the field <code>staffMobile</code>.</p>
	 *
	 * @param staffMobile a {@link java.lang.String} object.
	 */
	public void setStaffMobile(String staffMobile) {
		this.staffMobile = staffMobile;
	}

	/**
	 * <p>Getter for the field <code>staffName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStaffName() {
		return this.staffName;
	}
	/**
	 * <p>Setter for the field <code>staffName</code>.</p>
	 *
	 * @param staffName a {@link java.lang.String} object.
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/**
	 * <p>Getter for the field <code>staffType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStaffType() {
		return this.staffType;
	}
	/**
	 * <p>Setter for the field <code>staffType</code>.</p>
	 *
	 * @param staffType a {@link java.lang.String} object.
	 */
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

}
