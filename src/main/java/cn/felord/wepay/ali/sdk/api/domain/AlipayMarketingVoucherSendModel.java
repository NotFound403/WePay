package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 发券接口
 *
 * @author auto create
 * @since 1.0, 2017-06-19 11:26:53
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

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTaobaoNick() {
		return this.taobaoNick;
	}
	public void setTaobaoNick(String taobaoNick) {
		this.taobaoNick = taobaoNick;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
