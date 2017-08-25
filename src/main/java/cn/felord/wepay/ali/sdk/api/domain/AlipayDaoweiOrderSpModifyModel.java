package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 订单服务者变更接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDaoweiOrderSpModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4526356681723694864L;

	/**
	 * 到位业务订单号，全局唯一，由32位数字组成，用户在到位下单时系统生成并消息同步给商家，商户只能查自己同步到的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部服务者id，由商户自己生成，保证同一商户id唯一，同步服务者信息或者修改订单服务者信息时设置，长度不超过64个字符
	 */
	@ApiField("out_sp_id")
	private String outSpId;

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
	 * <p>Getter for the field <code>outSpId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutSpId() {
		return this.outSpId;
	}
	/**
	 * <p>Setter for the field <code>outSpId</code>.</p>
	 *
	 * @param outSpId a {@link java.lang.String} object.
	 */
	public void setOutSpId(String outSpId) {
		this.outSpId = outSpId;
	}

}
