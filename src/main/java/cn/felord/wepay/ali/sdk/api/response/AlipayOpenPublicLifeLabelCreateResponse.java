package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.create response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7562611772846548168L;

	/** 
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * <p>Setter for the field <code>labelId</code>.</p>
	 *
	 * @param labelId a {@link java.lang.String} object.
	 */
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}
	/**
	 * <p>Getter for the field <code>labelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelId( ) {
		return this.labelId;
	}

}
