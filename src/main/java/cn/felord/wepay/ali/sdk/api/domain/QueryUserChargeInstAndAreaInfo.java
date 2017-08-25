package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 出账机构与城市信息对象信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryUserChargeInstAndAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 4246271947862175279L;

	/**
	 * 出账机构简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构名称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 缴费次数
	 */
	@ApiField("pay_count")
	private String payCount;

	/**
	 * 最近一次缴费日期
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 子业务类型：
 电费:ELECTRIC,水费:WATER,GAS:燃气费
  暖气费：HEATING, 有线电视费:CATV
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>chargeInst</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInst() {
		return this.chargeInst;
	}
	/**
	 * <p>Setter for the field <code>chargeInst</code>.</p>
	 *
	 * @param chargeInst a {@link java.lang.String} object.
	 */
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	/**
	 * <p>Getter for the field <code>chargeInstName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChargeInstName() {
		return this.chargeInstName;
	}
	/**
	 * <p>Setter for the field <code>chargeInstName</code>.</p>
	 *
	 * @param chargeInstName a {@link java.lang.String} object.
	 */
	public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}

	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Getter for the field <code>cityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCityCode() {
		return this.cityCode;
	}
	/**
	 * <p>Setter for the field <code>cityCode</code>.</p>
	 *
	 * @param cityCode a {@link java.lang.String} object.
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	/**
	 * <p>Getter for the field <code>payCount</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayCount() {
		return this.payCount;
	}
	/**
	 * <p>Setter for the field <code>payCount</code>.</p>
	 *
	 * @param payCount a {@link java.lang.String} object.
	 */
	public void setPayCount(String payCount) {
		this.payCount = payCount;
	}

	/**
	 * <p>Getter for the field <code>payDate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPayDate() {
		return this.payDate;
	}
	/**
	 * <p>Setter for the field <code>payDate</code>.</p>
	 *
	 * @param payDate a {@link java.lang.String} object.
	 */
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	/**
	 * <p>Getter for the field <code>subBizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubBizType() {
		return this.subBizType;
	}
	/**
	 * <p>Setter for the field <code>subBizType</code>.</p>
	 *
	 * @param subBizType a {@link java.lang.String} object.
	 */
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
