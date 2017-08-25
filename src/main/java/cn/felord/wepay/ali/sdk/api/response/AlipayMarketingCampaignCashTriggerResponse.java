package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.trigger response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCampaignCashTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 8333247145449138817L;

	/** 
	 * 支付宝业务号,发奖成功时返回,调用者可提供此字符串进行问题排查与核对等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 红包名称,创建活动时设置，用于账单列表和详情、红包列表和详情的展示
	 */
	@ApiField("coupon_name")
	private String couponName;

	/** 
	 * 用户领取失败的错误信息描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 商户头像logo的图片url地址，用于账单和红包列表、详情的展示
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/** 
	 * 外部业务号,回填请求中的out_biz_no,请求者可用于日志记录与核对等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 发送红包商户签约pid，发奖成功时非空
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 现金红包金额，发奖成功时非空，单位为元，保留两位小数
	 */
	@ApiField("prize_amount")
	private String prizeAmount;

	/** 
	 * 活动文案,用于账单的备注展示、红包详情页的文案展示
	 */
	@ApiField("prize_msg")
	private String prizeMsg;

	/** 
	 * 用户是否重复领取，如果重复领取，返回的是之前的中奖结果，如果是首次领取，则走发奖流程
	 */
	@ApiField("repeat_trigger_flag")
	private String repeatTriggerFlag;

	/** 
	 * 是否中奖结果状态，如果为true时返回的结果中的其他字段非空，否则返回的其他字段为空
	 */
	@ApiField("trigger_result")
	private String triggerResult;

	/**
	 * <p>Setter for the field <code>bizNo</code>.</p>
	 *
	 * @param bizNo a {@link java.lang.String} object.
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	/**
	 * <p>Getter for the field <code>bizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizNo( ) {
		return this.bizNo;
	}

	/**
	 * <p>Setter for the field <code>couponName</code>.</p>
	 *
	 * @param couponName a {@link java.lang.String} object.
	 */
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	/**
	 * <p>Getter for the field <code>couponName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCouponName( ) {
		return this.couponName;
	}

	/**
	 * <p>Setter for the field <code>errorMsg</code>.</p>
	 *
	 * @param errorMsg a {@link java.lang.String} object.
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * <p>Getter for the field <code>errorMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	/**
	 * <p>Setter for the field <code>merchantLogo</code>.</p>
	 *
	 * @param merchantLogo a {@link java.lang.String} object.
	 */
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}
	/**
	 * <p>Getter for the field <code>merchantLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantLogo( ) {
		return this.merchantLogo;
	}

	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	/**
	 * <p>Setter for the field <code>partnerId</code>.</p>
	 *
	 * @param partnerId a {@link java.lang.String} object.
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId( ) {
		return this.partnerId;
	}

	/**
	 * <p>Setter for the field <code>prizeAmount</code>.</p>
	 *
	 * @param prizeAmount a {@link java.lang.String} object.
	 */
	public void setPrizeAmount(String prizeAmount) {
		this.prizeAmount = prizeAmount;
	}
	/**
	 * <p>Getter for the field <code>prizeAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeAmount( ) {
		return this.prizeAmount;
	}

	/**
	 * <p>Setter for the field <code>prizeMsg</code>.</p>
	 *
	 * @param prizeMsg a {@link java.lang.String} object.
	 */
	public void setPrizeMsg(String prizeMsg) {
		this.prizeMsg = prizeMsg;
	}
	/**
	 * <p>Getter for the field <code>prizeMsg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPrizeMsg( ) {
		return this.prizeMsg;
	}

	/**
	 * <p>Setter for the field <code>repeatTriggerFlag</code>.</p>
	 *
	 * @param repeatTriggerFlag a {@link java.lang.String} object.
	 */
	public void setRepeatTriggerFlag(String repeatTriggerFlag) {
		this.repeatTriggerFlag = repeatTriggerFlag;
	}
	/**
	 * <p>Getter for the field <code>repeatTriggerFlag</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepeatTriggerFlag( ) {
		return this.repeatTriggerFlag;
	}

	/**
	 * <p>Setter for the field <code>triggerResult</code>.</p>
	 *
	 * @param triggerResult a {@link java.lang.String} object.
	 */
	public void setTriggerResult(String triggerResult) {
		this.triggerResult = triggerResult;
	}
	/**
	 * <p>Getter for the field <code>triggerResult</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTriggerResult( ) {
		return this.triggerResult;
	}

}
