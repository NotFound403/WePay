package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.voice.mediaaudio.upload response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMsaasMediarecogVoiceMediaaudioUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1341912994911639776L;

	/** 
	 * 扩展字段
	 */
	@ApiField("extinfo_a")
	private String extinfoA;

	/** 
	 * 扩展字段
	 */
	@ApiField("extinfo_b")
	private String extinfoB;

	/** 
	 * 结果memo
	 */
	@ApiField("result_memo")
	private String resultMemo;

	/** 
	 * 结果状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	/**
	 * <p>Setter for the field <code>extinfoA</code>.</p>
	 *
	 * @param extinfoA a {@link java.lang.String} object.
	 */
	public void setExtinfoA(String extinfoA) {
		this.extinfoA = extinfoA;
	}
	/**
	 * <p>Getter for the field <code>extinfoA</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtinfoA( ) {
		return this.extinfoA;
	}

	/**
	 * <p>Setter for the field <code>extinfoB</code>.</p>
	 *
	 * @param extinfoB a {@link java.lang.String} object.
	 */
	public void setExtinfoB(String extinfoB) {
		this.extinfoB = extinfoB;
	}
	/**
	 * <p>Getter for the field <code>extinfoB</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtinfoB( ) {
		return this.extinfoB;
	}

	/**
	 * <p>Setter for the field <code>resultMemo</code>.</p>
	 *
	 * @param resultMemo a {@link java.lang.String} object.
	 */
	public void setResultMemo(String resultMemo) {
		this.resultMemo = resultMemo;
	}
	/**
	 * <p>Getter for the field <code>resultMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultMemo( ) {
		return this.resultMemo;
	}

	/**
	 * <p>Setter for the field <code>resultStatus</code>.</p>
	 *
	 * @param resultStatus a {@link java.lang.String} object.
	 */
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	/**
	 * <p>Getter for the field <code>resultStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
