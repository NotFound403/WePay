package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 奖品发放规则
 *
 * @author auto create
 * @version $Id: $Id
 */
public class SendRule extends AlipayObject {

	private static final long serialVersionUID = 3362541594256957814L;

	/**
	 * 是否允许重复发奖：
true代表允许，false代表不允许
默认不设置，表明用户领取券后如果没有核销则不允许再次领取券
如果设置为true，表明如果用户领取券后没有核销，还可以继续领取该券
	 */
	@ApiField("allow_repeat_send")
	private String allowRepeatSend;

	/**
	 * 发券最低消费金额，单位元
活动类型为消费送且不是消费送礼包时设置
多营销工具之间不允许设置重复值
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 券的预算数量（仅对口令送随机抽奖有效，即当活动类型为GUESS_SEND，且营销工具PromoTool的个数大于1时，此字段必填，其余情况此字段必为空）
	 */
	@ApiField("send_budget")
	private String sendBudget;

	/**
	 * 发券数目
最少发1张券，最多发5张券
	 */
	@ApiField("send_num")
	private String sendNum;

	/**
	 * <p>Getter for the field <code>allowRepeatSend</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAllowRepeatSend() {
		return this.allowRepeatSend;
	}
	/**
	 * <p>Setter for the field <code>allowRepeatSend</code>.</p>
	 *
	 * @param allowRepeatSend a {@link java.lang.String} object.
	 */
	public void setAllowRepeatSend(String allowRepeatSend) {
		this.allowRepeatSend = allowRepeatSend;
	}

	/**
	 * <p>Getter for the field <code>minCost</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMinCost() {
		return this.minCost;
	}
	/**
	 * <p>Setter for the field <code>minCost</code>.</p>
	 *
	 * @param minCost a {@link java.lang.String} object.
	 */
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	/**
	 * <p>Getter for the field <code>sendBudget</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendBudget() {
		return this.sendBudget;
	}
	/**
	 * <p>Setter for the field <code>sendBudget</code>.</p>
	 *
	 * @param sendBudget a {@link java.lang.String} object.
	 */
	public void setSendBudget(String sendBudget) {
		this.sendBudget = sendBudget;
	}

	/**
	 * <p>Getter for the field <code>sendNum</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSendNum() {
		return this.sendNum;
	}
	/**
	 * <p>Setter for the field <code>sendNum</code>.</p>
	 *
	 * @param sendNum a {@link java.lang.String} object.
	 */
	public void setSendNum(String sendNum) {
		this.sendNum = sendNum;
	}

}
