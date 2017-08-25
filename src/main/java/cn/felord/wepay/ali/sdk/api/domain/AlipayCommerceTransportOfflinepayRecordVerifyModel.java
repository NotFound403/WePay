package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝脱机操作信息验证
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceTransportOfflinepayRecordVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3274393825821781575L;

	/**
	 * 原始脱机记录信息
	 */
	@ApiField("record")
	private String record;

	/**
	 * <p>Getter for the field <code>record</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecord() {
		return this.record;
	}
	/**
	 * <p>Setter for the field <code>record</code>.</p>
	 *
	 * @param record a {@link java.lang.String} object.
	 */
	public void setRecord(String record) {
		this.record = record;
	}

}
