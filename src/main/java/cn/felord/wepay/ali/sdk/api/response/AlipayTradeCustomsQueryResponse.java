package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.CustomsDeclareRecordInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customs.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeCustomsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3556413194394377866L;

	/** 
	 * 不存在记录的报关请求号。多个值用逗号分隔，单次最多10个;每个报关请求号String(32)
	 */
	@ApiField("not_found")
	private String notFound;

	/** 
	 * 匹配到的列表。每个记录代表一条报关记录
	 */
	@ApiListField("records")
	@ApiField("customs_declare_record_info")
	private List<CustomsDeclareRecordInfo> records;

	/**
	 * <p>Setter for the field <code>notFound</code>.</p>
	 *
	 * @param notFound a {@link java.lang.String} object.
	 */
	public void setNotFound(String notFound) {
		this.notFound = notFound;
	}
	/**
	 * <p>Getter for the field <code>notFound</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotFound( ) {
		return this.notFound;
	}

	/**
	 * <p>Setter for the field <code>records</code>.</p>
	 *
	 * @param records a {@link java.util.List} object.
	 */
	public void setRecords(List<CustomsDeclareRecordInfo> records) {
		this.records = records;
	}
	/**
	 * <p>Getter for the field <code>records</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CustomsDeclareRecordInfo> getRecords( ) {
		return this.records;
	}

}
