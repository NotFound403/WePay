package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.script.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceCityfacilitatorScriptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879677262685859157L;

	/** 
	 * 脚本内容，智能卡中心自定义的脚本格式内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 脚本更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent( ) {
		return this.content;
	}

	/**
	 * <p>Setter for the field <code>gmtModified</code>.</p>
	 *
	 * @param gmtModified a {@link java.lang.String} object.
	 */
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	/**
	 * <p>Getter for the field <code>gmtModified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtModified( ) {
		return this.gmtModified;
	}

}
