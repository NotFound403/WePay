package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 创建处理中的分佣任务信息
 *审批阶段，分佣任务尚未创建，只返回状态等信息
 *任务尚未创建，因此不分配任务ID
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertProcessMissionResponse extends AlipayObject {

	private static final long serialVersionUID = 8649955492494364586L;

	/**
	 * 标识ID
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 主键类型
activity_id：运营活动ID
voucher：商品ID
mission：分佣任务ID
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 任务状态
UNCONFIRMED-未确认（代表任务还在等待商户确认）
EFFECTIVE-有效
INVALID-无效
	 */
	@ApiField("promote_status")
	private String promoteStatus;

	/**
	 * <p>Getter for the field <code>identify</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentify() {
		return this.identify;
	}
	/**
	 * <p>Setter for the field <code>identify</code>.</p>
	 *
	 * @param identify a {@link java.lang.String} object.
	 */
	public void setIdentify(String identify) {
		this.identify = identify;
	}

	/**
	 * <p>Getter for the field <code>identifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIdentifyType() {
		return this.identifyType;
	}
	/**
	 * <p>Setter for the field <code>identifyType</code>.</p>
	 *
	 * @param identifyType a {@link java.lang.String} object.
	 */
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	/**
	 * <p>Getter for the field <code>promoteStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPromoteStatus() {
		return this.promoteStatus;
	}
	/**
	 * <p>Setter for the field <code>promoteStatus</code>.</p>
	 *
	 * @param promoteStatus a {@link java.lang.String} object.
	 */
	public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}

}
