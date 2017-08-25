package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保养订单状态更新
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarMaintainOrderstatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 5799665635485858392L;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_param")
	private MaintainOrderStatusExtParams extParam;

	/**
	 * 洗车-015；保养-016；4S-020
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 55-已核销；7-已出库；8-已收货
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 废弃
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>extParam</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MaintainOrderStatusExtParams} object.
	 */
	public MaintainOrderStatusExtParams getExtParam() {
		return this.extParam;
	}
	/**
	 * <p>Setter for the field <code>extParam</code>.</p>
	 *
	 * @param extParam a {@link cn.felord.wepay.ali.sdk.api.domain.MaintainOrderStatusExtParams} object.
	 */
	public void setExtParam(MaintainOrderStatusExtParams extParam) {
		this.extParam = extParam;
	}

	/**
	 * <p>Getter for the field <code>industryCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIndustryCode() {
		return this.industryCode;
	}
	/**
	 * <p>Setter for the field <code>industryCode</code>.</p>
	 *
	 * @param industryCode a {@link java.lang.String} object.
	 */
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
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
	 * <p>Getter for the field <code>orderStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderStatus() {
		return this.orderStatus;
	}
	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link java.lang.String} object.
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
