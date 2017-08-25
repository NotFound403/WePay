package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户可以通过此接口对商品进行库存等信息的修改（库存修改值只能大于当前值）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOfflineMarketItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4422928269822189955L;

	/**
	 * 审核规则。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("audit_rule")
	private AlipayItemAuditRule auditRule;

	/**
	 * 支付宝内部使用，暂时不支持ISV修改。商品失效时间，只能延长，不能缩短
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户通知地址，口碑发消息给商户通知其是否对商品创建、修改、变更状态成功
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 商品操作上下文。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("operation_context")
	private AlipayItemOperationContext operationContext;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝内部参数，ISV不支持修改。销售规则
	 */
	@ApiField("sales_rule")
	private AlipayItemSalesRule salesRule;

	/**
	 * 商品顺序权重，必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private Long weight;

	/**
	 * <p>Getter for the field <code>auditRule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemAuditRule} object.
	 */
	public AlipayItemAuditRule getAuditRule() {
		return this.auditRule;
	}
	/**
	 * <p>Setter for the field <code>auditRule</code>.</p>
	 *
	 * @param auditRule a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemAuditRule} object.
	 */
	public void setAuditRule(AlipayItemAuditRule auditRule) {
		this.auditRule = auditRule;
	}

	/**
	 * <p>Getter for the field <code>gmtEnd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getGmtEnd() {
		return this.gmtEnd;
	}
	/**
	 * <p>Setter for the field <code>gmtEnd</code>.</p>
	 *
	 * @param gmtEnd a {@link java.lang.String} object.
	 */
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	/**
	 * <p>Getter for the field <code>inventory</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getInventory() {
		return this.inventory;
	}
	/**
	 * <p>Setter for the field <code>inventory</code>.</p>
	 *
	 * @param inventory a {@link java.lang.Long} object.
	 */
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	/**
	 * <p>Getter for the field <code>itemId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * <p>Setter for the field <code>itemId</code>.</p>
	 *
	 * @param itemId a {@link java.lang.String} object.
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * <p>Getter for the field <code>memo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMemo() {
		return this.memo;
	}
	/**
	 * <p>Setter for the field <code>memo</code>.</p>
	 *
	 * @param memo a {@link java.lang.String} object.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>Getter for the field <code>operateNotifyUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}
	/**
	 * <p>Setter for the field <code>operateNotifyUrl</code>.</p>
	 *
	 * @param operateNotifyUrl a {@link java.lang.String} object.
	 */
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

	/**
	 * <p>Getter for the field <code>operationContext</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemOperationContext} object.
	 */
	public AlipayItemOperationContext getOperationContext() {
		return this.operationContext;
	}
	/**
	 * <p>Setter for the field <code>operationContext</code>.</p>
	 *
	 * @param operationContext a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemOperationContext} object.
	 */
	public void setOperationContext(AlipayItemOperationContext operationContext) {
		this.operationContext = operationContext;
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

	/**
	 * <p>Getter for the field <code>salesRule</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemSalesRule} object.
	 */
	public AlipayItemSalesRule getSalesRule() {
		return this.salesRule;
	}
	/**
	 * <p>Setter for the field <code>salesRule</code>.</p>
	 *
	 * @param salesRule a {@link cn.felord.wepay.ali.sdk.api.domain.AlipayItemSalesRule} object.
	 */
	public void setSalesRule(AlipayItemSalesRule salesRule) {
		this.salesRule = salesRule;
	}

	/**
	 * <p>Getter for the field <code>weight</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getWeight() {
		return this.weight;
	}
	/**
	 * <p>Setter for the field <code>weight</code>.</p>
	 *
	 * @param weight a {@link java.lang.Long} object.
	 */
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
