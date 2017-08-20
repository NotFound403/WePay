package org.wepay.ali.sdk.api.domain;

import org.wepay.ali.sdk.api.AlipayObject;
import org.wepay.ali.sdk.api.internal.mapping.ApiField;

/**
 * 外部应用根据用户当前地理位置查询附近商家信息
 *
 * @author auto create
 * @since 1.0, 2016-07-12 19:37:01
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

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
