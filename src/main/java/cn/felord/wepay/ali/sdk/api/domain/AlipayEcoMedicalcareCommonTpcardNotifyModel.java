package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 医疗行业通用消息通知
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMedicalcareCommonTpcardNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7389326892442747263L;

	/**
	 * 模板样式信息中的底部动作
	 */
	@ApiListField("action_info")
	@ApiField("medical_sv_tp_card_action_info")
	private List<MedicalSvTpCardActionInfo> actionInfo;

	/**
	 * 模板样式信息中的内容信息
	 */
	@ApiListField("body_info")
	@ApiField("medical_sv_tp_card_body_info")
	private List<MedicalSvTpCardBodyInfo> bodyInfo;

	/**
	 * 业务扩展参数json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 模板样式信息中的头部信息
	 */
	@ApiField("header_info")
	private MedicalSvTpCardHeadInfo headerInfo;

	/**
	 * 通知时间
注意：通知时间确定card即时显示还是预定未来某个时间显示
通知时间不能早于当前时间
	 */
	@ApiField("notify_time")
	private String notifyTime;

	/**
	 * 操作类型：
CREATE_UPDATE表示创建并更新通知信息；
DELETE表示删除通知信息
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 通知业务模板样式编码，根据业务增加会增加模板类型
sv_remind_reg	预约挂号
sv_remind_clinic	诊间缴费
sv_remind_answer	问诊首次答复
sv_remind_report	报告已出
sv_remind_vaccine	疫苗接种
sv_app_doctors_say	名医说
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 第三方唯一序列号，创建后不能修改，需要保证在商户端不重复。
	 */
	@ApiField("third_no")
	private String thirdNo;

	/**
	 * 支付宝用户ID,可以通过 获取会员信息产品 获取支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * <p>Getter for the field <code>actionInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MedicalSvTpCardActionInfo> getActionInfo() {
		return this.actionInfo;
	}
	/**
	 * <p>Setter for the field <code>actionInfo</code>.</p>
	 *
	 * @param actionInfo a {@link java.util.List} object.
	 */
	public void setActionInfo(List<MedicalSvTpCardActionInfo> actionInfo) {
		this.actionInfo = actionInfo;
	}

	/**
	 * <p>Getter for the field <code>bodyInfo</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<MedicalSvTpCardBodyInfo> getBodyInfo() {
		return this.bodyInfo;
	}
	/**
	 * <p>Setter for the field <code>bodyInfo</code>.</p>
	 *
	 * @param bodyInfo a {@link java.util.List} object.
	 */
	public void setBodyInfo(List<MedicalSvTpCardBodyInfo> bodyInfo) {
		this.bodyInfo = bodyInfo;
	}

	/**
	 * <p>Getter for the field <code>extendParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtendParams() {
		return this.extendParams;
	}
	/**
	 * <p>Setter for the field <code>extendParams</code>.</p>
	 *
	 * @param extendParams a {@link java.lang.String} object.
	 */
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	/**
	 * <p>Getter for the field <code>headerInfo</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalSvTpCardHeadInfo} object.
	 */
	public MedicalSvTpCardHeadInfo getHeaderInfo() {
		return this.headerInfo;
	}
	/**
	 * <p>Setter for the field <code>headerInfo</code>.</p>
	 *
	 * @param headerInfo a {@link cn.felord.wepay.ali.sdk.api.domain.MedicalSvTpCardHeadInfo} object.
	 */
	public void setHeaderInfo(MedicalSvTpCardHeadInfo headerInfo) {
		this.headerInfo = headerInfo;
	}

	/**
	 * <p>Getter for the field <code>notifyTime</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getNotifyTime() {
		return this.notifyTime;
	}
	/**
	 * <p>Setter for the field <code>notifyTime</code>.</p>
	 *
	 * @param notifyTime a {@link java.lang.String} object.
	 */
	public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}

	/**
	 * <p>Getter for the field <code>operate</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperate() {
		return this.operate;
	}
	/**
	 * <p>Setter for the field <code>operate</code>.</p>
	 *
	 * @param operate a {@link java.lang.String} object.
	 */
	public void setOperate(String operate) {
		this.operate = operate;
	}

	/**
	 * <p>Getter for the field <code>templateCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTemplateCode() {
		return this.templateCode;
	}
	/**
	 * <p>Setter for the field <code>templateCode</code>.</p>
	 *
	 * @param templateCode a {@link java.lang.String} object.
	 */
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	/**
	 * <p>Getter for the field <code>thirdNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getThirdNo() {
		return this.thirdNo;
	}
	/**
	 * <p>Setter for the field <code>thirdNo</code>.</p>
	 *
	 * @param thirdNo a {@link java.lang.String} object.
	 */
	public void setThirdNo(String thirdNo) {
		this.thirdNo = thirdNo;
	}

	/**
	 * <p>Getter for the field <code>userId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserId() {
		return this.userId;
	}
	/**
	 * <p>Setter for the field <code>userId</code>.</p>
	 *
	 * @param userId a {@link java.lang.String} object.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
