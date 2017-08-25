package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ExtBrand;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.brand.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemExtitemBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2258565381129873267L;

	/** 
	 * 品牌列表信息
	 */
	@ApiListField("brand_list")
	@ApiField("ext_brand")
	private List<ExtBrand> brandList;

	/**
	 * <p>Setter for the field <code>brandList</code>.</p>
	 *
	 * @param brandList a {@link java.util.List} object.
	 */
	public void setBrandList(List<ExtBrand> brandList) {
		this.brandList = brandList;
	}
	/**
	 * <p>Getter for the field <code>brandList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ExtBrand> getBrandList( ) {
		return this.brandList;
	}

}
