package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 消息模板上下文，即模板中定义的参数及参数值
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Context extends AlipayObject {

	private static final long serialVersionUID = 2272146421849484134L;

	/**
	 * 底部链接描述文字，如“查看详情”
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("first")
	private Keyword first;

	/**
	 * 顶部色条的色值
	 */
	@ApiField("head_color")
	private String headColor;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword1")
	private Keyword keyword1;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword2")
	private Keyword keyword2;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("remark")
	private Keyword remark;

	/**
	 * 点击消息后承接页的地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>actionName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getActionName() {
		return this.actionName;
	}
	/**
	 * <p>Setter for the field <code>actionName</code>.</p>
	 *
	 * @param actionName a {@link java.lang.String} object.
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * <p>Getter for the field <code>first</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public Keyword getFirst() {
		return this.first;
	}
	/**
	 * <p>Setter for the field <code>first</code>.</p>
	 *
	 * @param first a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public void setFirst(Keyword first) {
		this.first = first;
	}

	/**
	 * <p>Getter for the field <code>headColor</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeadColor() {
		return this.headColor;
	}
	/**
	 * <p>Setter for the field <code>headColor</code>.</p>
	 *
	 * @param headColor a {@link java.lang.String} object.
	 */
	public void setHeadColor(String headColor) {
		this.headColor = headColor;
	}

	/**
	 * <p>Getter for the field <code>keyword1</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public Keyword getKeyword1() {
		return this.keyword1;
	}
	/**
	 * <p>Setter for the field <code>keyword1</code>.</p>
	 *
	 * @param keyword1 a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public void setKeyword1(Keyword keyword1) {
		this.keyword1 = keyword1;
	}

	/**
	 * <p>Getter for the field <code>keyword2</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public Keyword getKeyword2() {
		return this.keyword2;
	}
	/**
	 * <p>Setter for the field <code>keyword2</code>.</p>
	 *
	 * @param keyword2 a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public void setKeyword2(Keyword keyword2) {
		this.keyword2 = keyword2;
	}

	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public Keyword getRemark() {
		return this.remark;
	}
	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link cn.felord.wepay.ali.sdk.api.domain.Keyword} object.
	 */
	public void setRemark(Keyword remark) {
		this.remark = remark;
	}

	/**
	 * <p>Getter for the field <code>url</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrl() {
		return this.url;
	}
	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
