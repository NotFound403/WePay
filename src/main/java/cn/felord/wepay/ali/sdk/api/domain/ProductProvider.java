package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 充值产品提供商
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProductProvider extends AlipayObject {

	private static final long serialVersionUID = 2219486579559965919L;

	/**
	 * 卡代英文名称 备注:淘宝交易为空
	 */
	@ApiField("agency")
	private String agency;

	/**
	 * 卡代中文名称 备注：淘宝交易为空
	 */
	@ApiField("agency_name")
	private String agencyName;

	/**
	 * 业务 类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 充值产品主表ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 子运营商英文名称 备注:淘宝交易为空
	 */
	@ApiField("sub_operator")
	private String subOperator;

	/**
	 * 子运营商中文名称 ,如浙江移动
	 */
	@ApiField("sub_operator_name")
	private String subOperatorName;

	/**
	 * <p>Getter for the field <code>agency</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgency() {
		return this.agency;
	}
	/**
	 * <p>Setter for the field <code>agency</code>.</p>
	 *
	 * @param agency a {@link java.lang.String} object.
	 */
	public void setAgency(String agency) {
		this.agency = agency;
	}

	/**
	 * <p>Getter for the field <code>agencyName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAgencyName() {
		return this.agencyName;
	}
	/**
	 * <p>Setter for the field <code>agencyName</code>.</p>
	 *
	 * @param agencyName a {@link java.lang.String} object.
	 */
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	/**
	 * <p>Getter for the field <code>bizType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBizType() {
		return this.bizType;
	}
	/**
	 * <p>Setter for the field <code>bizType</code>.</p>
	 *
	 * @param bizType a {@link java.lang.String} object.
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
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
	 * <p>Getter for the field <code>subOperator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubOperator() {
		return this.subOperator;
	}
	/**
	 * <p>Setter for the field <code>subOperator</code>.</p>
	 *
	 * @param subOperator a {@link java.lang.String} object.
	 */
	public void setSubOperator(String subOperator) {
		this.subOperator = subOperator;
	}

	/**
	 * <p>Getter for the field <code>subOperatorName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubOperatorName() {
		return this.subOperatorName;
	}
	/**
	 * <p>Setter for the field <code>subOperatorName</code>.</p>
	 *
	 * @param subOperatorName a {@link java.lang.String} object.
	 */
	public void setSubOperatorName(String subOperatorName) {
		this.subOperatorName = subOperatorName;
	}

}
