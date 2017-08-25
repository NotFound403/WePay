package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 蓝牙设备信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class BeaconDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 2537741654412765678L;

	/**
	 * 设备类型
	 */
	@ApiField("actiontype")
	private String actiontype;

	/**
	 * 设备是否可用
	 */
	@ApiField("inuse")
	private Boolean inuse;

	/**
	 * 设备说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 蓝牙设备关联的模板信息
	 */
	@ApiField("template")
	private BeaconTemplate template;

	/**
	 * 设备ID
	 */
	@ApiField("uuid")
	private String uuid;

	/**
	 * <p>Getter for the field <code>actiontype</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActiontype() {
		return this.actiontype;
	}
	/**
	 * <p>Setter for the field <code>actiontype</code>.</p>
	 *
	 * @param actiontype a {@link java.lang.String} object.
	 */
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}

	/**
	 * <p>Getter for the field <code>inuse</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getInuse() {
		return this.inuse;
	}
	/**
	 * <p>Setter for the field <code>inuse</code>.</p>
	 *
	 * @param inuse a {@link java.lang.Boolean} object.
	 */
	public void setInuse(Boolean inuse) {
		this.inuse = inuse;
	}

	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * <p>Getter for the field <code>sn</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSn() {
		return this.sn;
	}
	/**
	 * <p>Setter for the field <code>sn</code>.</p>
	 *
	 * @param sn a {@link java.lang.String} object.
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * <p>Getter for the field <code>template</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.BeaconTemplate} object.
	 */
	public BeaconTemplate getTemplate() {
		return this.template;
	}
	/**
	 * <p>Setter for the field <code>template</code>.</p>
	 *
	 * @param template a {@link cn.felord.wepay.ali.sdk.api.domain.BeaconTemplate} object.
	 */
	public void setTemplate(BeaconTemplate template) {
		this.template = template;
	}

	/**
	 * <p>Getter for the field <code>uuid</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUuid() {
		return this.uuid;
	}
	/**
	 * <p>Setter for the field <code>uuid</code>.</p>
	 *
	 * @param uuid a {@link java.lang.String} object.
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
