package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.editor.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-10 10:25:08
 */
public class AlipayMarketingToolFengdieEditorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5784743213976836695L;

	/** 
	 * 凤蝶编辑器访问地址，可通过iframe集成在后台系统，由系统用户编辑H5应用内容。url的有效期为15秒，因此每次需要编辑h5页面的时候应该重新调用Api生成。
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
