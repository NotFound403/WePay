package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.present.send response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceLotteryPresentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5169972697983933849L;

	/** 
	 * 是否赠送成功
	 */
	@ApiField("send_result")
	private Boolean sendResult;

	/**
	 * <p>Setter for the field <code>sendResult</code>.</p>
	 *
	 * @param sendResult a {@link java.lang.Boolean} object.
	 */
	public void setSendResult(Boolean sendResult) {
		this.sendResult = sendResult;
	}
	/**
	 * <p>Getter for the field <code>sendResult</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getSendResult( ) {
		return this.sendResult;
	}

}
