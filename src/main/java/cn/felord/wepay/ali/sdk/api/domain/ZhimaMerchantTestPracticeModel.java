package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * asd
 *
 * @author auto create
 * @version $Id: $Id
 */
public class ZhimaMerchantTestPracticeModel extends AlipayObject {

	private static final long serialVersionUID = 2833451123543857337L;

	/**
	 * a d
	 */
	@ApiListField("add")
	@ApiField("string")
	private List<String> add;

	/**
	 * zzz
	 */
	@ApiField("xxxx")
	private XXXXsdasdasd xxxx;

	/**
	 * <p>Getter for the field <code>add</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getAdd() {
		return this.add;
	}
	/**
	 * <p>Setter for the field <code>add</code>.</p>
	 *
	 * @param add a {@link java.util.List} object.
	 */
	public void setAdd(List<String> add) {
		this.add = add;
	}

	/**
	 * <p>Getter for the field <code>xxxx</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.XXXXsdasdasd} object.
	 */
	public XXXXsdasdasd getXxxx() {
		return this.xxxx;
	}
	/**
	 * <p>Setter for the field <code>xxxx</code>.</p>
	 *
	 * @param xxxx a {@link cn.felord.wepay.ali.sdk.api.domain.XXXXsdasdasd} object.
	 */
	public void setXxxx(XXXXsdasdasd xxxx) {
		this.xxxx = xxxx;
	}

}
