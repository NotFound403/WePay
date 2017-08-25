package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 卡券模板创建
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassTemplateAddModel extends AlipayObject {

	private static final long serialVersionUID = 2789879141143959755L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content参数说明：<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content">参考文档</a>。
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 商户用于控制模版的唯一性。（可以使用时间戳保证唯一性）
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * <p>Getter for the field <code>tplContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTplContent() {
		return this.tplContent;
	}
	/**
	 * <p>Setter for the field <code>tplContent</code>.</p>
	 *
	 * @param tplContent a {@link java.lang.String} object.
	 */
	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	/**
	 * <p>Getter for the field <code>uniqueId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUniqueId() {
		return this.uniqueId;
	}
	/**
	 * <p>Setter for the field <code>uniqueId</code>.</p>
	 *
	 * @param uniqueId a {@link java.lang.String} object.
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
