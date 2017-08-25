package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;
import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 会员卡更新
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCardUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8876546421539117179L;

	/**
	 * 需要修改的最新卡信息
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/**
	 * 扩展信息(暂时无用)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 会员卡卡面展示样式
参考：展示位置详情参考"商户会员卡->快速接入文档->第四步" 
备注：mcard_style_info与card_info下的template_id不能同时更新
	 */
	@ApiField("mcard_style_info")
	private McardStylInfo mcardStyleInfo;

	/**
	 * 卡信息变更通知消息
1、在列表中定义的消息，才会发送给用户，消息格式一定。
2、根据卡信息变更情况，一次可发送多个消息
	 */
	@ApiListField("notify_messages")
	@ApiField("mcard_notify_message")
	private List<McardNotifyMessage> notifyMessages;

	/**
	 * 标识业务发生的时间
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 支付宝业务卡号，开卡接口中返回获取
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
BIZ_CARD：支付宝业务卡号
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	/**
	 * <p>Getter for the field <code>cardInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public MerchantCard getCardInfo() {
		return this.cardInfo;
	}
	/**
	 * <p>Setter for the field <code>cardInfo</code>.</p>
	 *
	 * @param cardInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MerchantCard} object.
	 */
	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
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
	 * <p>Getter for the field <code>mcardStyleInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.McardStylInfo} object.
	 */
	public McardStylInfo getMcardStyleInfo() {
		return this.mcardStyleInfo;
	}
	/**
	 * <p>Setter for the field <code>mcardStyleInfo</code>.</p>
	 *
	 * @param mcardStyleInfo a {@link cn.felord.wepay.ali.sdk.api.domain.McardStylInfo} object.
	 */
	public void setMcardStyleInfo(McardStylInfo mcardStyleInfo) {
		this.mcardStyleInfo = mcardStyleInfo;
	}

	/**
	 * <p>Getter for the field <code>notifyMessages</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<McardNotifyMessage> getNotifyMessages() {
		return this.notifyMessages;
	}
	/**
	 * <p>Setter for the field <code>notifyMessages</code>.</p>
	 *
	 * @param notifyMessages a {@link java.util.List} object.
	 */
	public void setNotifyMessages(List<McardNotifyMessage> notifyMessages) {
		this.notifyMessages = notifyMessages;
	}

	/**
	 * <p>Getter for the field <code>occurTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getOccurTime() {
		return this.occurTime;
	}
	/**
	 * <p>Setter for the field <code>occurTime</code>.</p>
	 *
	 * @param occurTime a {@link java.util.Date} object.
	 */
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	/**
	 * <p>Getter for the field <code>targetCardNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	/**
	 * <p>Setter for the field <code>targetCardNo</code>.</p>
	 *
	 * @param targetCardNo a {@link java.lang.String} object.
	 */
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	/**
	 * <p>Getter for the field <code>targetCardNoType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	/**
	 * <p>Setter for the field <code>targetCardNoType</code>.</p>
	 *
	 * @param targetCardNoType a {@link java.lang.String} object.
	 */
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
