package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 洗车保养订单物流
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MaintainBizOrderExpress extends AlipayObject {

	private static final long serialVersionUID = 5197548181488438543L;

	/**
	 * 创建时间，物流子订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 物流公司编号。支付宝支付物流公司编号。具体查看 
支付宝支持物流公司编码
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 物流单号， ISV上传商品物流单号，用于物流流水的查询。
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 订单发货地址。记录订单发货的详细地址。省^^^市^^^区^^^详细地址。
	 */
	@ApiField("sender_addr")
	private String senderAddr;

	/**
	 * <p>Getter for the field <code>createTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCreateTime() {
		return this.createTime;
	}
	/**
	 * <p>Setter for the field <code>createTime</code>.</p>
	 *
	 * @param createTime a {@link java.lang.String} object.
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * <p>Getter for the field <code>expressCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpressCode() {
		return this.expressCode;
	}
	/**
	 * <p>Setter for the field <code>expressCode</code>.</p>
	 *
	 * @param expressCode a {@link java.lang.String} object.
	 */
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

	/**
	 * <p>Getter for the field <code>expressNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExpressNo() {
		return this.expressNo;
	}
	/**
	 * <p>Setter for the field <code>expressNo</code>.</p>
	 *
	 * @param expressNo a {@link java.lang.String} object.
	 */
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	/**
	 * <p>Getter for the field <code>senderAddr</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSenderAddr() {
		return this.senderAddr;
	}
	/**
	 * <p>Setter for the field <code>senderAddr</code>.</p>
	 *
	 * @param senderAddr a {@link java.lang.String} object.
	 */
	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
