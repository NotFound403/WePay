package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 产品查询维度选项
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ProductVOOptions extends AlipayObject {

	private static final long serialVersionUID = 7819992928474555417L;

	/**
	 * 是否包括产品条件组信息，默认为false
	 */
	@ApiField("include_condition_group")
	private Boolean includeConditionGroup;

	/**
	 * 是否包括产品基本信息，默认为false
	 */
	@ApiField("include_prod_base")
	private Boolean includeProdBase;

	/**
	 * 是否包括产品参与者信息，默认为false
	 */
	@ApiField("include_prod_ip")
	private Boolean includeProdIp;

	/**
	 * 是否包括产品区域信息
	 */
	@ApiField("include_prod_lo")
	private Boolean includeProdLo;

	/**
	 * 是否包括产品外标信息
	 */
	@ApiField("include_prod_mark")
	private Boolean includeProdMark;

	/**
	 * 产品关联关系
	 */
	@ApiField("include_prod_rel")
	private String includeProdRel;

	/**
	 * 是否包括产品资源项信息
	 */
	@ApiField("include_prod_ri")
	private Boolean includeProdRi;

	/**
	 * <p>Getter for the field <code>includeConditionGroup</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIncludeConditionGroup() {
		return this.includeConditionGroup;
	}
	/**
	 * <p>Setter for the field <code>includeConditionGroup</code>.</p>
	 *
	 * @param includeConditionGroup a {@link java.lang.Boolean} object.
	 */
	public void setIncludeConditionGroup(Boolean includeConditionGroup) {
		this.includeConditionGroup = includeConditionGroup;
	}

	/**
	 * <p>Getter for the field <code>includeProdBase</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIncludeProdBase() {
		return this.includeProdBase;
	}
	/**
	 * <p>Setter for the field <code>includeProdBase</code>.</p>
	 *
	 * @param includeProdBase a {@link java.lang.Boolean} object.
	 */
	public void setIncludeProdBase(Boolean includeProdBase) {
		this.includeProdBase = includeProdBase;
	}

	/**
	 * <p>Getter for the field <code>includeProdIp</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIncludeProdIp() {
		return this.includeProdIp;
	}
	/**
	 * <p>Setter for the field <code>includeProdIp</code>.</p>
	 *
	 * @param includeProdIp a {@link java.lang.Boolean} object.
	 */
	public void setIncludeProdIp(Boolean includeProdIp) {
		this.includeProdIp = includeProdIp;
	}

	/**
	 * <p>Getter for the field <code>includeProdLo</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIncludeProdLo() {
		return this.includeProdLo;
	}
	/**
	 * <p>Setter for the field <code>includeProdLo</code>.</p>
	 *
	 * @param includeProdLo a {@link java.lang.Boolean} object.
	 */
	public void setIncludeProdLo(Boolean includeProdLo) {
		this.includeProdLo = includeProdLo;
	}

	/**
	 * <p>Getter for the field <code>includeProdMark</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIncludeProdMark() {
		return this.includeProdMark;
	}
	/**
	 * <p>Setter for the field <code>includeProdMark</code>.</p>
	 *
	 * @param includeProdMark a {@link java.lang.Boolean} object.
	 */
	public void setIncludeProdMark(Boolean includeProdMark) {
		this.includeProdMark = includeProdMark;
	}

	/**
	 * <p>Getter for the field <code>includeProdRel</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIncludeProdRel() {
		return this.includeProdRel;
	}
	/**
	 * <p>Setter for the field <code>includeProdRel</code>.</p>
	 *
	 * @param includeProdRel a {@link java.lang.String} object.
	 */
	public void setIncludeProdRel(String includeProdRel) {
		this.includeProdRel = includeProdRel;
	}

	/**
	 * <p>Getter for the field <code>includeProdRi</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIncludeProdRi() {
		return this.includeProdRi;
	}
	/**
	 * <p>Setter for the field <code>includeProdRi</code>.</p>
	 *
	 * @param includeProdRi a {@link java.lang.Boolean} object.
	 */
	public void setIncludeProdRi(Boolean includeProdRi) {
		this.includeProdRi = includeProdRi;
	}

}
