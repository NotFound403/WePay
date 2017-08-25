package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.LotteryType;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.typelist.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceLotteryTypelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2356798634888116825L;

	/** 
	 * 彩票系统支持的可用于赠送的彩种类型列表
	 */
	@ApiListField("results")
	@ApiField("lottery_type")
	private List<LotteryType> results;

	/** 
	 * 彩票系统支持的可用于赠送的彩种个数
	 */
	@ApiField("total_result")
	private Long totalResult;

	/**
	 * <p>Setter for the field <code>results</code>.</p>
	 *
	 * @param results a {@link java.util.List} object.
	 */
	public void setResults(List<LotteryType> results) {
		this.results = results;
	}
	/**
	 * <p>Getter for the field <code>results</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<LotteryType> getResults( ) {
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
