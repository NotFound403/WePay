package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户动态码回传信息模型。包含动态码的码值、过期时间等信息。
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MdCodeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2344849957992399499L;

	/**
	 * 本次回传动态码的状态：
SUCCESS: 本次发码成功
FAIL_RETRY: 本次发码失败，且需要支付宝重试（重新通知商户发码）
FAIL_NOT_RETRY: 本次发码失败，且无需支付宝重试（无需重新通知商户发码）
	 */
	@ApiField("code_status")
	private String codeStatus;

	/**
	 * 动态码的码值：
code_status为SUCCESS时必填；
基于此码值生成条形码或二维码用于扫码核销。
	 */
	@ApiField("code_value")
	private String codeValue;

	/**
	 * 当前动态码的过期（失效）时间：
 code_status为SUCCESS时必填。
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 商户回传动态码的时间戳。

即商户调接口回传动态码时刻对应的long类型时间戳，用于区分不同的发码请求。
	 */
	@ApiField("time_stamp")
	private Long timeStamp;

	/**
	 * <p>Getter for the field <code>codeStatus</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeStatus() {
		return this.codeStatus;
	}
	/**
	 * <p>Setter for the field <code>codeStatus</code>.</p>
	 *
	 * @param codeStatus a {@link java.lang.String} object.
	 */
	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	/**
	 * <p>Getter for the field <code>codeValue</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCodeValue() {
		return this.codeValue;
	}
	/**
	 * <p>Setter for the field <code>codeValue</code>.</p>
	 *
	 * @param codeValue a {@link java.lang.String} object.
	 */
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	/**
	 * <p>Getter for the field <code>expireTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getExpireTime() {
		return this.expireTime;
	}
	/**
	 * <p>Setter for the field <code>expireTime</code>.</p>
	 *
	 * @param expireTime a {@link java.util.Date} object.
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * <p>Getter for the field <code>timeStamp</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTimeStamp() {
		return this.timeStamp;
	}
	/**
	 * <p>Setter for the field <code>timeStamp</code>.</p>
	 *
	 * @param timeStamp a {@link java.lang.Long} object.
	 */
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
