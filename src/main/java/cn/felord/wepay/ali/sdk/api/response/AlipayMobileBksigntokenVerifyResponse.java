package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.bksigntoken.verify response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:08:15
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

	public void setCreatetimestamp(String createtimestamp) {
		this.createtimestamp = createtimestamp;
	}
	public String getCreatetimestamp( ) {
		return this.createtimestamp;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getLoginid( ) {
		return this.loginid;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setResultcode(Long resultcode) {
		this.resultcode = resultcode;
	}
	public Long getResultcode( ) {
		return this.resultcode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

}
