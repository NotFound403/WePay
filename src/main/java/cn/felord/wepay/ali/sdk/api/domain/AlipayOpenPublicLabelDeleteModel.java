package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-删除标签
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenPublicLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4825984651791418971L;

	/**
	 * 标签id
	 */
	@ApiField("id")
	private String id;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

}
