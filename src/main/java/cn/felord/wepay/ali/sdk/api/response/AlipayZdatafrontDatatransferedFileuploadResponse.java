package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.fileupload response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-02 14:41:11
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

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}
	public String getResultData( ) {
		return this.resultData;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
