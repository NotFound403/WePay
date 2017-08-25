package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 零七二五
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayOpenAppLingqierwuLingqierquQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5888448293983824655L;

	/**
	 * 12
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

	/**
	 * <p>Getter for the field <code>test</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getTest() {
		return this.test;
	}
	/**
	 * <p>Setter for the field <code>test</code>.</p>
	 *
	 * @param test a {@link java.util.List} object.
	 */
	public void setTest(List<String> test) {
		this.test = test;
	}

}
