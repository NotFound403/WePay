package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 余利宝账户和收益查询
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:07:46
 */
public class MybankFinanceYulibaoAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7774254976717613121L;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝
	 */
	@ApiField("fund_code")
	private String fundCode;

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

}
