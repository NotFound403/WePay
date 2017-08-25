package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建特殊广告内容返回模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertSpecialAdvContentModifyResponse extends AlipayObject {

	private static final long serialVersionUID = 5318948446489534835L;

	/**
	 * 修改广告内容的结果码；
Success：修改成功；
PASSWORD_RED_EXIST：口令已存在；
ITEM_INVALID：商品无效或者已过期；
CREATE_PASSWORD_MORE_THEN_MAX：口令超过限定最多数量；
ADV_REPEAT_PASSWORD_RED：当前广告已存在口令，不能再次创建；
PASSWORD_RED_INVALID：口令校验失败；
CONTRACT_INVALID：合同已失效，不能创建口令；
NOT_SUPPORT_ERROR：非代金券不支持创建口令；
	 */
	@ApiField("code")
	private String code;

	/**
	 * 口令红包信息
	 */
	@ApiField("content_password")
	private KbAdvertContentPassword contentPassword;

	/**
	 * 吱口令结果
	 */
	@ApiField("content_share_code")
	private KbAdvertContentShareCode contentShareCode;

	/**
	 * 广告内容类型；
当该值是passwordRed时，code的值表示修改口令红包的结果码；
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 修改结果描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>contentPassword</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentPassword} object.
	 */
	public KbAdvertContentPassword getContentPassword() {
		return this.contentPassword;
	}
	/**
	 * <p>Setter for the field <code>contentPassword</code>.</p>
	 *
	 * @param contentPassword a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentPassword} object.
	 */
	public void setContentPassword(KbAdvertContentPassword contentPassword) {
		this.contentPassword = contentPassword;
	}

	/**
	 * <p>Getter for the field <code>contentShareCode</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentShareCode} object.
	 */
	public KbAdvertContentShareCode getContentShareCode() {
		return this.contentShareCode;
	}
	/**
	 * <p>Setter for the field <code>contentShareCode</code>.</p>
	 *
	 * @param contentShareCode a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentShareCode} object.
	 */
	public void setContentShareCode(KbAdvertContentShareCode contentShareCode) {
		this.contentShareCode = contentShareCode;
	}

	/**
	 * <p>Getter for the field <code>contentType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContentType() {
		return this.contentType;
	}
	/**
	 * <p>Setter for the field <code>contentType</code>.</p>
	 *
	 * @param contentType a {@link java.lang.String} object.
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * <p>Getter for the field <code>msg</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMsg() {
		return this.msg;
	}
	/**
	 * <p>Setter for the field <code>msg</code>.</p>
	 *
	 * @param msg a {@link java.lang.String} object.
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
