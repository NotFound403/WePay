package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.domain.ExtItem;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemExtitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1194734496186736226L;

	/** 
	 * 商品信息
	 */
	@ApiField("extitem")
	private ExtItem extitem;

	/**
	 * <p>Setter for the field <code>extitem</code>.</p>
	 *
	 * @param extitem a {@link cn.felord.wepay.ali.sdk.api.domain.ExtItem} object.
	 */
	public void setExtitem(ExtItem extitem) {
		this.extitem = extitem;
	}
	/**
	 * <p>Getter for the field <code>extitem</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.ExtItem} object.
	 */
	public ExtItem getExtitem( ) {
		return this.extitem;
	}

}
