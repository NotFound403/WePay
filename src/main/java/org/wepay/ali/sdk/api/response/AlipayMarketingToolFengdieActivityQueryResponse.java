package org.wepay.ali.sdk.api.response;

import org.wepay.ali.sdk.api.internal.mapping.ApiField;
import org.wepay.ali.sdk.api.domain.FengdieActivity;

import org.wepay.ali.sdk.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class AlipayMarketingToolFengdieActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7762498611679337394L;

	/** 
	 * H5应用详情
	 */
	@ApiField("activity")
	private FengdieActivity activity;

	public void setActivity(FengdieActivity activity) {
		this.activity = activity;
	}
	public FengdieActivity getActivity( ) {
		return this.activity;
	}

}
