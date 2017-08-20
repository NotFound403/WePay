package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 获取生产指令接口
 *
 * @author auto create
 * @since 1.0, 2017-06-30 10:14:49
 */
public class AntMerchantExpandAssetproduceAssignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5447776599293118726L;

	/**
	 * 每次拉取最大记录数量，可选值为[1,200] ;
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
