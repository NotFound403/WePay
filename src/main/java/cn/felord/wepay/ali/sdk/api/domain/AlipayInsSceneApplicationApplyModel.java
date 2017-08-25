package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 投保受理
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsSceneApplicationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5598142816433852426L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 投保参数 ,每个产品特有的投保参数,如航空险的航班信息;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 被保险人
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 实际保费，询价接口获取的保费通过投保接口传递进来。投保接口会对传入的保费进行验证。传入的保费和核价的值不一样投保失败
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险）
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 保额值,保额类型为枚举的时候是一个枚举值,当为金额类型时单位为分
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
	 * <p>Getter for the field <code>effectStartTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEffectStartTime() {
		return this.effectStartTime;
	}
	/**
	 * <p>Setter for the field <code>effectStartTime</code>.</p>
	 *
	 * @param effectStartTime a {@link java.util.Date} object.
	 */
	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
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
	 * <p>Getter for the field <code>premium</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPremium() {
		return this.premium;
	}
	/**
	 * <p>Setter for the field <code>premium</code>.</p>
	 *
	 * @param premium a {@link java.lang.Long} object.
	 */
	public void setPremium(Long premium) {
		this.premium = premium;
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
