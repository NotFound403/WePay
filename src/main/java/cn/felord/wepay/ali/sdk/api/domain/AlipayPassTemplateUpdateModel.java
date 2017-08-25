package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新模版接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayPassTemplateUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2864824777756131581L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content参数说明:<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content">参考文档</a>。
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 更新的模板ID
	 */
	@ApiField("tpl_id")
	private String tplId;

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
	 * <p>Getter for the field <code>tplId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTplId() {
		return this.tplId;
	}
	/**
	 * <p>Setter for the field <code>tplId</code>.</p>
	 *
	 * @param tplId a {@link java.lang.String} object.
	 */
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

}
