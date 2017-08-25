package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险公司核损确认对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsDataAutodamageEstimateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8226188493784521245L;

	/**
	 * 受损程度
	 */
	@ApiField("damage_degree")
	private String damageDegree;

	/**
	 * 受损程度中文描述
	 */
	@ApiField("damage_degree_desc")
	private String damageDegreeDesc;

	/**
	 * 受损类型
	 */
	@ApiField("damage_type")
	private String damageType;

	/**
	 * 受损类型中文描述
	 */
	@ApiField("damage_type_desc")
	private String damageTypeDesc;

	/**
	 * 工时费，单位：元
	 */
	@ApiField("hourly_wage")
	private String hourlyWage;

	/**
	 * 是否旧件回收
	 */
	@ApiField("old_recycle")
	private Boolean oldRecycle;

	/**
	 * 配件费用，单位：元
	 */
	@ApiField("parts_cost")
	private String partsCost;

	/**
	 * 配件id
	 */
	@ApiField("parts_id")
	private String partsId;

	/**
	 * 零件管理费，单位：元
	 */
	@ApiField("parts_manage_fee")
	private String partsManageFee;

	/**
	 * 配件名称
	 */
	@ApiField("parts_name")
	private String partsName;

	/**
	 * 残值扣除，单位：元
	 */
	@ApiField("remain_value")
	private String remainValue;

	/**
	 * 维修方案
	 */
	@ApiField("repair_type")
	private String repairType;

	/**
	 * 维修方案中文描述
	 */
	@ApiField("repair_type_desc")
	private String repairTypeDesc;

	/**
	 * <p>Getter for the field <code>damageDegree</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDamageDegree() {
		return this.damageDegree;
	}
	/**
	 * <p>Setter for the field <code>damageDegree</code>.</p>
	 *
	 * @param damageDegree a {@link java.lang.String} object.
	 */
	public void setDamageDegree(String damageDegree) {
		this.damageDegree = damageDegree;
	}

	/**
	 * <p>Getter for the field <code>damageDegreeDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDamageDegreeDesc() {
		return this.damageDegreeDesc;
	}
	/**
	 * <p>Setter for the field <code>damageDegreeDesc</code>.</p>
	 *
	 * @param damageDegreeDesc a {@link java.lang.String} object.
	 */
	public void setDamageDegreeDesc(String damageDegreeDesc) {
		this.damageDegreeDesc = damageDegreeDesc;
	}

	/**
	 * <p>Getter for the field <code>damageType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDamageType() {
		return this.damageType;
	}
	/**
	 * <p>Setter for the field <code>damageType</code>.</p>
	 *
	 * @param damageType a {@link java.lang.String} object.
	 */
	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}

	/**
	 * <p>Getter for the field <code>damageTypeDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDamageTypeDesc() {
		return this.damageTypeDesc;
	}
	/**
	 * <p>Setter for the field <code>damageTypeDesc</code>.</p>
	 *
	 * @param damageTypeDesc a {@link java.lang.String} object.
	 */
	public void setDamageTypeDesc(String damageTypeDesc) {
		this.damageTypeDesc = damageTypeDesc;
	}

	/**
	 * <p>Getter for the field <code>hourlyWage</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHourlyWage() {
		return this.hourlyWage;
	}
	/**
	 * <p>Setter for the field <code>hourlyWage</code>.</p>
	 *
	 * @param hourlyWage a {@link java.lang.String} object.
	 */
	public void setHourlyWage(String hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	/**
	 * <p>Getter for the field <code>oldRecycle</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getOldRecycle() {
		return this.oldRecycle;
	}
	/**
	 * <p>Setter for the field <code>oldRecycle</code>.</p>
	 *
	 * @param oldRecycle a {@link java.lang.Boolean} object.
	 */
	public void setOldRecycle(Boolean oldRecycle) {
		this.oldRecycle = oldRecycle;
	}

	/**
	 * <p>Getter for the field <code>partsCost</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartsCost() {
		return this.partsCost;
	}
	/**
	 * <p>Setter for the field <code>partsCost</code>.</p>
	 *
	 * @param partsCost a {@link java.lang.String} object.
	 */
	public void setPartsCost(String partsCost) {
		this.partsCost = partsCost;
	}

	/**
	 * <p>Getter for the field <code>partsId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartsId() {
		return this.partsId;
	}
	/**
	 * <p>Setter for the field <code>partsId</code>.</p>
	 *
	 * @param partsId a {@link java.lang.String} object.
	 */
	public void setPartsId(String partsId) {
		this.partsId = partsId;
	}

	/**
	 * <p>Getter for the field <code>partsManageFee</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartsManageFee() {
		return this.partsManageFee;
	}
	/**
	 * <p>Setter for the field <code>partsManageFee</code>.</p>
	 *
	 * @param partsManageFee a {@link java.lang.String} object.
	 */
	public void setPartsManageFee(String partsManageFee) {
		this.partsManageFee = partsManageFee;
	}

	/**
	 * <p>Getter for the field <code>partsName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPartsName() {
		return this.partsName;
	}
	/**
	 * <p>Setter for the field <code>partsName</code>.</p>
	 *
	 * @param partsName a {@link java.lang.String} object.
	 */
	public void setPartsName(String partsName) {
		this.partsName = partsName;
	}

	/**
	 * <p>Getter for the field <code>remainValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemainValue() {
		return this.remainValue;
	}
	/**
	 * <p>Setter for the field <code>remainValue</code>.</p>
	 *
	 * @param remainValue a {@link java.lang.String} object.
	 */
	public void setRemainValue(String remainValue) {
		this.remainValue = remainValue;
	}

	/**
	 * <p>Getter for the field <code>repairType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepairType() {
		return this.repairType;
	}
	/**
	 * <p>Setter for the field <code>repairType</code>.</p>
	 *
	 * @param repairType a {@link java.lang.String} object.
	 */
	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

	/**
	 * <p>Getter for the field <code>repairTypeDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRepairTypeDesc() {
		return this.repairTypeDesc;
	}
	/**
	 * <p>Setter for the field <code>repairTypeDesc</code>.</p>
	 *
	 * @param repairTypeDesc a {@link java.lang.String} object.
	 */
	public void setRepairTypeDesc(String repairTypeDesc) {
		this.repairTypeDesc = repairTypeDesc;
	}

}
