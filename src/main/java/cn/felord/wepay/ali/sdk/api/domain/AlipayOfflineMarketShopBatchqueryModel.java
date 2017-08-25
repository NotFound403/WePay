package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 系统商通过该接口可以查询所有门店的外部门店编号（系统商的门店编号）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5674381756613716214L;

	/**
	 * 页码，第一页传入"1"，默认500个结果为一页。此参数必须是大于0的正整数，为0时将查询报错。
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNo() {
		return this.pageNo;
	}
	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.String} object.
	 */
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

}
