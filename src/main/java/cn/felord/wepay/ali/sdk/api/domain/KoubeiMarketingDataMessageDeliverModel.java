package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 一键营销商家中心PUSH消息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataMessageDeliverModel extends AlipayObject {

	private static final long serialVersionUID = 2619369884893294819L;

	/**
	 * 消息内容，json格式， KEY值编号递增
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息， json格式，
key值：
REDIRECT_URL跳转地址; 
CHANNEL发送渠道，对应value值为：MSGBOX消息盒子，PUSH手机消息通知
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息业务类型
活动推荐消息：PROMO_RECOMMEND;
活动效果消息: PROMO_STAT
	 */
	@ApiField("msg_type")
	private String msgType;

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
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

}
