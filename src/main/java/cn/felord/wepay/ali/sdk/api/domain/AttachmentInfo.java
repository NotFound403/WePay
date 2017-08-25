package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 商户附件信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 5517724527461965254L;

	/**
	 * 支付宝返回的图片在文件存储平台的标识
	 */
	@ApiField("atta_url")
	private String attaUrl;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 附件类型,PROMO_PIC:营销物料照
	 */
	@ApiField("type")
	private String type;

	/**
	 * <p>Getter for the field <code>attaUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAttaUrl() {
		return this.attaUrl;
	}
	/**
	 * <p>Setter for the field <code>attaUrl</code>.</p>
	 *
	 * @param attaUrl a {@link java.lang.String} object.
	 */
	public void setAttaUrl(String attaUrl) {
		this.attaUrl = attaUrl;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

}
