package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 基金爬虫数据推送接口
 *
 * @author auto create
 * @since 1.0, 2017-04-12 15:55:55
 */
public class AlipayFinanceQuotationDtcrawlerSendModel extends AlipayObject {

	private static final long serialVersionUID = 1785539655425472231L;

	/**
	 * 爬虫平台推送数据，为json字符串，bizNo 为推送流水号，taskName为任务名，业务数据包含在bizData中
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
