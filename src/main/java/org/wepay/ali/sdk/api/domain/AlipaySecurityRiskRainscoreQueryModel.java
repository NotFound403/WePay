package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * RAIN （Risk of Activity, Identity and Network）是蚁盾旗下产品，专业提供风险评分服务，是一套能够对手机号进行风险预测、风险解释的评分体系。
 *
 * @author auto create
 * @since 1.0, 2017-06-26 11:44:02
 */
public class AlipaySecurityRiskRainscoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4596964452854555751L;

	/**
	 * 帐号内容，目前为中国大陆手机号（11位阿拉伯数字，不包含特殊符号或空格）
	 */
	@ApiField("account")
	private String account;

	/**
	 * 账号类型，目前仅支持手机号（MOBILE_NO）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * “蚁盾”风险评分服务版本号，当前版本为2.0
	 */
	@ApiField("version")
	private String version;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
