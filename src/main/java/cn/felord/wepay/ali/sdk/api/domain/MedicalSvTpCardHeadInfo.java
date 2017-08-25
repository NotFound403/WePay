package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 医疗行业通知行业消息card头部信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class MedicalSvTpCardHeadInfo extends AlipayObject {

	private static final long serialVersionUID = 2645245485473593691L;

	/**
	 * 模板头部图标：开发者提供公网图片地址
图片大小（长*宽,单位px）81*81
	 */
	@ApiField("header_icon")
	private String headerIcon;

	/**
	 * 模板头部标题,开发者自定义
	 */
	@ApiField("header_title")
	private String headerTitle;

	/**
	 * <p>Getter for the field <code>headerIcon</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeaderIcon() {
		return this.headerIcon;
	}
	/**
	 * <p>Setter for the field <code>headerIcon</code>.</p>
	 *
	 * @param headerIcon a {@link java.lang.String} object.
	 */
	public void setHeaderIcon(String headerIcon) {
		this.headerIcon = headerIcon;
	}

	/**
	 * <p>Getter for the field <code>headerTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getHeaderTitle() {
		return this.headerTitle;
	}
	/**
	 * <p>Setter for the field <code>headerTitle</code>.</p>
	 *
	 * @param headerTitle a {@link java.lang.String} object.
	 */
	public void setHeaderTitle(String headerTitle) {
		this.headerTitle = headerTitle;
	}

}
