package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 券的使用说明描述
 *
 * @author auto create
 * @version $Id: $Id
 */
public class VoucherDescDetail extends AlipayObject {

	private static final long serialVersionUID = 5515828399248411615L;

	/**
	 * 具体描述信息列表
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 图片描述信息
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 券说明的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 券外部详情描述
	 */
	@ApiField("url")
	private String url;

	/**
	 * <p>Getter for the field <code>details</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getDetails() {
		return this.details;
	}
	/**
	 * <p>Setter for the field <code>details</code>.</p>
	 *
	 * @param details a {@link java.util.List} object.
	 */
	public void setDetails(List<String> details) {
		this.details = details;
	}

	/**
	 * <p>Getter for the field <code>images</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getImages() {
		return this.images;
	}
	/**
	 * <p>Setter for the field <code>images</code>.</p>
	 *
	 * @param images a {@link java.util.List} object.
	 */
	public void setImages(List<String> images) {
		this.images = images;
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
