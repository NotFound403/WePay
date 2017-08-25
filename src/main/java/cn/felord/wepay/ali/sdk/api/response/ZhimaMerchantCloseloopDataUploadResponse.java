package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.closeloop.data.upload response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantCloseloopDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8437468565318785777L;

	/** 
	 * 公用回传参数（非必填），这个字段由商户传入，系统透传给商户。
	 */
	@ApiField("biz_ext_params")
	private String bizExtParams;

	/** 
	 * 每次上传都会生成一个任务号
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * <p>Setter for the field <code>bizExtParams</code>.</p>
	 *
	 * @param bizExtParams a {@link java.lang.String} object.
	 */
	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	/**
	 * <p>Getter for the field <code>bizExtParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizExtParams( ) {
		return this.bizExtParams;
	}

	/**
	 * <p>Setter for the field <code>taskId</code>.</p>
	 *
	 * @param taskId a {@link java.lang.String} object.
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * <p>Getter for the field <code>taskId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaskId( ) {
		return this.taskId;
	}

}
