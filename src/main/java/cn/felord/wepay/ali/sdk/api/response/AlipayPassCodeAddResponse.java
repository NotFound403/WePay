package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.code.add response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassCodeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1418552388778586194L;

	/** 
	 * 成功时返回业务参数
	 */
	@ApiListField("biz_result")
	@ApiField("string")
	private List<String> bizResult;

	/** 
	 * 返回码.
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否发码成功的标识。
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * <p>Setter for the field <code>bizResult</code>.</p>
	 *
	 * @param bizResult a {@link java.util.List} object.
	 */
	public void setBizResult(List<String> bizResult) {
		this.bizResult = bizResult;
	}
	/**
	 * <p>Getter for the field <code>bizResult</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getBizResult( ) {
		return this.bizResult;
	}

	/** {@inheritDoc} */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * <p>Getter for the field <code>errorCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorCode( ) {
		return this.errorCode;
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

}
