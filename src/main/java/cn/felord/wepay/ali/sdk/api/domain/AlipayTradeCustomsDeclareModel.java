package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 统一收单报关接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeCustomsDeclareModel extends AlipayObject {

	private static final long serialVersionUID = 2626467314669885267L;

	/**
	 * 报关金额，单位为人民币“元”，精确到小数点后2位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订购人身份信息
	 */
	@ApiField("buyer_info")
	private CustomsDeclareBuyerInfo buyerInfo;

	/**
	 * 海关编号（大小写皆可）。参见“ <a href="https://doc.open.alipay.com/docs/doc.htm?treeId=267&articleId=105883&docType=1">海关编号</a>”。
	 */
	@ApiField("customs_place")
	private String customsPlace;

	/**
	 * 商户控制本单是否拆单的报关参数。
仅当该参数传值为T或者t时，才会触发拆单。
	 */
	@ApiField("is_split")
	private String isSplit;

	/**
	 * 商户在海关备案的编号。
	 */
	@ApiField("merchant_customs_code")
	private String merchantCustomsCode;

	/**
	 * 商户海关备案名称。
	 */
	@ApiField("merchant_customs_name")
	private String merchantCustomsName;

	/**
	 * 报关流水号。商户生成的用于唯一标识一次报关操作的业务编号。
建议生成规则：yyyymmdd型8位日期拼接4位序列号。每个报关请求号仅允许传入：数字、英文字母、下划线”_”、短横线”－” 。长度6-32位前后不能有空格
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 拆单报关的商户子订单号。 用于区别拆单时不同子单。拆单时必须传入，否则会报INVALID_PARAMETER错误码。
	 */
	@ApiField("sub_out_biz_no")
	private String subOutBizNo;

	/**
	 * 支付宝交易号。该交易在支付宝系统中的交易流水号，最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
	 * <p>Getter for the field <code>buyerInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.CustomsDeclareBuyerInfo} object.
	 */
	public CustomsDeclareBuyerInfo getBuyerInfo() {
		return this.buyerInfo;
	}
	/**
	 * <p>Setter for the field <code>buyerInfo</code>.</p>
	 *
	 * @param buyerInfo a {@link cn.felord.wepay.ali.sdk.api.domain.CustomsDeclareBuyerInfo} object.
	 */
	public void setBuyerInfo(CustomsDeclareBuyerInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
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
