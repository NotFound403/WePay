package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单确认接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3319784139666496247L;

	/**
	 * 备注信息，商家确认订单时添加的备注信息，长度不超过2000个字符
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 到位业务订单号。用户在到位下单时，由到位系统生成的32位全局唯一数字 id。
通过应用中的应用网关post发送给商户（应用网关配置参考链接：https%3A%2F%2Fdoc.open.alipay.com%2Fdocs%2Fdoc.htm%3Fspm%3Da219a.7629140.0.0.TcIuKL%26treeId%3D193%26articleId%3D105310%26docType%3D1）。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户订单号码。确认接单时需要设置外部订单号，由商户自行生成，并确保其唯一性
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

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
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * <p>Getter for the field <code>outOrderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	/**
	 * <p>Setter for the field <code>outOrderNo</code>.</p>
	 *
	 * @param outOrderNo a {@link java.lang.String} object.
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
