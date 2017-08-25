package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 资金明细模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class FundItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 6513998955187527963L;

	/**
	 * 财务外部单据号
	 */
	@ApiField("acctrans_out_biz_no")
	private String acctransOutBizNo;

	/**
	 * 资金变动金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产类型编码
	 */
	@ApiField("assert_type_code")
	private String assertTypeCode;

	/**
	 * 银行卡支付工具类型
	 */
	@ApiField("bank_card_pay_type")
	private String bankCardPayType;

	/**
	 * 银行卡类型
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务号
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	/**
	 * 业务外部流水号
	 */
	@ApiField("biz_out_no")
	private String bizOutNo;

	/**
	 * 业务类型（枚举值对应的code）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 币种（数字形式）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 充退金额
	 */
	@ApiField("dback_amount")
	private String dbackAmount;

	/**
	 * 退款申请时间
	 */
	@ApiField("dback_gmt_create")
	private Date dbackGmtCreate;

	/**
	 * 实际/预估银行响应时间
	 */
	@ApiField("dback_gmt_est_bk_ack")
	private Date dbackGmtEstBkAck;

	/**
	 * 预估银行入账时间
	 */
	@ApiField("dback_gmt_est_bk_into")
	private Date dbackGmtEstBkInto;

	/**
	 * 充值账户名
	 */
	@ApiField("dback_inst_account_name")
	private String dbackInstAccountName;

	/**
	 * 充值卡号（后四位）
	 */
	@ApiField("dback_inst_account_no")
	private String dbackInstAccountNo;

	/**
	 * 机构ID
	 */
	@ApiField("dback_inst_id")
	private String dbackInstId;

	/**
	 * 机构名称
	 */
	@ApiField("dback_inst_name")
	private String dbackInstName;

	/**
	 * 统一支付资金条目ID
	 */
	@ApiField("fid")
	private String fid;

	/**
	 * 面向系统的资金工具接入类型
	 */
	@ApiField("fund_access_type")
	private Long fundAccessType;

	/**
	 * 资金账号。可以是支付宝主卡账号，子卡账号，银行卡号等等。
	 */
	@ApiField("fund_account_no")
	private String fundAccountNo;

	/**
	 * 资金业务类型枚举
	 */
	@ApiField("fund_biz_type")
	private Long fundBizType;

	/**
	 * 资金明细创建时间
	 */
	@ApiField("fund_create_time")
	private Date fundCreateTime;

	/**
	 * 资金变动完成时间
	 */
	@ApiField("fund_finish_time")
	private Date fundFinishTime;

	/**
	 * 资金流向枚举
	 */
	@ApiField("fund_in_out")
	private Long fundInOut;

	/**
	 * 资金工具机构
	 */
	@ApiField("fund_inst_id")
	private String fundInstId;

	/**
	 * 资金明细最后修改时间
	 */
	@ApiField("fund_modify_time")
	private Date fundModifyTime;

	/**
	 * 资金状态
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/**
	 * 该资金变动的资金工具是否为ownerCardNo所拥有
	 */
	@ApiField("fund_tool_belong_to_crowner")
	private Boolean fundToolBelongToCrowner;

	/**
	 * fundToolBelongToCROwner为false时，该字段记录资金工具的实际拥有者
	 */
	@ApiField("fund_tool_owner_card_no")
	private String fundToolOwnerCardNo;

	/**
	 * 面向用户的资金工具类型
	 */
	@ApiField("fund_tool_type_for_crowner")
	private String fundToolTypeForCrowner;

	/**
	 * 面向系统的资金工具类型
	 */
	@ApiField("fund_tool_type_for_system")
	private String fundToolTypeForSystem;

	/**
	 * 资金工具名字（中文），供外部直接展示用。
	 */
	@ApiField("fund_tool_type_name")
	private String fundToolTypeName;

	/**
	 * 业务创建时间
	 */
	@ApiField("gmt_biz_create")
	private Date gmtBizCreate;

	/**
	 * 差错资金自服务入口开放类型，TAOBAO-对淘宝开放，ALIPAY-对支付宝站内开放
	 */
	@ApiField("open_self_slip_type")
	private String openSelfSlipType;

	/**
	 * 导致该资金变动在业务上的另一方的卡别名
	 */
	@ApiField("opposite_biz_card_alias")
	private String oppositeBizCardAlias;

	/**
	 * 导致该资金变动在业务上的另一方的卡别名。
	 */
	@ApiField("opposite_biz_card_no")
	private String oppositeBizCardNo;

	/**
	 * 导致该资金变动在资金上的另一方的卡别名。
	 */
	@ApiField("opposite_fund_card_no")
	private String oppositeFundCardNo;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 本方卡号
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	/**
	 * 银行卡退款进度状态
	 */
	@ApiField("refund_bank_status")
	private String refundBankStatus;

	/**
	 * 差错可提取金额，单位元
	 */
	@ApiField("slip_amount")
	private String slipAmount;

	/**
	 * 差错挂账id
	 */
	@ApiField("slip_id")
	private String slipId;

	/**
	 * 差错挂账资金申领状态，W-待申领，P-申领中，S-成功，F-失败
	 */
	@ApiField("slip_status")
	private String slipStatus;

	/**
	 * 预付子卡类型
	 */
	@ApiField("sub_prepaid_card_type")
	private String subPrepaidCardType;

	/**
	 * 统一支付ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * <p>Getter for the field <code>acctransOutBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAcctransOutBizNo() {
		return this.acctransOutBizNo;
	}
	/**
	 * <p>Setter for the field <code>acctransOutBizNo</code>.</p>
	 *
	 * @param acctransOutBizNo a {@link java.lang.String} object.
	 */
	public void setAcctransOutBizNo(String acctransOutBizNo) {
		this.acctransOutBizNo = acctransOutBizNo;
	}

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.String} object.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>assertTypeCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssertTypeCode() {
		return this.assertTypeCode;
	}
	/**
	 * <p>Setter for the field <code>assertTypeCode</code>.</p>
	 *
	 * @param assertTypeCode a {@link java.lang.String} object.
	 */
	public void setAssertTypeCode(String assertTypeCode) {
		this.assertTypeCode = assertTypeCode;
	}

	/**
	 * <p>Getter for the field <code>bankCardPayType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankCardPayType() {
		return this.bankCardPayType;
	}
	/**
	 * <p>Setter for the field <code>bankCardPayType</code>.</p>
	 *
	 * @param bankCardPayType a {@link java.lang.String} object.
	 */
	public void setBankCardPayType(String bankCardPayType) {
		this.bankCardPayType = bankCardPayType;
	}

	/**
	 * <p>Getter for the field <code>bankCardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBankCardType() {
		return this.bankCardType;
	}
	/**
	 * <p>Setter for the field <code>bankCardType</code>.</p>
	 *
	 * @param bankCardType a {@link java.lang.String} object.
	 */
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	/**
	 * <p>Getter for the field <code>bizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizId() {
		return this.bizId;
	}
	/**
	 * <p>Setter for the field <code>bizId</code>.</p>
	 *
	 * @param bizId a {@link java.lang.String} object.
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
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
	 * <p>Getter for the field <code>dbackAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackAmount() {
		return this.dbackAmount;
	}
	/**
	 * <p>Setter for the field <code>dbackAmount</code>.</p>
	 *
	 * @param dbackAmount a {@link java.lang.String} object.
	 */
	public void setDbackAmount(String dbackAmount) {
		this.dbackAmount = dbackAmount;
	}

	/**
	 * <p>Getter for the field <code>dbackGmtCreate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDbackGmtCreate() {
		return this.dbackGmtCreate;
	}
	/**
	 * <p>Setter for the field <code>dbackGmtCreate</code>.</p>
	 *
	 * @param dbackGmtCreate a {@link java.util.Date} object.
	 */
	public void setDbackGmtCreate(Date dbackGmtCreate) {
		this.dbackGmtCreate = dbackGmtCreate;
	}

	/**
	 * <p>Getter for the field <code>dbackGmtEstBkAck</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDbackGmtEstBkAck() {
		return this.dbackGmtEstBkAck;
	}
	/**
	 * <p>Setter for the field <code>dbackGmtEstBkAck</code>.</p>
	 *
	 * @param dbackGmtEstBkAck a {@link java.util.Date} object.
	 */
	public void setDbackGmtEstBkAck(Date dbackGmtEstBkAck) {
		this.dbackGmtEstBkAck = dbackGmtEstBkAck;
	}

	/**
	 * <p>Getter for the field <code>dbackGmtEstBkInto</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getDbackGmtEstBkInto() {
		return this.dbackGmtEstBkInto;
	}
	/**
	 * <p>Setter for the field <code>dbackGmtEstBkInto</code>.</p>
	 *
	 * @param dbackGmtEstBkInto a {@link java.util.Date} object.
	 */
	public void setDbackGmtEstBkInto(Date dbackGmtEstBkInto) {
		this.dbackGmtEstBkInto = dbackGmtEstBkInto;
	}

	/**
	 * <p>Getter for the field <code>dbackInstAccountName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackInstAccountName() {
		return this.dbackInstAccountName;
	}
	/**
	 * <p>Setter for the field <code>dbackInstAccountName</code>.</p>
	 *
	 * @param dbackInstAccountName a {@link java.lang.String} object.
	 */
	public void setDbackInstAccountName(String dbackInstAccountName) {
		this.dbackInstAccountName = dbackInstAccountName;
	}

	/**
	 * <p>Getter for the field <code>dbackInstAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackInstAccountNo() {
		return this.dbackInstAccountNo;
	}
	/**
	 * <p>Setter for the field <code>dbackInstAccountNo</code>.</p>
	 *
	 * @param dbackInstAccountNo a {@link java.lang.String} object.
	 */
	public void setDbackInstAccountNo(String dbackInstAccountNo) {
		this.dbackInstAccountNo = dbackInstAccountNo;
	}

	/**
	 * <p>Getter for the field <code>dbackInstId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackInstId() {
		return this.dbackInstId;
	}
	/**
	 * <p>Setter for the field <code>dbackInstId</code>.</p>
	 *
	 * @param dbackInstId a {@link java.lang.String} object.
	 */
	public void setDbackInstId(String dbackInstId) {
		this.dbackInstId = dbackInstId;
	}

	/**
	 * <p>Getter for the field <code>dbackInstName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDbackInstName() {
		return this.dbackInstName;
	}
	/**
	 * <p>Setter for the field <code>dbackInstName</code>.</p>
	 *
	 * @param dbackInstName a {@link java.lang.String} object.
	 */
	public void setDbackInstName(String dbackInstName) {
		this.dbackInstName = dbackInstName;
	}

	/**
	 * <p>Getter for the field <code>fid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFid() {
		return this.fid;
	}
	/**
	 * <p>Setter for the field <code>fid</code>.</p>
	 *
	 * @param fid a {@link java.lang.String} object.
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}

	/**
	 * <p>Getter for the field <code>fundAccessType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getFundAccessType() {
		return this.fundAccessType;
	}
	/**
	 * <p>Setter for the field <code>fundAccessType</code>.</p>
	 *
	 * @param fundAccessType a {@link java.lang.Long} object.
	 */
	public void setFundAccessType(Long fundAccessType) {
		this.fundAccessType = fundAccessType;
	}

	/**
	 * <p>Getter for the field <code>fundAccountNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundAccountNo() {
		return this.fundAccountNo;
	}
	/**
	 * <p>Setter for the field <code>fundAccountNo</code>.</p>
	 *
	 * @param fundAccountNo a {@link java.lang.String} object.
	 */
	public void setFundAccountNo(String fundAccountNo) {
		this.fundAccountNo = fundAccountNo;
	}

	/**
	 * <p>Getter for the field <code>fundBizType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getFundBizType() {
		return this.fundBizType;
	}
	/**
	 * <p>Setter for the field <code>fundBizType</code>.</p>
	 *
	 * @param fundBizType a {@link java.lang.Long} object.
	 */
	public void setFundBizType(Long fundBizType) {
		this.fundBizType = fundBizType;
	}

	/**
	 * <p>Getter for the field <code>fundCreateTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getFundCreateTime() {
		return this.fundCreateTime;
	}
	/**
	 * <p>Setter for the field <code>fundCreateTime</code>.</p>
	 *
	 * @param fundCreateTime a {@link java.util.Date} object.
	 */
	public void setFundCreateTime(Date fundCreateTime) {
		this.fundCreateTime = fundCreateTime;
	}

	/**
	 * <p>Getter for the field <code>fundFinishTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getFundFinishTime() {
		return this.fundFinishTime;
	}
	/**
	 * <p>Setter for the field <code>fundFinishTime</code>.</p>
	 *
	 * @param fundFinishTime a {@link java.util.Date} object.
	 */
	public void setFundFinishTime(Date fundFinishTime) {
		this.fundFinishTime = fundFinishTime;
	}

	/**
	 * <p>Getter for the field <code>fundInOut</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getFundInOut() {
		return this.fundInOut;
	}
	/**
	 * <p>Setter for the field <code>fundInOut</code>.</p>
	 *
	 * @param fundInOut a {@link java.lang.Long} object.
	 */
	public void setFundInOut(Long fundInOut) {
		this.fundInOut = fundInOut;
	}

	/**
	 * <p>Getter for the field <code>fundInstId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundInstId() {
		return this.fundInstId;
	}
	/**
	 * <p>Setter for the field <code>fundInstId</code>.</p>
	 *
	 * @param fundInstId a {@link java.lang.String} object.
	 */
	public void setFundInstId(String fundInstId) {
		this.fundInstId = fundInstId;
	}

	/**
	 * <p>Getter for the field <code>fundModifyTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getFundModifyTime() {
		return this.fundModifyTime;
	}
	/**
	 * <p>Setter for the field <code>fundModifyTime</code>.</p>
	 *
	 * @param fundModifyTime a {@link java.util.Date} object.
	 */
	public void setFundModifyTime(Date fundModifyTime) {
		this.fundModifyTime = fundModifyTime;
	}

	/**
	 * <p>Getter for the field <code>fundStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundStatus() {
		return this.fundStatus;
	}
	/**
	 * <p>Setter for the field <code>fundStatus</code>.</p>
	 *
	 * @param fundStatus a {@link java.lang.String} object.
	 */
	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}

	/**
	 * <p>Getter for the field <code>fundToolBelongToCrowner</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getFundToolBelongToCrowner() {
		return this.fundToolBelongToCrowner;
	}
	/**
	 * <p>Setter for the field <code>fundToolBelongToCrowner</code>.</p>
	 *
	 * @param fundToolBelongToCrowner a {@link java.lang.Boolean} object.
	 */
	public void setFundToolBelongToCrowner(Boolean fundToolBelongToCrowner) {
		this.fundToolBelongToCrowner = fundToolBelongToCrowner;
	}

	/**
	 * <p>Getter for the field <code>fundToolOwnerCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundToolOwnerCardNo() {
		return this.fundToolOwnerCardNo;
	}
	/**
	 * <p>Setter for the field <code>fundToolOwnerCardNo</code>.</p>
	 *
	 * @param fundToolOwnerCardNo a {@link java.lang.String} object.
	 */
	public void setFundToolOwnerCardNo(String fundToolOwnerCardNo) {
		this.fundToolOwnerCardNo = fundToolOwnerCardNo;
	}

	/**
	 * <p>Getter for the field <code>fundToolTypeForCrowner</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundToolTypeForCrowner() {
		return this.fundToolTypeForCrowner;
	}
	/**
	 * <p>Setter for the field <code>fundToolTypeForCrowner</code>.</p>
	 *
	 * @param fundToolTypeForCrowner a {@link java.lang.String} object.
	 */
	public void setFundToolTypeForCrowner(String fundToolTypeForCrowner) {
		this.fundToolTypeForCrowner = fundToolTypeForCrowner;
	}

	/**
	 * <p>Getter for the field <code>fundToolTypeForSystem</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundToolTypeForSystem() {
		return this.fundToolTypeForSystem;
	}
	/**
	 * <p>Setter for the field <code>fundToolTypeForSystem</code>.</p>
	 *
	 * @param fundToolTypeForSystem a {@link java.lang.String} object.
	 */
	public void setFundToolTypeForSystem(String fundToolTypeForSystem) {
		this.fundToolTypeForSystem = fundToolTypeForSystem;
	}

	/**
	 * <p>Getter for the field <code>fundToolTypeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFundToolTypeName() {
		return this.fundToolTypeName;
	}
	/**
	 * <p>Setter for the field <code>fundToolTypeName</code>.</p>
	 *
	 * @param fundToolTypeName a {@link java.lang.String} object.
	 */
	public void setFundToolTypeName(String fundToolTypeName) {
		this.fundToolTypeName = fundToolTypeName;
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
	 * <p>Getter for the field <code>openSelfSlipType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpenSelfSlipType() {
		return this.openSelfSlipType;
	}
	/**
	 * <p>Setter for the field <code>openSelfSlipType</code>.</p>
	 *
	 * @param openSelfSlipType a {@link java.lang.String} object.
	 */
	public void setOpenSelfSlipType(String openSelfSlipType) {
		this.openSelfSlipType = openSelfSlipType;
	}

	/**
	 * <p>Getter for the field <code>oppositeBizCardAlias</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeBizCardAlias() {
		return this.oppositeBizCardAlias;
	}
	/**
	 * <p>Setter for the field <code>oppositeBizCardAlias</code>.</p>
	 *
	 * @param oppositeBizCardAlias a {@link java.lang.String} object.
	 */
	public void setOppositeBizCardAlias(String oppositeBizCardAlias) {
		this.oppositeBizCardAlias = oppositeBizCardAlias;
	}

	/**
	 * <p>Getter for the field <code>oppositeBizCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeBizCardNo() {
		return this.oppositeBizCardNo;
	}
	/**
	 * <p>Setter for the field <code>oppositeBizCardNo</code>.</p>
	 *
	 * @param oppositeBizCardNo a {@link java.lang.String} object.
	 */
	public void setOppositeBizCardNo(String oppositeBizCardNo) {
		this.oppositeBizCardNo = oppositeBizCardNo;
	}

	/**
	 * <p>Getter for the field <code>oppositeFundCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOppositeFundCardNo() {
		return this.oppositeFundCardNo;
	}
	/**
	 * <p>Setter for the field <code>oppositeFundCardNo</code>.</p>
	 *
	 * @param oppositeFundCardNo a {@link java.lang.String} object.
	 */
	public void setOppositeFundCardNo(String oppositeFundCardNo) {
		this.oppositeFundCardNo = oppositeFundCardNo;
	}

	/**
	 * <p>Getter for the field <code>outRequestNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	/**
	 * <p>Setter for the field <code>outRequestNo</code>.</p>
	 *
	 * @param outRequestNo a {@link java.lang.String} object.
	 */
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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
	 * <p>Getter for the field <code>refundBankStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRefundBankStatus() {
		return this.refundBankStatus;
	}
	/**
	 * <p>Setter for the field <code>refundBankStatus</code>.</p>
	 *
	 * @param refundBankStatus a {@link java.lang.String} object.
	 */
	public void setRefundBankStatus(String refundBankStatus) {
		this.refundBankStatus = refundBankStatus;
	}

	/**
	 * <p>Getter for the field <code>slipAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSlipAmount() {
		return this.slipAmount;
	}
	/**
	 * <p>Setter for the field <code>slipAmount</code>.</p>
	 *
	 * @param slipAmount a {@link java.lang.String} object.
	 */
	public void setSlipAmount(String slipAmount) {
		this.slipAmount = slipAmount;
	}

	/**
	 * <p>Getter for the field <code>slipId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSlipId() {
		return this.slipId;
	}
	/**
	 * <p>Setter for the field <code>slipId</code>.</p>
	 *
	 * @param slipId a {@link java.lang.String} object.
	 */
	public void setSlipId(String slipId) {
		this.slipId = slipId;
	}

	/**
	 * <p>Getter for the field <code>slipStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSlipStatus() {
		return this.slipStatus;
	}
	/**
	 * <p>Setter for the field <code>slipStatus</code>.</p>
	 *
	 * @param slipStatus a {@link java.lang.String} object.
	 */
	public void setSlipStatus(String slipStatus) {
		this.slipStatus = slipStatus;
	}

	/**
	 * <p>Getter for the field <code>subPrepaidCardType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubPrepaidCardType() {
		return this.subPrepaidCardType;
	}
	/**
	 * <p>Setter for the field <code>subPrepaidCardType</code>.</p>
	 *
	 * @param subPrepaidCardType a {@link java.lang.String} object.
	 */
	public void setSubPrepaidCardType(String subPrepaidCardType) {
		this.subPrepaidCardType = subPrepaidCardType;
	}

	/**
	 * <p>Getter for the field <code>uid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUid() {
		return this.uid;
	}
	/**
	 * <p>Setter for the field <code>uid</code>.</p>
	 *
	 * @param uid a {@link java.lang.String} object.
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

}
