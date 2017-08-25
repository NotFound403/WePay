package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayHighValueCustomerResult;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.userlevel.zrank.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceUserlevelZrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7518315293415786673L;

	/** 
	 * 活跃高价值用户返回
	 */
	@ApiField("result")
	private AlipayHighValueCustomerResult result;

	/**
	 * <p>Setter for the field <code>result</code>.</p>
	 *
	 * @param result a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayHighValueCustomerResult} object.
	 */
	public void setResult(AlipayHighValueCustomerResult result) {
		this.result = result;
	}
	/**
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayHighValueCustomerResult} object.
	 */
	public AlipayHighValueCustomerResult getResult( ) {
		return this.result;
	}

}
