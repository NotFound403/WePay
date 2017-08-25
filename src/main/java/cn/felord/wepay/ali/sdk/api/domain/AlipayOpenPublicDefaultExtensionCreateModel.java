package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 默认扩展区创建接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicDefaultExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5313725165427986577L;

	/**
	 * 默认扩展区列表，最大条数为3，
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	/**
	 * <p>Getter for the field <code>areas</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	/**
	 * <p>Setter for the field <code>areas</code>.</p>
	 *
	 * @param areas a {@link java.util.List} object.
	 */
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

}
