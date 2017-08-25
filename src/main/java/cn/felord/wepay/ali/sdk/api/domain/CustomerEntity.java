package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 数据资产平台对输数据实验室提供的结果
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CustomerEntity extends AlipayObject {

	private static final long serialVersionUID = 7394498556769491953L;

	/**
	 * 实体英文名
	 */
	@ApiField("code")
	private String code;

	/**
	 * 实体描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 实体id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 实体中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * tag列表
	 */
	@ApiListField("tags")
	@ApiField("customer_tag")
	private List<CustomerTag> tags;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>desc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDesc() {
		return this.desc;
	}
	/**
	 * <p>Setter for the field <code>desc</code>.</p>
	 *
	 * @param desc a {@link java.lang.String} object.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
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
	 * <p>Getter for the field <code>tags</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<CustomerTag> getTags() {
		return this.tags;
	}
	/**
	 * <p>Setter for the field <code>tags</code>.</p>
	 *
	 * @param tags a {@link java.util.List} object.
	 */
	public void setTags(List<CustomerTag> tags) {
		this.tags = tags;
	}

}
