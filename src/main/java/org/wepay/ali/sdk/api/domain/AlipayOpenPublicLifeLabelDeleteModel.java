package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 标签删除接口
 *
 * @author auto create
 * @since 1.0, 2017-06-27 17:51:38
 */
public class AlipayOpenPublicLifeLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3745784218327915156L;

	/**
	 * 标签id, 只支持生活号自定义标签
	 */
	@ApiField("label_id")
	private String labelId;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

}
