package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayCodeRecoResult;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.code.reco response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataDataserviceCodeRecoResponse extends AlipayResponse {

	private static final long serialVersionUID = 8191513246658922461L;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private AlipayCodeRecoResult result;

	/**
	 * <p>Setter for the field <code>result</code>.</p>
	 *
	 * @param result a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayCodeRecoResult} object.
	 */
	public void setResult(AlipayCodeRecoResult result) {
		this.result = result;
	}
	/**
	 * <p>Getter for the field <code>result</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayCodeRecoResult} object.
	 */
	public AlipayCodeRecoResult getResult( ) {
		return this.result;
	}

}
