package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.public.bind response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopPublicBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3291842854892574972L;

	/** 
	 * 绑定失败的店铺ID列表
	 */
	@ApiListField("error_binding_shop_ids")
	@ApiField("string")
	private List<String> errorBindingShopIds;

	/** 
	 * 数字类型，标示总的绑定错误总数
	 */
	@ApiField("total_error")
	private Long totalError;

	/** 
	 * 绑定店铺总成功数
	 */
	@ApiField("total_success")
	private Long totalSuccess;

	/**
	 * <p>Setter for the field <code>errorBindingShopIds</code>.</p>
	 *
	 * @param errorBindingShopIds a {@link java.util.List} object.
	 */
	public void setErrorBindingShopIds(List<String> errorBindingShopIds) {
		this.errorBindingShopIds = errorBindingShopIds;
	}
	/**
	 * <p>Getter for the field <code>errorBindingShopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getErrorBindingShopIds( ) {
		return this.errorBindingShopIds;
	}

	/**
	 * <p>Setter for the field <code>totalError</code>.</p>
	 *
	 * @param totalError a {@link java.lang.Long} object.
	 */
	public void setTotalError(Long totalError) {
		this.totalError = totalError;
	}
	/**
	 * <p>Getter for the field <code>totalError</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalError( ) {
		return this.totalError;
	}

	/**
	 * <p>Setter for the field <code>totalSuccess</code>.</p>
	 *
	 * @param totalSuccess a {@link java.lang.Long} object.
	 */
	public void setTotalSuccess(Long totalSuccess) {
		this.totalSuccess = totalSuccess;
	}
	/**
	 * <p>Getter for the field <code>totalSuccess</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotalSuccess( ) {
		return this.totalSuccess;
	}

}
