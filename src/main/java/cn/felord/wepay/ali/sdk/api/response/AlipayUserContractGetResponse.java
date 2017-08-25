package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayContract;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.contract.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserContractGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6789583115972784168L;

	/** 
	 * 支付宝用户订购信息
	 */
	@ApiField("alipay_contract")
	private AlipayContract alipayContract;

	/**
	 * <p>Setter for the field <code>alipayContract</code>.</p>
	 *
	 * @param alipayContract a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayContract} object.
	 */
	public void setAlipayContract(AlipayContract alipayContract) {
		this.alipayContract = alipayContract;
	}
	/**
	 * <p>Getter for the field <code>alipayContract</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayContract} object.
	 */
	public AlipayContract getAlipayContract( ) {
		return this.alipayContract;
	}

}
