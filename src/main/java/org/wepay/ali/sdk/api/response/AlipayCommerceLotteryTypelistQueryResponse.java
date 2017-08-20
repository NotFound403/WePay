package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.LotteryType;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.typelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-24 14:38:00
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

	public void setResults(List<LotteryType> results) {
		this.results = results;
	}
	public List<LotteryType> getResults( ) {
		return this.results;
	}

	public void setTotalResult(Long totalResult) {
		this.totalResult = totalResult;
	}
	public Long getTotalResult( ) {
		return this.totalResult;
	}

}
