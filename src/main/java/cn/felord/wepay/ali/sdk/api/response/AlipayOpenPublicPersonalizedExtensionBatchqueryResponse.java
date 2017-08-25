package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.QueryExtension;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>count</code>.</p>
	 *
	 * @param count a {@link java.lang.Long} object.
	 */
	public void setCount(Long count) {
		this.count = count;
	}
	/**
	 * <p>Getter for the field <code>count</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCount( ) {
		return this.count;
	}

	/**
	 * <p>Setter for the field <code>extensions</code>.</p>
	 *
	 * @param extensions a {@link java.util.List} object.
	 */
	public void setExtensions(List<QueryExtension> extensions) {
		this.extensions = extensions;
	}
	/**
	 * <p>Getter for the field <code>extensions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QueryExtension> getExtensions( ) {
		return this.extensions;
	}

}
