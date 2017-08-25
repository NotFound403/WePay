package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.bksigntoken.verify response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMobileBksigntokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7186898375472936496L;

	/** 
	 * 返回值创建时间
	 */
	@ApiField("createtimestamp")
	private String createtimestamp;

	/** 
	 * 返回值logonId
	 */
	@ApiField("loginid")
	private String loginid;

	/** 
	 * 结果说明
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 结果状态码
	 */
	@ApiField("resultcode")
	private Long resultcode;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 返回值userId
	 */
	@ApiField("userid")
	private String userid;

	/**
	 * <p>Setter for the field <code>createtimestamp</code>.</p>
	 *
	 * @param createtimestamp a {@link java.lang.String} object.
	 */
	public void setCreatetimestamp(String createtimestamp) {
		this.createtimestamp = createtimestamp;
	}
	/**
	 * <p>Getter for the field <code>createtimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreatetimestamp( ) {
		return this.createtimestamp;
	}

	/**
	 * <p>Setter for the field <code>loginid</code>.</p>
	 *
	 * @param loginid a {@link java.lang.String} object.
	 */
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	/**
	 * <p>Getter for the field <code>loginid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginid( ) {
		return this.loginid;
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
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo( ) {
		return this.memo;
	}

	/**
	 * <p>Setter for the field <code>resultcode</code>.</p>
	 *
	 * @param resultcode a {@link java.lang.Long} object.
	 */
	public void setResultcode(Long resultcode) {
		this.resultcode = resultcode;
	}
	/**
	 * <p>Getter for the field <code>resultcode</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getResultcode( ) {
		return this.resultcode;
	}

	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.Boolean} object.
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSuccess( ) {
		return this.success;
	}

	/**
	 * <p>Setter for the field <code>userid</code>.</p>
	 *
	 * @param userid a {@link java.lang.String} object.
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * <p>Getter for the field <code>userid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserid( ) {
		return this.userid;
	}

}
