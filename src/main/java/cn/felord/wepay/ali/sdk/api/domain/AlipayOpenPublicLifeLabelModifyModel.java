package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 标签修改接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLifeLabelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8148111719149322954L;

	/**
	 * 标签id，调用创建标签接口后由支付宝返回 ，只支持生活号自定义标签
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

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

	/**
	 * <p>Getter for the field <code>labelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLabelName() {
		return this.labelName;
	}
	/**
	 * <p>Setter for the field <code>labelName</code>.</p>
	 *
	 * @param labelName a {@link java.lang.String} object.
	 */
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
