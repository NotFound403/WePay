package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.common.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayZdatafrontCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8119392439749474189L;

	/** 
	 * 数据的时间戳：
如果fromCache=false,timestamp就是从外部返回的数据时间，如果外部返回的数据没有时间字段，就以系统取到的时间；
如果fromCache=true，timestamp就是从cache中获取的数据时间
	 */
	@ApiField("cache_timestamp")
	private Long cacheTimestamp;

	/** 
	 * 数据结果集，统一按照String类型返回
	 */
	@ApiField("values")
	private String values;

	/**
	 * <p>Setter for the field <code>cacheTimestamp</code>.</p>
	 *
	 * @param cacheTimestamp a {@link java.lang.Long} object.
	 */
	public void setCacheTimestamp(Long cacheTimestamp) {
		this.cacheTimestamp = cacheTimestamp;
	}
	/**
	 * <p>Getter for the field <code>cacheTimestamp</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCacheTimestamp( ) {
		return this.cacheTimestamp;
	}

	/**
	 * <p>Setter for the field <code>values</code>.</p>
	 *
	 * @param values a {@link java.lang.String} object.
	 */
	public void setValues(String values) {
		this.values = values;
	}
	/**
	 * <p>Getter for the field <code>values</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getValues( ) {
		return this.values;
	}

}
