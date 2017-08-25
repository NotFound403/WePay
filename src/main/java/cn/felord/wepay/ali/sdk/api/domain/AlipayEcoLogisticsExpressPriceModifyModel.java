package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 更新寄件价格接口
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayEcoLogisticsExpressPriceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5475878912453128365L;

	/**
	 * 查询区域类型
AREA_PRVN:省代码；
AREA_CITY:市代码；
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 续重价格（单位：元）
	 */
	@ApiField("extra_weight_price")
	private String extraWeightPrice;

	/**
	 * 续重单位（单位：克）
	 */
	@ApiField("extra_weight_unit")
	private Long extraWeightUnit;

	/**
	 * 发货区域代码
区域类型为省代码时为省代码；
区域类型为市代码时为市代码；
省市区代码采用国家标准编码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("from_code")
	private String fromCode;

	/**
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/**
	 * 首重重量（单位：克）
	 */
	@ApiField("preset_weight")
	private Long presetWeight;

	/**
	 * 首重价格（单位：元）
	 */
	@ApiField("preset_weight_price")
	private String presetWeightPrice;

	/**
	 * 产品类型编码，取值如下：
STANDARD：标准快递。这是寄件平台默认支持的产品分类，如有其他产品分类的支持需求，可以发送邮件至xxx@alipay.com联系。
	 */
	@ApiField("product_type_code")
	private String productTypeCode;

	/**
	 * 收货区域代码
区域类型为省代码时为省代码；
区域类型为市代码时为市代码；
省市区代码采用国家标准编码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("to_code")
	private String toCode;

	/**
	 * <p>Getter for the field <code>areaType</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAreaType() {
		return this.areaType;
	}
	/**
	 * <p>Setter for the field <code>areaType</code>.</p>
	 *
	 * @param areaType a {@link java.lang.String} object.
	 */
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	/**
	 * <p>Getter for the field <code>extraWeightPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtraWeightPrice() {
		return this.extraWeightPrice;
	}
	/**
	 * <p>Setter for the field <code>extraWeightPrice</code>.</p>
	 *
	 * @param extraWeightPrice a {@link java.lang.String} object.
	 */
	public void setExtraWeightPrice(String extraWeightPrice) {
		this.extraWeightPrice = extraWeightPrice;
	}

	/**
	 * <p>Getter for the field <code>extraWeightUnit</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getExtraWeightUnit() {
		return this.extraWeightUnit;
	}
	/**
	 * <p>Setter for the field <code>extraWeightUnit</code>.</p>
	 *
	 * @param extraWeightUnit a {@link java.lang.Long} object.
	 */
	public void setExtraWeightUnit(Long extraWeightUnit) {
		this.extraWeightUnit = extraWeightUnit;
	}

	/**
	 * <p>Getter for the field <code>fromCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFromCode() {
		return this.fromCode;
	}
	/**
	 * <p>Setter for the field <code>fromCode</code>.</p>
	 *
	 * @param fromCode a {@link java.lang.String} object.
	 */
	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}

	/**
	 * <p>Getter for the field <code>logisMerchCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogisMerchCode() {
		return this.logisMerchCode;
	}
	/**
	 * <p>Setter for the field <code>logisMerchCode</code>.</p>
	 *
	 * @param logisMerchCode a {@link java.lang.String} object.
	 */
	public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
	}

	/**
	 * <p>Getter for the field <code>presetWeight</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Long getPresetWeight() {
		return this.presetWeight;
	}
	/**
	 * <p>Setter for the field <code>presetWeight</code>.</p>
	 *
	 * @param presetWeight a {@link java.lang.Long} object.
	 */
	public void setPresetWeight(Long presetWeight) {
		this.presetWeight = presetWeight;
	}

	/**
	 * <p>Getter for the field <code>presetWeightPrice</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPresetWeightPrice() {
		return this.presetWeightPrice;
	}
	/**
	 * <p>Setter for the field <code>presetWeightPrice</code>.</p>
	 *
	 * @param presetWeightPrice a {@link java.lang.String} object.
	 */
	public void setPresetWeightPrice(String presetWeightPrice) {
		this.presetWeightPrice = presetWeightPrice;
	}

	/**
	 * <p>Getter for the field <code>productTypeCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getProductTypeCode() {
		return this.productTypeCode;
	}
	/**
	 * <p>Setter for the field <code>productTypeCode</code>.</p>
	 *
	 * @param productTypeCode a {@link java.lang.String} object.
	 */
	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	/**
	 * <p>Getter for the field <code>toCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToCode() {
		return this.toCode;
	}
	/**
	 * <p>Setter for the field <code>toCode</code>.</p>
	 *
	 * @param toCode a {@link java.lang.String} object.
	 */
	public void setToCode(String toCode) {
		this.toCode = toCode;
	}

}
