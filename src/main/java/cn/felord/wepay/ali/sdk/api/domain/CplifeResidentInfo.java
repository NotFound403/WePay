package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 物业社区业主信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CplifeResidentInfo extends AlipayObject {

	private static final long serialVersionUID = 2556558521312339573L;

	/**
	 * 业主关联的房产在支付宝平台中的唯一标识。(该属性和property_entity_id两个至少需要填写一项，如果两项都填写则以entity_id为准.)
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 业主身份证号的MD5结果
	 */
	@ApiField("idcard_no")
	private String idcardNo;

	/**
	 * 用户的真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业主关联的房产在物业系统中的唯一标识。(该属性和entity_id两个至少需要填写一项，如果两项都填写则以entity_id为准.)
	 */
	@ApiField("out_entity_id")
	private String outEntityId;

	/**
	 * 物业系统中小区住户的唯一ID标识.
	 */
	@ApiField("out_resident_id")
	private String outResidentId;

	/**
	 * 用户对房产的关系类型。业主:1；家人:2；租客:3
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>entityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityId() {
		return this.entityId;
	}
	/**
	 * <p>Setter for the field <code>entityId</code>.</p>
	 *
	 * @param entityId a {@link java.lang.String} object.
	 */
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	/**
	 * <p>Getter for the field <code>idcardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdcardNo() {
		return this.idcardNo;
	}
	/**
	 * <p>Setter for the field <code>idcardNo</code>.</p>
	 *
	 * @param idcardNo a {@link java.lang.String} object.
	 */
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>outEntityId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutEntityId() {
		return this.outEntityId;
	}
	/**
	 * <p>Setter for the field <code>outEntityId</code>.</p>
	 *
	 * @param outEntityId a {@link java.lang.String} object.
	 */
	public void setOutEntityId(String outEntityId) {
		this.outEntityId = outEntityId;
	}

	/**
	 * <p>Getter for the field <code>outResidentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutResidentId() {
		return this.outResidentId;
	}
	/**
	 * <p>Setter for the field <code>outResidentId</code>.</p>
	 *
	 * @param outResidentId a {@link java.lang.String} object.
	 */
	public void setOutResidentId(String outResidentId) {
		this.outResidentId = outResidentId;
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
