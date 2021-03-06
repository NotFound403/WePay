package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 商品描述模型(数据)
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayDataItemDescription extends AlipayObject {

	private static final long serialVersionUID = 1123131668462612214L;

	/**
	 * 标题下的描述列表
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 明细图片列表
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 描述标题，不得超过15个中文字符
	 */
	@ApiField("title")
	private String title;

	/**
	 * 套餐使用说明链接，必须是https的地址链接
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
