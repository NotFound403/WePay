package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询支付宝缴费订单
 *
 * @author auto create
 * @since 1.0, 2017-07-19 12:08:26
 */
public class AlipayEbppJfexportBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4266127833543878169L;

	/**
	 * 支付宝的业务订单号，具有唯一性和幂等性
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务类型英文名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

}
