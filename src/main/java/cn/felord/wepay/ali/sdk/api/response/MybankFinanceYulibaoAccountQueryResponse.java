package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.YLBProfitDetailInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-18 16:07:46
 */
public class MybankFinanceYulibaoAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2254451828264153946L;

	/** 
	 * 可用份额，单位为元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 业务冻结份额，单位为元
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 系统冻结份额，单位为元（建议不展示给用户）
	 */
	@ApiField("sys_freeze_amount")
	private String sysFreezeAmount;

	/** 
	 * 余利宝总余额，单位为元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 余利宝收益详情
	 */
	@ApiField("ylb_profit_detail_info")
	private YLBProfitDetailInfo ylbProfitDetailInfo;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setSysFreezeAmount(String sysFreezeAmount) {
		this.sysFreezeAmount = sysFreezeAmount;
	}
	public String getSysFreezeAmount( ) {
		return this.sysFreezeAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setYlbProfitDetailInfo(YLBProfitDetailInfo ylbProfitDetailInfo) {
		this.ylbProfitDetailInfo = ylbProfitDetailInfo;
	}
	public YLBProfitDetailInfo getYlbProfitDetailInfo( ) {
		return this.ylbProfitDetailInfo;
	}

}
