package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.fileupload response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZdatafrontDatatransferedFileuploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5126611571334934818L;

	/** 
	 * 返回用户数据推送产生的结果数据，如picPath为文件上传后返回文件内部存储的位置信息
	 */
	@ApiField("result_data")
	private String resultData;

	/** 
	 * 数据上传结果，true/false
	 */
	@ApiField("success")
	private String success;

	/**
	 * <p>Setter for the field <code>resultData</code>.</p>
	 *
	 * @param resultData a {@link java.lang.String} object.
	 */
	public void setResultData(String resultData) {
		this.resultData = resultData;
	}
	/**
	 * <p>Getter for the field <code>resultData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getResultData( ) {
		return this.resultData;
	}

	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a {@link java.lang.String} object.
	 */
	public void setSuccess(String success) {
		this.success = success;
	}
	/**
	 * <p>Getter for the field <code>success</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSuccess( ) {
		return this.success;
	}

}
