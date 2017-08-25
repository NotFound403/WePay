package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建标签接口
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Getter for the field <code>dataType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDataType() {
		return this.dataType;
	}
	/**
	 * <p>Setter for the field <code>dataType</code>.</p>
	 *
	 * @param dataType a {@link java.lang.String} object.
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * <p>Getter for the field <code>labelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelName() {
		return this.labelName;
	}
	/**
	 * <p>Setter for the field <code>labelName</code>.</p>
	 *
	 * @param labelName a {@link java.lang.String} object.
	 */
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
