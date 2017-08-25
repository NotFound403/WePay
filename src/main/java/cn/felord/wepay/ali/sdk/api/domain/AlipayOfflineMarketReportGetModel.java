package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取店铺信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketReportGetModel extends AlipayObject {

	private static final long serialVersionUID = 7159647962358671598L;

	/**
	 * 操作人PID
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 全局唯一的流水号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>opePid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOpePid() {
		return this.opePid;
	}
	/**
	 * <p>Setter for the field <code>opePid</code>.</p>
	 *
	 * @param opePid a {@link java.lang.String} object.
	 */
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * <p>Getter for the field <code>shopId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * <p>Setter for the field <code>shopId</code>.</p>
	 *
	 * @param shopId a {@link java.lang.String} object.
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
