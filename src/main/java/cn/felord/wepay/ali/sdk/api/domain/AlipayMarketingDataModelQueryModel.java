package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 模型数据查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingDataModelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3174863288363528754L;

	/**
	 * 模型查询输入参数格式。此为参数列表，参数包含外部用户身分信息类型、模型输出字段及模型输出值，根据实际业务需求获取；用于实验试算法模型结果查询
key:条件查询参数。此为外部用户身份信息类型，例如:手机号、身份证
operate:操作计算符数。此为查询条件
value:查询参数值。此为查询值
	 */
	@ApiListField("model_query_param")
	@ApiField("model_query_param")
	private List<ModelQueryParam> modelQueryParam;

	/**
	 * 模型唯一查询标识符。参数值为调用batchquery接口后获取的model_uk参数值；用于标识模型的唯一性
	 */
	@ApiField("model_uk")
	private String modelUk;

	/**
	 * <p>Getter for the field <code>modelQueryParam</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ModelQueryParam> getModelQueryParam() {
		return this.modelQueryParam;
	}
	/**
	 * <p>Setter for the field <code>modelQueryParam</code>.</p>
	 *
	 * @param modelQueryParam a {@link java.util.List} object.
	 */
	public void setModelQueryParam(List<ModelQueryParam> modelQueryParam) {
		this.modelQueryParam = modelQueryParam;
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

}
