package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 文章段落
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class ArticleParagraph extends AlipayObject {

	private static final long serialVersionUID = 8481815147222276114L;

	/**
	 * 图片列表
	 */
	@ApiListField("pictures")
	@ApiField("article_picture")
	private List<ArticlePicture> pictures;

	/**
	 * 文章正文描述
	 */
	@ApiField("text")
	private String text;

	public List<ArticlePicture> getPictures() {
		return this.pictures;
	}
	public void setPictures(List<ArticlePicture> pictures) {
		this.pictures = pictures;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
