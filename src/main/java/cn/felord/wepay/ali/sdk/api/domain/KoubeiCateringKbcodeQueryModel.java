package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑码查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiCateringKbcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6859246888719131423L;

	/**
	 * 创建口碑码时返回的批次号（batch_id和shop_id二者必填其一）
	 */
	@ApiField("batch_id")
	private Long batchId;

	/**
	 * 当前页码（大于0的整数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页返回的记录数（0~100的整数）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 口碑店铺ID（batch_id和shop_id二者必填其一）
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * <p>Getter for the field <code>batchId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBatchId() {
		return this.batchId;
	}
	/**
	 * <p>Setter for the field <code>batchId</code>.</p>
	 *
	 * @param batchId a {@link java.lang.Long} object.
	 */
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	/**
	 * <p>Getter for the field <code>pageNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageNum() {
		return this.pageNum;
	}
	/**
	 * <p>Setter for the field <code>pageNum</code>.</p>
	 *
	 * @param pageNum a {@link java.lang.Long} object.
	 */
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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
