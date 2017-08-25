package cn.felord.wepay.ali.sdk.api.response;

import java.util.List;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;
import cn.felord.wepay.ali.sdk.api.domain.ItemDiagnoseDetail;

import cn.felord.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.dishdiagnose.batchquery response.
 *
 * @author auto create
 * @version $Id: $Id
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

	/**
	 * <p>Setter for the field <code>itemDiagnoseList</code>.</p>
	 *
	 * @param itemDiagnoseList a {@link java.util.List} object.
	 */
	public void setItemDiagnoseList(List<ItemDiagnoseDetail> itemDiagnoseList) {
		this.itemDiagnoseList = itemDiagnoseList;
	}
	/**
	 * <p>Getter for the field <code>itemDiagnoseList</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ItemDiagnoseDetail> getItemDiagnoseList( ) {
		return this.itemDiagnoseList;
	}

	/**
	 * <p>Setter for the field <code>total</code>.</p>
	 *
	 * @param total a {@link java.lang.Long} object.
	 */
	public void setTotal(Long total) {
		this.total = total;
	}
	/**
	 * <p>Getter for the field <code>total</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getTotal( ) {
		return this.total;
	}

}
