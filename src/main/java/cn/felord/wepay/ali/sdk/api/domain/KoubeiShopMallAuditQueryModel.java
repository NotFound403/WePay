package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商圈首页地址变更工单审核状态查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiShopMallAuditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1384297887912273351L;

	/**
	 * koubei.shop.mall.page.modify(商圈主页地址创建修改接口)中 返回的工单id
	 */
	@ApiField("order_flow_id")
	private String orderFlowId;

	/**
	 * <p>Getter for the field <code>orderFlowId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderFlowId() {
		return this.orderFlowId;
	}
	/**
	 * <p>Setter for the field <code>orderFlowId</code>.</p>
	 *
	 * @param orderFlowId a {@link java.lang.String} object.
	 */
	public void setOrderFlowId(String orderFlowId) {
		this.orderFlowId = orderFlowId;
	}

}
