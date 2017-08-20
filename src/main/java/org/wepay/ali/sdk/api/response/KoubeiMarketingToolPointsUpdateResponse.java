package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.update response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-15 18:49:47
 */
public class KoubeiMarketingToolPointsUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6755373636979162116L;

	/** 
	 * 集点变更流水号
	 */
	@ApiField("point_log_no")
	private String pointLogNo;

	public void setPointLogNo(String pointLogNo) {
		this.pointLogNo = pointLogNo;
	}
	public String getPointLogNo( ) {
		return this.pointLogNo;
	}

}
