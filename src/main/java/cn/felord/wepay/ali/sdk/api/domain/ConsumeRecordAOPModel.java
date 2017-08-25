package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 消费记录信息-主记录
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ConsumeRecordAOPModel extends AlipayObject {

	private static final long serialVersionUID = 5859115896398367678L;

	/**
	 * 接入渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 扩展状态
	 */
	@ApiField("additional_status")
	private String additionalStatus;

	/**
	 * 用户下一步动作
	 */
	@ApiListField("biz_actions")
	@ApiField("string")
	private List<String> bizActions;

	/**
	 * 业务扩展流水号
	 */
	@ApiField("biz_extra_no")
	private String bizExtraNo;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	/**
	 * 业务备注
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 业务发起方
	 */
	@ApiField("biz_orig")
	private String bizOrig;

	/**
	 * 业务外部流水号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 业务状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 业务子类型
	 */
	@ApiField("biz_sub_type")
	private String bizSubType;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 自定义分类Id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 总费用
	 */
	@ApiField("consume_fee")
	private String consumeFee;

	/**
	 * 消费记录退款状态
	 */
	@ApiField("consume_refund_status")
	private String consumeRefundStatus;

	/**
	 * 来源
	 */
	@ApiField("consume_site")
	private String consumeSite;

	/**
	 * 消费记录状态
	 */
	@ApiField("consume_status")
	private String consumeStatus;

	/**
	 * 标题
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 消费记录类型
	 */
	@ApiField("consume_type")
	private String consumeType;

	/**
	 * 货币币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 消费记录永久删除时间
	 */
	@ApiField("delete_over_time")
	private Date deleteOverTime;

	/**
	 * 消费记录删除时间
	 */
	@ApiField("delete_time")
	private Date deleteTime;

	/**
	 * 消费记录删除标记
	 */
	@ApiField("delete_type")
	private String deleteType;

	/**
	 * 充退状态，可能为空，目前只针对交易业务有效
	 */
	@ApiField("depositback_status")
	private String depositbackStatus;

	/**
	 * 是否锁定标记
	 */
	@ApiField("flag_locked")
	private String flagLocked;

	/**
	 * 退款标记
	 */
	@ApiField("flag_refund")
	private String flagRefund;

	/**
	 * 业务数据创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 业务数据最后更新时间
	 */
	@ApiField("gmt_biz_modified")
	private Date gmtBizModified;

	/**
	 * 消费记录创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 消费记录最后更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 收到付款时间（买家付款时间）
	 */
	@ApiField("gmt_receive_pay")
	private Date gmtReceivePay;

	/**
	 * 打款给卖家时间（卖家收款时间）
	 */
	@ApiField("gmt_send_pay")
	private Date gmtSendPay;

	/**
	 * 是否有资金明细
	 */
	@ApiField("has_fund_item")
	private Boolean hasFundItem;

	/**
	 * 是否有新资金明细(落地新流程交易的消费记录)
	 */
	@ApiField("has_new_fund_item")
	private Boolean hasNewFundItem;

	/**
	 * 收入/支出
	 */
	@ApiField("in_out")
	private String inOut;

	/**
	 * 对方卡号
	 */
	@ApiField("opposite_card_no")
	private String oppositeCardNo;

	/**
	 * 对方登录ID
	 */
	@ApiField("opposite_login_id")
	private String oppositeLoginId;

	/**
	 * 对方名称
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 对方昵称
	 */
	@ApiField("opposite_nick_name")
	private String oppositeNickName;

	/**
	 * 消费记录原标题
	 */
	@ApiField("orig_consume_title")
	private String origConsumeTitle;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 本方客户ID
	 */
	@ApiField("owner_customer_id")
	private String ownerCustomerId;

	/**
	 * 本方登录ID
	 */
	@ApiField("owner_login_id")
	private String ownerLoginId;

	/**
	 * 本方名称
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 本方昵称
	 */
	@ApiField("owner_nick")
	private String ownerNick;

	/**
	 * 合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 创建渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 代付人&亲密付人姓名
	 */
	@ApiField("peerpayer_real_name")
	private String peerpayerRealName;

	/**
	 * 产品码
	 */
	@ApiField("product")
	private String product;

	/**
	 * 最后一次退款金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 服务费
	 */
	@ApiField("service_fee")
	private String serviceFee;

	/**
	 * 多次成功退款总金额
	 */
	@ApiField("total_refund_fee")
	private String totalRefundFee;

	/**
	 * 交易来源
	 */
	@ApiField("trade_from")
	private String tradeFrom;

	/**
	 * <p>Getter for the field <code>accessChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccessChannel() {
		return this.accessChannel;
	}
	/**
	 * <p>Setter for the field <code>accessChannel</code>.</p>
	 *
	 * @param accessChannel a {@link java.lang.String} object.
	 */
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	/**
	 * <p>Getter for the field <code>additionalStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdditionalStatus() {
		return this.additionalStatus;
	}
	/**
	 * <p>Setter for the field <code>additionalStatus</code>.</p>
	 *
	 * @param additionalStatus a {@link java.lang.String} object.
	 */
	public void setAdditionalStatus(String additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	/**
	 * <p>Getter for the field <code>bizActions</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getBizActions() {
		return this.bizActions;
	}
	/**
	 * <p>Setter for the field <code>bizActions</code>.</p>
	 *
	 * @param bizActions a {@link java.util.List} object.
	 */
	public void setBizActions(List<String> bizActions) {
		this.bizActions = bizActions;
	}

	/**
	 * <p>Getter for the field <code>bizExtraNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizExtraNo() {
		return this.bizExtraNo;
	}
	/**
	 * <p>Setter for the field <code>bizExtraNo</code>.</p>
	 *
	 * @param bizExtraNo a {@link java.lang.String} object.
	 */
	public void setBizExtraNo(String bizExtraNo) {
		this.bizExtraNo = bizExtraNo;
	}

	/**
	 * <p>Getter for the field <code>bizInNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizInNo() {
		return this.bizInNo;
	}
	/**
	 * <p>Setter for the field <code>bizInNo</code>.</p>
	 *
	 * @param bizInNo a {@link java.lang.String} object.
	 */
	public void setBizInNo(String bizInNo) {
		this.bizInNo = bizInNo;
	}

	/**
	 * <p>Getter for the field <code>bizMemo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizMemo() {
		return this.bizMemo;
	}
	/**
	 * <p>Setter for the field <code>bizMemo</code>.</p>
	 *
	 * @param bizMemo a {@link java.lang.String} object.
	 */
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

	/**
	 * <p>Getter for the field <code>bizOrig</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizOrig() {
		return this.bizOrig;
	}
	/**
	 * <p>Setter for the field <code>bizOrig</code>.</p>
	 *
	 * @param bizOrig a {@link java.lang.String} object.
	 */
	public void setBizOrig(String bizOrig) {
		this.bizOrig = bizOrig;
	}

	/**
	 * <p>Getter for the field <code>bizOutNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizOutNo() {
		return this.bizOutNo;
	}
	/**
	 * <p>Setter for the field <code>bizOutNo</code>.</p>
	 *
	 * @param bizOutNo a {@link java.lang.String} object.
	 */
	public void setBizOutNo(String bizOutNo) {
		this.bizOutNo = bizOutNo;
	}

	/**
	 * <p>Getter for the field <code>bizState</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizState() {
		return this.bizState;
	}
	/**
	 * <p>Setter for the field <code>bizState</code>.</p>
	 *
	 * @param bizState a {@link java.lang.String} object.
	 */
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	/**
	 * <p>Getter for the field <code>bizSubType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizSubType() {
		return this.bizSubType;
	}
	/**
	 * <p>Setter for the field <code>bizSubType</code>.</p>
	 *
	 * @param bizSubType a {@link java.lang.String} object.
	 */
	public void setBizSubType(String bizSubType) {
		this.bizSubType = bizSubType;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>categoryId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategoryId() {
		return this.categoryId;
	}
	/**
	 * <p>Setter for the field <code>categoryId</code>.</p>
	 *
	 * @param categoryId a {@link java.lang.String} object.
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * <p>Getter for the field <code>consumeFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeFee() {
		return this.consumeFee;
	}
	/**
	 * <p>Setter for the field <code>consumeFee</code>.</p>
	 *
	 * @param consumeFee a {@link java.lang.String} object.
	 */
	public void setConsumeFee(String consumeFee) {
		this.consumeFee = consumeFee;
	}

	/**
	 * <p>Getter for the field <code>consumeRefundStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeRefundStatus() {
		return this.consumeRefundStatus;
	}
	/**
	 * <p>Setter for the field <code>consumeRefundStatus</code>.</p>
	 *
	 * @param consumeRefundStatus a {@link java.lang.String} object.
	 */
	public void setConsumeRefundStatus(String consumeRefundStatus) {
		this.consumeRefundStatus = consumeRefundStatus;
	}

	/**
	 * <p>Getter for the field <code>consumeSite</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeSite() {
		return this.consumeSite;
	}
	/**
	 * <p>Setter for the field <code>consumeSite</code>.</p>
	 *
	 * @param consumeSite a {@link java.lang.String} object.
	 */
	public void setConsumeSite(String consumeSite) {
		this.consumeSite = consumeSite;
	}

	/**
	 * <p>Getter for the field <code>consumeStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeStatus() {
		return this.consumeStatus;
	}
	/**
	 * <p>Setter for the field <code>consumeStatus</code>.</p>
	 *
	 * @param consumeStatus a {@link java.lang.String} object.
	 */
	public void setConsumeStatus(String consumeStatus) {
		this.consumeStatus = consumeStatus;
	}

	/**
	 * <p>Getter for the field <code>consumeTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeTitle() {
		return this.consumeTitle;
	}
	/**
	 * <p>Setter for the field <code>consumeTitle</code>.</p>
	 *
	 * @param consumeTitle a {@link java.lang.String} object.
	 */
	public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

	/**
	 * <p>Getter for the field <code>consumeType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getConsumeType() {
		return this.consumeType;
	}
	/**
	 * <p>Setter for the field <code>consumeType</code>.</p>
	 *
	 * @param consumeType a {@link java.lang.String} object.
	 */
	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

	/**
	 * <p>Getter for the field <code>currency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCurrency() {
		return this.currency;
	}
	/**
	 * <p>Setter for the field <code>currency</code>.</p>
	 *
	 * @param currency a {@link java.lang.String} object.
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * <p>Getter for the field <code>deleteOverTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDeleteOverTime() {
		return this.deleteOverTime;
	}
	/**
	 * <p>Setter for the field <code>deleteOverTime</code>.</p>
	 *
	 * @param deleteOverTime a {@link java.util.Date} object.
	 */
	public void setDeleteOverTime(Date deleteOverTime) {
		this.deleteOverTime = deleteOverTime;
	}

	/**
	 * <p>Getter for the field <code>deleteTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDeleteTime() {
		return this.deleteTime;
	}
	/**
	 * <p>Setter for the field <code>deleteTime</code>.</p>
	 *
	 * @param deleteTime a {@link java.util.Date} object.
	 */
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	/**
	 * <p>Getter for the field <code>deleteType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeleteType() {
		return this.deleteType;
	}
	/**
	 * <p>Setter for the field <code>deleteType</code>.</p>
	 *
	 * @param deleteType a {@link java.lang.String} object.
	 */
	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}

	/**
	 * <p>Getter for the field <code>depositbackStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDepositbackStatus() {
		return this.depositbackStatus;
	}
	/**
	 * <p>Setter for the field <code>depositbackStatus</code>.</p>
	 *
	 * @param depositbackStatus a {@link java.lang.String} object.
	 */
	public void setDepositbackStatus(String depositbackStatus) {
		this.depositbackStatus = depositbackStatus;
	}

	/**
	 * <p>Getter for the field <code>flagLocked</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFlagLocked() {
		return this.flagLocked;
	}
	/**
	 * <p>Setter for the field <code>flagLocked</code>.</p>
	 *
	 * @param flagLocked a {@link java.lang.String} object.
	 */
	public void setFlagLocked(String flagLocked) {
		this.flagLocked = flagLocked;
	}

	/**
	 * <p>Getter for the field <code>flagRefund</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFlagRefund() {
		return this.flagRefund;
	}
	/**
	 * <p>Setter for the field <code>flagRefund</code>.</p>
	 *
	 * @param flagRefund a {@link java.lang.String} object.
	 */
	public void setFlagRefund(String flagRefund) {
		this.flagRefund = flagRefund;
	}

	/**
	 * <p>Getter for the field <code>gmtBizCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtBizCreate() {
		return this.gmtBizCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtBizCreate</code>.</p>
	 *
	 * @param gmtBizCreate a {@link java.util.Date} object.
	 */
	public void setGmtBizCreate(Date gmtBizCreate) {
		this.gmtBizCreate = gmtBizCreate;
	}

	/**
	 * <p>Getter for the field <code>gmtBizModified</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtBizModified() {
		return this.gmtBizModified;
	}
	/**
	 * <p>Setter for the field <code>gmtBizModified</code>.</p>
	 *
	 * @param gmtBizModified a {@link java.util.Date} object.
	 */
	public void setGmtBizModified(Date gmtBizModified) {
		this.gmtBizModified = gmtBizModified;
	}

	/**
	 * <p>Getter for the field <code>gmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	/**
	 * <p>Setter for the field <code>gmtCreate</code>.</p>
	 *
	 * @param gmtCreate a {@link java.util.Date} object.
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * <p>Getter for the field <code>gmtModified</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtModified() {
		return this.gmtModified;
	}
	/**
	 * <p>Setter for the field <code>gmtModified</code>.</p>
	 *
	 * @param gmtModified a {@link java.util.Date} object.
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * <p>Getter for the field <code>gmtReceivePay</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtReceivePay() {
		return this.gmtReceivePay;
	}
	/**
	 * <p>Setter for the field <code>gmtReceivePay</code>.</p>
	 *
	 * @param gmtReceivePay a {@link java.util.Date} object.
	 */
	public void setGmtReceivePay(Date gmtReceivePay) {
		this.gmtReceivePay = gmtReceivePay;
	}

	/**
	 * <p>Getter for the field <code>gmtSendPay</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getGmtSendPay() {
		return this.gmtSendPay;
	}
	/**
	 * <p>Setter for the field <code>gmtSendPay</code>.</p>
	 *
	 * @param gmtSendPay a {@link java.util.Date} object.
	 */
	public void setGmtSendPay(Date gmtSendPay) {
		this.gmtSendPay = gmtSendPay;
	}

	/**
	 * <p>Getter for the field <code>hasFundItem</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getHasFundItem() {
		return this.hasFundItem;
	}
	/**
	 * <p>Setter for the field <code>hasFundItem</code>.</p>
	 *
	 * @param hasFundItem a {@link java.lang.Boolean} object.
	 */
	public void setHasFundItem(Boolean hasFundItem) {
		this.hasFundItem = hasFundItem;
	}

	/**
	 * <p>Getter for the field <code>hasNewFundItem</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getHasNewFundItem() {
		return this.hasNewFundItem;
	}
	/**
	 * <p>Setter for the field <code>hasNewFundItem</code>.</p>
	 *
	 * @param hasNewFundItem a {@link java.lang.Boolean} object.
	 */
	public void setHasNewFundItem(Boolean hasNewFundItem) {
		this.hasNewFundItem = hasNewFundItem;
	}

	/**
	 * <p>Getter for the field <code>inOut</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInOut() {
		return this.inOut;
	}
	/**
	 * <p>Setter for the field <code>inOut</code>.</p>
	 *
	 * @param inOut a {@link java.lang.String} object.
	 */
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	/**
	 * <p>Getter for the field <code>oppositeCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeCardNo() {
		return this.oppositeCardNo;
	}
	/**
	 * <p>Setter for the field <code>oppositeCardNo</code>.</p>
	 *
	 * @param oppositeCardNo a {@link java.lang.String} object.
	 */
	public void setOppositeCardNo(String oppositeCardNo) {
		this.oppositeCardNo = oppositeCardNo;
	}

	/**
	 * <p>Getter for the field <code>oppositeLoginId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeLoginId() {
		return this.oppositeLoginId;
	}
	/**
	 * <p>Setter for the field <code>oppositeLoginId</code>.</p>
	 *
	 * @param oppositeLoginId a {@link java.lang.String} object.
	 */
	public void setOppositeLoginId(String oppositeLoginId) {
		this.oppositeLoginId = oppositeLoginId;
	}

	/**
	 * <p>Getter for the field <code>oppositeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeName() {
		return this.oppositeName;
	}
	/**
	 * <p>Setter for the field <code>oppositeName</code>.</p>
	 *
	 * @param oppositeName a {@link java.lang.String} object.
	 */
	public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

	/**
	 * <p>Getter for the field <code>oppositeNickName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeNickName() {
		return this.oppositeNickName;
	}
	/**
	 * <p>Setter for the field <code>oppositeNickName</code>.</p>
	 *
	 * @param oppositeNickName a {@link java.lang.String} object.
	 */
	public void setOppositeNickName(String oppositeNickName) {
		this.oppositeNickName = oppositeNickName;
	}

	/**
	 * <p>Getter for the field <code>origConsumeTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrigConsumeTitle() {
		return this.origConsumeTitle;
	}
	/**
	 * <p>Setter for the field <code>origConsumeTitle</code>.</p>
	 *
	 * @param origConsumeTitle a {@link java.lang.String} object.
	 */
	public void setOrigConsumeTitle(String origConsumeTitle) {
		this.origConsumeTitle = origConsumeTitle;
	}

	/**
	 * <p>Getter for the field <code>ownerCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerCardNo() {
		return this.ownerCardNo;
	}
	/**
	 * <p>Setter for the field <code>ownerCardNo</code>.</p>
	 *
	 * @param ownerCardNo a {@link java.lang.String} object.
	 */
	public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

	/**
	 * <p>Getter for the field <code>ownerCustomerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerCustomerId() {
		return this.ownerCustomerId;
	}
	/**
	 * <p>Setter for the field <code>ownerCustomerId</code>.</p>
	 *
	 * @param ownerCustomerId a {@link java.lang.String} object.
	 */
	public void setOwnerCustomerId(String ownerCustomerId) {
		this.ownerCustomerId = ownerCustomerId;
	}

	/**
	 * <p>Getter for the field <code>ownerLoginId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerLoginId() {
		return this.ownerLoginId;
	}
	/**
	 * <p>Setter for the field <code>ownerLoginId</code>.</p>
	 *
	 * @param ownerLoginId a {@link java.lang.String} object.
	 */
	public void setOwnerLoginId(String ownerLoginId) {
		this.ownerLoginId = ownerLoginId;
	}

	/**
	 * <p>Getter for the field <code>ownerName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerName() {
		return this.ownerName;
	}
	/**
	 * <p>Setter for the field <code>ownerName</code>.</p>
	 *
	 * @param ownerName a {@link java.lang.String} object.
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * <p>Getter for the field <code>ownerNick</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOwnerNick() {
		return this.ownerNick;
	}
	/**
	 * <p>Setter for the field <code>ownerNick</code>.</p>
	 *
	 * @param ownerNick a {@link java.lang.String} object.
	 */
	public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}

	/**
	 * <p>Getter for the field <code>partnerId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartnerId() {
		return this.partnerId;
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
	 * <p>Getter for the field <code>payChannel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayChannel() {
		return this.payChannel;
	}
	/**
	 * <p>Setter for the field <code>payChannel</code>.</p>
	 *
	 * @param payChannel a {@link java.lang.String} object.
	 */
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	/**
	 * <p>Getter for the field <code>peerpayerRealName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPeerpayerRealName() {
		return this.peerpayerRealName;
	}
	/**
	 * <p>Setter for the field <code>peerpayerRealName</code>.</p>
	 *
	 * @param peerpayerRealName a {@link java.lang.String} object.
	 */
	public void setPeerpayerRealName(String peerpayerRealName) {
		this.peerpayerRealName = peerpayerRealName;
	}

	/**
	 * <p>Getter for the field <code>product</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProduct() {
		return this.product;
	}
	/**
	 * <p>Setter for the field <code>product</code>.</p>
	 *
	 * @param product a {@link java.lang.String} object.
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * <p>Getter for the field <code>refundFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundFee() {
		return this.refundFee;
	}
	/**
	 * <p>Setter for the field <code>refundFee</code>.</p>
	 *
	 * @param refundFee a {@link java.lang.String} object.
	 */
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	/**
	 * <p>Getter for the field <code>serviceFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getServiceFee() {
		return this.serviceFee;
	}
	/**
	 * <p>Setter for the field <code>serviceFee</code>.</p>
	 *
	 * @param serviceFee a {@link java.lang.String} object.
	 */
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	/**
	 * <p>Getter for the field <code>totalRefundFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalRefundFee() {
		return this.totalRefundFee;
	}
	/**
	 * <p>Setter for the field <code>totalRefundFee</code>.</p>
	 *
	 * @param totalRefundFee a {@link java.lang.String} object.
	 */
	public void setTotalRefundFee(String totalRefundFee) {
		this.totalRefundFee = totalRefundFee;
	}

	/**
	 * <p>Getter for the field <code>tradeFrom</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeFrom() {
		return this.tradeFrom;
	}
	/**
	 * <p>Setter for the field <code>tradeFrom</code>.</p>
	 *
	 * @param tradeFrom a {@link java.lang.String} object.
	 */
	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

}
