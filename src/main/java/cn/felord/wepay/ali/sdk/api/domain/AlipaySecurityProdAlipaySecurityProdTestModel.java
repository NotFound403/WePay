package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 安全业务操作
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipaySecurityProdAlipaySecurityProdTestModel extends AlipayObject {

	private static final long serialVersionUID = 5376847675418567772L;

	/**
	 * ddd
	 */
	@ApiListField("cds")
	@ApiField("string")
	private List<String> cds;

	/**
	 * aaa
	 */
	@ApiField("ddd")
	private String ddd;

	/**
	 * <p>Getter for the field <code>cds</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getCds() {
		return this.cds;
	}
	/**
	 * <p>Setter for the field <code>cds</code>.</p>
	 *
	 * @param cds a {@link java.util.List} object.
	 */
	public void setCds(List<String> cds) {
		this.cds = cds;
	}

	/**
	 * <p>Getter for the field <code>ddd</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDdd() {
		return this.ddd;
	}
	/**
	 * <p>Setter for the field <code>ddd</code>.</p>
	 *
	 * @param ddd a {@link java.lang.String} object.
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
