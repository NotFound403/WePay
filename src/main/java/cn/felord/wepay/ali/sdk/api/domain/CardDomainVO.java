package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 卡域模型
 *
 * @author auto create
 * @version $Id: $Id
 */
public class CardDomainVO extends AlipayObject {

	private static final long serialVersionUID = 3799937418432494992L;

	/**
	 * 值域域名的描述值，固定为”金融”
	 */
	@ApiField("description")
	private String description;

	/**
	 * 值域域名，固定为“FINANCE”
	 */
	@ApiField("domain_name")
	private String domainName;

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * <p>Getter for the field <code>domainName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDomainName() {
		return this.domainName;
	}
	/**
	 * <p>Setter for the field <code>domainName</code>.</p>
	 *
	 * @param domainName a {@link java.lang.String} object.
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

}
