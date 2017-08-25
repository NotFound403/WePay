package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询车型详情信息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarCarmodelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7595521982393174351L;

	/**
	 * 支付宝车型库车型编号,系统唯一。
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * <p>Getter for the field <code>modelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelId() {
		return this.modelId;
	}
	/**
	 * <p>Setter for the field <code>modelId</code>.</p>
	 *
	 * @param modelId a {@link java.lang.String} object.
	 */
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

}
