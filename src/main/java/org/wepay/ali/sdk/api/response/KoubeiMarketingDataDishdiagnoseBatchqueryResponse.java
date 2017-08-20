package org.wepay.ali.sdk.api.response;

import java.util.List;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.internal.mapping.ApiListField;
import org.wepay.ali.sdk.api.domain.ItemDiagnoseDetail;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.dishdiagnose.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-03 14:41:41
 */
public class KoubeiMarketingDataDishdiagnoseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5447946646153714258L;

	/** 
	 * 查询返回的详情数据
	 */
	@ApiListField("item_diagnose_list")
	@ApiField("item_diagnose_detail")
	private List<ItemDiagnoseDetail> itemDiagnoseList;

	/** 
	 * 记录的总条数
	 */
	@ApiField("total")
	private Long total;

	public void setItemDiagnoseList(List<ItemDiagnoseDetail> itemDiagnoseList) {
		this.itemDiagnoseList = itemDiagnoseList;
	}
	public List<ItemDiagnoseDetail> getItemDiagnoseList( ) {
		return this.itemDiagnoseList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
