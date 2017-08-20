package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询图像定损结果
 *
 * @author auto create
 * @since 1.0, 2017-03-16 09:53:51
 */
public class AlipayInsDataAutodamageEstimateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1321993273162658988L;

	/**
	 * 保险公司定损单号，同之前调用的“提交车险图像定损请求”接口中的定损单号。
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	public String getEstimateNo() {
		return this.estimateNo;
	}
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

}
