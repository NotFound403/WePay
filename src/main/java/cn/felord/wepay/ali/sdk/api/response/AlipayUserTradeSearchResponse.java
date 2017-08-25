package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.TradeRecord;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.trade.search response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserTradeSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3546277581984839239L;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private String totalResults;

	/** 
	 * 交易记录列表
	 */
	@ApiListField("trade_records")
	@ApiField("trade_record")
	private List<TradeRecord> tradeRecords;

	/**
	 * <p>Setter for the field <code>totalPages</code>.</p>
	 *
	 * @param totalPages a {@link java.lang.String} object.
	 */
	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * <p>Getter for the field <code>totalPages</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalPages( ) {
		return this.totalPages;
	}

	/**
	 * <p>Setter for the field <code>totalResults</code>.</p>
	 *
	 * @param totalResults a {@link java.lang.String} object.
	 */
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	/**
	 * <p>Getter for the field <code>totalResults</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalResults( ) {
		return this.totalResults;
	}

	/**
	 * <p>Setter for the field <code>tradeRecords</code>.</p>
	 *
	 * @param tradeRecords a {@link java.util.List} object.
	 */
	public void setTradeRecords(List<TradeRecord> tradeRecords) {
		this.tradeRecords = tradeRecords;
	}
	/**
	 * <p>Getter for the field <code>tradeRecords</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<TradeRecord> getTradeRecords( ) {
		return this.tradeRecords;
	}

}
