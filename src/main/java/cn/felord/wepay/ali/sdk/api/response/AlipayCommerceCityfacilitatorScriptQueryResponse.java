package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.script.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-09 16:24:55
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

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

}
