package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 分组消息发送接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicMessageGroupSendModel extends AlipayObject {

	private static final long serialVersionUID = 4152819585275579626L;

	/**
	 * 图文消息，当msg_type为image-text，该值必须设置，图文消息中的图片建议尺寸 750 x 350px，小于3M，图片支持jpg、png格式
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 用户分组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 纯图片消息，暂时不支持，包含url信息，当msg_type为image时，必须设置该值 ，图片尺寸建议为1080x750px，小于3M，图片支持jpg、png格式
	 */
	@ApiField("image")
	private Image image;

	/**
	 * 消息类型，text表示文本消息，image-text表示图文消息
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 文本消息内容，当msg_type为text，必须设置该值，而且必须同时设置标题和内容字段
	 */
	@ApiField("text")
	private Text text;

	/**
	 * <p>Getter for the field <code>articles</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Article> getArticles() {
		return this.articles;
	}
	/**
	 * <p>Setter for the field <code>articles</code>.</p>
	 *
	 * @param articles a {@link java.util.List} object.
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	/**
	 * <p>Getter for the field <code>groupId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGroupId() {
		return this.groupId;
	}
	/**
	 * <p>Setter for the field <code>groupId</code>.</p>
	 *
	 * @param groupId a {@link java.lang.String} object.
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * <p>Getter for the field <code>image</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Image} object.
	 */
	public Image getImage() {
		return this.image;
	}
	/**
	 * <p>Setter for the field <code>image</code>.</p>
	 *
	 * @param image a {@link cn.felord.wepay.ali.sdk.api.domain.Image} object.
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * <p>Getter for the field <code>msgType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsgType() {
		return this.msgType;
	}
	/**
	 * <p>Setter for the field <code>msgType</code>.</p>
	 *
	 * @param msgType a {@link java.lang.String} object.
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	/**
	 * <p>Getter for the field <code>text</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.Text} object.
	 */
	public Text getText() {
		return this.text;
	}
	/**
	 * <p>Setter for the field <code>text</code>.</p>
	 *
	 * @param text a {@link cn.felord.wepay.ali.sdk.api.domain.Text} object.
	 */
	public void setText(Text text) {
		this.text = text;
	}

}
