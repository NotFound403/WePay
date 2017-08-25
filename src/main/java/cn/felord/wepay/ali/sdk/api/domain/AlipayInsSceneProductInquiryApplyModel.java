package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险产品询价申请
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneProductInquiryApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6624129291523416423L;

	/**
	 * 保险产品的投保人,当产品价格和投保人有关时候需传值
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保业务参数，标准json格式支付串
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 保险被保人,产品价格和被保人相关时传值。
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 询价流水号，标识一次询价请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保险产品码，由保险产品小二分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 投保来源渠道，由保险产品小二分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 产品险种对应的保额(金额类型，单位为分，例如100000为1000元)。产品保额类型为金额时必传
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

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
	 * <p>Getter for the field <code>insureds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsPerson> getInsureds() {
		return this.insureds;
	}
	/**
	 * <p>Setter for the field <code>insureds</code>.</p>
	 *
	 * @param insureds a {@link java.util.List} object.
	 */
	public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
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
	 * <p>Getter for the field <code>period</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPeriod() {
		return this.period;
	}
	/**
	 * <p>Setter for the field <code>period</code>.</p>
	 *
	 * @param period a {@link java.lang.String} object.
	 */
	public void setPeriod(String period) {
		this.period = period;
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

	/**
	 * <p>Getter for the field <code>sumInsured</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getSumInsured() {
		return this.sumInsured;
	}
	/**
	 * <p>Setter for the field <code>sumInsured</code>.</p>
	 *
	 * @param sumInsured a {@link java.lang.Long} object.
	 */
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
