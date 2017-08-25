package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.OrderItem;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.order.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenServicemarketOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7846725469358827274L;

	/** 
	 * 订购服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/** 
	 * 当前查询页（本接口支持最多查询100条记录）
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 订单明细列表
	 */
	@ApiListField("order_items")
	@ApiField("order_item")
	private List<OrderItem> orderItems;

	/** 
	 * 用于区分同一个服务的不同版本
	 */
	@ApiField("specifications")
	private String specifications;

	/** 
	 * MERCHANT_ORDED（待服务商接单）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	/**
	 * <p>Setter for the field <code>commodityId</code>.</p>
	 *
	 * @param commodityId a {@link java.lang.String} object.
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * <p>Getter for the field <code>commodityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommodityId( ) {
		return this.commodityId;
	}

	/**
	 * <p>Setter for the field <code>currentPage</code>.</p>
	 *
	 * @param currentPage a {@link java.lang.Long} object.
	 */
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * <p>Getter for the field <code>currentPage</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	/**
	 * <p>Setter for the field <code>orderItems</code>.</p>
	 *
	 * @param orderItems a {@link java.util.List} object.
	 */
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	/**
	 * <p>Getter for the field <code>orderItems</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<OrderItem> getOrderItems( ) {
		return this.orderItems;
	}

	/**
	 * <p>Setter for the field <code>specifications</code>.</p>
	 *
	 * @param specifications a {@link java.lang.String} object.
	 */
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	/**
	 * <p>Getter for the field <code>specifications</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpecifications( ) {
		return this.specifications;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus( ) {
		return this.status;
	}

	/**
	 * <p>Setter for the field <code>totalSize</code>.</p>
	 *
	 * @param totalSize a {@link java.lang.Long} object.
	 */
	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	/**
	 * <p>Getter for the field <code>totalSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
