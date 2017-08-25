package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.YLBProfitDetailInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.account.query response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>availableAmount</code>.</p>
	 *
	 * @param availableAmount a {@link java.lang.String} object.
	 */
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	/**
	 * <p>Getter for the field <code>availableAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	/**
	 * <p>Setter for the field <code>freezeAmount</code>.</p>
	 *
	 * @param freezeAmount a {@link java.lang.String} object.
	 */
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	/**
	 * <p>Getter for the field <code>freezeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	/**
	 * <p>Setter for the field <code>sysFreezeAmount</code>.</p>
	 *
	 * @param sysFreezeAmount a {@link java.lang.String} object.
	 */
	public void setSysFreezeAmount(String sysFreezeAmount) {
		this.sysFreezeAmount = sysFreezeAmount;
	}
	/**
	 * <p>Getter for the field <code>sysFreezeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSysFreezeAmount( ) {
		return this.sysFreezeAmount;
	}

	/**
	 * <p>Setter for the field <code>totalAmount</code>.</p>
	 *
	 * @param totalAmount a {@link java.lang.String} object.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * <p>Getter for the field <code>totalAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	/**
	 * <p>Setter for the field <code>ylbProfitDetailInfo</code>.</p>
	 *
	 * @param ylbProfitDetailInfo a {@link cn.felord.wepay.ali.sdk.api.domain.YLBProfitDetailInfo} object.
	 */
	public void setYlbProfitDetailInfo(YLBProfitDetailInfo ylbProfitDetailInfo) {
		this.ylbProfitDetailInfo = ylbProfitDetailInfo;
	}
	/**
	 * <p>Getter for the field <code>ylbProfitDetailInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.YLBProfitDetailInfo} object.
	 */
	public YLBProfitDetailInfo getYlbProfitDetailInfo( ) {
		return this.ylbProfitDetailInfo;
	}

}
