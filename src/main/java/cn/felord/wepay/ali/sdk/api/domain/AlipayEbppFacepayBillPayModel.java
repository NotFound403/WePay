package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 当成付扣款接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEbppFacepayBillPayModel extends AlipayObject {

	private static final long serialVersionUID = 5197846468935853859L;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 户号（缴税业务：纳税人识别号，对于三证合一的企业来说，采用社会信用代码；对于个人来说，采用身份证号）
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称，JF-缴费、TAX-缴税
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构代码（缴税业务：指征收机关英文代码，例如南京玄武国税（NJXWGS））
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 扩展字段（缴税业务：taxpayerName -纳税人名称，taxOrgCode - 征收机关代码；缴费业务如需支付宝销账：billCacheKey -欠费单缓存Key，billUniqId - 欠费单唯一ID）
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金额，单位：元
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 机构账单ID（缴税业务：用外部申报号）
	 */
	@ApiField("inst_no")
	private String instNo;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付金额（包含滞纳金），单位：元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 商户partnerId
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 子业务类型英文名称，ELECTRIC-电费，WATER-水费，GAS-燃气费，TAX-缴税
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户支付宝付款码
	 */
	@ApiField("user_identity_code")
	private String userIdentityCode;

	/**
	 * <p>Getter for the field <code>billDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillDate() {
		return this.billDate;
	}
	/**
	 * <p>Setter for the field <code>billDate</code>.</p>
	 *
	 * @param billDate a {@link java.lang.String} object.
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	/**
	 * <p>Getter for the field <code>billKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillKey() {
		return this.billKey;
	}
	/**
	 * <p>Setter for the field <code>billKey</code>.</p>
	 *
	 * @param billKey a {@link java.lang.String} object.
	 */
	public void setBillKey(String billKey) {
		this.billKey = billKey;
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
	 * <p>Getter for the field <code>chargeInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInst() {
		return this.chargeInst;
	}
	/**
	 * <p>Setter for the field <code>chargeInst</code>.</p>
	 *
	 * @param chargeInst a {@link java.lang.String} object.
	 */
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	/**
	 * <p>Getter for the field <code>extendField</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendField() {
		return this.extendField;
	}
	/**
	 * <p>Setter for the field <code>extendField</code>.</p>
	 *
	 * @param extendField a {@link java.lang.String} object.
	 */
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	/**
	 * <p>Getter for the field <code>fineAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFineAmount() {
		return this.fineAmount;
	}
	/**
	 * <p>Setter for the field <code>fineAmount</code>.</p>
	 *
	 * @param fineAmount a {@link java.lang.String} object.
	 */
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	/**
	 * <p>Getter for the field <code>instNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInstNo() {
		return this.instNo;
	}
	/**
	 * <p>Setter for the field <code>instNo</code>.</p>
	 *
	 * @param instNo a {@link java.lang.String} object.
	 */
	public void setInstNo(String instNo) {
		this.instNo = instNo;
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
	 * <p>Getter for the field <code>payAmount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayAmount() {
		return this.payAmount;
	}
	/**
	 * <p>Setter for the field <code>payAmount</code>.</p>
	 *
	 * @param payAmount a {@link java.lang.String} object.
	 */
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * <p>Getter for the field <code>pid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPid() {
		return this.pid;
	}
	/**
	 * <p>Setter for the field <code>pid</code>.</p>
	 *
	 * @param pid a {@link java.lang.String} object.
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * <p>Getter for the field <code>subBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubBizType() {
		return this.subBizType;
	}
	/**
	 * <p>Setter for the field <code>subBizType</code>.</p>
	 *
	 * @param subBizType a {@link java.lang.String} object.
	 */
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
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
