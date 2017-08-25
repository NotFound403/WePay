package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 调查的数据项详情
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InvestigCategoryData extends AlipayObject {

	private static final long serialVersionUID = 2391778928371474562L;

	/**
	 * 数据项
	 */
	@ApiField("category")
	private String category;

	/**
	 * 实体code
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 实体名
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 实体类别
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 模型结果,不同数据项,对应的模型结果对象不同,以JSON格式输出
	 */
	@ApiField("model_result_object")
	private String modelResultObject;

	/**
	 * 采集状态
	 */
	@ApiField("state")
	private String state;

	/**
	 * <p>Getter for the field <code>category</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCategory() {
		return this.category;
	}
	/**
	 * <p>Setter for the field <code>category</code>.</p>
	 *
	 * @param category a {@link java.lang.String} object.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * <p>Getter for the field <code>entityCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityCode() {
		return this.entityCode;
	}
	/**
	 * <p>Setter for the field <code>entityCode</code>.</p>
	 *
	 * @param entityCode a {@link java.lang.String} object.
	 */
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	/**
	 * <p>Getter for the field <code>entityName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityName() {
		return this.entityName;
	}
	/**
	 * <p>Setter for the field <code>entityName</code>.</p>
	 *
	 * @param entityName a {@link java.lang.String} object.
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	/**
	 * <p>Getter for the field <code>entityType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEntityType() {
		return this.entityType;
	}
	/**
	 * <p>Setter for the field <code>entityType</code>.</p>
	 *
	 * @param entityType a {@link java.lang.String} object.
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/**
	 * <p>Getter for the field <code>modelResultObject</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelResultObject() {
		return this.modelResultObject;
	}
	/**
	 * <p>Setter for the field <code>modelResultObject</code>.</p>
	 *
	 * @param modelResultObject a {@link java.lang.String} object.
	 */
	public void setModelResultObject(String modelResultObject) {
		this.modelResultObject = modelResultObject;
	}

	/**
	 * <p>Getter for the field <code>state</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * <p>Setter for the field <code>state</code>.</p>
	 *
	 * @param state a {@link java.lang.String} object.
	 */
	public void setState(String state) {
		this.state = state;
	}

}
