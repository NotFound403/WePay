package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物料生产订单物流详情, 包括物流订单号, 物流公司名称等信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ItemDeliveryDetail extends AlipayObject {

	private static final long serialVersionUID = 3681149193363741374L;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 物流公司code, 比如: SF-顺丰, POST-中国邮政, CAINIAO-菜鸟.
	 */
	@ApiField("logistic_code")
	private String logisticCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流订单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * <p>Getter for the field <code>assignItemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAssignItemId() {
		return this.assignItemId;
	}
	/**
	 * <p>Setter for the field <code>assignItemId</code>.</p>
	 *
	 * @param assignItemId a {@link java.lang.String} object.
	 */
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	/**
	 * <p>Getter for the field <code>logisticCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticCode() {
		return this.logisticCode;
	}
	/**
	 * <p>Setter for the field <code>logisticCode</code>.</p>
	 *
	 * @param logisticCode a {@link java.lang.String} object.
	 */
	public void setLogisticCode(String logisticCode) {
		this.logisticCode = logisticCode;
	}

	/**
	 * <p>Getter for the field <code>logisticsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticsName() {
		return this.logisticsName;
	}
	/**
	 * <p>Setter for the field <code>logisticsName</code>.</p>
	 *
	 * @param logisticsName a {@link java.lang.String} object.
	 */
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	/**
	 * <p>Getter for the field <code>logisticsNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	/**
	 * <p>Setter for the field <code>logisticsNo</code>.</p>
	 *
	 * @param logisticsNo a {@link java.lang.String} object.
	 */
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

}
