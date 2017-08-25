package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 会员卡模板外部权益
 *
 * @author auto create
 * @version $Id: $Id
 */
public class McardTemplateBenefit extends AlipayObject {

	private static final long serialVersionUID = 6855442979359649452L;

	/**
	 * 权益描述信息
	 */
	@ApiListField("benefit_desc")
	@ApiField("string")
	private List<String> benefitDesc;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 权益开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 权益标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>benefitDesc</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getBenefitDesc() {
		return this.benefitDesc;
	}
	/**
	 * <p>Setter for the field <code>benefitDesc</code>.</p>
	 *
	 * @param benefitDesc a {@link java.util.List} object.
	 */
	public void setBenefitDesc(List<String> benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	/**
	 * <p>Getter for the field <code>endDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getEndDate() {
		return this.endDate;
	}
	/**
	 * <p>Setter for the field <code>endDate</code>.</p>
	 *
	 * @param endDate a {@link java.util.Date} object.
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>startDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getStartDate() {
		return this.startDate;
	}
	/**
	 * <p>Setter for the field <code>startDate</code>.</p>
	 *
	 * @param startDate a {@link java.util.Date} object.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * <p>Getter for the field <code>templateId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateId() {
		return this.templateId;
	}
	/**
	 * <p>Setter for the field <code>templateId</code>.</p>
	 *
	 * @param templateId a {@link java.lang.String} object.
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
