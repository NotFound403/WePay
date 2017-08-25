package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 实习生职位刷新接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoEduCampusJobPublishModel extends AlipayObject {

	private static final long serialVersionUID = 6541491357545378443L;

	/**
	 * 过期时间(毫秒数)
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 刷新时间(毫秒数)
	 */
	@ApiField("gmt_refresh")
	private String gmtRefresh;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * <p>Getter for the field <code>gmtExpired</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtExpired() {
		return this.gmtExpired;
	}
	/**
	 * <p>Setter for the field <code>gmtExpired</code>.</p>
	 *
	 * @param gmtExpired a {@link java.lang.String} object.
	 */
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	/**
	 * <p>Getter for the field <code>gmtRefresh</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtRefresh() {
		return this.gmtRefresh;
	}
	/**
	 * <p>Setter for the field <code>gmtRefresh</code>.</p>
	 *
	 * @param gmtRefresh a {@link java.lang.String} object.
	 */
	public void setGmtRefresh(String gmtRefresh) {
		this.gmtRefresh = gmtRefresh;
	}

	/**
	 * <p>Getter for the field <code>sourceCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceCode() {
		return this.sourceCode;
	}
	/**
	 * <p>Setter for the field <code>sourceCode</code>.</p>
	 *
	 * @param sourceCode a {@link java.lang.String} object.
	 */
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	/**
	 * <p>Getter for the field <code>sourceId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSourceId() {
		return this.sourceId;
	}
	/**
	 * <p>Setter for the field <code>sourceId</code>.</p>
	 *
	 * @param sourceId a {@link java.lang.String} object.
	 */
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
