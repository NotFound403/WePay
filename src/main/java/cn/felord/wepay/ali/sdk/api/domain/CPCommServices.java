package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 小区服务列表
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CPCommServices extends AlipayObject {

	private static final long serialVersionUID = 3463855865651874895L;

	/**
	 * 对于涉及收费类型的服务，返回收款帐号，若开发者没有为当前服务传入过物业收款帐号，则默认为授权物业的签约账号。
	 */
	@ApiField("account")
	private String account;

	/**
	 * 若当前服务涉及收费，则返回收款帐号类型。
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 服务审核状态描述，如果审核驳回则有相关的驳回理由。
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/**
	 * 服务审核状态。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 服务对应的前台类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 该字段可选，若对于外部调用地址巡检失败，会返回失败状态。
	 */
	@ApiField("external_address_scan_result")
	private String externalAddressScanResult;

	/**
	 * 由开发者系统提供的，支付宝根据基础服务类型在特定业务环节调用的外部系统服务地址。
	 */
	@ApiField("external_invoke_address")
	private String externalInvokeAddress;

	/**
	 * 服务初始化时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/**
	 * 服务最近修改时间（包括状态变更）。
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 若从当前状态到下一状态需要完成下一步条件代码，则返回该字段，否则不返回。
	 */
	@ApiField("next_action")
	private String nextAction;

	/**
	 * 若qr_code_image二维码存在有效期，则返回。
	 */
	@ApiField("qr_code_expires")
	private Date qrCodeExpires;

	/**
	 * 为满足特定的服务类型在上线前后的不同阶段需要进行测试验证等目的，选择性返回能直达具体服务的二维码图片链接。用支付宝手机客户端扫一扫该链接，完成验证工作。
	 */
	@ApiField("qr_code_image")
	private String qrCodeImage;

	/**
	 * 若返回qr_code_image，则同时返回对应的类型，类型值为：
TEST - 用于上线前验证的临时二维码；
FORMAL - 上线后可用于推广的正式二维码（仅针对部分服务类型）；
	 */
	@ApiField("qr_code_type")
	private String qrCodeType;

	/**
	 * 本服务预计过期时间（如在物业服务合同中约定），按标准时间格式：yyyy-MM-dd HH:mm:ss返回。
	 */
	@ApiField("service_expires")
	private Date serviceExpires;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务当前状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>account</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccount() {
		return this.account;
	}
	/**
	 * <p>Setter for the field <code>account</code>.</p>
	 *
	 * @param account a {@link java.lang.String} object.
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * <p>Getter for the field <code>accountType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccountType() {
		return this.accountType;
	}
	/**
	 * <p>Setter for the field <code>accountType</code>.</p>
	 *
	 * @param accountType a {@link java.lang.String} object.
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * <p>Getter for the field <code>auditDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditDesc() {
		return this.auditDesc;
	}
	/**
	 * <p>Setter for the field <code>auditDesc</code>.</p>
	 *
	 * @param auditDesc a {@link java.lang.String} object.
	 */
	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

	/**
	 * <p>Getter for the field <code>auditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditStatus() {
		return this.auditStatus;
	}
	/**
	 * <p>Setter for the field <code>auditStatus</code>.</p>
	 *
	 * @param auditStatus a {@link java.lang.String} object.
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * <p>Getter for the field <code>categoryName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	/**
	 * <p>Setter for the field <code>categoryName</code>.</p>
	 *
	 * @param categoryName a {@link java.lang.String} object.
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * <p>Getter for the field <code>externalAddressScanResult</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalAddressScanResult() {
		return this.externalAddressScanResult;
	}
	/**
	 * <p>Setter for the field <code>externalAddressScanResult</code>.</p>
	 *
	 * @param externalAddressScanResult a {@link java.lang.String} object.
	 */
	public void setExternalAddressScanResult(String externalAddressScanResult) {
		this.externalAddressScanResult = externalAddressScanResult;
	}

	/**
	 * <p>Getter for the field <code>externalInvokeAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExternalInvokeAddress() {
		return this.externalInvokeAddress;
	}
	/**
	 * <p>Setter for the field <code>externalInvokeAddress</code>.</p>
	 *
	 * @param externalInvokeAddress a {@link java.lang.String} object.
	 */
	public void setExternalInvokeAddress(String externalInvokeAddress) {
		this.externalInvokeAddress = externalInvokeAddress;
	}

	/**
	 * <p>Getter for the field <code>gmtCreated</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreated() {
		return this.gmtCreated;
	}
	/**
	 * <p>Setter for the field <code>gmtCreated</code>.</p>
	 *
	 * @param gmtCreated a {@link java.util.Date} object.
	 */
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	/**
	 * <p>Getter for the field <code>gmtModified</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtModified() {
		return this.gmtModified;
	}
	/**
	 * <p>Setter for the field <code>gmtModified</code>.</p>
	 *
	 * @param gmtModified a {@link java.util.Date} object.
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * <p>Getter for the field <code>nextAction</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNextAction() {
		return this.nextAction;
	}
	/**
	 * <p>Setter for the field <code>nextAction</code>.</p>
	 *
	 * @param nextAction a {@link java.lang.String} object.
	 */
	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}

	/**
	 * <p>Getter for the field <code>qrCodeExpires</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getQrCodeExpires() {
		return this.qrCodeExpires;
	}
	/**
	 * <p>Setter for the field <code>qrCodeExpires</code>.</p>
	 *
	 * @param qrCodeExpires a {@link java.util.Date} object.
	 */
	public void setQrCodeExpires(Date qrCodeExpires) {
		this.qrCodeExpires = qrCodeExpires;
	}

	/**
	 * <p>Getter for the field <code>qrCodeImage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCodeImage() {
		return this.qrCodeImage;
	}
	/**
	 * <p>Setter for the field <code>qrCodeImage</code>.</p>
	 *
	 * @param qrCodeImage a {@link java.lang.String} object.
	 */
	public void setQrCodeImage(String qrCodeImage) {
		this.qrCodeImage = qrCodeImage;
	}

	/**
	 * <p>Getter for the field <code>qrCodeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getQrCodeType() {
		return this.qrCodeType;
	}
	/**
	 * <p>Setter for the field <code>qrCodeType</code>.</p>
	 *
	 * @param qrCodeType a {@link java.lang.String} object.
	 */
	public void setQrCodeType(String qrCodeType) {
		this.qrCodeType = qrCodeType;
	}

	/**
	 * <p>Getter for the field <code>serviceExpires</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getServiceExpires() {
		return this.serviceExpires;
	}
	/**
	 * <p>Setter for the field <code>serviceExpires</code>.</p>
	 *
	 * @param serviceExpires a {@link java.util.Date} object.
	 */
	public void setServiceExpires(Date serviceExpires) {
		this.serviceExpires = serviceExpires;
	}

	/**
	 * <p>Getter for the field <code>serviceType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceType() {
		return this.serviceType;
	}
	/**
	 * <p>Setter for the field <code>serviceType</code>.</p>
	 *
	 * @param serviceType a {@link java.lang.String} object.
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
