package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 口碑商品查询
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7755717419825878834L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商品Id,多个用,分割，最多支持传5个,如果不传递则查询商户下所有商品，但是不返回适用门店字段，使用了该参数，则无需填写page_no和page_size
	 */
	@ApiField("item_ids")
	private String itemIds;

	/**
	 * 操作上下文 isv角色操作时必填；其他角色不需填写
	 */
	@ApiField("operation_context")
	private KoubeiOperationContext operationContext;

	/**
	 * 页码，留空标示第一页，默认10个结果为一页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页记录数，默认10，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * <p>Getter for the field <code>authCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAuthCode() {
		return this.authCode;
	}
	/**
	 * <p>Setter for the field <code>authCode</code>.</p>
	 *
	 * @param authCode a {@link java.lang.String} object.
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * <p>Getter for the field <code>itemIds</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getItemIds() {
		return this.itemIds;
	}
	/**
	 * <p>Setter for the field <code>itemIds</code>.</p>
	 *
	 * @param itemIds a {@link java.lang.String} object.
	 */
	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	/**
	 * <p>Getter for the field <code>operationContext</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.KoubeiOperationContext} object.
	 */
	public KoubeiOperationContext getOperationContext() {
		return this.operationContext;
	}
	/**
	 * <p>Setter for the field <code>operationContext</code>.</p>
	 *
	 * @param operationContext a {@link cn.felord.wepay.ali.sdk.api.domain.KoubeiOperationContext} object.
	 */
	public void setOperationContext(KoubeiOperationContext operationContext) {
		this.operationContext = operationContext;
	}

	/**
	 * <p>Getter for the field <code>pageNo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPageNo() {
		return this.pageNo;
	}
	/**
	 * <p>Setter for the field <code>pageNo</code>.</p>
	 *
	 * @param pageNo a {@link java.lang.String} object.
	 */
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * <p>Getter for the field <code>pageSize</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPageSize() {
		return this.pageSize;
	}
	/**
	 * <p>Setter for the field <code>pageSize</code>.</p>
	 *
	 * @param pageSize a {@link java.lang.Long} object.
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
