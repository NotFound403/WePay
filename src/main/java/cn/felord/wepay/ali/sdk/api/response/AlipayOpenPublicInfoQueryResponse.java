package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.info.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7615846581554699215L;

	/** 
	 * 服务窗名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 服务窗审核状态描述，如果审核驳回则有相关的驳回理由
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 服务窗审核状态，对于系统商而言，只有四个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过，AUDIT_NORMAL：无审核状态（当前没有处于审核过程的工单）
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 服务窗是否上线，T表示上线，F表示未上线
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 服务窗是否上架，T表示上架，上架即可在支付宝客户端被搜索到，F表示未上架
	 */
	@ApiField("is_release")
	private String isRelease;

	/** 
	 * 服务窗头像地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * 服务窗欢迎语
	 */
	@ApiField("public_greeting")
	private String publicGreeting;

	/**
	 * <p>Setter for the field <code>appName</code>.</p>
	 *
	 * @param appName a {@link java.lang.String} object.
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}
	/**
	 * <p>Getter for the field <code>appName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAppName( ) {
		return this.appName;
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
	 * <p>Getter for the field <code>auditDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditDesc( ) {
		return this.auditDesc;
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
	 * <p>Getter for the field <code>auditStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	/**
	 * <p>Setter for the field <code>isOnline</code>.</p>
	 *
	 * @param isOnline a {@link java.lang.String} object.
	 */
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	/**
	 * <p>Getter for the field <code>isOnline</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsOnline( ) {
		return this.isOnline;
	}

	/**
	 * <p>Setter for the field <code>isRelease</code>.</p>
	 *
	 * @param isRelease a {@link java.lang.String} object.
	 */
	public void setIsRelease(String isRelease) {
		this.isRelease = isRelease;
	}
	/**
	 * <p>Getter for the field <code>isRelease</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsRelease( ) {
		return this.isRelease;
	}

	/**
	 * <p>Setter for the field <code>logoUrl</code>.</p>
	 *
	 * @param logoUrl a {@link java.lang.String} object.
	 */
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	/**
	 * <p>Getter for the field <code>logoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogoUrl( ) {
		return this.logoUrl;
	}

	/**
	 * <p>Setter for the field <code>publicGreeting</code>.</p>
	 *
	 * @param publicGreeting a {@link java.lang.String} object.
	 */
	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}
	/**
	 * <p>Getter for the field <code>publicGreeting</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPublicGreeting( ) {
		return this.publicGreeting;
	}

}
