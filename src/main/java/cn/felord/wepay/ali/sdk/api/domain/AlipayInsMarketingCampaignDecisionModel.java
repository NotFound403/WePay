package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险营销标的活动列表查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayInsMarketingCampaignDecisionModel extends AlipayObject {

	private static final long serialVersionUID = 1584458488799928825L;

	/**
	 * 描述营销活动涉及的业务类型
1：平台险业务
	 */
	@ApiField("business_type")
	private Long businessType;

	/**
	 * 营销市场列表
	 */
	@ApiListField("market_types")
	@ApiField("number")
	private List<Long> marketTypes;

	/**
	 * 保险营销平台营销标的标识
	 */
	@ApiField("mkt_obj_id")
	private String mktObjId;

	/**
	 * 保险营销平台的营销标的类型
1：淘宝商品
	 */
	@ApiField("mkt_obj_type")
	private Long mktObjType;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * <p>Getter for the field <code>businessType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getBusinessType() {
		return this.businessType;
	}
	/**
	 * <p>Setter for the field <code>businessType</code>.</p>
	 *
	 * @param businessType a {@link java.lang.Long} object.
	 */
	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	/**
	 * <p>Getter for the field <code>marketTypes</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Long> getMarketTypes() {
		return this.marketTypes;
	}
	/**
	 * <p>Setter for the field <code>marketTypes</code>.</p>
	 *
	 * @param marketTypes a {@link java.util.List} object.
	 */
	public void setMarketTypes(List<Long> marketTypes) {
		this.marketTypes = marketTypes;
	}

	/**
	 * <p>Getter for the field <code>mktObjId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMktObjId() {
		return this.mktObjId;
	}
	/**
	 * <p>Setter for the field <code>mktObjId</code>.</p>
	 *
	 * @param mktObjId a {@link java.lang.String} object.
	 */
	public void setMktObjId(String mktObjId) {
		this.mktObjId = mktObjId;
	}

	/**
	 * <p>Getter for the field <code>mktObjType</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getMktObjType() {
		return this.mktObjType;
	}
	/**
	 * <p>Setter for the field <code>mktObjType</code>.</p>
	 *
	 * @param mktObjType a {@link java.lang.Long} object.
	 */
	public void setMktObjType(Long mktObjType) {
		this.mktObjType = mktObjType;
	}

	/**
	 * <p>Getter for the field <code>requestId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getRequestId() {
		return this.requestId;
	}
	/**
	 * <p>Setter for the field <code>requestId</code>.</p>
	 *
	 * @param requestId a {@link java.lang.String} object.
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
