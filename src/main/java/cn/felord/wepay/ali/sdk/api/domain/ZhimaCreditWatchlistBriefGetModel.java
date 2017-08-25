package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 行业关注名单普惠版
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCreditWatchlistBriefGetModel extends AlipayObject {

	private static final long serialVersionUID = 4557786798461175743L;

	/**
	 * 与参数cert_type对应，分别为：证件号完整值(例：420983190001010001) 或支付宝uid（例：2088102165398450）
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 目前支持三种IDENTITY_CARD(身份证),PASSPORT(护照),ALIPAY_USER_ID(支付宝uid)
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户姓名 当证件类型为ALIPAY_USER_ID时可以不填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码，直接使用［示例］给出的值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * <p>Getter for the field <code>certNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertNo() {
		return this.certNo;
	}
	/**
	 * <p>Setter for the field <code>certNo</code>.</p>
	 *
	 * @param certNo a {@link java.lang.String} object.
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * <p>Getter for the field <code>certType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCertType() {
		return this.certType;
	}
	/**
	 * <p>Setter for the field <code>certType</code>.</p>
	 *
	 * @param certType a {@link java.lang.String} object.
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>productCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * <p>Setter for the field <code>productCode</code>.</p>
	 *
	 * @param productCode a {@link java.lang.String} object.
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * <p>Getter for the field <code>transactionId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTransactionId() {
		return this.transactionId;
	}
	/**
	 * <p>Setter for the field <code>transactionId</code>.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object.
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
