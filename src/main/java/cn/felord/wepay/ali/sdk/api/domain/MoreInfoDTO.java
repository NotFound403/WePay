package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 模板栏位的扩展信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MoreInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1615852449924542522L;

	/**
	 * 选择opennative的时候必须填写descs的内容
	 */
	@ApiListField("descs")
	@ApiField("string")
	private List<String> descs;

	/**
	 * 扩展参数，需要URL地址回带的值，JSON格式(openweb时填)
	 */
	@ApiField("params")
	private String params;

	/**
	 * 二级页面标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 超链接(选择openweb的时候必须填写url参数内容)
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>descs</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getDescs() {
		return this.descs;
	}
	/**
	 * <p>Setter for the field <code>descs</code>.</p>
	 *
	 * @param descs a {@link java.util.List} object.
	 */
	public void setDescs(List<String> descs) {
		this.descs = descs;
	}

	/**
	 * <p>Getter for the field <code>params</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getParams() {
		return this.params;
	}
	/**
	 * <p>Setter for the field <code>params</code>.</p>
	 *
	 * @param params a {@link java.lang.String} object.
	 */
	public void setParams(String params) {
		this.params = params;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
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
