package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mdata.tag.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-03-11 14:09:56
 */
public class AlipayMdataTagGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3289855598255293481L;

	/** 
	 * 查询到的标签值, JSON字符串
	 */
	@ApiField("tag_values")
	private String tagValues;

	public void setTagValues(String tagValues) {
		this.tagValues = tagValues;
	}
	public String getTagValues( ) {
		return this.tagValues;
	}

}
