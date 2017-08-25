package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AccountRecord;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.search response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayUserAccountSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5363574979248227657L;

	/** 
	 * 支付宝用户账务明细信息
	 */
	@ApiListField("account_records")
	@ApiField("account_record")
	private List<AccountRecord> accountRecords;

	/** 
	 * 总页面数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private Long totalResults;

	/**
	 * <p>Setter for the field <code>accountRecords</code>.</p>
	 *
	 * @param accountRecords a {@link java.util.List} object.
	 */
	public void setAccountRecords(List<AccountRecord> accountRecords) {
		this.accountRecords = accountRecords;
	}
	/**
	 * <p>Getter for the field <code>accountRecords</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AccountRecord> getAccountRecords( ) {
		return this.accountRecords;
	}

	/**
	 * <p>Setter for the field <code>totalPages</code>.</p>
	 *
	 * @param totalPages a {@link java.lang.Long} object.
	 */
	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * <p>Getter for the field <code>totalPages</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	/**
	 * <p>Setter for the field <code>totalResults</code>.</p>
	 *
	 * @param totalResults a {@link java.lang.Long} object.
	 */
	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	/**
	 * <p>Getter for the field <code>totalResults</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
