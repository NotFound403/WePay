package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 预授权资金解冻接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayFundAuthOrderUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 8628915657813793366L;

	/**
	 * 本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位，取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 商户本次资金操作的请求流水号，同一商户每次不同的资金操作请求，商户请求流水号不能重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户对本次解冻操作的附言描述，长度不超过100个字母或50个汉字
	 */
	@ApiField("remark")
	private String remark;

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
	 * <p>Getter for the field <code>authNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthNo() {
		return this.authNo;
	}
	/**
	 * <p>Setter for the field <code>authNo</code>.</p>
	 *
	 * @param authNo a {@link java.lang.String} object.
	 */
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
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
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
