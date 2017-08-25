package cn.felord.wepay.ali.sdk.api.response;

import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.applyorder.cancel response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopApplyorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1575883375135756885L;

	/** 
	 * 申请撤销成功接口同步返回的支付宝申请流水号。
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * <p>Setter for the field <code>applyId</code>.</p>
	 *
	 * @param applyId a {@link java.lang.String} object.
	 */
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	/**
	 * <p>Getter for the field <code>applyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplyId( ) {
		return this.applyId;
	}

}
