package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询图像定损结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsDataAutodamageEstimateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1321993273162658988L;

	/**
	 * 保险公司定损单号，同之前调用的“提交车险图像定损请求”接口中的定损单号。
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/**
	 * <p>Getter for the field <code>estimateNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEstimateNo() {
		return this.estimateNo;
	}
	/**
	 * <p>Setter for the field <code>estimateNo</code>.</p>
	 *
	 * @param estimateNo a {@link java.lang.String} object.
	 */
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

}
