package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 返回列表为json格式的列表（query_type参数的值为brands时返回品牌信息列表；query_type参数的值为series时返回车系信息列表；query_type参数的值为company时返厂商信息列表；query_type参数的值为models时返回车型信息列表）
 *
 * @author auto create
 * @version $Id: $Id
 */
public class QueryResult extends AlipayObject {

	private static final long serialVersionUID = 8419463677294589196L;

	/**
	 * 支付宝车型库品牌背景图片链接地址，
query_type参数的值为brands时此参数必填；query_type参数的值为series,models，company时不返回
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 支付宝车型库品牌编号query_type参数的值为brands，models时此参数必填；query_type参数的值为series，company时不返回，系统唯一
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 支付宝车型库品牌名称query_type参数的值为brands， models时此参数必填；query_type参数的值为series，company时不返回
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 支付宝车型库排量，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 支付宝车型库厂商编号，query_type参数的值为series， models，company时此参数必填；query_type参数的值为brands时不返回，系统唯一
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 支付宝车型库厂商名称，query_type参数的值为series， models，company时此参数必填，query_type参数的值为brands时此参数不返回
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 支付宝车型库发动机号，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 支付宝车型库品牌logo图片链接地址，
query_type参数的值为brands时此参数必填；query_type参数的值为series,models，company时不返回
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 支付宝车型库车型编号，query_type参数的值为models时此参数必填，query_type参数的值为series，company, brands时此参数不返回，系统唯一
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 支付宝车型库车型名称，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 支付宝车型库生产年限，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 支付宝车型库车系组别，query_type参数的值为series时此参数必填，query_type参数的值为brands， models时此参数不返回
	 */
	@ApiField("serie_group")
	private String serieGroup;

	/**
	 * 支付宝车型库车系编号query_type参数的值为series，models，company时此参数必填；query_type参数的值为brands时不返回，系统唯一
	 */
	@ApiField("serie_id")
	private String serieId;

	/**
	 * 支付宝车型库车系名称，query_type参数的值为series，models时此参数必填；query_type参数的值为brands时不返回
	 */
	@ApiField("serie_name")
	private String serieName;

	/**
	 * 支付宝车型库车系图片连接地址，
query_type参数的值为series时此参数必填；query_type参数的值为brands,models时不返回
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/**
	 * 支付宝车型库年款，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("style")
	private String style;

	/**
	 * <p>Getter for the field <code>backgroundUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBackgroundUrl() {
		return this.backgroundUrl;
	}
	/**
	 * <p>Setter for the field <code>backgroundUrl</code>.</p>
	 *
	 * @param backgroundUrl a {@link java.lang.String} object.
	 */
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	/**
	 * <p>Getter for the field <code>brandId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandId() {
		return this.brandId;
	}
	/**
	 * <p>Setter for the field <code>brandId</code>.</p>
	 *
	 * @param brandId a {@link java.lang.String} object.
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	/**
	 * <p>Getter for the field <code>brandName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandName() {
		return this.brandName;
	}
	/**
	 * <p>Setter for the field <code>brandName</code>.</p>
	 *
	 * @param brandName a {@link java.lang.String} object.
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * <p>Getter for the field <code>cc</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCc() {
		return this.cc;
	}
	/**
	 * <p>Setter for the field <code>cc</code>.</p>
	 *
	 * @param cc a {@link java.lang.String} object.
	 */
	public void setCc(String cc) {
		this.cc = cc;
	}

	/**
	 * <p>Getter for the field <code>companyId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyId() {
		return this.companyId;
	}
	/**
	 * <p>Setter for the field <code>companyId</code>.</p>
	 *
	 * @param companyId a {@link java.lang.String} object.
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	/**
	 * <p>Getter for the field <code>companyName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompanyName() {
		return this.companyName;
	}
	/**
	 * <p>Setter for the field <code>companyName</code>.</p>
	 *
	 * @param companyName a {@link java.lang.String} object.
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * <p>Getter for the field <code>engine</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEngine() {
		return this.engine;
	}
	/**
	 * <p>Setter for the field <code>engine</code>.</p>
	 *
	 * @param engine a {@link java.lang.String} object.
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * <p>Getter for the field <code>logoUrl</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogoUrl() {
		return this.logoUrl;
	}
	/**
	 * <p>Setter for the field <code>logoUrl</code>.</p>
	 *
	 * @param logoUrl a {@link java.lang.String} object.
	 */
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	/**
	 * <p>Getter for the field <code>modelId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelId() {
		return this.modelId;
	}
	/**
	 * <p>Setter for the field <code>modelId</code>.</p>
	 *
	 * @param modelId a {@link java.lang.String} object.
	 */
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	/**
	 * <p>Getter for the field <code>modelName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getModelName() {
		return this.modelName;
	}
	/**
	 * <p>Setter for the field <code>modelName</code>.</p>
	 *
	 * @param modelName a {@link java.lang.String} object.
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * <p>Getter for the field <code>prodYear</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProdYear() {
		return this.prodYear;
	}
	/**
	 * <p>Setter for the field <code>prodYear</code>.</p>
	 *
	 * @param prodYear a {@link java.lang.String} object.
	 */
	public void setProdYear(String prodYear) {
		this.prodYear = prodYear;
	}

	/**
	 * <p>Getter for the field <code>serieGroup</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSerieGroup() {
		return this.serieGroup;
	}
	/**
	 * <p>Setter for the field <code>serieGroup</code>.</p>
	 *
	 * @param serieGroup a {@link java.lang.String} object.
	 */
	public void setSerieGroup(String serieGroup) {
		this.serieGroup = serieGroup;
	}

	/**
	 * <p>Getter for the field <code>serieId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSerieId() {
		return this.serieId;
	}
	/**
	 * <p>Setter for the field <code>serieId</code>.</p>
	 *
	 * @param serieId a {@link java.lang.String} object.
	 */
	public void setSerieId(String serieId) {
		this.serieId = serieId;
	}

	/**
	 * <p>Getter for the field <code>serieName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSerieName() {
		return this.serieName;
	}
	/**
	 * <p>Setter for the field <code>serieName</code>.</p>
	 *
	 * @param serieName a {@link java.lang.String} object.
	 */
	public void setSerieName(String serieName) {
		this.serieName = serieName;
	}

	/**
	 * <p>Getter for the field <code>seriePhoto</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSeriePhoto() {
		return this.seriePhoto;
	}
	/**
	 * <p>Setter for the field <code>seriePhoto</code>.</p>
	 *
	 * @param seriePhoto a {@link java.lang.String} object.
	 */
	public void setSeriePhoto(String seriePhoto) {
		this.seriePhoto = seriePhoto;
	}

	/**
	 * <p>Getter for the field <code>style</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getStyle() {
		return this.style;
	}
	/**
	 * <p>Setter for the field <code>style</code>.</p>
	 *
	 * @param style a {@link java.lang.String} object.
	 */
	public void setStyle(String style) {
		this.style = style;
	}

}
