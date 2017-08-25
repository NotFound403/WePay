package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 个性化扩展区上下线接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPersonalizedExtensionSetModel extends AlipayObject {

	private static final long serialVersionUID = 2661737352941292657L;

	/**
	 * 扩展区套id，调用创建个性化扩展区接口时返回
	 */
	@ApiField("extension_key")
	private String extensionKey;

	/**
	 * 扩展区操作类型，支持2个值：ON、OFF，ON代表上线操作，OFF代表下线操作。当上线一个扩展区时，若存在同样的标签规则，且状态为上线的扩展区，该扩展区会自动下线
	 */
	@ApiField("status")
	private String status;

	/**
	 * <p>Getter for the field <code>extensionKey</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtensionKey() {
		return this.extensionKey;
	}
	/**
	 * <p>Setter for the field <code>extensionKey</code>.</p>
	 *
	 * @param extensionKey a {@link java.lang.String} object.
	 */
	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link java.lang.String} object.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
