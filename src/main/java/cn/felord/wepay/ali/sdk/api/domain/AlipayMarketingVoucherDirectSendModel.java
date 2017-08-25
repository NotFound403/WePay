package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 券平台直发券接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingVoucherDirectSendModel extends AlipayObject {

	private static final long serialVersionUID = 8528589449311565111L;

	/**
	 * 券金额(单位:分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务发生时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * {"LEHUA_IS_ALGO_MONEY":"F","LEHUA_IS_MULTIPLIED":"F","LEHUA_MULTIPLIED_PRICE":"0.08","LEHUA_MULTIPLY_TIMES":"1.0","LEHUA_ORIGIN_PRICE":"0.08","camp_id":"1332546","camp_type":"PLATFORM_CAMP"}
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 业务订单号，每次操作不可重复。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 模板编码，创建模板后生成。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * USERID(支付宝用户2088账号)
	 */
	@ApiField("user_id")
	private String userId;

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
	 * <p>Getter for the field <code>bizDate</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getBizDate() {
		return this.bizDate;
	}
	/**
	 * <p>Setter for the field <code>bizDate</code>.</p>
	 *
	 * @param bizDate a {@link java.util.Date} object.
	 */
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	/**
	 * <p>Getter for the field <code>extendInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendInfo() {
		return this.extendInfo;
	}
	/**
	 * <p>Setter for the field <code>extendInfo</code>.</p>
	 *
	 * @param extendInfo a {@link java.lang.String} object.
	 */
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
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

}
