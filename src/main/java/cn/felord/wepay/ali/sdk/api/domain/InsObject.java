package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 保险标的
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsObject extends AlipayObject {

	private static final long serialVersionUID = 3475651397598826388L;

	/**
	 * 标的物的标识id
	 */
	@ApiField("insured_object_id")
	private String insuredObjectId;

	/**
	 * 标的信息;标准json 格式
	 */
	@ApiField("insured_object_info")
	private String insuredObjectInfo;

	/**
	 * 标的类型;0:财产所在地;1:其它;2:车;3:资金债务;4:电商订单
	 */
	@ApiField("type")
	private Long type;

	/**
	 * <p>Getter for the field <code>insuredObjectId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInsuredObjectId() {
		return this.insuredObjectId;
	}
	/**
	 * <p>Setter for the field <code>insuredObjectId</code>.</p>
	 *
	 * @param insuredObjectId a {@link java.lang.String} object.
	 */
	public void setInsuredObjectId(String insuredObjectId) {
		this.insuredObjectId = insuredObjectId;
	}

	/**
	 * <p>Getter for the field <code>insuredObjectInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getInsuredObjectInfo() {
		return this.insuredObjectInfo;
	}
	/**
	 * <p>Setter for the field <code>insuredObjectInfo</code>.</p>
	 *
	 * @param insuredObjectInfo a {@link java.lang.String} object.
	 */
	public void setInsuredObjectInfo(String insuredObjectInfo) {
		this.insuredObjectInfo = insuredObjectInfo;
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
