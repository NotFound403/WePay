package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建标签接口
 *
 * @author auto create
 * @since 1.0, 2017-06-27 17:50:46
 */
public class AlipayOpenPublicLifeLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7618953417888455668L;

	/**
	 * 标签值类型，目前只支持string（字符串类型），不传默认为"string"
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 自定义标签名
	 */
	@ApiField("label_name")
	private String labelName;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
