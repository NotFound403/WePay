package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 门店产品通知接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2744489112745817945L;

	/**
	 * 业务订单状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 状态描述
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 拓展参数，区分4S厂商
{”remark”:”DFRC”}
日产- DFRC,  北现- BJXD
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 业务订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 交易主题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 交易摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 交易金额，单位：分
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>bizStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizStatus() {
		return this.bizStatus;
	}
	/**
	 * <p>Setter for the field <code>bizStatus</code>.</p>
	 *
	 * @param bizStatus a {@link java.lang.String} object.
	 */
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	/**
	 * <p>Getter for the field <code>bizStatusTxt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizStatusTxt() {
		return this.bizStatusTxt;
	}
	/**
	 * <p>Setter for the field <code>bizStatusTxt</code>.</p>
	 *
	 * @param bizStatusTxt a {@link java.lang.String} object.
	 */
	public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

	/**
	 * <p>Getter for the field <code>extParam</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtParam() {
		return this.extParam;
	}
	/**
	 * <p>Setter for the field <code>extParam</code>.</p>
	 *
	 * @param extParam a {@link java.lang.String} object.
	 */
	public void setExtParam(String extParam) {
		this.extParam = extParam;
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
	 * <p>Getter for the field <code>subject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubject() {
		return this.subject;
	}
	/**
	 * <p>Setter for the field <code>subject</code>.</p>
	 *
	 * @param subject a {@link java.lang.String} object.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * <p>Getter for the field <code>summary</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSummary() {
		return this.summary;
	}
	/**
	 * <p>Setter for the field <code>summary</code>.</p>
	 *
	 * @param summary a {@link java.lang.String} object.
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * <p>Getter for the field <code>totalFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalFee() {
		return this.totalFee;
	}
	/**
	 * <p>Setter for the field <code>totalFee</code>.</p>
	 *
	 * @param totalFee a {@link java.lang.String} object.
	 */
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
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
