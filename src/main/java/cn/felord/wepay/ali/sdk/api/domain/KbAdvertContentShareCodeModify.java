package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建吱口令模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KbAdvertContentShareCodeModify extends AlipayObject {

	private static final long serialVersionUID = 3416869697973938195L;

	/**
	 * 宣传展示标题（不能超过30个字符）
	 */
	@ApiField("display_title")
	private String displayTitle;

	/**
	 * <p>Getter for the field <code>displayTitle</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDisplayTitle() {
		return this.displayTitle;
	}
	/**
	 * <p>Setter for the field <code>displayTitle</code>.</p>
	 *
	 * @param displayTitle a {@link java.lang.String} object.
	 */
	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
	}

}
