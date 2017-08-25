package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 参见“body_info参数说明”
 *1提醒类body_info固定为主副及可选布局格式
 *2应用类body_info固定为图文连接的格式布局
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MedicalSvTpCardBodyInfo extends AlipayObject {

	private static final long serialVersionUID = 7183611399657376647L;

	/**
	 * 模板消息主体主要内容题,开发者自定义
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("content")
	private String content;

	/**
	 * 模板消息主体内同图标URL
图片大小（长*宽,单位px）328*328
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 模板消息主体内容的URL链接
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 模板消息主体内容的备注
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 模板消息主体内容的副内容
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("sub_contenet")
	private String subContenet;

	/**
	 * 模板消息主体内容的副标题
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 主体内容中的标题,开发者自定义
备注：根据模板类型确定属性是否可空
	 */
	@ApiField("title")
	private String title;

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>imageUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}
	/**
	 * <p>Setter for the field <code>imageUrl</code>.</p>
	 *
	 * @param imageUrl a {@link java.lang.String} object.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * <p>Getter for the field <code>linkUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLinkUrl() {
		return this.linkUrl;
	}
	/**
	 * <p>Setter for the field <code>linkUrl</code>.</p>
	 *
	 * @param linkUrl a {@link java.lang.String} object.
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	/**
	 * <p>Getter for the field <code>remark</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * <p>Setter for the field <code>remark</code>.</p>
	 *
	 * @param remark a {@link java.lang.String} object.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * <p>Getter for the field <code>subContenet</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubContenet() {
		return this.subContenet;
	}
	/**
	 * <p>Setter for the field <code>subContenet</code>.</p>
	 *
	 * @param subContenet a {@link java.lang.String} object.
	 */
	public void setSubContenet(String subContenet) {
		this.subContenet = subContenet;
	}

	/**
	 * <p>Getter for the field <code>subTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSubTitle() {
		return this.subTitle;
	}
	/**
	 * <p>Setter for the field <code>subTitle</code>.</p>
	 *
	 * @param subTitle a {@link java.lang.String} object.
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
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

}
