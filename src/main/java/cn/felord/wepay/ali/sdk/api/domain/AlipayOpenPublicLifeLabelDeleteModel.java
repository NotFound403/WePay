package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 标签删除接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3745784218327915156L;

	/**
	 * 标签id, 只支持生活号自定义标签
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * <p>Getter for the field <code>labelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelId() {
		return this.labelId;
	}
	/**
	 * <p>Setter for the field <code>labelId</code>.</p>
	 *
	 * @param labelId a {@link java.lang.String} object.
	 */
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

}
