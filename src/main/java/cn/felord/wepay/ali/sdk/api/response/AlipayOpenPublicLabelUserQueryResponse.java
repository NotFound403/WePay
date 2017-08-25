package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.user.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2655313878549644335L;

	/** 
	 * 用户标签id列表，以英文逗号分隔
	 */
	@ApiField("label_ids")
	private String labelIds;

	/**
	 * <p>Setter for the field <code>labelIds</code>.</p>
	 *
	 * @param labelIds a {@link java.lang.String} object.
	 */
	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
	/**
	 * <p>Getter for the field <code>labelIds</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelIds( ) {
		return this.labelIds;
	}

}
