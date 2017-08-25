package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.public.unbind response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketShopPublicUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2423358785667396589L;

	/** 
	 * 绑定失败的店铺ID列表,绑定失败原因可能是：a)检测到shop_id不存在;b)检测到shop_id不属于当前商户；c）该门店ID已经绑定服务窗
	 */
	@ApiListField("error_un_binding_shop_ids")
	@ApiField("string")
	private List<String> errorUnBindingShopIds;

	/** 
	 * 总的基础绑定错误数
	 */
	@ApiField("total_error")
	private Long totalError;

	/** 
	 * 总的解除绑定成功数
	 */
	@ApiField("total_success")
	private Long totalSuccess;

	/**
	 * <p>Setter for the field <code>errorUnBindingShopIds</code>.</p>
	 *
	 * @param errorUnBindingShopIds a {@link java.util.List} object.
	 */
	public void setErrorUnBindingShopIds(List<String> errorUnBindingShopIds) {
		this.errorUnBindingShopIds = errorUnBindingShopIds;
	}
	/**
	 * <p>Getter for the field <code>errorUnBindingShopIds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getErrorUnBindingShopIds( ) {
		return this.errorUnBindingShopIds;
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
