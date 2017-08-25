package cn.felord.wepay.ali.sdk.api.domain;

import cn.felord.wepay.ali.sdk.api.AlipayObject;
import cn.felord.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部应用根据用户当前地理位置查询附近商家信息
 *
 * @author auto create
 * @version $Id: $Id
 */
public class AlipayMarketingCdpRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1573619958416312877L;

	/**
	 * 广告标识码
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 扩展信息，传json格式的字符串，包含longitude=经度；latitude=纬度；deviceId=设备标识
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 支付宝账户
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * <p>Getter for the field <code>adCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAdCode() {
		return this.adCode;
	}
	/**
	 * <p>Setter for the field <code>adCode</code>.</p>
	 *
	 * @param adCode a {@link java.lang.String} object.
	 */
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	/**
	 * <p>Getter for the field <code>extInfo</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getExtInfo() {
		return this.extInfo;
	}
	/**
	 * <p>Setter for the field <code>extInfo</code>.</p>
	 *
	 * @param extInfo a {@link java.lang.String} object.
	 */
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * <p>Getter for the field <code>logonId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLogonId() {
		return this.logonId;
	}
	/**
	 * <p>Setter for the field <code>logonId</code>.</p>
	 *
	 * @param logonId a {@link java.lang.String} object.
	 */
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
