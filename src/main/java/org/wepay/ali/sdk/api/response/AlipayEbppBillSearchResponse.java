package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.QueryInstBillInfo;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.search response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 17:13:40
 */
public class AlipayEbppBillSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8444829367156283565L;

	/** 
	 * 已经缓存的的key
	 */
	@ApiField("cachekey")
	private String cachekey;

	/** 
	 * 实时查询欠费单返回对象
	 */
	@ApiListField("inst_bill_info_list")
	@ApiField("query_inst_bill_info")
	private List<QueryInstBillInfo> instBillInfoList;

	public void setCachekey(String cachekey) {
		this.cachekey = cachekey;
	}
	public String getCachekey( ) {
		return this.cachekey;
	}

	public void setInstBillInfoList(List<QueryInstBillInfo> instBillInfoList) {
		this.instBillInfoList = instBillInfoList;
	}
	public List<QueryInstBillInfo> getInstBillInfoList( ) {
		return this.instBillInfoList;
	}

}
