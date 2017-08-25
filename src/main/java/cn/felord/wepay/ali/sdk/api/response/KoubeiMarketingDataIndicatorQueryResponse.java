package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.indicator.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4576232257461221264L;

	/** 
	 * JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值,各biz_type入参以及返回值的详细信息参见<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.1AZ2QH&treeId=193&articleId=106028&docType=1">快速接入</a>
	 */
	@ApiField("indicator_infos")
	private String indicatorInfos;

	/** 
	 * 总条目数,供计算分页信息使用
	 */
	@ApiField("total_size")
	private String totalSize;

	/**
	 * <p>Setter for the field <code>indicatorInfos</code>.</p>
	 *
	 * @param indicatorInfos a {@link java.lang.String} object.
	 */
	public void setIndicatorInfos(String indicatorInfos) {
		this.indicatorInfos = indicatorInfos;
	}
	/**
	 * <p>Getter for the field <code>indicatorInfos</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getIndicatorInfos( ) {
		return this.indicatorInfos;
	}

	/**
	 * <p>Setter for the field <code>totalSize</code>.</p>
	 *
	 * @param totalSize a {@link java.lang.String} object.
	 */
	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	/**
	 * <p>Getter for the field <code>totalSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
