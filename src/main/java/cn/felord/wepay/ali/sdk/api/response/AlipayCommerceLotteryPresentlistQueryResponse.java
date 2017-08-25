package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.LotteryPresent;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.presentlist.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceLotteryPresentlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4229852188487187868L;

	/** 
	 * 列表内容
	 */
	@ApiListField("results")
	@ApiField("lottery_present")
	private List<LotteryPresent> results;

	/** 
	 * 返回的列表的大小
	 */
	@ApiField("total_result")
	private Long totalResult;

	/**
	 * <p>Setter for the field <code>results</code>.</p>
	 *
	 * @param results a {@link java.util.List} object.
	 */
	public void setResults(List<LotteryPresent> results) {
		this.results = results;
	}
	/**
	 * <p>Getter for the field <code>results</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<LotteryPresent> getResults( ) {
		return this.results;
	}

	/**
	 * <p>Setter for the field <code>totalResult</code>.</p>
	 *
	 * @param totalResult a {@link java.lang.Long} object.
	 */
	public void setTotalResult(Long totalResult) {
		this.totalResult = totalResult;
	}
	/**
	 * <p>Getter for the field <code>totalResult</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalResult( ) {
		return this.totalResult;
	}

}
