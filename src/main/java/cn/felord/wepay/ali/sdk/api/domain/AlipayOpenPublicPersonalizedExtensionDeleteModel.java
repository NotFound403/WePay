package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 个性化扩展区删除接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicPersonalizedExtensionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8649429978769334149L;

	/**
	 * 一套扩展区的key，删除默认扩展区时传入default ，查询扩展区列表可以获得每套扩展区的key
	 */
	@ApiField("extension_key")
	private String extensionKey;

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

}
