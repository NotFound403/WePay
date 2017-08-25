package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑码绑定的门店和桌号信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbCodeBindInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4336523577839137333L;

	/**
	 * 商家餐桌摆放的区域名称（预留字段，暂不使用）
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 餐桌最大就餐人数（预留字段，暂不使用）
	 */
	@ApiField("max_pepole_num")
	private Long maxPepoleNum;

	/**
	 * 餐桌就餐的最少人数（预留字段，暂不使用）
	 */
	@ApiField("min_pepole_num")
	private String minPepoleNum;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * table_no对应的中文名称。（预留字段，暂不使用）
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 商家收银系统录入的点菜桌号（生成桌码时，必填）
	 */
	@ApiField("table_no")
	private String tableNo;

	/**
	 * <p>Getter for the field <code>areaName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaName() {
		return this.areaName;
	}
	/**
	 * <p>Setter for the field <code>areaName</code>.</p>
	 *
	 * @param areaName a {@link java.lang.String} object.
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * <p>Getter for the field <code>maxPepoleNum</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMaxPepoleNum() {
		return this.maxPepoleNum;
	}
	/**
	 * <p>Setter for the field <code>maxPepoleNum</code>.</p>
	 *
	 * @param maxPepoleNum a {@link java.lang.Long} object.
	 */
	public void setMaxPepoleNum(Long maxPepoleNum) {
		this.maxPepoleNum = maxPepoleNum;
	}

	/**
	 * <p>Getter for the field <code>minPepoleNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinPepoleNum() {
		return this.minPepoleNum;
	}
	/**
	 * <p>Setter for the field <code>minPepoleNum</code>.</p>
	 *
	 * @param minPepoleNum a {@link java.lang.String} object.
	 */
	public void setMinPepoleNum(String minPepoleNum) {
		this.minPepoleNum = minPepoleNum;
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

	/**
	 * <p>Getter for the field <code>tableName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTableName() {
		return this.tableName;
	}
	/**
	 * <p>Setter for the field <code>tableName</code>.</p>
	 *
	 * @param tableName a {@link java.lang.String} object.
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * <p>Getter for the field <code>tableNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTableNo() {
		return this.tableNo;
	}
	/**
	 * <p>Setter for the field <code>tableNo</code>.</p>
	 *
	 * @param tableNo a {@link java.lang.String} object.
	 */
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

}
