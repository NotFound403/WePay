package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 发送消息内容
 *
 * @author auto create
 * @version $Id: $Id
 */
public class Material extends AlipayObject {

	private static final long serialVersionUID = 7694397757993443244L;

	/**
	 * 图文消息子消息项集合，单条消息最多6个子项，否则会发送失败
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 消息类型，text：文本类型，image-text：图文类型。当消息类型为text时，text参数必传，当消息类型为image-text时，articles参数必传
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 文本消息内容
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
