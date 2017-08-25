package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 多保单投保申请
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneApplicationGroupApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2249968492932517291L;

	/**
	 * 收件人
	 */
	@ApiField("addressee")
	private InsAddressee addressee;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保申请信息列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application")
	private List<InsApplication> applications;

	/**
	 * 保费支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * <p>Getter for the field <code>addressee</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsAddressee} object.
	 */
	public InsAddressee getAddressee() {
		return this.addressee;
	}
	/**
	 * <p>Setter for the field <code>addressee</code>.</p>
	 *
	 * @param addressee a {@link cn.felord.wepay.ali.sdk.api.domain.InsAddressee} object.
	 */
	public void setAddressee(InsAddressee addressee) {
		this.addressee = addressee;
	}

	/**
	 * <p>Getter for the field <code>applicant</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public InsPerson getApplicant() {
		return this.applicant;
	}
	/**
	 * <p>Setter for the field <code>applicant</code>.</p>
	 *
	 * @param applicant a {@link cn.felord.wepay.ali.sdk.api.domain.InsPerson} object.
	 */
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	/**
	 * <p>Getter for the field <code>applications</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsApplication> getApplications() {
		return this.applications;
	}
	/**
	 * <p>Setter for the field <code>applications</code>.</p>
	 *
	 * @param applications a {@link java.util.List} object.
	 */
	public void setApplications(List<InsApplication> applications) {
		this.applications = applications;
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
	 * <p>Getter for the field <code>source</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSource() {
		return this.source;
	}
	/**
	 * <p>Setter for the field <code>source</code>.</p>
	 *
	 * @param source a {@link java.lang.String} object.
	 */
	public void setSource(String source) {
		this.source = source;
	}

}
