package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 匹配用户标签删除接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMatchuserLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7841555497361927162L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

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
