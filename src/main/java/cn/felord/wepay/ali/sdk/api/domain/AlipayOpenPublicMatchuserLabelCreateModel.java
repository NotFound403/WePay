package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签添加接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMatchuserLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7722157877386257695L;

	/**
	 * 标签id，调用创建标签接口会返回label_id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值，由开发者自主指定，标签值类型要满足创建标签接口中data_type参数的限定。
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 支付宝用户匹配器列表，最多传入10条
	 */
	@ApiListField("matchers")
	@ApiField("matcher")
	private List<Matcher> matchers;

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
	 * <p>Getter for the field <code>labelValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelValue() {
		return this.labelValue;
	}
	/**
	 * <p>Setter for the field <code>labelValue</code>.</p>
	 *
	 * @param labelValue a {@link java.lang.String} object.
	 */
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	/**
	 * <p>Getter for the field <code>matchers</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Matcher> getMatchers() {
		return this.matchers;
	}
	/**
	 * <p>Setter for the field <code>matchers</code>.</p>
	 *
	 * @param matchers a {@link java.util.List} object.
	 */
	public void setMatchers(List<Matcher> matchers) {
		this.matchers = matchers;
	}

}
