package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.QueryInstBillInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.search response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>cachekey</code>.</p>
	 *
	 * @param cachekey a {@link java.lang.String} object.
	 */
	public void setCachekey(String cachekey) {
		this.cachekey = cachekey;
	}
	/**
	 * <p>Getter for the field <code>cachekey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCachekey( ) {
		return this.cachekey;
	}

	/**
	 * <p>Setter for the field <code>instBillInfoList</code>.</p>
	 *
	 * @param instBillInfoList a {@link java.util.List} object.
	 */
	public void setInstBillInfoList(List<QueryInstBillInfo> instBillInfoList) {
		this.instBillInfoList = instBillInfoList;
	}
	/**
	 * <p>Getter for the field <code>instBillInfoList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<QueryInstBillInfo> getInstBillInfoList( ) {
		return this.instBillInfoList;
	}

}
