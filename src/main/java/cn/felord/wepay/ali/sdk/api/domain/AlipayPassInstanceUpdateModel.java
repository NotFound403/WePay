package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新卡券实例接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassInstanceUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7283386592785911265L;

	/**
	 * 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 商户指定卡券唯一值，卡券JSON模板中fileInfo->serialNumber字段对应的值
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 券状态，支持更新为USED、CLOSED两种状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段
	 */
	@ApiField("tpl_params")
	private String tplParams;

	/**
	 * 核销码串值【当状态变更为USED时，建议传】
	 */
	@ApiField("verify_code")
	private String verifyCode;

	/**
	 * 核销方式，目前支持：wave（声波方式）、qrcode（二维码方式）、barcode（条码方式）、input（文本方式，即手工输入方式）。verify_code和verify_type需同时传入
	 */
	@ApiField("verify_type")
	private String verifyType;

	/**
	 * <p>Getter for the field <code>channelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getChannelId() {
		return this.channelId;
	}
	/**
	 * <p>Setter for the field <code>channelId</code>.</p>
	 *
	 * @param channelId a {@link java.lang.String} object.
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * <p>Getter for the field <code>serialNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSerialNumber() {
		return this.serialNumber;
	}
	/**
	 * <p>Setter for the field <code>serialNumber</code>.</p>
	 *
	 * @param serialNumber a {@link java.lang.String} object.
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
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

	/**
	 * <p>Getter for the field <code>verifyCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyCode() {
		return this.verifyCode;
	}
	/**
	 * <p>Setter for the field <code>verifyCode</code>.</p>
	 *
	 * @param verifyCode a {@link java.lang.String} object.
	 */
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	/**
	 * <p>Getter for the field <code>verifyType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getVerifyType() {
		return this.verifyType;
	}
	/**
	 * <p>Setter for the field <code>verifyType</code>.</p>
	 *
	 * @param verifyType a {@link java.lang.String} object.
	 */
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
