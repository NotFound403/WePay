package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 区域代码
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AreaCode extends AlipayObject {

	private static final long serialVersionUID = 2115957846173786684L;

	/**
	 * 区域类型
AREA_PRVN:省代码；
AREA_CITY:市代码；
AREA_DIST:区县代码；
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 区域代码
省市区代码，国标码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("code")
	private String code;

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
	 * <p>Getter for the field <code>code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object.
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
