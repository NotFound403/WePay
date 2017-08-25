package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 缴费当面付账单状态查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppFacepayBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1259293822499164593L;

	/**
	 * 支付宝交易流水号(和user_id、user_identity_code三者至少传一个) 
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一。
（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户ID(和user_identity_code、bill_no三者至少传一个) 
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户支付宝付款码 (需使用下单时用的码值，10分钟内有效）(和user_id、bill_no三者至少传一个)
（缴税业务：out_order_no/user_id/bill_no都可以不传）
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

	/**
	 * <p>Getter for the field <code>billNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillNo() {
		return this.billNo;
	}
	/**
	 * <p>Setter for the field <code>billNo</code>.</p>
	 *
	 * @param billNo a {@link java.lang.String} object.
	 */
	public void setBillNo(String billNo) {
		this.billNo = billNo;
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

	/**
	 * <p>Getter for the field <code>userIdentityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserIdentityCode() {
		return this.userIdentityCode;
	}
	/**
	 * <p>Setter for the field <code>userIdentityCode</code>.</p>
	 *
	 * @param userIdentityCode a {@link java.lang.String} object.
	 */
	public void setUserIdentityCode(String userIdentityCode) {
		this.userIdentityCode = userIdentityCode;
	}

}
