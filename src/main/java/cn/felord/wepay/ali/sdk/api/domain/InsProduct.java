package cn.felord.wepay.ali.sdk.api.domain;

import java.util.List;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiListField;

/**
 * 保险产品
 *
 * @author auto create
 * @version $Id: $Id
 */
public class InsProduct extends AlipayObject {

	private static final long serialVersionUID = 3696675975853223329L;

	/**
	 * 险种列表
	 */
	@ApiField("coverages")
	private InsProdCoverage coverages;

	/**
	 * 是否标准产品
	 */
	@ApiField("is_sp")
	private Boolean isSp;

	/**
	 * 保险机构;当产品为标准产品时该值为空
	 */
	@ApiField("merchant")
	private InsMerchant merchant;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品描述
	 */
	@ApiField("prod_desc")
	private String prodDesc;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品版本号
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 资源项
	 */
	@ApiListField("resources")
	@ApiField("ins_prod_resource")
	private List<InsProdResource> resources;

	/**
	 * 产品简称
	 */
	@ApiField("short_name")
	private String shortName;

	/**
	 * 标准产品编码;标准产品是不同保险公司同一类型产品的一种抽象
	 */
	@ApiField("sp_code")
	private String spCode;

	/**
	 * 标记列表
	 */
	@ApiListField("tags")
	@ApiField("ins_prod_tag")
	private List<InsProdTag> tags;

	/**
	 * <p>Getter for the field <code>coverages</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsProdCoverage} object.
	 */
	public InsProdCoverage getCoverages() {
		return this.coverages;
	}
	/**
	 * <p>Setter for the field <code>coverages</code>.</p>
	 *
	 * @param coverages a {@link cn.felord.wepay.ali.sdk.api.domain.InsProdCoverage} object.
	 */
	public void setCoverages(InsProdCoverage coverages) {
		this.coverages = coverages;
	}

	/**
	 * <p>Getter for the field <code>isSp</code>.</p>
	 *
	 * @return a {@link java.lang.Boolean} object.
	 */
	public Boolean getIsSp() {
		return this.isSp;
	}
	/**
	 * <p>Setter for the field <code>isSp</code>.</p>
	 *
	 * @param isSp a {@link java.lang.Boolean} object.
	 */
	public void setIsSp(Boolean isSp) {
		this.isSp = isSp;
	}

	/**
	 * <p>Getter for the field <code>merchant</code>.</p>
	 *
	 * @return a {@link cn.felord.wepay.ali.sdk.api.domain.InsMerchant} object.
	 */
	public InsMerchant getMerchant() {
		return this.merchant;
	}
	/**
	 * <p>Setter for the field <code>merchant</code>.</p>
	 *
	 * @param merchant a {@link cn.felord.wepay.ali.sdk.api.domain.InsMerchant} object.
	 */
	public void setMerchant(InsMerchant merchant) {
		this.merchant = merchant;
	}

	/**
	 * <p>Getter for the field <code>prodCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdCode() {
		return this.prodCode;
	}
	/**
	 * <p>Setter for the field <code>prodCode</code>.</p>
	 *
	 * @param prodCode a {@link java.lang.String} object.
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * <p>Getter for the field <code>prodDesc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdDesc() {
		return this.prodDesc;
	}
	/**
	 * <p>Setter for the field <code>prodDesc</code>.</p>
	 *
	 * @param prodDesc a {@link java.lang.String} object.
	 */
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	/**
	 * <p>Getter for the field <code>prodName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdName() {
		return this.prodName;
	}
	/**
	 * <p>Setter for the field <code>prodName</code>.</p>
	 *
	 * @param prodName a {@link java.lang.String} object.
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * <p>Getter for the field <code>prodVersion</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdVersion() {
		return this.prodVersion;
	}
	/**
	 * <p>Setter for the field <code>prodVersion</code>.</p>
	 *
	 * @param prodVersion a {@link java.lang.String} object.
	 */
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	/**
	 * <p>Getter for the field <code>resources</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsProdResource> getResources() {
		return this.resources;
	}
	/**
	 * <p>Setter for the field <code>resources</code>.</p>
	 *
	 * @param resources a {@link java.util.List} object.
	 */
	public void setResources(List<InsProdResource> resources) {
		this.resources = resources;
	}

	/**
	 * <p>Getter for the field <code>shortName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getShortName() {
		return this.shortName;
	}
	/**
	 * <p>Setter for the field <code>shortName</code>.</p>
	 *
	 * @param shortName a {@link java.lang.String} object.
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * <p>Getter for the field <code>spCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSpCode() {
		return this.spCode;
	}
	/**
	 * <p>Setter for the field <code>spCode</code>.</p>
	 *
	 * @param spCode a {@link java.lang.String} object.
	 */
	public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

	/**
	 * <p>Getter for the field <code>tags</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<InsProdTag> getTags() {
		return this.tags;
	}
	/**
	 * <p>Setter for the field <code>tags</code>.</p>
	 *
	 * @param tags a {@link java.util.List} object.
	 */
	public void setTags(List<InsProdTag> tags) {
		this.tags = tags;
	}

}
