package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 模型列表信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ModelMeta extends AlipayObject {

	private static final long serialVersionUID = 3875613355728481243L;

	/**
	 * 模型描述
	 */
	@ApiField("model_desc")
	private String modelDesc;

	/**
	 * 模型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 模型唯一查询标识符
	 */
	@ApiField("model_uk")
	private String modelUk;

	/**
	 * 查询参数
	 */
	@ApiListField("query_key")
	@ApiField("string")
	private List<String> queryKey;

	/**
	 * <p>Getter for the field <code>modelDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelDesc() {
		return this.modelDesc;
	}
	/**
	 * <p>Setter for the field <code>modelDesc</code>.</p>
	 *
	 * @param modelDesc a {@link java.lang.String} object.
	 */
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

	/**
	 * <p>Getter for the field <code>modelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelName() {
		return this.modelName;
	}
	/**
	 * <p>Setter for the field <code>modelName</code>.</p>
	 *
	 * @param modelName a {@link java.lang.String} object.
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * <p>Getter for the field <code>modelUk</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelUk() {
		return this.modelUk;
	}
	/**
	 * <p>Setter for the field <code>modelUk</code>.</p>
	 *
	 * @param modelUk a {@link java.lang.String} object.
	 */
	public void setModelUk(String modelUk) {
		this.modelUk = modelUk;
	}

	/**
	 * <p>Getter for the field <code>queryKey</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getQueryKey() {
		return this.queryKey;
	}
	/**
	 * <p>Setter for the field <code>queryKey</code>.</p>
	 *
	 * @param queryKey a {@link java.util.List} object.
	 */
	public void setQueryKey(List<String> queryKey) {
		this.queryKey = queryKey;
	}

}
