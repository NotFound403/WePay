package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.exsc.user.currentsign.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayExscUserCurrentsignGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7612711175178323554L;

	/** 
	 * 返回结果的业务类型。当前签约绑卡业务类型 （current_sign）
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 业务处理结果
 true 无资金流入记录，本次是首次交易
 false 已有资金流入记录，本次不是首次交易
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType( ) {
		return this.bizType;
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
