package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商品操作接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class KoubeiItemStateModel extends AlipayObject {

	private static final long serialVersionUID = 1112842128521312221L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，有效期24小时；
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑体系内部商品的唯一标识，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作上下文 ISV角色操作时必填；其他角色不需填写
	 */
	@ApiField("operation_context")
	private KoubeiOperationContext operationContext;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 控制商品的售卖状态，RESUME：恢复售卖；PAUSE：暂停售卖,C端不可见;
	 */
	@ApiField("state_type")
	private String stateType;

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
	 * <p>Getter for the field <code>stateType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStateType() {
		return this.stateType;
	}
	/**
	 * <p>Setter for the field <code>stateType</code>.</p>
	 *
	 * @param stateType a {@link java.lang.String} object.
	 */
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}

}
