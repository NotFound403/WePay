package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑客分佣账单查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-09 15:38:56
 */
public class KoubeiAdvertCommissionBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7582833736143357582L;

	/**
	 * 账期(格式为yyyyMM)
	 */
	@ApiField("date")
	private String date;

	/**
	 * 账单类型
deal-交易账单
settle-结算账单
	 */
	@ApiField("type")
	private String type;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
