package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.alixiaohao.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SsdataDataserviceRiskAlixiaohaoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4743651872867113895L;

	/** 
	 * 是否阿里小号
	 */
	@ApiField("is_alixiaohao")
	private Boolean isAlixiaohao;

	/**
	 * <p>Setter for the field <code>isAlixiaohao</code>.</p>
	 *
	 * @param isAlixiaohao a {@link java.lang.Boolean} object.
	 */
	public void setIsAlixiaohao(Boolean isAlixiaohao) {
		this.isAlixiaohao = isAlixiaohao;
	}
	/**
	 * <p>Getter for the field <code>isAlixiaohao</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsAlixiaohao( ) {
		return this.isAlixiaohao;
	}

}
