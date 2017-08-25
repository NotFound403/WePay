package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 物料生产完成反馈接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandAssetproduceCompleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8777497317681617276L;

	/**
	 * 物料生产单完成后指定物流信息
	 */
	@ApiListField("asset_produce_details")
	@ApiField("item_delivery_detail")
	private List<ItemDeliveryDetail> assetProduceDetails;

	/**
	 * <p>Getter for the field <code>assetProduceDetails</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ItemDeliveryDetail> getAssetProduceDetails() {
		return this.assetProduceDetails;
	}
	/**
	 * <p>Setter for the field <code>assetProduceDetails</code>.</p>
	 *
	 * @param assetProduceDetails a {@link java.util.List} object.
	 */
	public void setAssetProduceDetails(List<ItemDeliveryDetail> assetProduceDetails) {
		this.assetProduceDetails = assetProduceDetails;
	}

}
