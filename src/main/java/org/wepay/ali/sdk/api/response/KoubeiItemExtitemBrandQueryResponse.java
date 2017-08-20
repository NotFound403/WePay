package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.ExtBrand;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.brand.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:03
 */
public class KoubeiItemExtitemBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2258565381129873267L;

	/** 
	 * 品牌列表信息
	 */
	@ApiListField("brand_list")
	@ApiField("ext_brand")
	private List<ExtBrand> brandList;

	public void setBrandList(List<ExtBrand> brandList) {
		this.brandList = brandList;
	}
	public List<ExtBrand> getBrandList( ) {
		return this.brandList;
	}

}
