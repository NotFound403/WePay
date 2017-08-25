package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 理赔受理
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneClaimApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8386634359622394767L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 受益人
	 */
	@ApiField("beneficiary")
	private InsPerson beneficiary;

	/**
	 * 支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 理赔因子;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 索赔金额（如果需要外部指定则必填），单位分
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 商户生成的外部投保业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户生成的理赔请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 产品编码；由蚂蚁保险平台分配，商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险）
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 报案人
	 */
	@ApiField("reporter")
	private InsPerson reporter;

	/**
	 * <p>Getter for the field <code>accidentAddress</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccidentAddress() {
		return this.accidentAddress;
	}
	/**
	 * <p>Setter for the field <code>accidentAddress</code>.</p>
	 *
	 * @param accidentAddress a {@link java.lang.String} object.
	 */
	public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

	/**
	 * <p>Getter for the field <code>accidentDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAccidentDesc() {
		return this.accidentDesc;
	}
	/**
	 * <p>Setter for the field <code>accidentDesc</code>.</p>
	 *
	 * @param accidentDesc a {@link java.lang.String} object.
	 */
	public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

	/**
	 * <p>Getter for the field <code>accidentTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getAccidentTime() {
		return this.accidentTime;
	}
	/**
	 * <p>Setter for the field <code>accidentTime</code>.</p>
	 *
	 * @param accidentTime a {@link java.util.Date} object.
	 */
	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	/**
	 * <p>Getter for the field <code>beneficiary</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getBeneficiary() {
		return this.beneficiary;
	}
	/**
	 * <p>Setter for the field <code>beneficiary</code>.</p>
	 *
	 * @param beneficiary a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setBeneficiary(InsPerson beneficiary) {
		this.beneficiary = beneficiary;
	}

	/**
	 * <p>Getter for the field <code>billTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBillTitle() {
		return this.billTitle;
	}
	/**
	 * <p>Setter for the field <code>billTitle</code>.</p>
	 *
	 * @param billTitle a {@link java.lang.String} object.
	 */
	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

	/**
	 * <p>Getter for the field <code>bizData</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizData() {
		return this.bizData;
	}
	/**
	 * <p>Setter for the field <code>bizData</code>.</p>
	 *
	 * @param bizData a {@link java.lang.String} object.
	 */
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	/**
	 * <p>Getter for the field <code>claimFee</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getClaimFee() {
		return this.claimFee;
	}
	/**
	 * <p>Setter for the field <code>claimFee</code>.</p>
	 *
	 * @param claimFee a {@link java.lang.Long} object.
	 */
	public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

	/**
	 * <p>Getter for the field <code>outBizNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizNo() {
		return this.outBizNo;
	}
	/**
	 * <p>Setter for the field <code>outBizNo</code>.</p>
	 *
	 * @param outBizNo a {@link java.lang.String} object.
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * <p>Getter for the field <code>reporter</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getReporter() {
		return this.reporter;
	}
	/**
	 * <p>Setter for the field <code>reporter</code>.</p>
	 *
	 * @param reporter a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setReporter(InsPerson reporter) {
		this.reporter = reporter;
	}

}
