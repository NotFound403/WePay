package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 赔案进度
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ClaimProgress extends AlipayObject {

	private static final long serialVersionUID = 6816493144784663729L;

	/**
	 * 更新内容
	 */
	@ApiField("update_content")
	private String updateContent;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * <p>Getter for the field <code>updateContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUpdateContent() {
		return this.updateContent;
	}
	/**
	 * <p>Setter for the field <code>updateContent</code>.</p>
	 *
	 * @param updateContent a {@link java.lang.String} object.
	 */
	public void setUpdateContent(String updateContent) {
		this.updateContent = updateContent;
	}

	/**
	 * <p>Getter for the field <code>updateTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * <p>Setter for the field <code>updateTime</code>.</p>
	 *
	 * @param updateTime a {@link java.util.Date} object.
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
