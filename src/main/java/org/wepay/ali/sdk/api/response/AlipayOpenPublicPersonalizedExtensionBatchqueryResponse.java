package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.QueryExtension;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-27 18:17:28
 */
public class AlipayOpenPublicPersonalizedExtensionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1514683621779162117L;

	/** 
	 * 扩展区套数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 扩展区信息
	 */
	@ApiListField("extensions")
	@ApiField("query_extension")
	private List<QueryExtension> extensions;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setExtensions(List<QueryExtension> extensions) {
		this.extensions = extensions;
	}
	public List<QueryExtension> getExtensions( ) {
		return this.extensions;
	}

}
