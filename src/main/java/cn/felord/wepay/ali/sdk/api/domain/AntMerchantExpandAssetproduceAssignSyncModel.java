package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 生产指令接收反馈接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AntMerchantExpandAssetproduceAssignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8443251445626473244L;

	/**
	 * 生产指令接收情况，最多200条
	 */
	@ApiListField("asset_results")
	@ApiField("asset_result")
	private List<AssetResult> assetResults;

	/**
	 * <p>Getter for the field <code>assetResults</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AssetResult> getAssetResults() {
		return this.assetResults;
	}
	/**
	 * <p>Setter for the field <code>assetResults</code>.</p>
	 *
	 * @param assetResults a {@link java.util.List} object.
	 */
	public void setAssetResults(List<AssetResult> assetResults) {
		this.assetResults = assetResults;
	}

}
