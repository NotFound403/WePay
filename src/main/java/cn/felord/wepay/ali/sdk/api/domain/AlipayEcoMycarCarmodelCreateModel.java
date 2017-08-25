package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 新增车型信息接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoMycarCarmodelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1886431347919881653L;

	/**
	 * 新增车型数据类型，接口通过此参数判断本次请求是增加品牌信息还是车型信息等，brand（品牌），company（厂商），serie（车系），model（车型）
	 */
	@ApiField("add_type")
	private String addType;

	/**
	 * 支付宝车型库品牌背景图片，尺寸750 x 448（add_type参数的值为brand时此参数必填）背景图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload 上传完成获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 支付宝车型库品牌编号，品牌编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（add_type参数的值为brand时此参数可为空）系统唯一
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 支付宝车型库品牌图片，尺寸220 x 147 （add_type参数的值为brand时此参数必填）品牌图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload 上传完成后获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 支付宝车型库品牌名称（add_type参数的值为brand时此参数必填）开发者自行配置，保证系统唯一
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 支付宝车型库排量（add_type参数的值为model时此参数必填）
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 支付宝车型库厂商编号，厂商编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（add_type参数的值为company时此参数可为空）系统唯一
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 支付宝车型库厂商名称（add_type参数的值为company时此参数必填）
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 支付宝车型库发动机型号（add_type参数的值为model时此参数必填）
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 支付宝车型库车型名称（add_type参数的值为model时此参数必填）
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 支付宝车型库生产年份（add_type参数的值为model时此参数必填）
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 支付宝车型库车系组名称（add_type":"serie状态时必填）
	 */
	@ApiField("serie_group")
	private String serieGroup;

	/**
	 * 支付宝车型库车系编号，车系编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（add_type参数的值为serie时此参数可为空）系统唯一
	 */
	@ApiField("serie_id")
	private String serieId;

	/**
	 * 支付宝车型库车系名称（add_type参数的值为serie时此参数必填）
	 */
	@ApiField("serie_name")
	private String serieName;

	/**
	 * 支付宝车型库车系logo图片链接地址，尺寸220 x 147 （add_type参数的值为serie时此参数必填）
图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload上传完成后获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/**
	 * 支付宝车型库年款（add_type参数的值为model时此参数必填）
	 */
	@ApiField("style")
	private String style;

	/**
	 * <p>Getter for the field <code>addType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddType() {
		return this.addType;
	}
	/**
	 * <p>Setter for the field <code>addType</code>.</p>
	 *
	 * @param addType a {@link java.lang.String} object.
	 */
	public void setAddType(String addType) {
		this.addType = addType;
	}

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
	 * <p>Getter for the field <code>brandLogo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getBrandLogo() {
		return this.brandLogo;
	}
	/**
	 * <p>Setter for the field <code>brandLogo</code>.</p>
	 *
	 * @param brandLogo a {@link java.lang.String} object.
	 */
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
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
