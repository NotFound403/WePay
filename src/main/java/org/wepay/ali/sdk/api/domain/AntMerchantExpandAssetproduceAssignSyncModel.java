package org.wepay.ali.sdk.api.domain;

import java.util.List;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 生产指令接收反馈接口
 *
 * @author auto create
 * @since 1.0, 2017-06-30 10:14:58
 */
public class AntMerchantExpandAssetproduceAssignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8443251445626473244L;

	/**
	 * 生产指令接收情况，最多200条
	 */
	@ApiListField("asset_results")
	@ApiField("asset_result")
	private List<AssetResult> assetResults;

	public List<AssetResult> getAssetResults() {
		return this.assetResults;
	}
	public void setAssetResults(List<AssetResult> assetResults) {
		this.assetResults = assetResults;
	}

}
