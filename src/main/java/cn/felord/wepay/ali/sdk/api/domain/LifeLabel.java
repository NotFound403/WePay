package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 标签信息模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class LifeLabel extends AlipayObject {

	private static final long serialVersionUID = 3376578775848492759L;

	/**
	 * 该标签支持的业务列表，menu表示个性化菜单，extension表示个性化扩展区，message表示消息触达
	 */
	@ApiField("biz")
	private String biz;

	/**
	 * 标签类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 标签值数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 标签英文代码
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 标签id，唯一标识一个标签
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 该标签支持的运算符
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 每个取值的业务含义
	 */
	@ApiListField("options")
	@ApiField("option")
	private List<Option> options;

	/**
	 * 标签类型，目前分为common（通用标签）、custom（生活号自定义标签）、cloud（云实验室标签）
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>biz</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBiz() {
		return this.biz;
	}
	/**
	 * <p>Setter for the field <code>biz</code>.</p>
	 *
	 * @param biz a {@link java.lang.String} object.
	 */
	public void setBiz(String biz) {
		this.biz = biz;
	}

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
	 * <p>Getter for the field <code>labelCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelCode() {
		return this.labelCode;
	}
	/**
	 * <p>Setter for the field <code>labelCode</code>.</p>
	 *
	 * @param labelCode a {@link java.lang.String} object.
	 */
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	/**
	 * <p>Getter for the field <code>labelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelId() {
		return this.labelId;
	}
	/**
	 * <p>Setter for the field <code>labelId</code>.</p>
	 *
	 * @param labelId a {@link java.lang.String} object.
	 */
	public void setLabelId(String labelId) {
		this.labelId = labelId;
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

	/**
	 * <p>Getter for the field <code>operator</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperator() {
		return this.operator;
	}
	/**
	 * <p>Setter for the field <code>operator</code>.</p>
	 *
	 * @param operator a {@link java.lang.String} object.
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * <p>Getter for the field <code>options</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Option> getOptions() {
		return this.options;
	}
	/**
	 * <p>Setter for the field <code>options</code>.</p>
	 *
	 * @param options a {@link java.util.List} object.
	 */
	public void setOptions(List<Option> options) {
		this.options = options;
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
