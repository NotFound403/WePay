package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 口碑营销活动列表查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiMarketingCampaignActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8236875249791577288L;

	/**
	 * 操作人id，必须和operator_type配对存在，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 页码，默认为1
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 页大小，默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询条件
	 */
	@ApiListField("query_criterias")
	@ApiField("condition")
	private List<Condition> queryCriterias;

	/**
	 * <p>Getter for the field <code>operatorId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * <p>Setter for the field <code>operatorId</code>.</p>
	 *
	 * @param operatorId a {@link java.lang.String} object.
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * <p>Getter for the field <code>operatorType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperatorType() {
		return this.operatorType;
	}
	/**
	 * <p>Setter for the field <code>operatorType</code>.</p>
	 *
	 * @param operatorType a {@link java.lang.String} object.
	 */
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	/**
	 * <p>Getter for the field <code>pageNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNumber() {
		return this.pageNumber;
	}
	/**
	 * <p>Setter for the field <code>pageNumber</code>.</p>
	 *
	 * @param pageNumber a {@link java.lang.String} object.
	 */
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.String} object.
	 */
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * <p>Getter for the field <code>queryCriterias</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Condition> getQueryCriterias() {
		return this.queryCriterias;
	}
	/**
	 * <p>Setter for the field <code>queryCriterias</code>.</p>
	 *
	 * @param queryCriterias a {@link java.util.List} object.
	 */
	public void setQueryCriterias(List<Condition> queryCriterias) {
		this.queryCriterias = queryCriterias;
	}

}
