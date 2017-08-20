package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AssetAccountResult;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.account.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:05:33
 */
public class AlipayAssetAccountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2557225156319323772L;

	/** 
	 * 账户绑定关系列表
	 */
	@ApiListField("asset_list")
	@ApiField("asset_account_result")
	private List<AssetAccountResult> assetList;

	public void setAssetList(List<AssetAccountResult> assetList) {
		this.assetList = assetList;
	}
	public List<AssetAccountResult> getAssetList( ) {
		return this.assetList;
	}

}
