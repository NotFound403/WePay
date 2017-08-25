package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 查询订单详情接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoLogisticsExpressOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6273346184449449311L;

	/**
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/**
	 * 寄件平台订单号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * <p>Getter for the field <code>logisMerchCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisMerchCode() {
		return this.logisMerchCode;
	}
	/**
	 * <p>Setter for the field <code>logisMerchCode</code>.</p>
	 *
	 * @param logisMerchCode a {@link java.lang.String} object.
	 */
	public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
	}

	/**
	 * <p>Getter for the field <code>orderNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * <p>Setter for the field <code>orderNo</code>.</p>
	 *
	 * @param orderNo a {@link java.lang.String} object.
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
