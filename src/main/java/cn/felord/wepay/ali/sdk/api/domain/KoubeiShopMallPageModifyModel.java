package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商圈主页地址创建修改接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiShopMallPageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2282416776375133485L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 商圈访问地址
	 */
	@ApiField("mall_url")
	private String mallUrl;

	/**
	 * 废弃！，务传。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * <p>Getter for the field <code>mallId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMallId() {
		return this.mallId;
	}
	/**
	 * <p>Setter for the field <code>mallId</code>.</p>
	 *
	 * @param mallId a {@link java.lang.String} object.
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	/**
	 * <p>Getter for the field <code>mallUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMallUrl() {
		return this.mallUrl;
	}
	/**
	 * <p>Setter for the field <code>mallUrl</code>.</p>
	 *
	 * @param mallUrl a {@link java.lang.String} object.
	 */
	public void setMallUrl(String mallUrl) {
		this.mallUrl = mallUrl;
	}

	/**
	 * <p>Getter for the field <code>outBizId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOutBizId() {
		return this.outBizId;
	}
	/**
	 * <p>Setter for the field <code>outBizId</code>.</p>
	 *
	 * @param outBizId a {@link java.lang.String} object.
	 */
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}
