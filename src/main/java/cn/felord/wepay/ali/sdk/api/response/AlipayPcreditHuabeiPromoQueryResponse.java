package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.promo.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPcreditHuabeiPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1251955629555491317L;

	/** 
	 * 花呗颜值分
	 */
	@ApiField("facescore")
	private String facescore;

	/**
	 * <p>Setter for the field <code>facescore</code>.</p>
	 *
	 * @param facescore a {@link java.lang.String} object.
	 */
	public void setFacescore(String facescore) {
		this.facescore = facescore;
	}
	/**
	 * <p>Getter for the field <code>facescore</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFacescore( ) {
		return this.facescore;
	}

}
