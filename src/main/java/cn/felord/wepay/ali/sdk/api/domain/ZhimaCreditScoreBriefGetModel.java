package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 芝麻信用评分普惠版
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaCreditScoreBriefGetModel extends AlipayObject {

	private static final long serialVersionUID = 3515912468434444188L;

	/**
	 * 350～950之间 业务判断的准入标准 建议业务确定一个稳定的判断标准 频繁的变更该标准可能导致接口被停用
	 */
	@ApiField("admittance_score")
	private Long admittanceScore;

	/**
	 * 对应的证件号(未脱敏)或支付宝uid
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 目前支持三种IDENTITY_CARD(身份证),PASSPORT(护照),ALIPAY_USER_ID(支付宝uid)
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户姓名 当证件类型为ALIPAY_USER_ID时不需要传入
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
	 * <p>Getter for the field <code>admittanceScore</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getAdmittanceScore() {
		return this.admittanceScore;
	}
	/**
	 * <p>Setter for the field <code>admittanceScore</code>.</p>
	 *
	 * @param admittanceScore a {@link java.lang.Long} object.
	 */
	public void setAdmittanceScore(Long admittanceScore) {
		this.admittanceScore = admittanceScore;
	}

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
