package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险营销标的对象
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsMktObjectDTO extends AlipayObject {

	private static final long serialVersionUID = 6193584367519647527L;

	/**
	 * 活动标的id
	 */
	@ApiField("obj_id")
	private String objId;

	/**
	 * 标的类型
	 */
	@ApiField("type")
	private Long type;

	/**
	 * <p>Getter for the field <code>objId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getObjId() {
		return this.objId;
	}
	/**
	 * <p>Setter for the field <code>objId</code>.</p>
	 *
	 * @param objId a {@link java.lang.String} object.
	 */
	public void setObjId(String objId) {
		this.objId = objId;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.Long} object.
	 */
	public void setType(Long type) {
		this.type = type;
	}

}
