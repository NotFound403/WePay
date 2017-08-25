package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.VoucherLiteInfo;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.list.query response.
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingVoucherListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7435299691177565625L;

	/** 
	 * 券列表，一定不为null，但是size可以为0
	 */
	@ApiListField("vouchers")
	@ApiField("voucher_lite_info")
	private List<VoucherLiteInfo> vouchers;

	/**
	 * <p>Setter for the field <code>vouchers</code>.</p>
	 *
	 * @param vouchers a {@link java.util.List} object.
	 */
	public void setVouchers(List<VoucherLiteInfo> vouchers) {
		this.vouchers = vouchers;
	}
	/**
	 * <p>Getter for the field <code>vouchers</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<VoucherLiteInfo> getVouchers( ) {
		return this.vouchers;
	}

}
