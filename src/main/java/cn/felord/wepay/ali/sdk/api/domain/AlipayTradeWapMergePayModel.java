package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * H5合并支付接口2.0
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayTradeWapMergePayModel extends AlipayObject {

	private static final long serialVersionUID = 4383277523121755886L;

	/**
	 * 如果预创建成功，支付宝返回该预下单号，后续商户使用该预下单号请求支付宝支付接口
	 */
	@ApiField("pre_order_no")
	private String preOrderNo;

	/**
	 * <p>Getter for the field <code>preOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPreOrderNo() {
		return this.preOrderNo;
	}
	/**
	 * <p>Setter for the field <code>preOrderNo</code>.</p>
	 *
	 * @param preOrderNo a {@link java.lang.String} object.
	 */
	public void setPreOrderNo(String preOrderNo) {
		this.preOrderNo = preOrderNo;
	}

}
