package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝pass新建卡券实例接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassInstanceAddModel extends AlipayObject {

	private static final long serialVersionUID = 7814616145838161245L;

	/**
	 * 支付宝用户识别信息：
包括partner_id（商户的签约账号）和out_trade_no（某笔订单号）
	 */
	@ApiField("recognition_info")
	private String recognitionInfo;

	/**
	 * Alipass添加对象识别类型：1–订单信息
	 */
	@ApiField("recognition_type")
	private String recognitionType;

	/**
	 * 支付宝pass模版ID
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段
	 */
	@ApiField("tpl_params")
	private String tplParams;

	/**
	 * <p>Getter for the field <code>recognitionInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecognitionInfo() {
		return this.recognitionInfo;
	}
	/**
	 * <p>Setter for the field <code>recognitionInfo</code>.</p>
	 *
	 * @param recognitionInfo a {@link java.lang.String} object.
	 */
	public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}

	/**
	 * <p>Getter for the field <code>recognitionType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRecognitionType() {
		return this.recognitionType;
	}
	/**
	 * <p>Setter for the field <code>recognitionType</code>.</p>
	 *
	 * @param recognitionType a {@link java.lang.String} object.
	 */
	public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}

	/**
	 * <p>Getter for the field <code>tplId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTplId() {
		return this.tplId;
	}
	/**
	 * <p>Setter for the field <code>tplId</code>.</p>
	 *
	 * @param tplId a {@link java.lang.String} object.
	 */
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

	/**
	 * <p>Getter for the field <code>tplParams</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTplParams() {
		return this.tplParams;
	}
	/**
	 * <p>Setter for the field <code>tplParams</code>.</p>
	 *
	 * @param tplParams a {@link java.lang.String} object.
	 */
	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

}
