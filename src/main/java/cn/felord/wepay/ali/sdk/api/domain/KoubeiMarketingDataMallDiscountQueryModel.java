package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 用户已获得的优惠信息查询接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingDataMallDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6192137496822194156L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

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

}
