package cn.felord.wepay.ali.sdk.api.domain;

import java.util.Date;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 理赔报案进度
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsClaimReportProgress extends AlipayObject {

	private static final long serialVersionUID = 5149738796767699251L;

	/**
	 * 案件更新内容
	 */
	@ApiField("progress_update_content")
	private String progressUpdateContent;

	/**
	 * 案件更新进度时间
	 */
	@ApiField("progress_update_time")
	private Date progressUpdateTime;

	/**
	 * 进度状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>progressUpdateContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProgressUpdateContent() {
		return this.progressUpdateContent;
	}
	/**
	 * <p>Setter for the field <code>progressUpdateContent</code>.</p>
	 *
	 * @param progressUpdateContent a {@link java.lang.String} object.
	 */
	public void setProgressUpdateContent(String progressUpdateContent) {
		this.progressUpdateContent = progressUpdateContent;
	}

	/**
	 * <p>Getter for the field <code>progressUpdateTime</code>.</p>
	 *
	 * @return a {@link java.util.Date} object.
	 */
	public Date getProgressUpdateTime() {
		return this.progressUpdateTime;
	}
	/**
	 * <p>Setter for the field <code>progressUpdateTime</code>.</p>
	 *
	 * @param progressUpdateTime a {@link java.util.Date} object.
	 */
	public void setProgressUpdateTime(Date progressUpdateTime) {
		this.progressUpdateTime = progressUpdateTime;
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

}
