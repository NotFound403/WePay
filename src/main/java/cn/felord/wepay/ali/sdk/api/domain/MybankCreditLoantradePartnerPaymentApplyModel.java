package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 代收付-申请接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MybankCreditLoantradePartnerPaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5185174752662637894L;

	/**
	 * 业务金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务产品编码，64个字符以内
	 */
	@ApiField("biz_product_code")
	private String bizProductCode;

	/**
	 * 业务类型，目前只支持两种：REPAY（还款）,ENCASH（放款）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客户支付宝账户，与UID字段不能同时为空
	 */
	@ApiField("login_account")
	private String loginAccount;

	/**
	 * 网商业务订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部网商端不重复
	 */
	@ApiField("mybk_order_no")
	private String mybkOrderNo;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扩展参数，JSON格式，100个字符以内，在代收请求时需要附带期数信息在扩展参数中，代付的场景下是没有的,具体参数：tenor:期次
	 */
	@ApiField("out_param")
	private String outParam;

	/**
	 * 外部请求流水号,32个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_seq_no")
	private String outSeqNo;

	/**
	 * 收款方列表
	 */
	@ApiListField("payee_account_list")
	@ApiField("payment_account_info")
	private List<PaymentAccountInfo> payeeAccountList;

	/**
	 * 付款方列表
	 */
	@ApiListField("payer_account_list")
	@ApiField("payment_account_info")
	private List<PaymentAccountInfo> payerAccountList;

	/**
	 * 代收付产品编码，64个字符以内
	 */
	@ApiField("payment_product_code")
	private String paymentProductCode;

	/**
	 * 客户支付宝账号数字ID，与支付宝账户字段不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAmount() {
		return this.amount;
	}
	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.Long} object.
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * <p>Getter for the field <code>bizProductCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizProductCode() {
		return this.bizProductCode;
	}
	/**
	 * <p>Setter for the field <code>bizProductCode</code>.</p>
	 *
	 * @param bizProductCode a {@link java.lang.String} object.
	 */
	public void setBizProductCode(String bizProductCode) {
		this.bizProductCode = bizProductCode;
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
	 * <p>Getter for the field <code>loginAccount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginAccount() {
		return this.loginAccount;
	}
	/**
	 * <p>Setter for the field <code>loginAccount</code>.</p>
	 *
	 * @param loginAccount a {@link java.lang.String} object.
	 */
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	/**
	 * <p>Getter for the field <code>mybkOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMybkOrderNo() {
		return this.mybkOrderNo;
	}
	/**
	 * <p>Setter for the field <code>mybkOrderNo</code>.</p>
	 *
	 * @param mybkOrderNo a {@link java.lang.String} object.
	 */
	public void setMybkOrderNo(String mybkOrderNo) {
		this.mybkOrderNo = mybkOrderNo;
	}

	/**
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	/**
	 * <p>Setter for the field <code>outOrderNo</code>.</p>
	 *
	 * @param outOrderNo a {@link java.lang.String} object.
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	/**
	 * <p>Getter for the field <code>outParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutParam() {
		return this.outParam;
	}
	/**
	 * <p>Setter for the field <code>outParam</code>.</p>
	 *
	 * @param outParam a {@link java.lang.String} object.
	 */
	public void setOutParam(String outParam) {
		this.outParam = outParam;
	}

	/**
	 * <p>Getter for the field <code>outSeqNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutSeqNo() {
		return this.outSeqNo;
	}
	/**
	 * <p>Setter for the field <code>outSeqNo</code>.</p>
	 *
	 * @param outSeqNo a {@link java.lang.String} object.
	 */
	public void setOutSeqNo(String outSeqNo) {
		this.outSeqNo = outSeqNo;
	}

	/**
	 * <p>Getter for the field <code>payeeAccountList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PaymentAccountInfo> getPayeeAccountList() {
		return this.payeeAccountList;
	}
	/**
	 * <p>Setter for the field <code>payeeAccountList</code>.</p>
	 *
	 * @param payeeAccountList a {@link java.util.List} object.
	 */
	public void setPayeeAccountList(List<PaymentAccountInfo> payeeAccountList) {
		this.payeeAccountList = payeeAccountList;
	}

	/**
	 * <p>Getter for the field <code>payerAccountList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<PaymentAccountInfo> getPayerAccountList() {
		return this.payerAccountList;
	}
	/**
	 * <p>Setter for the field <code>payerAccountList</code>.</p>
	 *
	 * @param payerAccountList a {@link java.util.List} object.
	 */
	public void setPayerAccountList(List<PaymentAccountInfo> payerAccountList) {
		this.payerAccountList = payerAccountList;
	}

	/**
	 * <p>Getter for the field <code>paymentProductCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPaymentProductCode() {
		return this.paymentProductCode;
	}
	/**
	 * <p>Setter for the field <code>paymentProductCode</code>.</p>
	 *
	 * @param paymentProductCode a {@link java.lang.String} object.
	 */
	public void setPaymentProductCode(String paymentProductCode) {
		this.paymentProductCode = paymentProductCode;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
