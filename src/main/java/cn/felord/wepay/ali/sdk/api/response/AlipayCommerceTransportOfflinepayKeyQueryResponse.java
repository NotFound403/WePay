package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.AlipayOfflinePayMasterKey;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.key.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayCommerceTransportOfflinepayKeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3138349323479224844L;

	/** 
	 * 支付宝脱机交易公钥列表。列表中每一项为一个有效的支付宝公钥信息, 其中id字段表示支付宝公钥id。
	 */
	@ApiListField("keys")
	@ApiField("alipay_offline_pay_master_key")
	private List<AlipayOfflinePayMasterKey> keys;

	/**
	 * <p>Setter for the field <code>keys</code>.</p>
	 *
	 * @param keys a {@link java.util.List} object.
	 */
	public void setKeys(List<AlipayOfflinePayMasterKey> keys) {
		this.keys = keys;
	}
	/**
	 * <p>Getter for the field <code>keys</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<AlipayOfflinePayMasterKey> getKeys( ) {
		return this.keys;
	}

}
