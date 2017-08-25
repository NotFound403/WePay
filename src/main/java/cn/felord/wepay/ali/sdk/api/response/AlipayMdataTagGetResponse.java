package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mdata.tag.get response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMdataTagGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3289855598255293481L;

	/** 
	 * 查询到的标签值, JSON字符串
	 */
	@ApiField("tag_values")
	private String tagValues;

	/**
	 * <p>Setter for the field <code>tagValues</code>.</p>
	 *
	 * @param tagValues a {@link java.lang.String} object.
	 */
	public void setTagValues(String tagValues) {
		this.tagValues = tagValues;
	}
	/**
	 * <p>Getter for the field <code>tagValues</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTagValues( ) {
		return this.tagValues;
	}

}
