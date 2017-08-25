package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 报关记录详情数据结构
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CustomsDeclareRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 7484943511594137257L;

	/**
	 * 支付宝报关流水号。
	 */
	@ApiField("alipay_declare_no")
	private String alipayDeclareNo;

	/**
	 * 报关金额，单位为人民币“元”，精确到小数点后2位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 此记录所报关的海关编号，参见“海关编号”。
	 */
	@ApiField("customs_place")
	private String customsPlace;

	/**
	 * 发起报关后，海关返回回执中的结果码。目前只有总署的报关，并且总署回执接收成功的请求才会返回此参数
2：电子口岸申报中
3：发送海关成功
4：发送海关失败
100：海关退单
399：海关审结
小于0的数字：表示处理异常回执
   注意：
支付宝原样返回海关返回的数据，参数值以海关的定义为准。
	 */
	@ApiField("customs_result_code")
	private String customsResultCode;

	/**
	 * 发起报关后，海关返回回执中的结果描述信息。目前只有总署报关，并且总署成功返回回执的时候会有此值
	 */
	@ApiField("customs_result_info")
	private String customsResultInfo;

	/**
	 * 发起报关后，海关返回回执的时间，格式为：yyyyMMddHHmmss。目前只有总署报关，并且总署成功返回回执的时候才会有此参数。
	 */
	@ApiField("customs_result_return_time")
	private String customsResultReturnTime;

	/**
	 * T: 拆单；F：非拆单。当请求没有拆单或者请求传入的is_split=F时，不会返回此参数。
	 */
	@ApiField("is_split")
	private String isSplit;

	/**
	 * 报关记录状态最后更新时间
	 */
	@ApiField("last_modified_time")
	private String lastModifiedTime;

	/**
	 * 备注说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户在海关备案的编号。
	 */
	@ApiField("merchant_customs_code")
	private String merchantCustomsCode;

	/**
	 * 商户海关备案名称
	 */
	@ApiField("merchant_customs_name")
	private String merchantCustomsName;

	/**
	 * 报关请求号。商户端报关请求号，对应入参中的某条报关请求号。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 该报关单当前的状态：
-	ws等待发送海关
-	sending已提交发送海关
-	succ 海关返回受理成功
	 */
	@ApiField("status")
	private String status;

	/**
	 * 拆单子订单号。如果报关请求没有请求拆单则不会返回此参数。
	 */
	@ApiField("sub_out_biz_no")
	private String subOutBizNo;

	/**
	 * 支付宝推送到海关的支付单据号。针对拆单的报关，这个单据号不等于支付宝原始交易号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * <p>Getter for the field <code>alipayDeclareNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAlipayDeclareNo() {
		return this.alipayDeclareNo;
	}
	/**
	 * <p>Setter for the field <code>alipayDeclareNo</code>.</p>
	 *
	 * @param alipayDeclareNo a {@link java.lang.String} object.
	 */
	public void setAlipayDeclareNo(String alipayDeclareNo) {
		this.alipayDeclareNo = alipayDeclareNo;
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
	 * <p>Getter for the field <code>customsPlace</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCustomsPlace() {
		return this.customsPlace;
	}
	/**
	 * <p>Setter for the field <code>customsPlace</code>.</p>
	 *
	 * @param customsPlace a {@link java.lang.String} object.
	 */
	public void setCustomsPlace(String customsPlace) {
		this.customsPlace = customsPlace;
	}

	/**
	 * <p>Getter for the field <code>customsResultCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCustomsResultCode() {
		return this.customsResultCode;
	}
	/**
	 * <p>Setter for the field <code>customsResultCode</code>.</p>
	 *
	 * @param customsResultCode a {@link java.lang.String} object.
	 */
	public void setCustomsResultCode(String customsResultCode) {
		this.customsResultCode = customsResultCode;
	}

	/**
	 * <p>Getter for the field <code>customsResultInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCustomsResultInfo() {
		return this.customsResultInfo;
	}
	/**
	 * <p>Setter for the field <code>customsResultInfo</code>.</p>
	 *
	 * @param customsResultInfo a {@link java.lang.String} object.
	 */
	public void setCustomsResultInfo(String customsResultInfo) {
		this.customsResultInfo = customsResultInfo;
	}

	/**
	 * <p>Getter for the field <code>customsResultReturnTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCustomsResultReturnTime() {
		return this.customsResultReturnTime;
	}
	/**
	 * <p>Setter for the field <code>customsResultReturnTime</code>.</p>
	 *
	 * @param customsResultReturnTime a {@link java.lang.String} object.
	 */
	public void setCustomsResultReturnTime(String customsResultReturnTime) {
		this.customsResultReturnTime = customsResultReturnTime;
	}

	/**
	 * <p>Getter for the field <code>isSplit</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIsSplit() {
		return this.isSplit;
	}
	/**
	 * <p>Setter for the field <code>isSplit</code>.</p>
	 *
	 * @param isSplit a {@link java.lang.String} object.
	 */
	public void setIsSplit(String isSplit) {
		this.isSplit = isSplit;
	}

	/**
	 * <p>Getter for the field <code>lastModifiedTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLastModifiedTime() {
		return this.lastModifiedTime;
	}
	/**
	 * <p>Setter for the field <code>lastModifiedTime</code>.</p>
	 *
	 * @param lastModifiedTime a {@link java.lang.String} object.
	 */
	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>merchantCustomsCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantCustomsCode() {
		return this.merchantCustomsCode;
	}
	/**
	 * <p>Setter for the field <code>merchantCustomsCode</code>.</p>
	 *
	 * @param merchantCustomsCode a {@link java.lang.String} object.
	 */
	public void setMerchantCustomsCode(String merchantCustomsCode) {
		this.merchantCustomsCode = merchantCustomsCode;
	}

	/**
	 * <p>Getter for the field <code>merchantCustomsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMerchantCustomsName() {
		return this.merchantCustomsName;
	}
	/**
	 * <p>Setter for the field <code>merchantCustomsName</code>.</p>
	 *
	 * @param merchantCustomsName a {@link java.lang.String} object.
	 */
	public void setMerchantCustomsName(String merchantCustomsName) {
		this.merchantCustomsName = merchantCustomsName;
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
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>subOutBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubOutBizNo() {
		return this.subOutBizNo;
	}
	/**
	 * <p>Setter for the field <code>subOutBizNo</code>.</p>
	 *
	 * @param subOutBizNo a {@link java.lang.String} object.
	 */
	public void setSubOutBizNo(String subOutBizNo) {
		this.subOutBizNo = subOutBizNo;
	}

	/**
	 * <p>Getter for the field <code>tradeNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTradeNo() {
		return this.tradeNo;
	}
	/**
	 * <p>Setter for the field <code>tradeNo</code>.</p>
	 *
	 * @param tradeNo a {@link java.lang.String} object.
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
