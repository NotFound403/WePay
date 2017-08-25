package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建或者删除广告内容时的请求参数
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertSpecialAdvContentRequest extends AlipayObject {

	private static final long serialVersionUID = 1718881166473992154L;

	/**
	 * 红包口令模型，创建红包口令时传入该模型
	 */
	@ApiField("content_password_modify")
	private KbAdvertContentPasswordModify contentPasswordModify;

	/**
	 * 广告内容类型；
当值是passwordRed时，表示修改口令红包，需要传入content_password_modify模型的参数；
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * <p>Getter for the field <code>contentPasswordModify</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentPasswordModify} object.
	 */
	public KbAdvertContentPasswordModify getContentPasswordModify() {
		return this.contentPasswordModify;
	}
	/**
	 * <p>Setter for the field <code>contentPasswordModify</code>.</p>
	 *
	 * @param contentPasswordModify a {@link cn.felord.wepay.ali.sdk.api.domain.KbAdvertContentPasswordModify} object.
	 */
	public void setContentPasswordModify(KbAdvertContentPasswordModify contentPasswordModify) {
		this.contentPasswordModify = contentPasswordModify;
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

}
