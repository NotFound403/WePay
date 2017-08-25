package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发券接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingVoucherSendModel extends AlipayObject {

	private static final long serialVersionUID = 7112767193617533391L;

	/**
	 * 券金额。浮点数，格式为#.00，单位是元。红包发放时填写，其它情形不能填
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝登录ID，手机或邮箱 。user_id, login_id, taobao_nick不能同时为空，优先级依次降低
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 发券备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部业务订单号，用于幂等控制，相同template_id和out_biz_no认为是同一次业务
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 淘宝昵称 。user_id, login_id, taobao_nick不能同时为空，优先级依次降低
	 */
	@ApiField("taobao_nick")
	private String taobaoNick;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户ID 。user_id, login_id, taobao_nick不能同时为空，优先级依次降低
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
	 * <p>Getter for the field <code>loginId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLoginId() {
		return this.loginId;
	}
	/**
	 * <p>Setter for the field <code>loginId</code>.</p>
	 *
	 * @param loginId a {@link java.lang.String} object.
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
	 * <p>Getter for the field <code>taobaoNick</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTaobaoNick() {
		return this.taobaoNick;
	}
	/**
	 * <p>Setter for the field <code>taobaoNick</code>.</p>
	 *
	 * @param taobaoNick a {@link java.lang.String} object.
	 */
	public void setTaobaoNick(String taobaoNick) {
		this.taobaoNick = taobaoNick;
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
